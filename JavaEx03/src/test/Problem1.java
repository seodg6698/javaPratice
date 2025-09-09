package test;
import java.util.Scanner;

public class Problem1
{
	public static void main(String[] args)
	{
		// 입장객의 키와 몸무게를 입력 받고
		// 키 150cm 이상
		// 몸무게 40kg 이상
		// 일때 : "입장가능" 출력
		// 아니면 : "입장불가" 출력
		// java에서 입력을 받기 위해 필요한 라이브러리 가져오기
		
		// [0] : 필요한 객체나 변수 선언 및 초기화
		String str = "";
		Scanner scan = new Scanner(System.in);
		// 입장 가능 여부를 판단할 기준점
		double MIN_HEIGHT = 150.0;
		double MIN_WEIGHT = 40.0;
		
		double weight;	// 입장객의 몸무게를 저장할 변수
		double height;	// 입장객의 키를 저장할 변수
		
		// 입력값의 유효 범위를 확인하고, 유효하지 않으면 다시 입력을 받아야 함
		while(true) {
			System.out.println("키를 입력하세요 [단위 cm / 기준 150cm 이상] ");
			// 입력 값의 유효 범위 0 ~ 200.0
			// 입장 가부의 판별 기준 150
			// scan.nextInt(); 정수를 입력 받음
			height = scan.nextDouble();	// 실수를 입력 받음
			// 유효 범위 확인
			/*if ( weight < 0) {
				System.out.println("입력값이 잘못되었습니다 [입력값 : " + weight + "]");
				System.out.println("입력값은 양의수여야 합니다");
			}*/
			if ( height < 0 || height > 200 ) {
				System.out.println("입력값이 잘못되었습니다 [입력값 : " + height + "]");
				continue;
			}
			// 입장 가부 판별
			if ( height < MIN_HEIGHT ) {
				System.out.println("기준치 미달로 입장할 수 없습니다 [사유:키 부족]");
				break;
			}
			System.out.println("몸무게를 입력하세요 [단위 kg / 기준 40kg 이상] ");
			weight =  scan.nextDouble();
			if ( weight < 0 || weight > 100 ) {
				System.out.println("입력값이 잘못되었습니다 [입력값 : " + height + "]");
				continue;
			}
			if ( weight < MIN_WEIGHT ) {
				System.out.println("기준치 미달로 입장할 수 없습니다 [사유:몸무게 부족]");
				break;
			}
			// 입장 조건을 모두 만족함
			System.out.println("입장이 가능합니다");
			// break; 1명만 판별할때에는 중단 // 연속으로 입장객 판별할때는 필요 없음
		}
	}
}