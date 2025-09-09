package game;
import java.util.Scanner;
public class UpDown_2
{
	public static void main(String[] args) 
	{	// 프로그램을 실행하면, Up Down 게임을 할것인지 물어봄
		// 실행을 선택하면 / 정수 생성, 반복 정답 받기, 비교, 기회 소진
		// 1~100 범위가 아닌 입력에 대해서 예외처리 하기
		// 게임이 끝나면, 게임을 재시작할것인지 물어봄
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Up!! Down!! 게임 ------------------------");
			System.out.println("시작 : s / 종료 : q");
			String userInput = scan.nextLine();
			userInput = userInput.trim().toLowerCase();
			System.out.println("입력값 : " + userInput);
			if( userInput.equals("q") ) { // q, Q
				System.out.println("종료를 선택하셨습니다");
				break;
			}else if( userInput.equals("s") ) { // s, S
				System.out.println("시작을 선택하셨습니다");
			}else { // s,S,q,Q 이외의 키를 입력함
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			// 게임 진행
			System.out.println("게임을 진행합니다");
			int answer = (int)(Math.random()*100)+1;
			int life = 5;
			int userNumber = 0;
			System.out.println("생성된 정답 : " + answer);
			while(true) {
				System.out.println("남은 기회 : " + life);
				System.out.println("1에서 100사이의 정수를 입력하세요");
				userInput =  scan.nextLine();
				if( userInput == null || userInput.trim().equals("") ) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
				System.out.println("입력값 : " + userInput);
				// 사용자 입력이 정수이고, 1에서 100사이의 값인지 확인
				// 숫자로 이루어진 문자열을 정수 변환을 시도
				try {
					userNumber = Integer.parseInt(userInput);
				}catch( Exception e) {
					System.out.println("숫자가 아닙니다");
					continue;
				}
				// 1~100사이의 정수인가?
				if( userNumber < 1 || userNumber > 100 ) {
					System.out.println("1부터 100사이의 정수를 입력하세요");
					continue;
				}
				// 유저가 문자열을 입력했고, 공백이 아니고,
				// 숫자로 이루어져있고, 1~100사이의 정수
				System.out.println("사용자 입력 : " + userNumber);
				// 정답과, 사용자 입력값을 비교하는 내용
				if( answer == userNumber ) {
					System.out.println("정답입니다");
					break;
				}else {
					life--;
					if( life == 0 ) {
						System.out.println("모든 기회를 소진하였습니다");
						break;
					}else {
						if( userNumber < answer ) {
							System.out.println("Up!!!");
						}else {
							System.out.println("Down!!!");
						}
					}
				}
			}
		}
		scan.close();
	}
}