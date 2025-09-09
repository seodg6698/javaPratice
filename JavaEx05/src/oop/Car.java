package oop;
public class Car
{
	public String name;		// 차종
	public String color;	// 색상
	public int    seat;		// 좌석수
	// 메소드 : class가 갖는 기능 : 함수
	/*	접근제어자 반환값타입 이름(타입 매개변수이름){
			수행할 내용
			return [반환할 값];
		}	*/
	public void start() {
		System.out.println( color + "색 " + name + "(이/가) 출발합니다");
	}
	public void stop() {
		System.out.println( color + "색 " + name + "(이/가) 정지합니다");
		return;
	}
	public int countSeat() {
		return seat;	 // 자동차의 좌석수를 반환
	}
}