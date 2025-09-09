package ezen;
public class Ex02
{
	public static void main(String[] args) {
		int score = 0;		// 점수를 넣을 변수 선언
		int result = 0;		// 계산 결과를 담을 변수 선언
		System.out.println("score의 값 : " + score);
		System.out.println("--------------------------");
		// 변수의 값을 변경
		// = 대입연산자 score(왼쪽변수)에 90(값)을 넣으세요(대입)
		score = 90;
		System.out.println("score의 값 : " + score);
		result = 1 + 2;
		System.out.println("result의 값 : " + result);
		System.out.println("1 + 2의 값 : " + 1 + 2 );
		// "1 + 2의 값 : 12"
		System.out.println("1 + 2의 값 : " + (1 + 2) );
		// "1 + 2의 값 : 3"
		System.out.print("1 + 2의 값 : ");
		System.out.println(1 + 2);
		// x, y 정수형 변수 선언
		int x,y;
		x = 10;
		y = 3;
		result = x + y;
		System.out.println("result의 값 : " + result);
		result = x - y;
		System.out.println("result의 값 : " + result);
		result = x * y;
		System.out.println("result의 값 : " + result);
		// 정수의 나눗셈 결과를 '정수형' result에 대입
		result = x / y;		// 나눈 몫을 구하는 연산자
		System.out.println("result의 값 : " + result);
		result = x % y;		// 나눈 나머지를 구하는 연산자
		System.out.println("result의 값 : " + result);
		// 정수의 0으로 나눔 문제
		y = 0;
		//result = x / y;
		//System.out.println("result의 값 : " + result);
		// 자바에서 정수를 0으로 나누는것은 허용되지 않습니다
		// 초기화되지 않은 변수는 호출 할 수 없습니다
		int z;
		//System.out.println(z);
	}
}