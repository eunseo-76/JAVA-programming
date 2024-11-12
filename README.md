# :books: 책론을박(DEBOOK)
멘트멘트

### 주요 기능
1. 기능
2. 기능
3. 기능
### 기술 스택

<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"><img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"><img src="https://img.shields.io/badge/Vue-4FC08D?style=for-the-badge&logo=Vue.js&logoColor=white"><img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=MariaDB&logoColor=white"><img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=MongoDB&logoColor=white"><img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white"><img src="https://img.shields.io/badge/Redis-FF4438?style=for-the-badge&logo=Redis&logoColor=white"><img src="https://img.shields.io/badge/Google Gemini-8E75B2?style=for-the-badge&logo=Google Gemini&logoColor=white">



<img src="https://img.shields.io/badge/표시할이름-색상?style=for-the-badge&logo=기술스택아이콘&logoColor=white">

### 프로젝트 아키텍처

# 팀 소개
- 김영기
- 김지민
- 이은서
- 정의진
- 최두혁
- 한동주

| | | [![](https://avatars.githubusercontent.com/u/174981455?v=4)](https://github.com/eunseo-76) | | | |


|:---:|:---:|:---:|:---:|:---:|:---:|
| 김영기 | 김지민 | 이은서 | 정의진 | 최두혁 | 한동주
|산책모임|공동구매|회원프로필 및 기타 기능|상담|게시판|채팅|

## :heavy_exclamation_mark:협업 전략
### 1. 브랜치 전략
![git-flow](https://github.com/user-attachments/assets/2d7e2ef4-df03-4c5f-8c78-316065100dde)
- **main**: 배포용 branch
- **develop**: 실질적 main branch
- **feature**: 각 기능을 개발하는 branch
- 브랜치명은 '태그/도메인/#이슈번호' 의 형식을 따른다.
  - 예) feat/user/#12
- 기능 단위로 브랜치를 생성하며, 커밋 단위는 가능한 작게 조절한다. 한 번에 여러 클래스를 커밋하지 않고, Pull Request에 너무 많은 커밋이 포함되지 않도록 한다.

### 2. Issue
- 이슈 템플릿을 활용하여 다른 사람이 알기 쉽게 이슈를 작성한다.
- 이슈 작성 후 발급된 #이슈번호를 이용해 브랜치를 생성한다.

![issue_template](https://github.com/user-attachments/assets/eed8bc02-ed2c-49d3-8262-c96478b21c5b)
![issue](https://github.com/user-attachments/assets/c5f1a66d-467d-404e-b26f-b37f3992a7f5)


### 3. Pull Request
- Pull Request의 제목은 '태그/도메인 개발 내용' 의 형식을 따른다.
- 예) feat/user 개발 내용

![pr_1](https://github.com/user-attachments/assets/8f3f4f03-5e50-4d26-8963-18ece4f3ebfa)
![pr_2](https://github.com/user-attachments/assets/fd1b75e4-9a81-49b4-b3d3-d1fd365b8ca4)
![pr_3](https://github.com/user-attachments/assets/fb8650a6-6183-4644-a971-3ca22412544d)

### 4. 커밋 메시지 컨벤션
- 태그<br/>
```feat```: 기능 개발<br/>
```fix```: 버그 수정<br/>
```docs```: 문서 작성 및 수정<br/>
```style```: 코드 리팩토링 등 내용상 변경이 없는 경우<br/>
```test```: 테스트 코드<br/>
```chore```: 자잘한 수정사항<br/><br/>
- 커밋 메시지는 '태그: #이슈번호 내용' 의 형식을 따른다.
- 예) docs: #43 ReadMe 수정

![commit](https://github.com/user-attachments/assets/f4261d3e-7bba-41b8-8b21-5ade721c9da5)

### 5. 네이밍 규칙
- **클래스명**: PascalCase
- **메소드명**, **필드명**: camelCase
```
public class User{

    public void fetchUserInfo(){

        private Long userId;
       private String userName;
    }
}
```
- DTO명: ~DTO 예) ```UserRequestDTO```
- 기타 모호한 단어는 도메인 정의서에 작성한다.

### 6. 기타 규칙
- 가독성을 위해 클래스 첫 줄은 띄어쓰고, 의미 없는 공백은 줄인다.
- 최대 tap depth = 2
- magic number 사용 자제, 상수화
- 커밋 전 정렬(```ctrl + alt + L```)
- 커밋 전 사용하지 않는 import문 삭제(```ctrl + alt + o```)



# :page_with_curl: 프로젝트 설계 문서
## 1. DDD 설계
:point_right: [DDD 설계 보기 - Miro](https://miro.com/app/board/uXjVLNZH4nw=/)
## 2. 요구사항 명세서, 도메인 정의서
:point_right: [요구사항 명세서/도메인 정의서 보기](https://docs.google.com/spreadsheets/d/1oddc-l1flUAqUNzAMt8jnrshAidp2dHnd1w2Sz5JxWA/edit?gid=1147247037#gid=1147247037)
## 3. DB 모델링
:point_right: [DB 모델링 보기 - ERDCloud](https://www.erdcloud.com/d/6fp4cuH2E49NQmkaL)
## 4. UI 설계
:point_right: [UI 설계 보기 - Figma](https://www.figma.com/design/A5tRWd8g8sqnmVyvuK297V/책론을박?node-id=0-1&t=UA7fibrZjfA6hAw0-1)

# 기능 수행 테스트

# 회고
|   팀원   | 회고 내용 |
|:---:|-----------|
| 김영기 | 회고회고 |
| 김지민 | 회고회고 |
| 이은서 | 이전 프로젝트에서 서비스 자체 회원가입, 로그인을 포함한 여러 기능을 구현했다. 회원가입/로그인은 다른 팀원들에게도 반드시 필요한 기능이기 때문에 중요도가 높은데, 단순히 이메일, 암호화 된 비밀번호를 DB에 저장하고 로그인 시 맞는지 매칭하는 수준이라 아쉬움이 남았다. 그래서 다음 기회가 생기면 좀 더 발전시키겠다고 다짐했다. 새로 만난 팀원들과 새 프로젝트를 하게 되었고, 나는 내가 회원가입 기능을 구현하겠다고 말했다. 일주일이 안되는 짧은 기간 안에 백엔드, 프론트엔드 개발을 마쳐야 했기 때문에, 한 번 해 본 서비스 자체 회원가입을 또 하기보다는 카카오 소셜 로그인을 도입하고, redis와 토큰을 사용하기로 했다.<br/>서비스 자체 회원가입보다 조금 어려울 거라고 예상은 했지만 생각보다 더 까다로웠다. 카카오에서 제공하는 문서를 열심히 읽으며 엔드포인트마다 postman으로 테스트하면서 카카오 로그인의 흐름을 이해했다. 이후 필요한 기능끼리 묶으면서 프론트엔드와 연결했다. 이 과정에서 서비스 자체 토큰을 생성하고, redis에 저장하고, api 요청마다 토큰을 함께 보내야 했는데, 복잡해서 시간을 많이 썼다. 하지만 덕분에 OAuth2와 토큰에 대해 배울 수 있었다. 그리고 카카오 인증 서버에서 보내주는 인가 코드를 백엔드와 프론트엔드 어느 쪽에서 처리해야할 지와 같은 문제를 고민하는 시간을 가질 수 있었다. 또한, 이 프로젝트에서 다른 팀원의 제안으로 git을 더 많이 활용했다. 원격 레포지토리의 main 브랜치 아래에 develop 이라는 브랜치를 만들었고, 반드시 2명 이상의 Pull Request 승인을 받아야 develop에 병합할 수 있도록 설정했다. 이로 인해 다른 사람의 코드를 조금이라도 더 보게 되었고, 커밋과 병합 시 경각심을 가질 수 있었다.<br/>프로젝트를 진행하면서 아쉬운 점이 있다면 리프레시 토큰을 적절하게 사용하지 못했다는 점과, 당장 서비스가 작동하게 하는 데에 급급해 쿼리 파라미터에 토큰을 넣는 등 보안에 신경을 쓰지 못했다는 것이다. 또한, 팀원들이 각자의 기능을 개발한 후 서로 맞춰보고 왜 문제가 생기는지 토의하는 시간이 너무 짧았다. 또 좋은 기회가 생긴다면 나의 팀원이 어떤 api를 개발하다가 어떤 문제가 있었고, 어떻게 해결했는지 시간을 내어 이야기 하고 싶다. |
| 정의진 | 회고회고 |
| 최두혁 | 회고회고 |
| 한동주 | 회고회고 |

