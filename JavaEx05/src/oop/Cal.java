package oop;

public class Cal
{	// 초등학생용 간단 계산기
	private int x = 0;
	private int y = 0;
	private int result = 0;
	// i, j를 양의 정수만 입력 / 음수가 들어오면 양수에 '-' 기호를 잘못 붙였다라고 가정 / 음수를 양수로 변환
	// private 접근 제어자 : 해당 클래스 내부에서만 접근
	private int checkValue( int v ) {
		if( v < 0 ) { 
			v = -v;
		}
		return v;
	}
	public int add( int i, int j ) {
		x = this.checkValue(i);
		y = checkValue(j);
		System.out.println( x + " + " + y + "를 수행합니다");
		result = x + y;
		return result;
	}
	public int sub( int i, int j ) {
		x = checkValue(i);
		y = checkValue(j);
		System.out.println( x + " - " + y + "를 수행합니다");
		result = x - y;
		return result;
	}
	public int mul( int i, int j ) {
		x = checkValue(i);
		y = checkValue(j);
		System.out.println( x + " * " + y + "를 수행합니다");
		result = x * y;
		return result;
	}
	public int div( int i, int j ) {
		if ( j == 0 ) {
			System.out.println("0으로 나눌 수 없습니다");
			return -1;
		}
		x = checkValue(i);
		y = checkValue(j);
		System.out.println( x + " / " + y + "를 수행합니다");
		result = x / y;
		return result;
	}
	public int lastResult() {
		System.out.println("마지막 연산 결과를 가져옵니다");
		return result;
	}
}
