package animal;
public class Puppy extends Animal
{
	public int age; // 나이
	public String idx; // 등록번호
	public void sound() {
		System.out.println("멍멍");
	}
	public void PlayWithBall() {
		System.out.println("강아지가 공을 물어옵니다");
		super.eat("칭찬으로 준 간식");
	}
	// 오버라이드, 상속받은 메소드 eat()을 재정의 하겠습니다
	@Override		// 어노테이션 @키워드 : 개발 용도로 사용하는 주석과 비슷한 개념
	public void eat(String value) {
		System.out.println(value + "를 자기 집에 가져갑니다");
		super.eat(value);
		// super 부모를 지칭
		// super.eat() -> Puppy가 재정의한 eat()이 아닌,
		// 부모로부터 물려받은(부모의) eat()을 실행
	}
	// 오버로딩
	public void eat(String v, int x) {
		System.out.println(v + " " + x + "개를 먹습니다");
	}
}