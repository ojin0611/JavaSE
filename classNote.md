7/15
# PC 포맷

window + R > cmd 
```
ipconfig
ipconfig /all
```
총 5줄 필요 : IP, 서브넷 마스크, 게이트웨이, DNS서버(2줄)을 얻어서 직접 입력해줘야한다.
# Java
Java는 오라클 + IBM + Sun이 만든 언어. 이후 오라클이 Sun을 인수함.  
Oracle Java : 오라클 정품 자바  
OpenJDK : 오픈소스인데 개발 책임이 오라클한테 있음  
**Java SE = Oracle Java + OpenJDK**

마케팅 관점에서 Java
- Java SE : Standard Edition (Core Java)
- Java EE : Enterprise Edition
- Java ME : Micro Edition

자바로 프로그래밍을 하기 위해선 Java Developer Kit (JDK)가 필요하다.  
자바(또는 자바로 만든 프로그램)를 실행하려면 Java Runtime Environment(JRE)가 깔려있어야한다.  
JRE는 개발하기 위한 프로그램이 아닌, 실행을 가능하게 하는 역할만 갖고 있다. Java Developer Kit가 있어야 개발을 할 수 있다.  즉, JRE는 소비자용, JDK는 개발자용이다.  
JDK를 설치하면 JRE가 포함되어있다.  
**JDK = JDK + JRE**

애초에 윈도우는 소비자가 쉽게 쓰기 위한 OS, 개발을 위한 OS는 Linux Mac.  
윈도우에는 JRE가 없고, 나머지에는 JRE가 있음. (오라클이랑 MS가 사이안좋아서)


## 자바 (JDK + JRE) 설치방법
참고링크 : http://codechobo.com

openjdk : https://openjdk.java.net/ 에서 아래 링크 클릭  
jdk 14 : https://jdk.java.net/14/ > 여기서 Windows : zip 다운로드  
압축해제 후, C:\Program Files 로 옮겨준다 -> C:\Program Files\jdk-14.0.2
> 윈도우는 기본적으로 다운로드된 파일의 위치가 Program Files다.


## 자바를 실행하기 위한 환경설정
window + r > SystemPropertiesAdvanced > 환경 변수
> 사용자 변수 : 사용자에 따라 다른 환경 변수
> 시스템 변수 : 같은 컴퓨터를 쓰는 사람들이 공유하는 환경 변수

시스템 변수 > 새로 만들기 > 변수 이름: JAVA_HOME, 변수값 : jdk-14.0.2의 위치 (C:\Program Files\jdk-14.0.2)  
시스템 변수 > Path > 편집 > 새로 만들기 > %JAVA_HOME%\bin
> JAVA_HOME : 자바를 실행할 때 참조하는 자바 위치(자바를 설치했다면 생김)
> 시스템 변수를 재활용할 때는 %MySystemVariable%, 이를 이용해 Path에 추가해줌.
> 우선순위가 있으므로, Path 내에서  JAVA_HOME을 맨 위로 올려주면 먼저 탐색한다.

## 환경설정 확인
window + r > cmd
```
echo %JAVA_HOME%
echo %PATH%
javac --version
java --version
```

## JDK 14 Documentation (Java API문서)
오라클에서 다운로드 : https://www.oracle.com/downloads/  
압축해제 후, C:\Program Files\jdk-14.0.2 로 옮겨준다. -> C:\Program Files\jdk-14.0.2\docs  
온라인 문서 : https://docs.oracle.com/en/java/javase/14/docs/api/index.html   
> firefox를 북마크용으로 사용
> documentation은 다운받은 후, 로컬 경로를 북마크에 저장

## Hello Java
```java
// HelloWorld.java
public class HelloWorld{
	public static void main(String [] args){
		System.out.println("Hello, World");
	}
}
```
메모장으로 코딩할 때, 확장자는 모든 파일(*.*), 파일명은 클래스 이름(HelloWorld.java)과 똑같이 설정한다.

### 실행
window + r > cmd > cd D:\JavaHome
```
> javac HelloWorld.java ------> 컴파일
> dir                   ------> 생성된 클래스 HelloWorld.class 확인
> java HelloWorld       ------> Hello, World 출력
```

## JVM
Java virtual machine. 자바를 실행하기 위한 가상 기계다. 머신은 영어권에서 컴퓨터를 부르는 말이다. JRE는 JVM 안에 설치돼있다.  
자바로 작성된 애플리케이션은 모두 JVM에서만 실행된다. 쉽게 말해, JVM은 통역사고, 여행갔을 때 통역사에게 이야기를 한다고 생각하면 된다. (반면 C언어는 직접 언어를 공부해서 여행에서 써먹는것이다. )  
실행 시 해석(interpret)되기때문에 속도가 느리다는 단점을 갖고 있다.  느려서 게임이나 GUI는 못 만든다.
하지만 멀티플랫폼이다. 어디서든 JVM만 있다면 실행가능!
**Write Once, Run Anywhere!**

## 기타
복종순  
- javaexpert@nate.com
- github.com/swacademy


숙제
1. 컴퓨터(노트북) 사양 : OS, CPU, Memory, HDD
2. 자기소개서(+프로그래밍 경험), 강사에게바라는 점 + 피드백
3. java 설치 후, 캡쳐
```
java --version
javac --version
Javadoc API 다운로드 후, 북마크한것
```





