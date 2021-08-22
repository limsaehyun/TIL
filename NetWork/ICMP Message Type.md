**ICMP(Internet Control Message Protocol) Message Type**

0(Echo Reply) : Recho Request를 받은 호스트는 Echo Replay메시지를 돌려 보냄(네이워크의 고장여부 체크)

8(Echo Request) : 요청하는 호스트가 네트워크상에서 정상동작하고 있는지를 확인해보는 메시지

11(Time Exceeded for Datagram) : 패킷의 무한 정송 차단을 위해 "시간초과 메시지"를 둔다. (TTL)