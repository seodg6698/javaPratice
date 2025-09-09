package test;
public class Gugu
{	// 메소드 오버로딩을 이용하여
	public void gugu() { // gugu() -> 2~9단 출력
		for( int dan = 2; dan < 10; dan++ ) {
			this.gugu(dan);
		}
	}
	public void gugu( int dan ) { // gugu(숫자) -> 해당 단의 구구단을 출력
		for( int num = 1; num < 10; num++ ) {
			System.out.println( dan + "*" + num + "=" + (dan*num));
		}
	}
}