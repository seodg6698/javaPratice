package ezen;
public class Ex06
{
	public static void main(String[] args)
	{
		// 문자와 문자열
		char c;		// '' X
		c = 'A';	// 문자 타입은 ''로 감쌉니다
		
		// 문자열 타입
		// 문자열 타입은 기본타입 변수는 아닙니다
		String s = "";	// "" O,
		s= "ABCD";
		System.out.println(s);
		
		// 문자열 리터럴로 "사용하기
		s = "ABCD\"EFGH\"IJKL"; // "를 문자열을 감싸는 용도 말고 문자로 인식
		// \: 탈출문자 -> 문자열 내부에서 문자를 문자 이외의 용도로 사용
		System.out.println(s);
		s = "ABCD\nEFGH\nIJKL"; // n을 문자가 아닌 '줄바꿈'의 기능으로 사용
		System.out.println(s);
		s = "ABCD\tEFGH\tIJKL"; // t를 문자가 아닌 '탭'의 기능으로 사용
		System.out.println(s);
		s = "ABCD\\EFGH\\IJKL"; // \를 탈출문자가 아닌 \ 문자로 사용
		// 윈도우의 파일 경로에 \가 사용되어 '\\'를 사용하기도 합니다
		String path = "D:\\AI_service\\02.CODE\\JAVA\\JavaEx01\\src\\ezen";
		System.out.println(s);
		// \r \b ... 탈출문자는 여러가지 더 있습니다.
		// 다만 상황에 따라 동작하지 않는것도 있습니다
		
		System.out.print("안녕 ");
		System.out.print("하세요\n");
		System.out.print("자바 수업 어렵죠?\t");
		System.out.print("처음엔 다 그래요.");
	}
}