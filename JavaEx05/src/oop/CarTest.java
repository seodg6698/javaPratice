package oop;
public class CarTest
{
	public static void main(String[] args)
	{	// 흰색 아반떼 생성
		Car myCar   = new Car();
		myCar.name  = "아반떼";
		myCar.color = "흰색";
		myCar.seat  = 5;
		Car yourCar   = new Car();	// 빨강 아반떼N 생성
		yourCar.name  = "아반떼N";
		yourCar.color = "빨강";
		yourCar.seat  = 1;
		myCar.start();
		myCar.stop();
		yourCar.start();
		yourCar.stop();
		String str = myCar.name + "(은/는) ";
		str += myCar.countSeat() + "인승입니다";
		System.out.println(str);
		str = yourCar.name + "(은/는) ";
		str += yourCar.countSeat() + "인승입니다";
		System.out.println(str);
	}
}