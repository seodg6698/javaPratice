package bank;
public class Account
{
	// 000000-00-000000 / 1, 2, 3, 4 ~ 
	private int		idx;			// 계좌번호
	private String	name;		// 명의자 성명
	private int		passWd;		// 비번
	private int		balance;		// 잔액
	
	// 기본 생성자
	public Account() {
		System.out.println("계좌를 생성합니다");
	}
	// 변형 생성자
	public Account(int idx, String name, int passWd, int balance ) {
		this();
		// this.idx = idx;
		this.setIdx(idx);
		this.setName(name);
		this.setPassWd(passWd);
		this.setBalance(balance);
	}
	// setters & getters
	public int	  getIdx()	   { return idx;	 }
	public String getName()	   { return name;	 }
	public int	  getPassWd()  { return passWd;	 }
	public int	  getBalance() { return balance; }

	public void setIdx(int idx) {
		if(idx < 1 ) { System.out.println("잘못된 계좌번호입니다");
		}else { this.idx = idx; }
	}
	public void setName(String name) {
		if( name == null ||					// null 참조인 경우
			name.trim().equals("") ||		// 공백문자나, 빈문자열인 경우
			name.trim().length() < 2 ) {		// 이름이 2글자 이상이 아닌 경우
			System.out.println("명의자 이름이 잘못되었습니다");
		}else { this.name = name; }
	}
	public void setPassWd(int passWd) {
		if( passWd < 0 || passWd > 9999 ) {
			System.out.println("비밀번호가 잘못되었습니다");
		}else { this.passWd = passWd; }
	}
	public void setBalance(int balance) {
		if( balance < 0 ) {
			System.out.println("잔액 설정값이 잘못되었습니다");
		}else { this.balance = balance; }
	}
	// 계좌 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("계좌번호 : " + this.getIdx());
		System.out.println("명의자 : " + this.getName());
		System.out.println("비번 : " + this.getPassWd());
		System.out.println("잔고 : " + this.getBalance() + "원");
		System.out.println("-----------------------------");
	}
	// 입금 : 음수값이 넘어올 경우를 체크
	public boolean deposit( int amount ) {
		boolean result = true;
		if ( amount < 1 ) {
			System.out.println("입금액이 잘못되었습니다");
			result = false;
		}else { // this.balance += amount;
			this.setBalance(this.getBalance() + amount);
			result = true;
		}
		return result;
	}
	// 출금 : 음수값이 요청되는 경우를 체크 / 요청금액이 잔고를 넘는가 체크
	public boolean withdraw( int amount ) {
		boolean result = false;
		if( amount < 1 ) {
			System.out.println("출금액이 잘못되었습니다");
		}else if( this.getBalance() < amount ) {
			System.out.println("잔액이 부족합니다");
		}else {
			System.out.println(amount + "원을 출금합니다");
			this.setBalance( this.getBalance() - amount );
			result = true;
		}
		return result;
	}
	// 비번확인
	public boolean checkPW( int passWd ) {
		boolean result = false;		// 반환값을 담을 변수 선언
		if( this.getPassWd() == passWd ) {	// 조건 체크
			result = true;			// 반환값 변경
		}
		return result;	// 반환값이 담긴 변수를 작성
		// 반환값 경우 : 일치 : true / 불일치 : false
		// return this.getPassWd() == passWd;
	}
}