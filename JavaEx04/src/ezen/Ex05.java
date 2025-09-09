package ezen;
public class Ex05
{
	public static void main(String[] args)
	{
		// 배열에 들어있는 원소들을 하나씩 꺼내가며 작업
		// 총합, 평균, 최소값, 최대값
		
		// [0] 초기화
		int[] scores = { 60, 80, 95, 75, 45, 86, 55, 68, 99, 32, 100, 76 };
		int sum = 0;
		double avg = 0.0;
		// 0으로 초기화
		int min = 0;
		int max = 0;
		// 이론적 초기화
		// Integer : 정수형 데이터를 다룰때 사용할 기능(함수:메소드)를 갖는 클래스
		min = Integer.MAX_VALUE;	// 정수(int)형에서 가장 큰 수
		max = Integer.MIN_VALUE;	// 정수형에서 가장 작은 수
		System.out.println(min);
		System.out.println(max);
		// 배열의 첫번째 원소로 초기화
		min = scores[0];
		max = scores[0];
		for( int i = 0; i < scores.length; i++ ) { // 0,1,2,3,4,5,6 
			sum += scores[i]; // 총합에 누적해나감
			// min에 들어있는 값이 scores[i]의 값보다 크면
			if( min  > scores[i] ) {
				min = scores[i]; // scores[i]의 값을 min에 넣음
			}
			if( max < scores[i] ) {
				max = scores[i];
			}
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		System.out.println("총합 : " + sum);
		avg = sum / (double)scores.length;
		System.out.println("평균 : " + avg);
	}
}