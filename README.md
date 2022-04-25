# DJ_Chatting

## 1 SSL 키파일 생성

cd /(JAVA_HOME)

![image](https://user-images.githubusercontent.com/100888647/165061900-42ff5232-a9bf-463f-976e-47c2b7d8032a.png)

## 2 CSR(Certificate Signing Reuest) 파일 생성

![image](https://user-images.githubusercontent.com/100888647/165062165-f45082c7-0258-46fc-b4da-63642577a7dd.png)


## 3 Tomcat 설정

### 내장서버 인 경우
![image](https://user-images.githubusercontent.com/100888647/165062370-e925d53a-34c5-4b54-ac79-489f1c0e0a5a.png)

### 그 외 
tomcat 안의 server.xml 에 다음과 같이 추가해 줍니다.

<Connector port="8443" protocol="org.apache.coyote.http11.Http11Protocol"
           maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
           clientAuth="false" sslProtocol="TLS" 
           keystoreFile="D:\tomcatkeystore" keystorePass="namusoft" />
