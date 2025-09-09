package ezen;
public class Ex11
{
	public static void main(String[] args)
	{	// 10번 반복을 하는 while문 예시
		int count = 10;
		while( count > 0 ) { // 10,9,8,7,6,5,4,3,2,1
			System.out.println(count);
			count--;
		}
		count = 10;
		while( count <= 100 ) { // 10,20,30,40,50,60,70,80,90,100
			System.out.println(count);
			count+=10;
		}
		count = 0;
		while( count < 10 ) { // 0,1,2,3,4,5,6,7,8,9
			System.out.println(count);
			count++;
		}
		count = 1;
		int sum = 0;
		while( count <= 10 ) { // 1,2,3,4,5,6,7,8,9,10
			System.out.println("현재 숫자 : " + count);
			//sum = sum + count;
			sum += count;
			System.out.println("현재 총합 : " + sum);
			count++;
		}
		System.out.println("최종 총합 : " + sum);
		
		// 1부터 100까지 모든 수의 총합을 구하세요
		count = 1;
		sum = 0;
		while( count <= 100 ) { // 1,2,3,4,5,6,7,8,9,10
			sum += count;
			count++;
		}
		System.out.println("최종 총합 : " + sum);
		
		int oddSum = 0;		// 홀수의 합을 저장할 변수
		int evenSum = 0;		// 짝수의 합을 저장할 변수
		// 1에서 10까지 정수중, 각각, 홀수의 총합과, 짝수의 총합을 구하세요
		count = 1;
		while( count <= 100 ) { // 1,2,3,4,5,6,7,8,9,10
			System.out.println(count);
			// count가 홀수면 oddSum에 count를 더함
			// count가 짝수면 evenSum에 count를 더함
			if( count%2 == 0 ) { // 짝수임
				evenSum = evenSum + count;	// evenSum += count;
			}else {	// 홀수
				oddSum = oddSum + count;		// oddSum += count; 
			}
			count++;
		}
		// 1,3,5,7,9 -> 25
		System.out.println("홀수의 합 : " + oddSum);
		// 2,4,6,8,10 -> 30 
		System.out.println("짝수의 합 : " + evenSum);
		
		oddSum = 0;		// 홀수의 합을 저장할 변수
		count = 1;
		while( count <= 100 ) {	// 1,3,5,7,9 ... 97, 99 -> 50번 반복
			System.out.println(count);
			oddSum = oddSum + count;		// oddSum += count; 
			count+=2; // 1에서 2를 증가 시키면 3이됨
		}
		System.out.println("홀수의 합 : " + oddSum);
	}
}