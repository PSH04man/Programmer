# CLAUDE.md — Programmers 코딩테스트 저장소

> 학교 PC(IntelliJ) ↔ 집 PC 두 곳에서 번갈아 작업하는 개인 학습 저장소.
> 이 파일은 세션마다 자동 로드되므로 **핵심 규칙만** 유지할 것.

## 저장소 구조 (2026-07-20 확정)

```
java/Level_0/*.java      ← Java 풀이 (메인)
c/Level_0/*.c            ← C 풀이
python/Level_0/*.py      ← Python 풀이
```

**언어별 최상위 폴더** 구조다. 옛 경로 `src/main/java/kopo/programmers/`는
폐기됐으며 빈 `src/` 폴더가 남아 있으면 지워도 된다.

## Java 파일 규칙 ⚠️

- **`package` 선언을 쓰지 않는다** (default package).
  `java/Level_0/`은 소스 루트이지 패키지 경로가 아니다.
  `package main.java.kopo.programmers.Level_0;` 같은 선언이 보이면 **잔재이므로 제거**.
- 인코딩 **UTF-8**, 줄바꿈 CRLF (Windows).
- 컴파일·실행 확인:
  ```bash
  javac -encoding UTF-8 -d out/manual java/Level_0/*.java
  java -Dstdout.encoding=UTF-8 -cp out/manual reverseString
  ```
  `-Dstdout.encoding=UTF-8`이 없으면 **터미널 출력의 한글이 깨진다**.
  Java 18부터 콘솔 출력 인코딩이 `file.encoding`에서 분리됐고, 한국어 Windows의
  기본 콘솔은 cp949라서 그렇다. 소스 파일 자체는 UTF-8로 정상이며 IntelliJ 실행에는
  영향 없다 — 터미널로 직접 돌릴 때만 필요하다.

## IntelliJ 설정 (PC마다 각자)

`*.iml`과 `.idea/`는 **gitignore 대상**이다. PC마다 경로가 달라 충돌의 원인이었다.
새 PC에서 처음 열 때 한 번만:

> `java` 폴더 우클릭 → **Mark Directory as → Sources Root**

## Git 워크플로 (중요 — 사고 재발 방지)

| 시점 | 명령 |
|------|------|
| 작업 **시작 전 반드시** | `git pull` (IntelliJ `Ctrl+T`) |
| 작업 **종료 전 반드시** | `git push` (`Ctrl+Shift+K`) |

- `pull.rebase true` 설정됨 → 병합 커밋이 안 생기고 히스토리가 일자로 유지된다.
  **새 PC에서는 `git config pull.rebase true`를 먼저 실행할 것.**
- 문제 하나 풀면 바로 커밋·push. 쌓아두면 양쪽이 갈라진다.

### 과거 사고 이력 (2026-07-20)
학교에서 pull 없이 커밋 → push 거부 → 병합. 이때 집에서 진행한
경로 리팩터링(`src/main/java/...` → `java/`)이 들어오면서 IntelliJ 트리에서
Level_0가 사라진 것처럼 보였다. **파일 손실은 없었고 rename이었다.**
부작용으로 package 선언 9개와 `programmer.iml` 삭제 문제가 발생해 정리했다.

> 비슷한 일이 또 생기면 **당황해서 reset/삭제하지 말고** 먼저 확인:
> `git status` → `git reflog` → `git diff --stat <이전커밋> HEAD`
