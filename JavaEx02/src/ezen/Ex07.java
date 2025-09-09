package ezen;
public class Ex07
{
	public static void main(String[] args)
	{
		int number = 1;
		// do { ... }while(조건식);
		do {		// 일단 do, 코드 블럭의 내용을 실행함
			System.out.println("number : " + number);
			number++;
		}while ( number <= 10 );
		// while(조건식) : 반복 조건을 만족하면 코드 블럭을 반복 
		System.out.println("----------------");
		// 위의 do - while 문으로 인해 number의 값은 11이 되어있음
		do {	 // 일단 실행
			System.out.println("number : " + number);
			number++;	// number의 값이 11에서 12로 변경됨
		}while ( number <= 10 ); // 반복 조건을 만족하지 않음
	}
}