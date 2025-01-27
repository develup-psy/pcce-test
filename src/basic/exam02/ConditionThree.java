package basic.exam02;

import java.util.*;
public class ConditionThree {
    public static void main(String[] args) {
        int a = 2,b = 6,c = 1;
        Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c));
        if(set.size() == 3){
            System.out.println(a+b+c);
        }else if(set.size() == 2){
            System.out.println((a+b+c)*(a*a+b*b+c*c));
        }else{
            System.out.println((a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c));
        }
        System.out.println(upgrade(a, b, c));
    }
    public static int upgrade(int a, int b, int c){
        int count = 1;
        int result = 0;

        if(a == b || b == c || c == a){
            count++;
        }
        if(a == b && b == c){
            count++;
        }
        for(int i=0; i<count; i++){
            result *= (pow(a,i) + pow(b,i) + pow(c,i));
        }
        return result;
    }
    static int pow(int base, int exponent){
        if(exponent == 0) return 1;
        return base * pow(base, exponent);
    }
}
