# 📖 MyDiary — 나만의 감성 다이어리 웹서비스

> 누군가에게는 보이지 않는 내 하루를, 조용히 담아두는 곳.

**MyDiary**는 사용자가 자신의 하루를 기록하고 되돌아볼 수 있도록 도와주는 개인용 웹 다이어리 서비스입니다.  
**Java와 Spring Boot** 기반으로 만들어졌으며, **JWT 인증**을 통해 나만의 공간을 안전하게 지킬 수 있어요.

---

## ✨ 주요 기능

- ✍️ 회원가입 및 로그인 (JWT 기반 보안)
- 📝 일기 작성 / 수정 / 삭제
- 🗂 날짜, 감정, 태그 기반 일기 분류
- 🔍 키워드 검색 기능
- 📊 (예정) 감정 통계 / 월별 일기 캘린더
- 🌙 (예정) 다크 모드 UI

---

## 🛠 기술 스택

| 구성 요소 | 사용 기술                             |
|-----------|----------------------------------------|
| 백엔드    | Java 17, Spring Boot                   |
| 인증      | Spring Security + JWT                  |
| 데이터베이스 | H2 (개발용) / MySQL (운영용)             |
| ORM       | Spring Data JPA                        |
| 프론트    | Thymeleaf (또는 추후 React 연동 가능) |
| 빌드 도구 | Gradle                                 |

---

## 🚀 프로젝트 실행 방법

### 1. 레포지토리 클론
```bash
git clone https://github.com/leegeonu02/MyLog.git
cd MyLog
```

---

## 커밋 메시지 규칙

| 타입         | 설명                            |
| ---------- | ----------------------------- |
| `feat`     | 새로운 기능 추가                     |
| `fix`      | 버그 수정                         |
| `docs`     | 문서 수정 (README 등)              |
| `style`    | 코드 포맷팅, 세미콜론, 공백 등 (기능 변화 없음) |
| `refactor` | 코드 리팩토링 (기능 변화 없음)            |
| `test`     | 테스트 코드 추가/수정                  |
| `chore`    | 빌드 설정, 패키지 설치 등 기타 잡일         |
| `perf`     | 성능 개선                         |

### 예시
- feat: 다이어리 작성 기능 추가
- fix(diary): 작성 시 날짜 저장 오류 수정
- docs: README에 프로젝트 소개 작성
- refactor(user): JWT 인증 로직 리팩토링
- style: controller 패키지 import 정리
- chore: .gitignore에 application.yml 추가

---
