package classEx;
public class Test
{
	public static void main(String[] args)
	{	// Person class의 객체를 생성
		Person hong = new Person();
		Person im = new Person();
		// 객체에 데이터 넣기
		hong.setName("홍길동");
		hong.setAge(30);
		hong.setAddr("경기도");
		// setter가 예외처리할 데이터로 넣음
		im.setName("임");
		//im.setAge(50);
		im.setAddr("  ");
		// 메소드 호출하기
		hong.doWork(50);
		// 메소드가 예외처리할 상황
		im.doRest(30);
		// 각 객체들의 정보 출력
		hong.printInfo();
		im.printInfo(); // 객체 정보가 올바르지 않아 예외 처리 기대
	}
}