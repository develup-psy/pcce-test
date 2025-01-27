# README 템플릿 설정 및 관리

## README 템플릿
```markdown
# 문제 이름
### Category: 카테고리명

### 😀문제설명

### 😍기초 다지기

### 👍UPGRADE 포인트
```

---

## 1. IntelliJ IDEA에 README 템플릿 추가하기
IntelliJ IDEA의 **File Templates** 기능을 활용해 템플릿을 설정할 수 있습니다.

### 단계별 설정 방법
1. **IntelliJ IDEA 열기**:
    - 메뉴에서 **`File` > `Settings`**(또는 Mac에서는 **`IntelliJ IDEA` > `Preferences`**)을 선택.

2. **File and Code Templates 열기**:
    - **`Editor` > `File and Code Templates`** 메뉴로 이동.
    - **`Files` 탭**을 선택.

3. **새 템플릿 추가**:
    - 오른쪽 상단의 **`+` 버튼**을 클릭하여 새 템플릿을 추가.
    - **템플릿 이름**: `README.md`
    - **내용**:
      ```markdown
      # 문제 이름
      ### Category: 카테고리명
 
      ### 😀문제설명
 
      ### 😍기초 다지기
 
      ### 👍UPGRADE 포인트
      ```
    - 저장 버튼을 눌러 완료.

---

## 2. 새 README.md 파일 생성하기
설정한 템플릿을 기반으로 새 README.md 파일을 생성합니다.

### 단계별 생성 방법
1. **프로젝트 폴더에서 새 파일 생성**:
    - 프로젝트의 원하는 폴더를 선택한 뒤, **`File` > `New` > `File`**을 선택.
    - 파일 이름으로 **`README.md`** 입력 후 Enter를 누릅니다.

2. **템플릿 선택**:
    - 템플릿 목록에서 **`README.md`**를 선택합니다.
    - IntelliJ IDEA가 자동으로 템플릿 내용을 파일에 추가합니다.

3. **내용 편집**:
    - 템플릿 내용을 문제 이름, 카테고리, 설명에 맞게 수정합니다.

---

## 3. 템플릿 규칙 유지 및 공유 방법

### 규칙 유지
- 템플릿 작성 시 반드시 모든 섹션이 포함되도록 설정:
    - `# 문제 이름`
    - `### Category:`
    - `### 😀문제설명`
    - `### 😍기초 다지기`
    - `### 👍UPGRADE 포인트`

### 공유 방법
1. **템플릿을 프로젝트에 추가**:
    - 프로젝트의 `docs` 또는 `README_TEMPLATE` 폴더에 템플릿 파일 저장:
        - 파일 이름: `README_TEMPLATE.md`
        - 내용:
          ```markdown
          # 문제 이름
          ### Category: 카테고리명
   
          ### 😀문제설명
   
          ### 😍기초 다지기
   
          ### 👍UPGRADE 포인트
          ```

2. **팀원들에게 템플릿 적용 방법 공유**:
    - 템플릿을 IntelliJ IDEA에서 설정하도록 팀원들에게 위의 "1. IntelliJ IDEA에 README 템플릿 추가하기" 단계를 공유.

3. **버전 관리로 유지**:
    - 템플릿 파일을 Git 저장소에 포함하여 변경 사항을 추적.

---

## 4. Markdown 미리보기 활성화
IntelliJ IDEA에서는 **Markdown 미리보기 기능**을 통해 작성된 README 파일을 실시간으로 확인할 수 있습니다.

### 미리보기 활성화 방법
1. **README.md 파일 열기**:
    - 템플릿 기반으로 생성된 README.md 파일을 열기.

2. **미리보기 창 열기**:
    - 우측 상단의 **눈 모양 아이콘(미리보기)** 클릭.
    - 작성 중인 Markdown 내용을 실시간으로 확인 가능.

---

## 요약
1. IntelliJ IDEA의 **File and Code Templates**에 README 템플릿 추가.
2. 새 파일 생성 시 설정된 템플릿 자동 적용.
3. 팀 협업 시 템플릿 파일을 프로젝트에 포함하고 Git으로 관리하여 공유.
4. Markdown 미리보기로 작성 내용을 실시간으로 확인.

---

이 템플릿은 기본적인 구조입니다. 필요에 따라 내용을 추가하거나 수정하여 사용하세요! 😊
