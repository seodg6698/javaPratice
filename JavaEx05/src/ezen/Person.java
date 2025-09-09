package ezen;
public class Person
{	// 접근 제어자
	// 접근 제한 없음
	public String name;
	// 같은 패키지이거나, 상속 관계는 접근 가능
	protected int age;
	// 접근 제어자를 생략하면 default
	char gender;
	// private : 자신만 접근 가능
	private String idx;	// 주민번호
	
	// 생성자 : class의 인스턴스를 생성하기 위해 호출되는 메소드
	// 생성자 메소드는 클래스 이름과 같게 선언
	public Person() {
		System.out.println("Person 클래스의 생성자가 호출되었습니다");
		System.out.println("Person 클래스의 인스턴스가 생성됩니다");
	}
	// [private로 선언된] 필드멤버의 값을 변경하거나, 호출하기 위해 작성
	// getter, setter
	// get필드이름(){ return 필드이름; }, set필드이름(매개변수){}
	public void setIdx( String idx ) {
		// 매개변수로 받은 idx의 유효성 검사
		this.idx = idx; // class의 필드인 idx -> this.idx
	}
	public String getIdx() {
		// 인스턴스가 idx 필드에 저장한 값의 유효성을 검사
		return this.idx;
	}
	public void printIdx() {
		System.out.println(idx);
	}
}
