package ezen;
public class Ex02
{
	public static void main(String[] args)
	{
		// 1. 변수 선언
		int number;
		// 2. 변수에 값을 넣음
		number = 22;	// 입력장치를 통해 입력 받았다고 가정
		// 3. 입력값 검증
		// 학급의 학생 명수 -> 음수 X / 정원 초과할 수 없음
		int MAX = 20;
		// number는 0 ~ 20 사이의 값만 갖고 있어 함
		if ( ( number >= 0 ) && ( number <= MAX ) ) {
			// 4-1. 입력값이 유효한 범위일때 수행할 내용
			System.out.println("입력 값 : " + number);
		}else {
			// 4-2. 입력값이 유효하지 않음
			System.out.println("입력값이 유효하지 않습니다");
			System.out.println("다시 입력해주세요");
		}
	}
}