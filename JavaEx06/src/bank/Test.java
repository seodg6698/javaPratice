package bank;
public class Test
{
	public static void main(String[] args)
	{
		// Account 클래스 확인하기
		Account acc1 = new Account();
		Account acc2 = new Account(1,"홍길동",1234,100000);
//		System.out.println("-----------------------------");
//		System.out.println("계좌번호 : " + acc1.getIdx());
//		System.out.println("명의자 : " + acc1.getName());
//		System.out.println("비번 : " + acc1.getPassWd());
//		System.out.println("잔고 : " + acc1.getBalance() + "원");
		acc1.printInfo();
		acc2.printInfo();
		// 유효하지 않은 값으로 객체 생성
		acc1 = new Account( -1, "", 10000, -100);
		acc1.printInfo();
		// 입금 테스트
		int amount = 10000;
		if( acc2.deposit(amount) ) {
			System.out.println( amount + "원을 입금했습니다");
		}else {
			System.out.println("입금하지 못했습니다");
		}
		// 출금 테스트
		amount = 10000;
		int pw = 1234;
		if( acc2.checkPW(pw) == true ) {		// 비번확인
			if( acc2.withdraw(amount) ) {	// 출금확인
				System.out.println( amount + "원을 출금했습니다");
			}else {
				System.out.println("출금하지 못했습니다");
			}
		}else {
			System.out.println("비번이 올바르지 않습니다");
		}
	}
}