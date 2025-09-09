package test;

public class Problem3
{
	public static void main(String[] args)
	{	// 3,6,9 게임 : 1에서 100까지 정수를 순서대로 순회하며 일의 자리나, 십의 자리에, 3,6,9중 하나가 나오면 "짝(숫자)" 두번 나오면 "짝짝(숫자)" 안나오면 숫자를 출력하세요
		// 1에서 100사이의 정수 n의 일의 자리 숫자와, 십의 자리 숫자를 넣을 변수
		int oneN, tenN;
		// 정수 n의 일의 자리 숫자와 십의 자리 숫자가 3,6,9일때를 확인할 플래그 변수
		boolean oneFlag, tenFlag;
		for( int n = 1; n <= 100; n++ ) {	// 정수 n은 1부터 100까지의 정수
			tenN = n / 10;					// 정수 n의 십의 자리수
			tenFlag = ( tenN == 3 || tenN == 6 || tenN == 9 );	// 십의 자리수가 3,6,9 중 하나
			oneN = n % 10;					// 정수 n의 일의 자리수
			oneFlag = ( oneN == 3 || oneN == 6 || oneN == 9 );	// 일의 자리수가 3,6,9 중 하나
			if( tenFlag && oneFlag ) {		// 십의 자리, 일의 자리 둘다 3,6,9 중 하나
				System.out.println("짝짝(" + n + ")");
			}else if ( oneFlag || tenFlag ) {	// 십의 자리, 일의 자리 둘 중 하나가 3,6,9 중 하나 
				System.out.println("짝(" + n + ")");
			}else {		// 십의 자리에도, 일의 자리에도 3,6,9가 없음
				System.out.println(n);
			}
		}
		/*if ( tenN == 3 || tenN == 6 || tenN == 9 ) { 
			// tenFlag에 true 저장
		}*/
		/*if ( oneN == 3 || oneN == 6 || oneN == 9 ) {
			// oneFlag에 true 저장
		}*/
	}
}