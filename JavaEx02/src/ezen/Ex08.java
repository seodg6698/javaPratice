package ezen;
public class Ex08
{
	public static void main(String[] args)
	{
		// 1부터 10까지 while문으로 출력해주세요
		int count = 0; // 작업 회수를 기록하는 변수
		// count -> 0,1,2,3,4,5,6,7,8,9 -> 10번
		int number = 1;
		while( count < 10 ) {
			//System.out.println( "작업 회차 : " + ( count + 1 ) );
			System.out.println( "count : " + count );
			System.out.println("number : " + number);
			count++;
			number++;
		}
		// while문의 중첩
		// A-1, A-2, A-3, ... A-9 -> 9번 작업
		count = 0;
		while ( count < 9 ) {	// 0,1,2,3,4,5,6,7,8
			System.out.println("A-"+(count+1));
			count++;
		}
		// 1-1, 1-2, 1-3, ... 1-9
		// 2-1, 2-2, 2-3, ... 2-9 
		count = 0;
		while ( count < 2 ) {	// 0,1
			number = 0;
			while( number < 9 ) { // 9번 반복
				System.out.println( (count + 1 ) +  "-" + ( number + 1 ) );
				number++;
			}
			count++;
		}
		
		System.out.println("---------");
		count = 1;
		while ( count <= 9 ) {	// 1,2,3,4,5,6,7,8,9
			number = 1;
			while( number <= 9 ) { // 1,2,3,4,5,6,7,8,9
				System.out.println( count +  "-" + number );
				number++;
			}
			count++;
			System.out.println("---------");
		}
		
		System.out.println("---------");
		count = 2;
		while ( count <= 9 ) {	// 2,3,4,5,6,7,8,9
			number = 1;
			while( number <= 9 ) { // 1,2,3,4,5,6,7,8,9
				System.out.print( count +  " * " + number + " = ");
				System.out.println( count * number );
				number++;
			}
			count++;
			System.out.println("---------");
		}
	}
}