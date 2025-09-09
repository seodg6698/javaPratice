package oop;
public class CalTest
{
	public static void main(String[] args)
	{
		Cal cal = new Cal();
		int result = cal.add(-10, 5);
		System.out.println("result : " + result);
		result = cal.sub(123, -78);
		System.out.println("result : " + result);
		result = cal.mul(13, -7);
		System.out.println("result : " + result);
		result = cal.div(-13, 7);
		if( result == -1 ) {
			System.out.println("나눗셈 연산에 오류가 있었습니다");
		}else {
			System.out.println("result : " + result);
		}
		result = cal.div(13, 0);
		if( result == -1 ) {
			System.out.println("나눗셈 연산에 오류가 있었습니다");
		}else {
			System.out.println("result : " + result);
		}
		Cal myCal = new Cal();
		result = myCal.add(123, 321);
		System.out.println("result : " + result);
		
		System.out.println("cal 객체가 저장하고 있는 마지막 연산 결과 : " + cal.lastResult());
		System.out.println("myCal 객체가 저장하고 있는 마지막 연산 결과 : " + myCal.lastResult());
	}
}