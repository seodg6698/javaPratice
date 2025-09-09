package game;
import java.util.Scanner;

public class UpDown_1
{
	public static void main(String[] args)
	{
		// Up Down 게임
		// 컴퓨터가 1에서 100사이의 정수를 선택
		// 난이도에 따라서 1~50이나 1~200을 선택할수도 있음
		// 주어진 기회동안 사용자가 정수를 선택하면
		// 정답 : 컴퓨터의 정수와 사용자의 정수가 같을때
		// Up!! : 사용자의 정수가 작을때
		// Down!! : 사용자의 정수가 클때
		// 를 판단하여 출력
		// 기회를 모두 소진하거나, 정답을 맞추면 게임 종료
		
		// 1 : 입력을 받을수 있는 Scanner 객체를 생성
		Scanner scan = new Scanner(System.in);
		// 2 : 변수들을 선언 초기화
		int answer = 0;
		int life = 5;
		int userInput = 0;
		// 3 : 랜덤한 정수 하나를 생성 (출력)
		answer = (int)(Math.random()*1000%100) + 1;
		System.out.println("생성된 정답 : " + answer);
		while(true) { // 4 : 반복문(기회) 사용자의 답변을 받음
			System.out.println("남은 기회 : " + life);
			System.out.println("정답을 입력하세요[1~100]");
			userInput = scan.nextInt();
			// 5 : 사용자 답과, 정답을 비교 
			if( userInput == answer ) { // 5-1 : 정답 : 정답입니다 출력 : 반복 종료
				System.out.println("정답입니다");
				break;
			}else { // 5-2 : 기회 소진
				life--;
				if(life == 0) {
					System.out.println("멍청이!!!");
					break;
				}
				if( userInput < answer ) { // 5-2-1 : 사용자 답이 작음 : Up!! 출력
					System.out.println("Up!!!");
				}else { // 5-2-2 : 사용자 답이 큼 : Down!!
					System.out.println("Down!!!");
				}
			}
		}
		scan.close();
	}
}