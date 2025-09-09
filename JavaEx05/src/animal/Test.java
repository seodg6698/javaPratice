package animal;
import classEx.Gugu;

public class Test {
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.name = "고냥이";
		myCat.age  = 5;
		myCat.eat("츄르");
		myCat.sleep(10);
		myCat.sound();
		Gugu g = new Gugu();
		Puppy myPuppy = new Puppy();
		myPuppy.name = "멍멍이";   // Animal이 갖고 있는 필드멤버
		myPuppy.age  = 2;
		myPuppy.idx  = "20230101";	// Cat은 없고, Puppy는 있는 필드멤버
		myPuppy.eat("육포");		// Puppy는 eat()을 재정의 했음(오버라이드)
		myPuppy.eat("육포", 3);		// 매개변수 개수가 다름 : 오버로딩
		myPuppy.PlayWithBall();
		myPuppy.sound();
	}
}