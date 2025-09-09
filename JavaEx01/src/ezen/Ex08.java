package ezen;

public class Ex08
{
	public static void main(String[] args)
	{
		// 부호/증감 연산자
		
		// 숫자에 부호로 + - : 
		// 5 -> +5 / -5
		// -5 -> +-5 / --5
		int a = +10;
		int b = -10;
		a = +a;		// +(+10) -> 10
		b = -b;		// -(-10) -> 10
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("----------------------");
		// 증감 연산자
		// 5++ : 5를 1증가 해주세요
		// 5-- : 5를 1감소 해주세요
		System.out.println(a);
		System.out.println(b);
		//a++;
		//b--;
		System.out.println("----------------------");
		++a;
		--b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("32----------------------");
		a = a + 10;
		b = b - 10;
		a += 10;		// a = a + 10;의 축약 표현
		b -= 10;		// b = b - 10;의 축약 표현
		a += 1;
		b -= 1;
		a++;			// a += 1;의 축약 표현
		b--;			// b -= 1;의 축약 표현
		System.out.println("----------------------");
		a = 10;
		b = 5;
		System.out.println(a++);	// 10
		System.out.println(b--);	// 5
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------");
		a = 10;
		b = 5;
		System.out.println(++a); // ++a -> 10+1 -> a에 넣음 / a -> 11
		System.out.println(--b); // 4
		System.out.println(a);
		System.out.println(b);
		a = 10;
		b = 5;
		System.out.println(a++ + 10);
		// 출력에 사용된 a값 : 10 / a에 들어있는 값 : 11 / 출력 결과 20 
		System.out.println(b-- + 10);
		// 출력에 사용된 b값 : 5 / b에 들어있는 값 : 4 / 출력 결과 15  
		System.out.println(a);	// 11
		System.out.println(b);	// 4
		a = 10;
		b = 5;
		System.out.println(++a + 10);
		// 출력에 사용된 a값 : 11 / a에 들어있는 값 : 11 / 출력 결과 21
		System.out.println(--b + 10);
		// 출력에 사용된 b값 : 4 / b에 들어있는 값 : 4 / 출력 결과 14
		System.out.println(a);	// 11
		System.out.println(b);	// 4
	}
}