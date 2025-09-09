package ezen;
// 사용할 라이브러리 객체를 지정
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args)
	{
		// [0] : 필요한 변수들을 준비한다
		// import한 Scanner 객체를 생성
		// Scanner 클래스에서 inputNum 객체를 생성(new) 해주세요
		// 생성할때 시스템 입력장치를 연결하세요 Scanner(System.in)
		Scanner inputNum = new Scanner(System.in);
		int userSelect = 0;
		System.out.println("출력할 단 수를 입력하세요 : ");
		
		// [1] : 입력을 받는다
		// Scanner클래스의 객체인 inputNum을 이용해서, 입력장치(System.in)를
		// 이용해, 숫자를 입력
		userSelect = inputNum.nextInt();
		System.out.println("입력받은 숫자 : " + userSelect);
		
		// [2] : 입력값의 범위를 확인
		// 2단부터 9단 사이의 구구단 출력
		if ( userSelect < 2 || userSelect > 9 ) {
			System.out.println("범위를 벗어났습니다");
		}else {	// userSelect가 2 ~ 9 사이의 정수
			// [3] : 출력하기
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.println( userSelect + " × " + j + " = " + ( userSelect * j ) );
			}
		}
	}
}