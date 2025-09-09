package test;
import java.util.Scanner;

public class Problem2
{
	public static void main(String[] args)
	{
		// 학생 이름을 입력 받고 국어, 수학, 영어 시험 점수를 입력 받아 평균 점수를 입력하세요
		// 학생 이름을 저장할 변수 / 국어 점수 저장할 변수 /수학 점수 저장할 변수 / 영어 점수 저장할 변수 / 평균 점수를 저장할 변수

		// [0] 사용할 객체와 변수 선언과 초기화
		String name = "";
		Scanner scan = new Scanner(System.in);
		int koreanScore, mathScore, engScore;
		double avg = 0.0;
		
		// [1] 값 입력 받기
		System.out.println("학생 이름을 입력하세요");
		name = scan.nextLine(); // 입력값중에 '엔터'까지 가져옴
		System.out.println("이름 : " + name);
		while(true) {
			System.out.println("국어 점수를 입력하세요 [0~100]");
			koreanScore = scan.nextInt();
			if( koreanScore < 0 || koreanScore > 100 ) {
				System.out.println("오류 : 점수는 0이상 100이하의 정수여야 합니다");
				continue;
			}else {
				System.out.println("국어 점수 : " + koreanScore);
				break;
			}
		}
		while(true) {
			System.out.println("수학 점수를 입력하세요 [0~100]");
			mathScore = scan.nextInt();
			if( mathScore < 0 || mathScore > 100 ) {
				System.out.println("오류 : 점수는 0이상 100이하의 정수여야 합니다");
				continue;
			}else {
				System.out.println("수학 점수 : " + mathScore);
				break;
			}
		}
		while(true) {
			System.out.println("영어 점수를 입력하세요 [0~100]");
			engScore = scan.nextInt();
			if( engScore < 0 || engScore > 100 ) {
				System.out.println("오류 : 점수는 0이상 100이하의 정수여야 합니다");
				continue;
			}else {
				System.out.println("영어 점수 : " + engScore);
				break;
			}
		}
		// [2] 계산하기
		avg = ( koreanScore + mathScore + engScore ) / 3.0;
		// [3] 출력하기
		System.out.println( name + "의 시험 평균 점수는 " + avg);
	}
}