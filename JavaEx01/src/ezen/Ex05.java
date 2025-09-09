package ezen;
public class Ex05
{
	public static void main(String[] args)
	{
		// 논리 연산자 AND OR NOT
		// AND &&
		boolean result ;
		result = true && true;			// true
		System.out.println(result);
		result = true && false;			// false
		System.out.println(result);
		result = false && true;			// false
		System.out.println(result);
		result = false && false;		// false
		// OR ||
		System.out.println(result);
		result = true || true;			// true
		System.out.println(result);
		result = true || false;			// true
		System.out.println(result);
		result = false || true;			// true
		System.out.println(result);
		result = false || false;		// false
		System.out.println(result);
		
		boolean a,b;
		a = (1<2);		// 결과를 boolean으로 반환하는 연산식
		b = (1>=2);		//
		result = a && b;
		System.out.println(result);
		result = a || b;
		System.out.println(result);
		// 부정 !
		System.out.println(!result);
	}
}