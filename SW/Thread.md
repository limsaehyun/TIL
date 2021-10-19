------

## Thread(쓰레드)란 무엇인가?



- 프로그램(프로세스) 실행의 단위이다.

  - 하나의 프로세스는 여러개의 쓰레드로 구성이 가능하다.

    

- 하나의 프로세스를 구성하는 쓰레드들은 프로세스에 할당된 메모리, 자원 등을 공유한다.

  

- 프로세스와 같이 실행, 준비, 대기 등의 실행 상태를 가지며 실행 상태가 변할때마다 쓰레드 문맥교환 (context switching)을 수행한다.

  

- 각 쓰레드별로 자신만의 스택과 레지스터를 가진다.

  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd228c3f-1e28-4315-b57a-96622a074216/Untitled.png)

- 한 순간에 하나의 쓰레드만 실행 가능

  

### Thread의 생성주기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7605414a-881d-4ff2-9f66-293c9f16afd0/Untitled.png)

[생성주기](https://www.notion.so/2c0ede7fb0c449b2a2585a8c2cd39443)

## Thread의 생명 주기

### Runnable (준비상태)

- 쓰레드가 실행되기 위한 준비단계

- CPU 점유 X

- 실행(Running 상태)을 하기 위해 대기하고 있는 상태

- start() 메서드를 호출하면 run() 메서드에 설정된 스레드가 RUnnable상태로 진입한다.

  

### Running (실행상태)

- CPU 점유 O

- run() 메서드는 JVM만이 호출 가능

- Runnable(준비상태)에 있는 여러 스레드 중 우선 순위를 가진 스레드가 결정되면 JVM이 자동으로 run() 메서드를 호출하여 스레드가 RUnning 상태로 진입

  

### DEAD (종료상태)

- Running 상태에서 스레드가 모두 실행되고 난 후 완료 상태

  

### Blocked (지연 상태)

- CPU를 점유권을 상실한 상태



참고 문헌

------

https://coding-factory.tistory.com/