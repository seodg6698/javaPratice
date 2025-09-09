// class 이름은 파일명과 반드시 동일해야 합니다
public class Ex01
{
	/* main 메소드가 있어야,
	   해당 클래스를 시작점으로 사용할 수 있습니다 */
	public static void main(String[] args)
	{
		// 변수 : 값을 담는 그릇
		// 변수이름 : java 문법에 사용되는 키워드들은 쓸수 없습니다
		// 변수를 선언할때에 변수의 종류(타입)을 지정해야 합니다
		// 정수를 저장하는 변수의 선언
		// 변수타입 변수이름;
		int number;
		//System.out.println("number의 값 : " + number);
		// 변수의 사용 -> 변수에 값을 넣기 / 변수의 값을 가져오기
		// 선언된 변수에 값을 '처음' 넣는 행위 : 초기화
		number = 100;
		// 변수에 값이 저장되어있기 때문에, 값을 호출 할 수 있습니다
		System.out.println("number의 값 : " + number);
		// 변수의 선언과 초기화
		String text = "ezen it ac";
		System.out.println("text의 값 : " + text);
		// 주의 같은 이름으로 변수 선언은 할 수 없습니다
		//int number;
		// 컴퓨터의 자료 종류
		// byte -> 1byte -> 8bit -> 0~255 정수 저장
		// -128 ~ 0 ~ 127
		byte byteNumber = 127;
		// short -> 2byte 정수 ->  -32,768 ~ 0 ~ 32,767
		short shortNumber = 32767;
		
		// int -> 정수 -> integer -> 32bit -> 4byte
		// -2,147,483,648 ~ 0 ~ 2,147,483,647 
		number = 2147483647;
		// 10 -> 2진법 8진법 10진법 16진법
		// 12 -> 8진법 10진법 16진법
		// 18 -> 10진법 16진법
		// 1A -> 16진법
		number = 0b0101;		// 0b 뒤에 오는 숫자가 2진법입니다
		System.out.println("number의 값 : " + number);
		// 10진수 : 별도 표기 없음 // 0,1,2...8,9,10,11,12...,19,20...
		// 2진수 : 0b		// 0, 1, 10, 11 ...
		// 8진수 : 0			// 0,1,2,3...,7,10,11,12,...17,20...
		number = 010;
		System.out.println("number의 값 : " + number);
		// 16진수 : 0x		// 0~9,A,B,C,D,E,F -> 0~F,10,11~1E,1F,20
		number = 0x10;
		System.out.println("number의 값 : " + number);

		// long -> int 보다 긴 정수 -> 64bit -> 8byte
		long longNumber = 2147483648L;
		// 자릿수 표기는 _를 이용
		longNumber = 2_147_483_648L;
		System.out.println("longNumber의 값 : " + longNumber);
		// 숫자 2147483647를 넘어가는 2147483648는 int 정수가 아님
		// 숫자 뒤에 long 타입임을 명시 'L'
		
		// 문자를 저장하는 char 타입 : ''로 묶어야 합니다
		// char -> 2byte -> 16bit -> 0 ~ 65,535
		// ASCII -> 8bit -> 1byte -> 0 ~255
		char charValue = 'a';	// 'a' O, '' X // "", " "
		System.out.println("charValue의 값 : " + charValue);
		// char 문자를 순서대로 숫자 매칭
		charValue += 1; // a에 1을 더하면 다음 문자인 b가 저장됨
		System.out.println("charValue의 값 : " + charValue);
		charValue -= 2; // a에 1을 더하면 다음 문자인 b가 저장됨
		System.out.println("charValue의 값 : " + charValue);
		// = 대입 연산자
		// 변수 = 값
		// 값을 변수에 대입하세요 : 연산
		// A == B -> 비교 연산자
		// A와 B가 같습니까?
	}
}