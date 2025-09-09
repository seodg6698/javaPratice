package ezen;
public class Ex10
{
	public static void main(String[] args)
	{
		// 짝수 : 2로 나눈 나머지가 0 / 홀수 : 2로 나눈 나머지가 1
		// while문을 사용해서 숫자 x가 1부터 10까지 변화할때
		// 숫자 x가 짝수이면, 숫자(짝수) 홀수이면, 숫자(홀수)를 출력하세요
		int x = 12;
		if ( x%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		x = 1;
		while ( x <= 10 ) {
			System.out.println( "X : " + x );
			x++;
		}
		
		x = 1;
		while ( x <= 10 ) {
			if ( x%2 == 0) {
				System.out.println( x + "(짝수)");
			}else {
				System.out.println( x + "(홀수)");
			}
			x++;
		}
	}
}