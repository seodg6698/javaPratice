package ezen;
public class Ex05
{
	public static void main(String[] args)
	{
		// switch case문을 이용해서
		// 회원의 나이를 바탕으로
		// 0세 ~ 9세 -> 영유아입니다
		// 10세 ~ 19세 -> 10대입니다
		// 20세 ~ 29세 -> 20대입니다
		// 30세 ~ 39세 -> 30대입니다
		int age = 0;
		age = 24;
		int result = age / 10 * 10 ;
		// 5세 -> 0 / 16세 -> 1 * 10 -> 10 / 27세 -> 2 * 10 -> 20
		switch ( result ) {
			case 0 :
				System.out.println("영유아입니다");
				break;
			case 10 :
				System.out.println( age + "세는 10대 입니다");
				break;
			case 20 :
				System.out.println( age + "세는 20대 입니다");
				break;
			case 30 :
				System.out.println( age + "세는 " + result + "대 입니다");
				break;
			default :
				System.out.println( "판별 범위를 벗어납니다" );
		}
	}
}