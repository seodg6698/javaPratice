package ezen;
public class Ex13
{
	public static void main(String[] args)
	{
		// 아래 코드를 참고해서 2단부터 9단까지 랜덤한 구구단을 출력하세요
		
		int target = (int)(Math.random() * 10%10)+1;
		int y = 1;
		System.out.println( target + " × " + y + " = " + ( target * y ) );
		// 원하는 숫자들 : 2,3,4,5,6,7,8,9 (8개)
		// (0+2), (1+2), (2+2), (3+2), (4+2), (5+2), (6+2), (7+2)
		// (0,1,2,3,4,5,6,7)을 2씩 더하면 동일 범위의 숫자가 완성됨
		// 0~7의 정수가 나오는 경우 -> 정수를 8로 나눈 나머지의 범위
		
		// 100을 8로 나눈 나머지에 2를 더한 숫자 10개를 랜덤하게 생성한 결과
		while( y < 10 ) {
			target = (int)(Math.random() * 10%8)+2;
			System.out.print(target + ", ");
			y++;
		}
		System.out.println("\n------------------");
		// 2부터 9사이의 랜덤한 숫자를 생성
		target = (int)(Math.random() * 10%8)+2;
		y = 1;
		while(y < 10) {
			System.out.println( target + " × " + y + " = " + ( target * y ) );
			y++;
		}
	}
}