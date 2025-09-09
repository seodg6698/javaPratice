package classEx;
public class Gugu
{
	public void printGugu( int dan ) { // dan을 입력받아 1개의 구구단을 출력하는 메소드
		System.out.println("선택된 단 : " + dan);
		// 구구단 출력 코드
		for( int num = 1; num < 10; num++ ) {
			System.out.println( dan + "*" + num + "=" + (dan*num) );
		}
	}
	public void printGuguAll() { // 2단부터 9단까지 한꺼번에 출력하는 메소드
		for( int dan = 2; dan < 10; dan++ ) {
			this.printGugu(dan);
		}
	}
}