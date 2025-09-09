package ezen;
public class Ex01
{
	public static void main(String[] args)
	{
		// for문
		/*	for (	조건을 확인하는데 사용할 변수를 선언, 초기화 ;
					반복 여부를 확인할 조건문 ;
					변수의 값을 변화하는 식 	) {
				반복 조건을 만족할때 수행할 내용
			}	*/
		for( int number = 0 ; number < 10; number++ ) {
			System.out.println(number);
		}
		//System.out.println(number);
		// number변수는 for문의 코드블럭 내부에 존재하는 지역변수
		/* for문의 조건들을 작성하지 않으면 멈추지 않습니다
		for (;;) {
			System.out.println("for문이 실행되고 있습니다");
		}	*/
		System.out.println("------------");
		// 1부터 10까지 정수를 출력하세요
		for( int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 10부터 1까지 정수를 출력하세요
		for( int i = 10; i > 0; i-- ) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 1부터 10까지 정수의 총 합을 구하세요
		int sum = 0;
		for ( int i = 1; i <= 10 ; i++ ) {
			int number = 0;	// 각 반복마다 새로 할당
			sum += i;
		}
		System.out.println(sum);
		//for문 내부에서 선언한 number는 for문 밖에서 인식 안됨
		//System.out.println(number);
		System.out.println("------------");
		// 구구단 2단을 출력하세요
		for ( int i = 1 ; i < 10 ; i++ ) {
			System.out.println( "2 × " + i + " = " + 2*i );
		}
		System.out.println("------------");
		// 1에서 100까지 정수중 홀수의 합과 짝수의 합을 구하세요
		int oddSum = 0;
		int evenSum = 0;
		for ( int i = 1 ; i <= 100 ; i++ ) {
			if ( i % 2 == 0 ) {	// 짝수 : evenSum
				evenSum += i;
			}else {	// 홀수 : oddSum
				oddSum += i;
			}
		}
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}
}