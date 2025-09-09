package overload;
public class Person
{	// 오버로딩
	private String name;
	private int    age;
	public  String msg;
	// 기본 생성자
//	public Person() {}
	public Person() {
		System.out.println("생성자가 호출되었습니다");
		// 필드 초기화 작업
		name = "아무개";
		this.age = -1;
	}
	// 변형 생성자
	public Person(String name) {
		// 기본 생성자 호출
		// 변형 생성자를 호출할때에는, 코드블럭에서 가장 처음에 해야 합니다
		this();
		System.out.println("변형 생성자가 호출되었습니다");
		this.name = name;
		this.doWork();
	}
	// 메소드 선언시, 매개변수의 타입이나 개수를 다르게 하면
	// 같은 이름의 다른 메소드들을 구분할 수 있습니다
	public Person(String name, int age) {
		this(name);
		System.out.println("이름과 나이를 받는 변형 생성자가 호출되었습니다");
		this.age = age;
	}
	// 일반 메소드의 오버로딩
	public void doWork() {
		System.out.println("기한없이 작업을 시작합니다");
		return; // 메소드 종료
		//System.out.println("이곳이 작업이 되나요?>");
	}
	public void doWork(int min) {
		System.out.println( min + "분 소요되는 작업을 시작합니다");
	}
	public void doWork(int min, String value ) {
		System.out.println( min + "분 소요되는 "+ value + " 작업을 시작합니다");
	}
}