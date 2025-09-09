package ezen;
public class Ex03
{
	public static void main(String[] args)
	{
		// 정수 데이터를 저장하는 10칸짜리 배열
		int[] numbers = new int[10];
		// 데이터를 지정해서 생성 : 선언시에만 허용
		int[] arrys = { 10, 3, 7, 2, 6, 4 };
		// 배열의 원소 개수와 데이터 개수가 같더라도 허용하지 않음
		//numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(numbers);
		// 배열의 원소에 값을 넣어야 합니다
		// 배열의 원소에 직접 접근할때에는, 원소의 번호표(인덱스)를 사용
		numbers[0] = 11;	// 인덱스는 0부터 시작
		numbers[1] = 24;
		numbers[2] = 13;
		numbers[3] = 15;
		numbers[4] = 5;
		numbers[5] = 40;
		//numbers[9] = 19;
		//numbers[10] = 10; // 인덱스 범위는 0 ~ (원소개수-1)
		int n = 7;
		System.out.println(numbers[n]);
		// numbers 배열은 10개의 원소를 갖고 있음
		boolean findFlag = false;	// 찾았는지 확인용 플래그
		int target = 15;	// 찾으려는 대상 숫자
		for( int i = 0; i < numbers.length ; i++ ) {
			if( numbers[i] == target) { // 대상 숫자가 배열에 있음
				System.out.println( i + " : "+ target );
				findFlag = true;	// 플래그를 true로 변경
				break;	// 배열에서 대상을 찾았으므로 반복 종료
			}
			System.out.println("numbers[" + i +"] : " + numbers[i]);
		}
		if(findFlag == true) { // 배열에서 target 값과 동일한 원소를 찾음
			System.out.println("배열에 " + target + "이 있습니다");
		}else {	// 못찾음
			System.out.println("배열에 " + target + "이 없습니다");
		}
	}
}