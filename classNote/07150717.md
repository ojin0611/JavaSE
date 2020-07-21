7/15
# PC 포맷
a.k.a. Windows 초기화  
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

책
남궁성 - 자바의 정석 3rd Edition (수업교재)  
<추천> 전병선 - 객체지향 이야기 (구글 도서관)


숙제
1. 컴퓨터(노트북) 사양 : OS, CPU, Memory, HDD
2. 자기소개서(+프로그래밍 경험), 강사에게바라는 점 + 피드백
3. java 설치 후, 캡쳐
```
java --version
javac --version
Javadoc API 다운로드 후, 북마크한것
```



-------

7/16

## 포맷 후 행동
1. 윈도우업데이트
	window > 설정 > 윈도우업데이트  
2. 프로그램 제거 또는 변경
	window+r > appwiz.cpl > McAfee 제거    

OOP --> CBD (Component Based Development) --> SOA(Service Oriented Architecture)  
Java로 OOP개념을 잡고, Spring할 때 CBD방법 사용. 이 때 RestfulAPI 활용 예정  



## HelloWorld 뜯어보기

```java
import java.lang.*; // 소스코드에 넣지 않아도, 필요하면 컴파일러가 자동으로 만들어냄
public class HelloWorld{
	public static void main(String [] args){
		System.out.print("한글 출력도 가능? "); // 줄 안바꿈
		System.out.println("한글 출력도 가능!"); // 줄바꿈
	}
}
```

.은 무엇의 아래에 있다는 뜻 (c언어 기준)  
Module = java.base  
Package = java.lang : 중국집, 치킨집 등 카테고리  

HelloWorld : 이름

void : return하는 값이 없다.

