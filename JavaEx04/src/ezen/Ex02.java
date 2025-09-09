package ezen;
public class Ex02
{
	public static void main(String[] args)
	{	// 정수 6개를 담을 수 있는 배열을 선언 후
		// 배열에 순서대로 랜덤한 숫자를 담으세요
		// 배열을 생성하고
		//int MAX = 6;
		//int[] lottos = new int[MAX];
		int[] lottos = new int[6];  
		for( int i = 0; i < 6; i ++ ) {
			// 배열의 인덱스로 i를 사용하여 값을 넣기
			lottos[i] = (int)(Math.random() * 100%45)+1;
		}
		// 배열에 저장된 로또 번호 출력해보기
		for( int i = 0; i < 6; i++ ) { // 0,1,2,3,4,5
			System.out.println(lottos[i]);
		}
		
		// 배열의 원소를 안전하게 접근하는 방법
		int MAX = 6;	// 원소 개수 지정
		int[] arrys = new int[MAX];
		for( int i = 0; i < MAX; i++ ) {
			System.out.println(arrys[i]);
		}
		// 배열의 원소 개수 : 배열이름.length
		System.out.println("배열 arrys의 원소 개수 : " + arrys.length);
		//arrys.length = 100; 
		// 배열의 원소 개수를 바탕으로 원소에 안전하게 접근
		for( int i = 0; i < arrys.length; i++ ) {
			// i는 배열 arrys의 인덱스 범위를 벗어나지 못함
			// i < arrys.length : 인덱스 범위 = 원소개수 - 1 까지
			System.out.println(arrys[i]);
		}
		
		// java 1.5 이후
		// 향상된 for문
		/*	for( 원소를 담을 변수 선언 : 원소가 여러개인 객체) {
				변수 이름으로 호출, 대입
			} */
		for( int item : lottos ) {
			// 각 반복마다 lottos에서 원소를 순서대로 꺼내어
			// item에 넣음
			System.out.println(item);
		}
	/*	lottos[0] = (int)(Math.random() * 100%45)+1;
		lottos[1] = (int)(Math.random() * 100%45)+1;
		lottos[2] = (int)(Math.random() * 100%45)+1;
		lottos[3] = (int)(Math.random() * 100%45)+1;
		lottos[4] = (int)(Math.random() * 100%45)+1;
		lottos[5] = (int)(Math.random() * 100%45)+1;	*/
		
	}
}