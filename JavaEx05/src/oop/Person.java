package oop;

public class Person
{
	/* Object : 현실 세계의 사물 - 특성과 기능
	// class : Object의 공통적인 특성과 기능을 모아 추상화를 한 객체의 설계도
	// Object : class에서 구체화 한 구별할 수 있는 객체	*/
	
	/* 현실의 사람이 갖는 특성과 기능을 추상화 하여 class를 설계
	// Person class를 이용해서, hong 객체를 생성
	// 인스턴스 : 특정 클래스의 객체를 지칭	*/
	
	/* Car class -> myCar : 객체 : myCar는 Car class의 인스턴스
	// Person class -> student : 객체
	// -> student 객체는 Person class의 인스턴스 O
	// -> student 객체는 Car class의 인스턴스 X	*/
	
	// 필드 멤버
	// 접근제어자 타입 이름;
	public String name;		// 성명
	public int    age;		// 나이
	public char   gender;	// 성별
}
