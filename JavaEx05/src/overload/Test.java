package overload;
public class Test
{
	public static void main(String[] args)
	{	// 생성자 오버로딩 확인
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("전우치",30);
		
		// 메소드 오버로딩 확인
		p1.doWork();
		p1.doWork(30);
		p1.doWork(30,"청소");
		p3.msg = "ezen";
		
		// 다른 작업을 하는 메소드들을
		// 같은 이름으로 선언하고자 할때 사용합니다
		// 매개변수 타입이나 개수가 달라야 합니다
		
		// gugu() / guguAll() -> gugu(2) / gugu() ->2~9
	}
}