package ezen;
import java.util.Scanner;
public class Ex05
{
	public static void main(String[] args)
	{	// [0] : 사용할 객체와 변수를 선언하고 초기화
		Scanner inputNum = new Scanner(System.in);
		int userSelect = 0;
		// [1] : 반복문 
		while(true) {
			// [2] : 유저에게 메세지 출력 (종료는0, 입력은 2~9)
			System.out.println("출력할 단 수를 입력하세요 : ");
			System.out.println("[종료:0 / 범위 2~9] ");
			// [3] : 입력받기
			userSelect = inputNum.nextInt();
			System.out.println("입력받은 숫자 : " + userSelect);
			// [4] : 입력값 확인 -> 0 : 반복 종료 / 2~9 : 출력 / 예외 : 메세지 출력
			if ( userSelect == 0 ) { // [4-1] 0 : break;
				System.out.println("종료를 선택하셨습니다");
				break;
			}else if ( userSelect >= 2 && userSelect <= 9 ) {
				// [4-2] 2~9 : 반복문으로 해당 입력 단 출력
				for ( int j = 1 ; j < 10 ; j++ ) {
					System.out.println( userSelect + " × " + j + " = " + ( userSelect * j ) );
				}
			}else { // [4-3] 0,2~9가 아닌 숫자 입력 : '잘못된 입력입니다'->반복
				System.out.println("잘못된 입력입니다");
			}
		}
	}
}
