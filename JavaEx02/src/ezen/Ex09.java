package ezen;
public class Ex09
{
	public static void main(String[] args)
	{
		int x = 2;
		while ( x <= 9 ) {	// 2,3,4,5,6,7,8,9
			int y = 1;	// x 기준으로 매 회차마다 새로운 y를 선언하고 사용
			while( y <= 9 ) { // 1,2,3,4,5,6,7,8,9
				System.out.println( x + " * " + y + " = " + ( x * y ) );
				y++;
			}
			x++;
			System.out.println("---------");
		}
		//System.out.println(y);  int y는 지역변수로 16라인에서는 접근 불가
	}
}