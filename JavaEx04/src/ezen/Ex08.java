package ezen;
public class Ex08
{
	public static void main(String[] args)
	{	// 기본형 변수와, 참조형 변수
		// 기본형 변수의 선언과 초기화
		int x = 10;
		int y = 3;
		// 기본형 변수는 값을 저장하고 있습니다
		System.out.println(x);
		// 대입연산자로, 값을 넣을 수 있습니다
		x = 300;
		System.out.println(x);
		// 참조형 변수의 선언과 객체의 생성
		// 객체 생성에는 new 키워드를 사용
		String str   = new String("hello, ezen");
		int[] scores = new int[10];
		// 참조형 변수에는 객체의 주소가 담겨있습니다
		System.out.println(scores);	// 주소 출력
		System.out.println(scores[0]); // 인덱스0의 내용 출력
		// String 타입은 기본형 변수의 사용성을 제공합니다
		System.out.println(str);
		str = "hi ezen!!";
		System.out.println(str);
		int[] arryA = null; // null 참조로 새 참조 변수를 선언
		scores[0] = 11;
		scores[1] = 22;
		// scores 참조 변수가 갖고 있는 주소 값을 arryA 참조 변수에 넣음
		arryA = scores;		// 그 결과 두 참조 변수는 같은 객체를 참조하게 됨
		System.out.println(scores[0] + " : " + arryA[0]); // 둘다 같은 값이 나옴
		System.out.println(scores[1] + " : " + arryA[1]); // 둘이 같은 배열을 참조중
		arryA[0] = 33;	// arryA의 원소 값을 변경
		System.out.println(scores[0] + " : " + arryA[0]); // 둘다 변경된 값 출력
		int[] arryB = {1,2,3,4,5};	// 선언과 초기화에만 허용하는 사용성
		// arryA = {1,2,3,4,5};	// 참조변수 arryA는 주소를 담습니다, 객체는 안됨
		System.out.println(arryA);
		arryA = null;	// arryA는 이제 어떤 객체도 참조하지 않음
		System.out.println(arryA);
		//System.out.println(arryA[0]); // null 참조 오류 발생
		arryA = arryB;
		System.out.println(arryA[0]);
		//arryA = str; // 두 참조 변수의 선언된 타입이 다르기에, 주소를 전달하지 못함
		
		// String 타입은 기본형 변수의 사용성을 제공하지만, 참조형 변수입니다
		// 명시적으로 String 클래스의 새 객체를 생성(new)하여
		// "홍길동" 문자열을 객체에 저장
		String str1 = new String("홍길동");
		// 문자열 저장 공간에서 "홍길동"이라는 문자열의 주소를 가져옴
		String str2 = "홍길동";
		System.out.println(str1);
		System.out.println(str2);
		// str1이 담고 있는 객체의 주소와, str2가 담고 있는 객체의 주소가 다름
		// 비교연산자 == 는 변수들의 값을 비교
		// 참조 변수는 '주소'를 값으로 갖고 있음
		// 결과적으로 같은 문자열 "홍길동"을 갖고 있는 두 객체를 참조하는
		// 두 참조변수 str1, str2에 저장되어있는 주소가 다르므로
		// 비교 연산자로는 두 참조변수가 참조하는 문자열이 같은지 판단하지 못함
		System.out.println(str1 == str2);
		// String의 내용이 같은지 비교하는 메소드
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("홍길동"));
		
	}
}