package basic;

import java.lang.reflect.Array;

public class DependOnMode {
    public static void main(String[] args) {
        //test 입력
        String code = "abc1abc1abc";

        StringBuilder ret = new StringBuilder();

        System.out.println(ret.toString().equals("")); //true
        System.out.println(ret.toString().equals("")); //Error: empty character literal
        int mode = 0;

        for(int i=0; i<code.length(); i++) {

            if (mode == 0) {
                char c = code.charAt(i);
                if (c == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        ret.append(c);
                    }
                }
            } else {
                char c = code.charAt(i);
                if (c == '1') {
                    mode = 0;
                } else {
                    if (i % 2 != 0) {
                        ret.append(c);
                    }
                }
            }
        }
        System.out.println(DependOnUpGrade(code));
    }
    public static String DependOnUpGrade(String code){
        //초기화
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for(int i = 0;i<code.length(); i++){

            char c = code.charAt(i);
            if(c == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if(i % 2 == mode){
                sb.append(c);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}
