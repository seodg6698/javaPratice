package ezen;
public class Ex03
{
	public static void main(String[] args)
	{
		// for문의 중첩
		for ( int i = 1 ; i < 10 ; i++ ) {
			System.out.println(i);
		}
		for ( int j = 1 ; j < 10 ; j++ ) {
			System.out.println(j);
		}
		for ( int i = 1 ; i < 10 ; i++ ) {
			System.out.println( "i : " + i );
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.println( "j : " + j );
			}
		}
		// 2단부터 9단까지 구구단을 출력하세요
		for ( int i = 2 ; i < 10 ; i++ ) {
			System.out.println("---------------------");
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.println( i + " × " + j + " = " + ( i * j ) );
			}
		}
	}
}