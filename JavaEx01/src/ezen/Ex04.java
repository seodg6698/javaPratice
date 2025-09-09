package ezen;
public class Ex04
{
	public static void main(String[] args)
	{
		// 논리형 변수 타입
		boolean value = true;
		System.out.println(value);
		value = false;
		System.out.println(value);
		// 논리 연산자
		// 연산의 결과가 논리형 데이터가 나오는 연산자들
		// 비교 연산자
		value = 11 < 2 ;	// A < B : A가 B보다 작습니까?
		System.out.println(value);
		value = 11 > 2 ;	// A > B : A가 B보다 큽니까?
		System.out.println(value);
		value = 11 == 2 ;	// A == B : A와 B가 같습니까?
		System.out.println(value);
		value = 11 != 2 ;	// A != B : A와 B가 다릅니까?
		System.out.println(value);
		value = !true;		// !A : A를 부정
		System.out.println(value);
		value = 2 <= 2 ;	// A <= B : A가 B보다 같거나 작습니까?
		System.out.println(value);
		value = 1 <= 2 ;	// A <= B : A가 B보다 같거나 작습니까?
		System.out.println(value);
		value = 3 >= 2 ;	// A >= B : A가 B보다 같거나 큽니까?
		System.out.println(value);
		value = 2 >= 2 ;	// A >= B : A가 B보다 같거나 큽니까?
		System.out.println(value);
	}
}