package animal;
public class Cat extends Animal 
{	// 클래스의 상속
	// class 클래스이름 extends 부모클래스이름
	// 부모클래스의 상속 가능한 모든 필드와 메소드를 기본을 갖게 됩니다
	// 부모에게는 없는 자식만이 갖는 필드
	public int age;
	// 메소드
	public void sound() { System.out.println("야옹"); }
}
