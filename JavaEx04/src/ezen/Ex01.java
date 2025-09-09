package ezen;
public class Ex01
{
	public static void main(String[] args)
	{
		// 학생 10명의 수학 점수를 저장할 변수들을 선언하고
		// 홍길동,전우치,임꺽정,성춘향,이몽룡,
		// 콩쥐,팥쥐,흥부,놀부,까치
		// 70,80,90,60,50,75,85,95,65,55 를 저장하세요
		// 이름과 점수를 쌍을 이뤄서, 학생 이름과 점수를 출력하세요
		
		// 배열
		// 같은 이름을 사용하는 같은 타입의 연속된 변수들
		
		// 선언할때에 변수들의 개수를 지정하면, 개수는 변경되지 않음
		
		// 타입[] 배열이름 = new 타입[개수];
		int[] scores = new int[10];
		// scores 배열의 첫번째 칸에 70점을 대입
		scores[0] = 70;	// 배열에 값 대입
		System.out.println(scores[0]);	// 배열에서 값 가져오기
		
		// 배열은 선언될때에, 원소 변수들을 초기화 해줍니다
		// 초기화 값은 0 혹은 0과 동등한 값으로 해줍니다
		// 정수 0 / 실수 0.0 / boolean false
		
		// scores 배열의 인덱스 9에는 값을 넣은적이 없음
		System.out.println(scores[9]);	// 초기값 0이 출력됨
		
		// 배열의 선언시, 배열에 넣을 값을 명시해서 초기화 할 수 있습니다
		int[] mathScores = { 70, 80, 90, 60, 50, 75, 85, 95, 65, 55 };
		//mathScores = new int[3];
		//mathScores = { 1, 2, 3 };
		System.out.println( mathScores[9]);
		
		String[] students = 	{"홍길동","전우치","임꺽정","성춘향","이몽룡","콩쥐","팥쥐","흥부","놀부","까치"};
		System.out.println(students[2]);
		
		// mathScores 배열의 원소를 순서대로 전부 출력하세요
		// 배열의 인덱스에 변수를 사용할 수 있습니다
		//int n = 1;
		System.out.println( mathScores );
		for ( int i = 0; i < 10; i++ ) {
			System.out.println( students[i] + " : " + mathScores[i] );
		}
	}
}