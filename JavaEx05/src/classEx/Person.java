package classEx;
public class Person
{	// 필드 멤버 작성 영역
	private String name;	// 성명 name 
	private int    age;		// 나이 age
	private String addr;	// 주소 addr
	// 생성자
	public Person() {
		System.out.println("생성자가 호출되었습니다");
	}
	// setter
	// setName
	public void setName( String name ) {
		if( name == null || name.trim().equals("") || name.length() < 2 ) {
			System.out.println("제대로된 이름 데이터가 아닙니다");
		}else {
			this.name = name;
		}
	}
	// setAge
	public void setAge( int age ) {
		if( age < 0 ) {
			System.out.println("올바른 나이 값이 아닙니다");
		}else {
			this.age = age;
		}
	}
	// setAddr
	public void setAddr( String addr ) {
		if( addr == null || addr.trim().equals("") ) {
			System.out.println("올바른 주소 데이터가 아닙니다");
		}else {
			this.addr = addr;
		}
	}
	
	// getter
	// getName
	public String getName() {
		if( this.name == null || this.name.trim().equals("") ) {
			System.out.println("저장되어있는 이름 정보가 없습니다");
			return null;
		}else {
			return this.name;
		}
	}
	// getAge
	public int getAge() {
		if( this.age < 0 ) {
			System.out.println("저장된 나이 정보가 없습니다");
			return -1; // 예외 상황임을 getAge()를 호출한쪽에 전달할 임의의 값
		}else {
			return this.age;
		}
	}
	// getAddr
	public String getAddr() {
		if( this.addr == null || this.addr.trim().equals("") ) {
			System.out.println("저장된 주소 정보가 없습니다");
			return null;
		}else {
			return this.addr;
		}
	}
	
	// 메소드
	// doWork( int min ) -> name 가 min 분 동안 작업을 합니다
	public void doWork( int min ) {
		if( min <= 0 ) {
			System.out.println("시간 설정이 잘못되었습니다");
		}else {
			String str = this.getName();
			if( str != null ) {
				System.out.println( str + "가 " + min + "분 동안 작업을 합니다"); 
			}else {
				System.out.println("이름 정보가 없어 작업을 시작하지 못했습니다");
			}
		}
	}
	// doRest( int min ) -> name 가 min 분 동안 휴식을 취합니다
	public void doRest( int min ) {
		if( min <= 0 ) {
			System.out.println("시간 설정이 잘못되었습니다");
		}else {
			String str = this.getName();
			if( str != null ) {
				System.out.println( str + "가 " + min + "분 동안 휴식을 취합니다"); 
			}else {
				System.out.println("이름 정보가 없어 휴식을 시작하지 못했습니다");
			}
		}
	}
	// printInfo() -> 인스턴스의 정보를 출력 / 성명 : 아무개 / 나이 : 숫자 / 주소 : 입력된 주소
	public void printInfo() {
		if( this.getName() == null ) {
			System.out.println("이름 정보가 없습니다");
		}else {
			System.out.println("이름 : " + this.getName());
		}
		if( this.getAge() < 0) {
			System.out.println("나이 정보가 없습니다");
		}else {
			System.out.println("나이 : " + this.getAge());
		}
		if( this.getAddr() == null ) {
			System.out.println("주소 정보가 없습니다");
		}else {
			System.out.println("주소 : " + this.getAddr());
		}
	}
}
