package ezen;
public class Ex12
{
	public static void main(String[] args)
	{
		// Math.random()
		// 0에서 1미만의 실수를 생성
		double d = Math.random();
		System.out.println(d);
		// 0 ~ 1.123 10미만
		// 1의 자리수에 올수 있는 숫자
		// 0,1,2,3,4,5,6,7,8,9
		// d를 10으로 나눈 나머지
		// (0,1,2,3,4,5,6,7,8,9) +1
		// 1,2,3,4,5,6,7,8,9,10
		int result = (int)(d * 10%10)+1;
		
		// 정수를 6으로 나눈 나머지의 범위
		// 0,1,2,3,4,5
		// (0,1,2,3,4,5)+1
		// 1,2,3,4,5,6
		result = (int)(d * 10%6)+1;	// 6면체 주사위의 예
		System.out.println(result);
		
		result = (int)(d * 100%12)+1;	// 12면체 주사위의 예 
		System.out.println(result);
		result = (int)(d * 100%45)+1;	// 로또 번호의 예
		System.out.println(result);
		System.out.println("-----------");
		int count = 0;
		while ( count < 6 ) {
			d = Math.random();
			result = (int)(d * 100%45)+1;
			System.out.println(result);
			count++;
		}
	}
}