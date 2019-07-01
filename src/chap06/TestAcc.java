package chap06;

/* 문제2. 다음과 같은 설명을 읽고 Account클래스를 작성하십시오. 
 *  	 TestAccount 클래스를 참고하세요
 *  계좌(Account) 클래스는 계좌 번호를 나타내는 accNo 데이터와 잔고를 나타내는 balance 데이터를 가지고 있습니다. 
 *  메소드로는 입금을 의미하는 save 메소드와 출금을 의미하는 deposit 메소드 
 *  및 잔고를 확인하는 getBalance 메소드와 계좌 번호를 확인하는 getAccNo 메소드를 가지고 있습니다. 
 *  TestAccount 클래스를 이용하여 Account 클래스의 함수를 호출 시켰을 때 콘솔에 출력되는 결과는 다음과 같습니다. 
 *  
 *  [TestAccount 실행결과] 
 * 	 	078-3762-293 계좌가 개설되었습니다. 
 *  	078-3762-293 계좌의 잔고는 0만원입니다. 
 *  	078-3762-293 계좌에 100만원이 입금되었습니다. 
 * 	 	078-3762-293 계좌의 잔고는 100만원입니다. 
 *  	078-3762-293 계좌에 30만원이 출금되었습니다. 
 *  	078-3762-293 계좌의 잔고는 70만원입니다. 
 */
public class TestAcc {

	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account();
		accObj.setAccNo("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
	}

}
