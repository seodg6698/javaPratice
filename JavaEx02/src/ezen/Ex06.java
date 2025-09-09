package ezen;
public class Ex06
{
	public static void main(String[] args)
	{
		// 반복문
		
		// 예시 : 1부터 100까지 정수들을 순서대로 3의 배수인지 확인 후 3의 배수이면 출력하세요
		
		/*	조건식에 사용할 변수를 선언
			조건식에 사용할 변수에 값을 대입
			while(조건식){
				조건식이 참일때 수행할 내용
				조건식에 사용하는 변수의 값을 변경
				더 이상 수행할 내용이 없으면 다시 조건식을 확인하고
				참이면 코드 블럭을 수행합니다(반복)
				
				** 조건식이 거짓이면 이 코드 블럭을 수행하지 않고,
				   코드 블럭을 나갑니다(반복을 중단합니다)
			}	*/
		// 1부터 10까지 1씩 증가하면서 숫자를 출력하는 반복문
		int number = 1;
		while ( number <= 10 ) {
			System.out.println("number의 값 : " + number);
			number++;
		}
		System.out.println("-----------------------");
		while ( number <= 10 ) {
			System.out.println("number의 값 : " + number);
			number++;
		}
	}
}