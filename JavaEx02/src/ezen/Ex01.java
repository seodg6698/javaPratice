package ezen;
public class Ex01
{
	public static void main(String[] args)
	{
		/* 조건문
		   조건문은 특정 조건에 따라, 처리 내용을
		   다르게 하고 싶을 때 사용하는 문법
		*/
		// 8세 미만      : 무료
		// 미성년(8~20)  : 청소년 요금
		// 성인          : 일반 요금
		// 65세 이상     : 노령 요금
		/*
			if (조건식:결과가 참/거짓) {
				조건식이 참일때 수행할 내용
			}
			
			if (조건식) {
				조건식이 참일때 수행할 내용
			}else{
				조건식이 거짓일때 수행할 내용
			}
			
			if (조건식A) {
				조건식A가 참일때 수행할 내용
			}else if (조건식B) {
				조건식A가 거짓이고,
				조건식B가 참일때 수행할 내용
			}else{
				조건식A가 거짓이고,
				조건식B도 거짓일때 수행할 내용
			}
			
			if (조건식A) {
				if (조건식B) {
					조건식A가 참이고, 조건식B도 참일때 수행할 내용
				}else{
					조건식A가 참이고, 조건식B는 거짓일때 수행할 내용
				}
			}else{
				if (조건식C) {
					조건식A가 거짓, 조건식C가 참일때 수행할 내용
				}else{
					조건식A가 거짓이고, 조건식C도 거짓일때 수행할 내용
				}
			}
		*/
		int age = -10;
		
		if ( age < 0 ) {
			System.out.println("나이 정보가 잘못되었습니다");
			System.out.println("다시 입력해주세요");
		}
		
		if ( age < 0 ) {
			System.out.println("나이 정보가 잘못되었습니다");
			System.out.println("다시 입력해주세요");
		}else {
			System.out.println("나이 정보가 잘 입력되었습니다");
			System.out.println("요금 분석을 시작합니다");
		}
		
		age = 15;
		if ( age < 8 ) {
			System.out.println("8세 미만 : 무료입니다");
		}else {
			System.out.println("8세 이상 : 유료입니다");
		}
		
		if ( age < 8 ) {
			System.out.println("8세 미만 : 무료입니다");
		}else if( age < 20 ) {
			System.out.println("미성년(8~20) : 청소년 요금입니다");
		}else {
			System.out.println("성인입니다");
		}
		
		age = 75;
		if ( age < 8 ) {		// ~ 7
			System.out.println("8세 미만 : 무료입니다");
		}else if( age < 20 ) { // 8 ~ 19
			System.out.println("미성년(8~20) : 청소년 요금입니다");
		}else if( age < 65 ) {	// 20 ~ 64
			System.out.println("성인 : 일반 요금입니다");
		}else {	// 65~
			System.out.println("65세 이상 : 노령 요금입니다");
		}
		
		if ( age >= 65 ) {		// 65 ~
			System.out.println("65세 이상 : 노령 요금입니다");
		}else if( age >= 20 ) { // 20 ~ 64
			System.out.println("성인 : 일반 요금입니다");
		}else if( age >= 8 ) {	// 8 ~ 19
			System.out.println("미성년(8~20) : 청소년 요금입니다");
		}else {	// ~ 7
			System.out.println("8세 미만 : 무료입니다");
		}
		
		if (age < 20) {	// 미성년 : 성년 판별
			// 미성년
			if ( age < 8) {	// 미취학 : 청소년
				// 미취학 age : 음수 ~ 0 ~ 7
				System.out.println("8세 미만 : 무료입니다");
			}else{
				// 청소년
				System.out.println("미성년(8~20) : 청소년 요금입니다");
			}
		}else{	// 성년
			if (age < 65) { // 일반 : 노령
				// 일반 성인
				System.out.println("성인 : 일반 요금입니다");
			}else{
				// 노령 
				System.out.println("65세 이상 : 노령 요금입니다");
			}
		}
		// int score 변수에 0에서 100까지의 정수를 넣고
		// 100~90 : A / 89~80 : B / 79~70 : C / 69~0 : 재수강 / -1 ~ : 데이터 오류
		int score = 0;
		if ( (score >= 0) && (score <= 100 ) ) {
			// 자바에서는 변수 앞뒤로 비교연산하면 안됩니다
			// 0 <= score <= 100 : true/false <= 100
			// 두개의 비교연산식으로 나누어야 합니다
			// (0 <= score) && (score <= 100)
			// score는 0 ~ 100사이의 정수
			if ( score >= 90 ) { // 100 ~ 90
				System.out.println("A");
			}else if ( score >= 80 ) { // 89 ~ 80
				System.out.println("B");
			}else if ( score >= 70 ) { // 79 ~ 70
				System.out.println("C");
			}else { // 69 ~ 0
				System.out.println("재수강");
			}
		}else { // 점수가 음수이거나 100을 초과
			System.out.println("데이터 오류입니다");
		}
		
	}
}	