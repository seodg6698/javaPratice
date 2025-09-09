package ezen;
import java.util.Arrays;
public class Ex07_sort
{
	public static void main(String[] args)
	{
		int[] scores = { 60, 80, 95, 75, 45, 86, 55, 68, 99, 32, 100, 76 };
		
		// Arrays 클래스의 sort() 메소드를 활용
		Arrays.sort(scores);
		
		// Arrays 클래스의 '배열 원소들을 보기 좋게 출력하는 기능'을 활용
		System.out.println(Arrays.toString(scores));
		
		// 정렬된 결과를 확인
		for( int i = 0; i < scores.length; i++ ) {
			System.out.print(scores[i] + " ");
		}
	}
}
