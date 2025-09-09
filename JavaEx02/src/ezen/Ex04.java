package ezen;
public class Ex04
{
	public static void main(String[] args)
	{
		int month;
		// 3,4,5 -> "봄입니다"
		// 6,7,8 -> "여름입니다"
		// 9,10,11 -> "가을입니다"
		// 12,1,2 -> "겨울입니다"
		// 1~12를 벗어나는 데이터일때에는 "데이터 오류입니다"
		// 출력하는 switch - case 를 작성하세요
		month = 0;
		switch ( month ) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄입니다");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름입니다");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을입니다");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("겨울입니다");
				break;
			default :
				System.out.println("데이터 오류입니다");
		}
	}
}