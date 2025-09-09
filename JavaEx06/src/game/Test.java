package game;
import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력해주세요");
		int number = scan.nextInt(); // 입력 중 정수만 가져옴 : 엔터가 남음
		scan.nextLine(); // 엔터 처리
		System.out.println(number);
		System.out.println("문자를 입력해주세요");
		String str = scan.nextLine();
		System.out.println("입력값 : "+str);
		
	}
}