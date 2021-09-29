# Thread



## Thread(쓰레드)란 무엇인가?

- 프로그램(프로세스) 실행의 단위이다.
  - 하나의 프로세스는 여러개의 쓰레드로 구성이 가능하다.
- 하나의 프로세스를 구성하는 쓰레드들은 프로세스에 할당된 메모리, 자원 등을 공유한다.
- 프로세스와 같이 실행, 준비, 대기 등의 실행 상태를 가지며 실행 상태가 변할때마다 쓰레드 문맥교환 (context switching)을 수행한다.
- 각 쓰레드별로 자신만의 스택과 레지스터를 가진다.

![Untitled](C:\Users\user\Downloads\Untitled.png)

- 한 순간에 하나의 쓰레드만 실행 가능





### ■ 참고 문헌

------

https://ko.wikipedia.org/wiki/스레드

https://goodgid.github.io/