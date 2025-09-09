package ezen;
public class Ex02
{
	public static void main(String[] args)
	{
		// 반복문의 제어
		// break; 반복을 종료
		for( int i = 0 ; i < 100 ; i++ ) {	// 0부터 99까지 반복
			if( i == 10 ) {	// i가 10이면
				// 반복문 내에서 break;를 실행하게 되면
				// 반복문을 종료합니다
				break;
			}
			System.out.println(i);
		}
		// continue; 다음 반복으로 진행
		for ( int i = 1 ; i <= 100 ; i++ ) {
			if( i % 2 == 0 ) {
				// 반복문 내에서 continue;를 실행하면
				// 이후의 코드를 실행하지 않고, 다음 반복으로 진행
				System.out.println("짝수!");
				continue;
			}
			System.out.println("i : " + i);
		}
		// 나와 컴퓨터가 주사위를 굴려 내가 이길때까지 반복
		int myDice = 0;
		int comDice = 0 ;
		while(true) {
			myDice = (int)(Math.random()*10%6)+1;
			comDice = (int)(Math.random()*10%6)+1;
			//System.out.println("내 주사위 : " + myDice);
			//System.out.println("컴 주사위 : " + comDice);
			System.out.println( myDice + " vs " + comDice);
			if( myDice > comDice ) {
				System.out.println("승리");
				break;
			}else if( myDice < comDice  ) {
				System.out.println("패배");
				continue;
			}
			System.out.println("무승부");
		}
		System.out.println("------------");
		while(true) {
			myDice = (int)(Math.random()*10%6)+1;
			myDice += (int)(Math.random()*10%6)+1;
			comDice = (int)(Math.random()*10%6)+1;
			comDice += (int)(Math.random()*10%6)+1;
			System.out.println( myDice + " vs " + comDice);
			if( myDice > comDice ) {
				System.out.println("승리");
				break;
			}else if( myDice < comDice  ) {
				System.out.println("패배");
				continue;
			}
			System.out.println("무승부");
		}
	}
}