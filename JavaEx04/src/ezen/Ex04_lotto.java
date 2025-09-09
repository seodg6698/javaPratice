package ezen;
public class Ex04_lotto
{
	public static void main(String[] args)
	{	// 정수형 타입 변수를 저장할수 있는 배열을 선언
		// [0] : 사용할 객체나 변수를 선언하고 초기화
		int[] lottos = new int[6];
		int count = 0; // 중복없이 생성된 로또 번호 개수
		int newLotto = 0;
		while( count < lottos.length ) { 	// [1] 반복문
			newLotto = (int)(Math.random()*100%45)+1; // [2] 로또 번호 생성
			boolean flag = false; // 중복 여부를 저장할 변수
			for( int i = 0; i < count; i++) { // [3] 중복확인
				if( lottos[i] == newLotto  ) { // 중복!!
					flag = true;	// 중복여부를 저장 : 플래그에 true 넣기
					break;			// 반복문 종료
				}
			}
			if( flag == true ) { // [3-1] 중복 : 다시 새 번호 생성
				System.out.println( count + " : " + newLotto + "중복발견");
			}else { 	// [3-2] 중복아님 : 배열에 새 번호를 넣고, count 증가
				lottos[count] = newLotto;
				count++;
			}
		}
		// 배열에 중복되지 않은 로또 번호 6개가 들어있는지 확인
		for( int i = 0; i < lottos.length; i++ ) {
			System.out.println(lottos[i]);
		}
	}
}