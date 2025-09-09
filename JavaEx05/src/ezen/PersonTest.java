package ezen;
public class PersonTest
{
	public static void main(String[] args)
	{
		Person ezen = new Person();
		ezen.name = "홍길동"; // public으로 선언된 필드멤버에 접근
		ezen.age = 20;	// 같은 패키지의 클래스 사이+자식클래스면 가능
		ezen.gender = 'M'; // default는 같은 패키지의 클래스에서 가능
		//ezen.idx = ""; // private는 외부에서 접근 불가
		ezen.printIdx();
	}
}