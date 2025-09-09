package str;
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args)
	{	// 사용자가 명시적으로 종료를 선택할때까지 계속 동작하는 프로그램
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		while(true) {
			System.out.println("1:입금 | 2:출금 | 3:잔액조회");
			System.out.println("q:종료");
			userInput = scan.nextLine(); //엔터 입력시 엔터까지 문자열로 받아옴
			if (userInput == null || userInput.trim().equals("") ) {
				System.out.println("입력이 올바르지 않습니다");
				continue;
			}
			userInput = userInput.trim(); // 빈칸 제거
			if( userInput.toLowerCase().equals("q") ) {
				System.out.println("종료를 선택하셨습니다");
				break;
			}
			System.out.println("입력값 : " + userInput);
			switch(userInput) {
				case "1" :
					System.out.println("입금을 선택하셨습니다");
					break;
				case "2" :
					System.out.println("출금을 선택하셨습니다");
					break;
				case "3" :
					System.out.println("잔액조회를 선택하셨습니다");
					break;
				default :
					System.out.println("잘못입력하셨습니다");
			}
		}
	}
}