package chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
		acc1.pay("1234-5678-8888", 500000);
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		System.out.print("ī���ȣ: ");
		String cardNo = key.next();
		acc1.pay(cardNo, 500000);
		System.out.println("�����ܾ�====>"+acc1.getBalance());
	}
}
