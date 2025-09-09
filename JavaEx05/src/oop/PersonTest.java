package oop;
public class PersonTest
{
	public static void main(String[] args)
	{
		// 클래스로부터 인스턴스를 '생성'
		// class이름(타입) 참조변수이름 = new 생성자();
		Person hong = new Person();
		hong.name   = "홍길동";
		hong.age    = 30;
		hong.gender = 'M';
		Person jeun = new Person();
		jeun.name   = "전우치";
		jeun.age    = 20;
		jeun.gender = 'M';
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.gender);
		System.out.println(jeun.name);
		System.out.println(jeun.age);
		System.out.println(jeun.gender);
		// hong이 갖고 있는 객체의주소를 jeun에게 전달
		jeun = hong;
		System.out.println(jeun.name);
		System.out.println(jeun.age);
		System.out.println(jeun.gender);
	}
};