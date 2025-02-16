## 1. 자신이 개발한 앱에 대한 설명

이 프로젝트는 spring boot v3를 기반으로 한 Todo List 웹 api입니다.
데이터 추가, 조회, 수정, 삭제할 수 있는 api를 제공하여 react 프론트엔드와 데이터를 주고 받습니다.
백엔드에서 데이터베이스에 할 일 목록을 저장합니다.

## 2. 소스 빌드 및 실행 방법 메뉴얼

- 개발 툴 버전 정보
  - java 17
  - spring boot v3.3.8
- 소스 빌드
  - git colne <repository_url>
- 의존성 추가
  - mybatis, swagger, mysql 등등
- build clean 후 실행

## 3. 주력으로 사용한 라이브러리에 대한 설명 및 사용 이유 기입
- Spring Boot Starter Web
- 설명: RESTful API 개발에 필요한 웹 기능(컨트롤러, JSON 변환 등)을 제공합니다.
사용 이유: 빠르고 안정적인 웹 애플리케이션 구동 환경을 제공하는걸로 알고있어 사용했습니다.

- MyBatis Spring Boot Starter
- 설명 및 사용이유 : MMyBatis를 통합하여 SQL 매핑과 데이터베이스 연동을 손쉽게 처리할 수 있도록 도와줍니다.
SQL 문장을 XML 또는 애너테이션으로 관리할 수 있어, 복잡한 쿼리를 유연하게 작성할 수 있습니다.

- Spring Boot Starter Validation (Hibernate Validator)
설명: 클라이언트로부터 들어오는 요청 데이터의 유효성을 검증합니다.
사용 이유:
@Valid 어노테이션을 통해 요청 데이터의 유효성 검사를 수행하여, 클라이언트로부터 전달되는 데이터의 무결성을 보장합니다.

- Lombok
- 설명: 반복적인 코드를 줄여주는 라이브러리로, @Getter, @Setter, @Slf4j 등 여러 어노테이션을 제공합니다.
사용 이유:
코드 간결화: Getter, Setter, 생성자 등 반복되는 코드를 자동 생성해주어 가독성 향상에도 좋습니다.

- Springdoc OpenAPI / Swagger
설명: 애플리케이션의 REST API 문서를 자동으로 생성하고, API 테스트 UI를 제공합니다.
사용 이유:
API 문서화 자동화: 코드의 어노테이션을 기반으로 API 스펙을 자동으로 문서화하여, API 사용법을 쉽게 공유할 수 있습니다.

## 4. API 명세 작성 필수
- Swagger 사용하였습니다
- http://localhost:8080/swagger-ui/index.html

## 5,6 X

## 7. mysql 사용완료
