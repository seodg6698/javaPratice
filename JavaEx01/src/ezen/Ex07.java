package ezen;

public class Ex07
{
	public static void main(String[] args)
	{
		// 변수의 형변환
		// 같은 크기의 데이터 범위를 갖는 경우,
		// 혹은 더 좁은 범위의 데이터 타입에서 더 넓은 범위의 타입으로
		// 데이터를 전달하는 경우 JAVA는 자동으로 형 변환을 해줍니다
		
		// 반대의 경우, 데이터 소실이 발생하기에
		// 자동 형 변환은 해주지 않습니다
		// 이때에 명시적 강제 형변환을 사용할 수 있습니다
		// 다만 데이터 소실은 발생합니다
		
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("---------------");
		s = 200;
		//b = s;
		b = (byte)s;
		System.out.println(b);
		System.out.println("---------------");
		s = 100;
		b = (byte)s;
		System.out.println(b);
		System.out.println("---------------");
		// 실제로 들어있는 값이 형변환 후 소실이 일어나지 않더라도,
		// 자동 형변환은
		// 넓은 범위의 타입에서 좁은 범위의 타입으로 변환 지원하지 않습니다
		//i = l;	
		//s = i;
		//b = s;
		l = 2_147_483_648L;
		// 강제 형변환 방법 : (변환할 타입)변수
		i = (int)l;
		s = (short)i;
		b = (byte)s;
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println("---------------");
		l = 2_147_493_648L;
		System.out.println(l);
		i = (int)l;
		System.out.println(i);
		i = 34767;
		s = (short)i;
		System.out.println(s);
		s = 200;
		b = (byte)s;
		System.out.println(b);
		s = 50;
		b = (byte)s;
		System.out.println(b);
	}
}