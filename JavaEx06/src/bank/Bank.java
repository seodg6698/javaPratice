package bank;
public class Bank
{	// 계좌들을 관리
	// 계좌를 개설 / 계좌 조회 -> 찾는 계좌가 있는지
	// 계좌의 관리 : 입금, 출금, 잔액 조회, 계좌 해지
	// 타입[] 이름 = new 생성자();	/ 참조 변수 선언과 참조 객체 생성
	// String[] strs = { "ezen", "java", "JS" };
	// Account class의 객체들을 넣을 배열
	private Account[] accounts;	// 참조 변수
	private int counts  = 0;		// 현재 개설된 계좌 수
	private int nextIdx = 100;	// 다음 개설될 계좌의 계좌번호
	// 생성자
	public Bank() {
		System.out.println("은행을 설립합니다");
	}
	public Bank( int capacity ) {
		this();
		if( capacity < 1 ) {
			System.out.println("계좌 개설 한계값이 잘못되었습니다");
			capacity = 10;	// 기본값으로 capacity를 조정
		}
		this.accounts = new Account[capacity];
		System.out.println("계좌 개설 한계값은 " + capacity + "입니다");
	}
	// CRUD : Create : 계좌 개설
	public boolean createAccount( String name, int pw, int balance ) {
		boolean result = false;
		if( this.checkBank() ) { // 계좌 개설에 여유 있음, 계좌 객체를 생성
			Account tmp = new Account(this.nextIdx, name, pw, balance);
			// 현재 개설된 계좌의 개수 : counts
			// 개설할 계좌의 번호 this.nextIdx
			// counts를 인덱스로 사용해서, 배열에 객체를 참조시킴
			this.accounts[counts] = tmp;
			this.counts++;	// 개설 계좌 수 증가
			this.nextIdx++;
			result = true;
		}
		return result;
	}
	public boolean checkBank() { // 계좌를 개설할 수 있는 상황인지 확인
		boolean result = true;
		if( this.counts >= this.accounts.length ) {
			System.out.println("더이상 계좌를 개설할 수 없습니다");
			result = false;
		}
		return result;
	}
	// read : list read
	public void showList() {
		if( this.counts > 0 ) {
			System.out.println("개설된 계좌 개수 : " + this.counts);
			// i를 인덱스로 사용 i : 0 ~ (개설된 계좌 개수 - 1) 
			for( int i = 0; i < this.counts; i++ ) {
				// 개설된 계좌들이 들어있는 배열 / this.accounts
				// 인덱스를 이용해서 배열의 원소에 접근 : 원소 -> Account의 객체
				// this.accounts[i] 로 원소에 접근하여 메소드 호출
				this.accounts[i].printInfo();
			}
		}else {
			System.out.println("개설된 계좌가 없습니다");
		}
	}
	// read : item read
	public Account findAccount( int accIdx ) {	// 계좌번호로 계좌 객체 반환
		// Bank에 개설된 계좌들의 배열 this.accounts / 계좌 개수 : this.counts
		for( int i = 0; i < this.counts; i++ ) {
			// 개설된 계좌들을 순서대로 접근해서, 계좌번호를 확인
			// this.accounts[i].getIdx() / 내가 찾고자 하는 계좌번호 accIdx
			if(this.accounts[i].getIdx() == accIdx) {
				return this.accounts[i]; // 찾은 계좌 객체의 주소를 반환
			}
		}
		System.out.println("해당 계좌번호의 계좌가 없습니다");
		return null;		// 계좌 객체가 없으므로 null을 반환
	}
	// update : 입금 / 출금
	public boolean deposit( int accIdx, int amount ) {
		Account acc = this.findAccount(accIdx);	// 계좌를 찾음
		if( acc != null ) { // 찾은 계좌가 있음
			boolean result = acc.deposit(amount); // 입금 시도
			if( result == true ) { // 입금이 되었음
				String str = "계좌번호 : " + acc.getIdx() + "에 ";
				str += amount + "원을 입금했습니다";
				System.out.println(str);
				return true;
			}
		}
		return false;
	}
	// update : 출금 : 계좌번호, 비번, 금액
	public boolean withdraw( int accIdx, int pw, int amount) {
		Account acc = this.findAccount(accIdx);	// 계좌 검색
		if( acc != null ) { // 계좌를 찾았음
			if( acc.checkPW(pw) == true ) { // 비번이 맞음 
				if(acc.withdraw(amount) == true ) { // 출금 시도
					String str = "계좌번호 " + accIdx + "에서 ";
					str += amount + "원을 출금했습니다";
					System.out.println(str);
					return true;
				}else {
					System.out.println("출금하지 못했습니다");
				}
			}else {
				System.out.println("비번이 올바르지 않습니다");
			}
		}else {
			System.out.println("해당 계좌를 찾지 못했습니다");
		}
		return false;
	}
}