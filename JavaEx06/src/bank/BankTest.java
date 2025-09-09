package bank;
public class BankTest
{
	public static void main(String[] args)
	{	// 은행 설립
		Bank myBank = new Bank(20);
		if( myBank.checkBank() == true ) {	// 계좌 개설 가능 여부 확인
			if( myBank.createAccount("홍길동", 1234, 10000) ) { // 계좌 개설
				System.out.println("계좌가 개설되었습니다");
				myBank.showList();		// 계좌 목록 조회
			}else {
				System.out.println("계좌를 개설하지 못했습니다");
			}
		}
		// 여러 계좌 개설하기 
		myBank.createAccount("전우치", 4321, 20000);
		myBank.createAccount("임꺽정", 1111, 50000);
		myBank.showList();	// 개설된 계좌 목록 확인
		Account acc = myBank.findAccount(102);
		if( acc != null ) { acc.printInfo(); }
		acc = myBank.findAccount(200);
		if( acc != null ) { acc.printInfo(); }
		// Bank의 입금 기능 확인(.deposit())
		if(myBank.deposit(100, 1111)){ // 100번 계좌에 1111원 입금
			System.out.println("입금이 완료되었습니다");
			myBank.findAccount(100).printInfo(); // 100번 계좌 정보 출력
		}else {
			System.out.println("입금하지 못했습니다");
		}
		myBank.withdraw(100, 1234, 5000);
		myBank.withdraw(200, 1234, 5000);
		myBank.withdraw(100, 1111, 5000);
		myBank.withdraw(100, 1234, 1000000);
	}
}