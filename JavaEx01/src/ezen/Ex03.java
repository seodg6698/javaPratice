package ezen;
public class Ex03
{
	public static void main(String[] args)
	{
		// 실수형 변수
		float f = 1.2f;		// float 타입 리터럴임을 명시
		// 소수점이 있는 실수 리터럴은 기본적으로 double로 인식 
		double d = 1.2;
		double pi = 3.14;
		// 반지름이 10인 원의 둘레 길이를 구하세요
		// 2 * pi(원주율) * r(반지름)
		double result = 0.0;
		result = 2 * pi * 10;
		System.out.println("원 둘레 길이 계산 값 : " + result);
		// 실수(부동소수점)의 산술연산
		result = 1.2 + 1.4;
		System.out.println("result의 값 : " + result);
		result = 1.2 - 1.4;
		System.out.println("result의 값 : " + result);
		result = 1.2 * 1.4;
		System.out.println("result의 값 : " + result);
		result = 1.2 / 1.4;
		System.out.println("result의 값 : " + result);
		// 실수의 0으로 나눔	 -> 부동소수점 표준에 의해 실수의 0 나눔은 무한대로 표기
		result = 1.2 / 0;
		System.out.println("result의 값 : " + result);
		// 실수의 0을 0으로 나눔 -> 숫자로 표현할 수 없음 Not a Number -> NaN
		result = 0.0 / 0.0;
		System.out.println("result의 값 : " + result);
	}
}