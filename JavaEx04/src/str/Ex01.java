package str;

import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args)
	{
		// String 타입 참조 변수와 String 객체
		// class의 객체를 생성해주는 메소드 : 생성자
		// 생성자 규칙 : 클래스와 같은 이름을 사용
		String str = new String("Hello");
		System.out.println(str);
		// String class가 제공하는 함수(메소드)들
		
		System.out.println(str.length()); // 문자열의 글자 개수를 반환
		str = " Hello, Ezen!!  ";
		System.out.println(str.length());
		str = ""; // char c = '';
		System.out.println(str.length());
		str = " Hello";
		str = "Hello ";
		str = "hello";
		str = " Hello, Ezen!!  ";
		
		String tmp = str.trim(); // 문자열 앞, 뒤의 빈칸을 제거한 결과를 반환
		System.out.println(str); // str에는 원본이 그대로 있음
		System.out.println(tmp); // 빈칸이 제거된 문자열
		str = str.trim();		 // str에 trim된 결과를 넣음
		System.out.println(str);
		
		// .equals(문자열 혹은 참조변수)
		String name = "전우치";
		System.out.println(name.equals("홍길동"));
		if( name.equals("") ) {
			System.out.println("문자열이 없습니다");
		}else if(name.equals("홍길동")) {
			System.out.println("홍길동님 반갑습니다");
		}else {
			System.out.println("누구세요?");
		}
		
		// 종료하려면 exit를 입력하세요
		String userInput = "Exit";
		userInput = "EXIT";
		userInput = "eXit";
		// 대소문자 변환
		System.out.println(userInput.toUpperCase()); // 문자열을 대문자로 변환 
		System.out.println(userInput.toLowerCase()); // 소문자로 변환
		userInput = userInput.toLowerCase();
		userInput = null;
//		if( userInput.equals("exit") ) {
//			System.out.println("종료합니다");
//		}
		if( userInput != null && userInput.equals("exit") ) {
			System.out.println("종료합니다");
		}
		if( "exit".equals(userInput) ) {
			System.out.println("종료합니다");
		}
		// 참조 변수가 null 참조인 상태에서는 해당 클래스의 메소드를 사용못함
		userInput = null;
		userInput = "Exit";
		// 메소드를 호출하기 전에, null 참조 확인 / 데이터 여부도 확인
		// 메소드는 연속해서 호출할 수 있음
		// "", " ", "  " 등 데이터가 없는 상황을 체크
		if( userInput == null ||  userInput.trim().equals("") ) {
			System.out.println("입력값이 올바르지 않습니다");
		}else if( userInput.trim().toLowerCase().equals("exit") ) {
			System.out.println("종료합니다");
		}else {
			System.out.println(userInput);
		}
		userInput = " eXiT "; // "", "  ", " exit", " EXIT ", "ezen" 
		if( userInput == null ||  userInput.trim().equals("") ) {
			System.out.println("입력값이 올바르지 않습니다");
		}else if( userInput.trim().toLowerCase().equals("exit") ) {
			System.out.println("종료합니다");
		}else {
			System.out.println(userInput);
		}
		
		// 문자열이 특정 문자열로 시작하는지 확인하는 메소드
		String url = "https://www.naver.com";
		if ( url.startsWith("https://")) {
			System.out.println("URL 문자열입니다");
		}else {
			System.out.println("문자열이 URL이 아닙니다");
		}
		url = "127.0.0.1:8080/ai_service.html";
		if ( url.startsWith("https://")) {
			System.out.println("URL 문자열입니다");
		}else if( url.endsWith(".html")) {
			// 문자열이 특정 문자열로 끝나는지 확인하는 메소드
			System.out.println("html 문서 주소입니다");
		}else {
			System.out.println("문자열이 URL이 아닙니다");
		}
		
		// 문자열 내부에 특정 문자열이 있는지 확인하는 메소드
		str = "Java, python, JS, HTML, SQL, UML";
		if ( str.contains("java") ) { // 대소문자 구분 함
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
		// JS -> JavaScript
		// 특정 문자열을 변경
		str.replace("JS", "JavaScript"); // (찾을문자열, 바꿀문자열)
		System.out.println(str);
		str = str.replace("JS", "JavaScript");
		System.out.println(str);
		
		// 문자열을 인덱스를 사용해서 자르는 메소드
		str = "0123456789";
		//     012 34567 89
		String result = str.substring(3, 8); // (시작인덱스,끝인덱스)
		// 끝 인덱스는 자를 인덱스 : 포함안됨
		System.out.println(result); // 34567 이 출력됨
		
		// System.out.println(str[0]); String을 배열처럼 인덱스 접근 X
		
		// html 문서에서 p태그의 내용을 가져오는 예제
		str = "<html><body> <p class='myP'>본문입니다 </p> </body> </html>";
		//     012345678901234567890123456789
		if( str.contains("<p class='myP'>") == false ) {
			System.out.println("<p>태그를 찾지 못했습니다");
		}else { // .indexOf() 문자열에서 특정문자열의 시작 인덱스 : 없으면 -1
			String targetTag = "<p class='myP'>";
			int startIndex = str.indexOf(targetTag); // <p>의 인덱스를 구함
			int endIndex = str.indexOf("</p>"); // </p>의 인덱스를 구함
			System.out.println(startIndex + ", " + endIndex);
			// "<p>"도 잘라야 하므로 targetTag 글자수 만큼 인덱스를 더함
			startIndex += targetTag.length();
			//<p>,</p> 사이의 문자열
			System.out.println(startIndex + ", " + endIndex);
			result = str.substring(startIndex, endIndex);
			System.out.println(result);
		}
	}
}