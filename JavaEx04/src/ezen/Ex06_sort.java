package ezen;
public class Ex06_sort
{
	public static void main(String[] args)
	{	// 배열의 원소를 정렬하기
		int[] scores = { 60, 80, 95, 75, 45, 86, 55, 68, 99, 32, 100, 76 };
		//for( int i = 0; i < scores.length - 1; i++ ) {
		for( int i = 0; i < scores.length; i++ ) {
			for( int j = i + 1; j < scores.length; j++ ) {
				System.out.print( i + " : " + scores[i] +" vs ");
				System.out.println( j + " : " + scores[j]);
				if( scores[i] > scores[j] ) { // scores[i]와 scores[j]의 값을 비교해서
					// 작은 숫자의 원소를 앞으로, 큰 숫자를 뒤로
					// 두 변수의 값을 서로 바꿀때에는 임시저장공간이 반드시 필요합니다
					int temp = scores[i];
					scores[i] = scores[j];	// 더 작은 숫자를 scores[i]에 넣고
					scores[j] = temp;		// 더 큰 숫자를 scores[j]에 넣고
				}
			}
		}
		for( int i = 0; i < scores.length; i++ ) { // 정렬된 배열의 원소 확인
			System.out.println(scores[i]);
		}
	}
}