main(){} : 프로그램의 시작과 끝
[링크: java.lang에 속해있는 클래스 System에 대한 설명](file:///C:/Program%20Files/jdk-14.0.2/docs/api/java.base/java/lang/System.html) `클래스명의 첫 글자는 대문자 and 명사`

out : static PrintStream type. The "standard" output stream  
println(String x) : void type. prints a string and then terminate the line.

```
> javac HelloWorld.java  
> java HelloWorld  
한글 출력도 가능? 한글 출력도 가능!  
```

`java HelloWorld` 실행 시, 하드디스크에 있는 HelloWorld.class를 메모리에 로드한다. 이후에 클래스 파일의 형식과 악성코드유무 여부를 체크하고, 모두 통과했을 때 main()을 호출한다!
public class이면서 main함수를 갖고 있는 class의 이름으로 파일명을 저장해야한다.  
하나의 파일에 클래스가 여러개 있으면, 컴파일 시 각 클래스마다 클래스파일이 생겨서 이상해진다. one file, one class가 원칙

## EditPlus
메모장+cmd는 불편하므로, 자바는 EditPlus 이용

다운로드링크 : [editplus](https://www.editplus.com/)  

Tools > Preferences에서 Fonts, Templates 수정


User tools 설정하기 - Group Name : Java  
Tool 1
- Menu text : Java Compiler  
- Command : javac.exe (위치 찾아서)  
- Argument : $(FileName)
- Initial directory : $(FileDir)
- Action : Capture output >>>> cmd창을 캡쳐해서 보여주는것!

Tool 2
- Menu text : Java Run
- Cmd : java.exe
- Argument : $(FileNameNoExt) // 파일이름 확장자 없이

```Java
/*
작성자 : 
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

public class Test {
	public static void main(String[] args) {
		System.out.print("Core Java -> ");
		System.out.print("Oracle -> ");
		System.out.print("JDBC -> ");
		System.out.println("1차 프로젝트");
	}
}

```
이후, Ctrl + 1 누르면  `javac.exe Test.java`  
Ctrl + 2 누르면 `java.exe Test`


## Java의 특징
1. 운영체제에 독립적이다.
2. 객체지향언어다.
3. C++에 비해 비교적 배우기 쉽다.
4. 자동 메모리 관리 (Garbage Collection)
5. 네트워크와 분산처리를 지원한다.
6. 멀티쓰레드를 지원한다.
7. 동적 로딩(Dynamic Loading)을 지원한다.

### 컴파일러 (Compiler)
- 컴파일이란 소스코드에서 목적코드로 옮기는 것으로, 실행가능한 파일이 생성된다.
- 컴파일 언어로는 C-language, Java, C# 가 대표적이다.
- CPU에 맞도록 컴파일한다는 특징이 있어, CPU에 종속적이다.
- Java 는 특이하게 CPU에 종속되지 않도록 노력했지만 느리다.

### 인터프리터 (Interpreter)
- 번역과 실행을 동시에 한다.
- 소스코드를 한줄씩 읽으면서 실행하는 프로그램
- CPU에 종속되지 않는다.
- 인터프리터형 언어는 script 언어로, html5, css, JS, Ajax, jQuery, SQL, python이 있다.

## 진법
똑같은 10101111을 데이터 타입에 따라 다르게 읽을 수 있다.  
4개씩 짜르면 16진수.  
두 수의 빼기는 맨앞 숫자를 바꾼 후 연산해준다.  

- 27.42(8) = 010111.100010(2) = 23+0.5+1/32
- AF.8(16) = 10101111.1000(2) = 175.5 
- 100101101.0110101(2) = 12D.6A(16)
- 2F360(16) = 00101111001101100000(2) = 571540(8)
- 571(8) = 0000 0001 0111 1001(2)

## 기타
금주의 목표 : 프로그래밍에 대한 사전 지식  

파일공유 : [dropbox](https://www.dropbox.com/h)
PDF리더 : [foxit reader](https://www.foxitsoftware.com/)

Windows : OS. Microsoft 공식 상표  
Window : GUI

메모리를 기준으로, 메모리에 넣으면 입력, 메모리에서 나오면 출력  
표준 입력은 키보드 (standard input), 표준 출력은 모니터 (standard output)  

### 파일공유방법
공유하는사람

1. 폴더 공유 > 공유할 사람 선택
2. 네트워크 및 인터넷 설정 열기 > 공유 옵션

공유받는사람

`window+r > \\ip`

보통 5시까지 수업하고, 마지막 1시간은 리뷰(라는 이름의 시험)하는 시간을 가질 예정

---

7/17



# Chapter 2. Variable  

변수를 선언할 때는 변수타입과 변수이름을 선언한다.  
변수 타입은 변수에 저장될 값이 어떤 타입인지 지정하고, 변수이름은 말 그대로 변수에 붙인 이름이다.

## 기본형 (Primitive type)
built in 8개
- 수치형
	- 정수형
		- 문자형 (char)
		- 정수형 (byte, short, int, long)
	- 실수형 (float, double)
	- Boolean형 (boolean)
- 무치형 
	- void
> String은 참조형에 속한다.

## 참조형 (Reference)
user-defined. 필요해서 유저가 만든것. API  
class, interface, enum(나열)


variable : 단 하나의 값을 저장하기 위한 메모리 공간  
constant : 값을 한번만 저장할 수 있는 공간  
literal : 그 자체로 값을 의미하는 것  
value : 변수에 저장된 값	


정수형 literal : 24  
실수형 literal : 3.14  
문자형 literal : 'A'  
문자열형 literal : "AB"  

### 정수형
Integer : 4Byte  
Long : 8Byte

```Java
/*
	Literal
	1. 정수형 Literal : +,-, 24(10진수), 24L(Long), 0234(8진수), 0xCAFE(16진수), 0b0111001(2진수)
	2. 실수형 Literal : +,-, 3.14(실수데이터, 8바이트 double), 3.14f(4바이트 float), 3.14e-2(지수형데이터)
	3. 문자형 Literal : 'A'(문자데이터), '\n'(escape sequence, 특수문자)
	4. 문자열형 Literal : "강남구 역삼동 한독빌딩"
	5. Boolean형 Literal : true, false

*/
```

literal이 메모리에 저장되면 value가 된다.

## 음수의 2진표현 - 2의 보수법
4비트연산하기  
#### 5 - 2
5 + 2 = 7 // 0101 + 0010 = 0111  
5 - 2 = 5 + (-2) = ?  
> 1의 보수 : 0을 1로, 1을 0으로 만드는 것  
> 2의 보수 : 1의 보수 + 1  

-2 를 2진법으로 표현하는 과정
1. 1101 (1의 보수)
2. 1110 (2의 보수)

5 + (-2) = 0101 + 1110 = 10011 = 0011 (오버플로우) = 3

#### 15 - 8
15 + (-8) = ?

8 = 00001000  
-8 = 11110111 + 1 = 11111000

15 + (-8) = 00001111 + 11111000 = 100000111 = 00000111 (overflow) = 7

맨앞의 비트를 음수를 위해 지정해준 경우를 signed 비트라고 한다.  
반대로 음수가 아닌 경우에는 unsigned라고 한다.  
4비트의 경우, signed의 범위는 -8~7, unsigned의 범위는 0~15다.  
8비트의 경우, signed의 최대값은 01111111=127, 최소값은 -(127+1)=-128이다.  
n비트, signed의 범위 : -2^(n-1) ~ 2^(n-1) -1  

signed비트 = MSB  

CPU의 비트수가 높으면 메모리핸들링을 더 많이할 수 있다.  
so, 메모리가 많으면 그 메모리를 다쓰기위해 cpu를 여러개 끼는 경우도 있다.

## 실수형 - float, double
실수자료형은 숫자의 범위보다 `정밀도`가 중요하다.  
float: 단일정밀도,    
double: 이중정밀도,  

### 실수형의 저장형식
+-M * 2^E



## 출력
형식화된 출력 : printf()

printf + 자료형 관련 자바 코드는 0717폴더에 저장!


## 기타

OCJP는 프로그래밍 지식 없어도 딸 수 있는 25만원짜리, 비교적 쉬운 자격증  
public static String toBinaryString(int i) 뜻  
String : 반환하는 자료형  
int i : 입력하는 자료형  
toBinaryString : 클래스가 하는 역할  
static : 주소없이 찾아갈 수 있는 곳이라는 의미 (ex. 디즈니랜드) 대신 어디(클래스) 소속인지 말해줘야됨 (ex. 올랜도)  

서버의 종류 : machine, os, program, service    

[dropbox link](https://www.dropbox.com/home/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7)



주말숙제

1. 주제: character set 조사
2. 기한: 7/20 수업전
3. 요구사항:
	1) ASCII  
	2) 확장 ASCII  
	3) cp949  
	4) KS_C_5601-1987  
	5) ISO_8859_1  
	6) Unicode  
	7) UTF-8  
4. 기타: 반드시 A4용지에 손으로 작성