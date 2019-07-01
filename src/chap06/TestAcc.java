package chap06;

/* ����2. ������ ���� ������ �а� AccountŬ������ �ۼ��Ͻʽÿ�. 
 *  	 TestAccount Ŭ������ �����ϼ���
 *  ����(Account) Ŭ������ ���� ��ȣ�� ��Ÿ���� accNo �����Ϳ� �ܰ� ��Ÿ���� balance �����͸� ������ �ֽ��ϴ�. 
 *  �޼ҵ�δ� �Ա��� �ǹ��ϴ� save �޼ҵ�� ����� �ǹ��ϴ� deposit �޼ҵ� 
 *  �� �ܰ� Ȯ���ϴ� getBalance �޼ҵ�� ���� ��ȣ�� Ȯ���ϴ� getAccNo �޼ҵ带 ������ �ֽ��ϴ�. 
 *  TestAccount Ŭ������ �̿��Ͽ� Account Ŭ������ �Լ��� ȣ�� ������ �� �ֿܼ� ��µǴ� ����� ������ �����ϴ�. 
 *  
 *  [TestAccount ������] 
 * 	 	078-3762-293 ���°� �����Ǿ����ϴ�. 
 *  	078-3762-293 ������ �ܰ�� 0�����Դϴ�. 
 *  	078-3762-293 ���¿� 100������ �ԱݵǾ����ϴ�. 
 * 	 	078-3762-293 ������ �ܰ�� 100�����Դϴ�. 
 *  	078-3762-293 ���¿� 30������ ��ݵǾ����ϴ�. 
 *  	078-3762-293 ������ �ܰ�� 70�����Դϴ�. 
 */
public class TestAcc {

	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account();
		accObj.setAccNo("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");
	}

}
