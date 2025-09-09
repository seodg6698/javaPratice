package ezen;
public class Ex03
{
	public static void main(String[] args)
	{
		// switch - case 문
		// if문으로 number 변수에 들어있는 값이 10인가? 를 확인
		// A < B -> A가 B보다 작은가?
		// A > B -> A가 B보다 큰가?
		// A == B -> A와 B가 같은가?
		// A != B -> A와 B가 다른가?
		int number;
		number = 10;
		if ( number == 10 ) { // 같음
			System.out.println("number의 값은 10입니다");
		}else { // 다름
			System.out.println("number의 값은 10이 아닙니다");
		}
		if ( number != 10 ) { // 다름
			System.out.println("number의 값은 10이 아닙니다");
		}else { // 같음
			System.out.println("number의 값은 10입니다");
		}
		/* switch - case 작성 문법
			switch (값을체크할변수이름) {
				case '값1' :
					변수의 값이 '값1'일때에 수행할 내용
					break;	// 작업을 중단하고, switch의 코드블럭을 나감
				case '값2' :
					변수의 값이 '값2'일때에 수행할 내용
					// break 키워드를 생략하면 다른 case를 만나도 계속 실행
				case '값3':
					수행내용
				case '값4':
					수행내용
					break;
				case '값5', '값6':
					수행내용
					break;
				default :
					변수의 값이 case에 해당하는 내용이 없었을 경우
			}
		 */
		// 고객의 등급을 저장할 변수 선언과 초기화
		String grade = ""; 
		// silver : 2% 적립 / gold : 5% 적립 / platinum : 10% 적립
		int price = 10000;	// 구매 상품 가격
		int point = 0;		// 적립 금액
		int per = 0;			// 적립률을 저장할 변수
		// 고객의 등급을 받아옴 (이라고 가정)
		grade = "vip";
		switch( grade ) {
			case "silver" :	// 고객이 silver 등급이면
				per = 2;		// 적립률에 2를 넣음
				break;
			case "gold" :	// 고객이 gold 등급이면
				per = 5;		// 적립률에 5를 넣음
				break;
			case "platinum" :
				per = 10;
				break;
			default :
				System.out.println("등급 정보가 올바르지 않습니다");
		}
		if( per != 0 ) {	// case에 해당하는 값이 아니면 여전히 per는 0
			point = price * per / 100 ;	// 적립금액을 계산
			System.out.println("고객의 등급은 " + grade + "입니다.");
			System.out.println("적립률은 " + per + "%입니다");
			System.out.println("이번 적립 금액은 " + point + "입니다");
		}
	}
}