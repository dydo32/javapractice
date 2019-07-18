package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress - �ڹٿ��� IP�ּҸ� �𵨸��� ���� ��ü
//- ���ð� ȣ��Ʈ����(������)�� ���ؼ� IP�ּҸ� ������ �� �ִ� ����� ����
public class InetAddressTest {

	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("ia.getHostName()=> " + ia.getHostName());
			System.out.println("ia.getHostAddress()=> " + ia.getHostAddress());
			System.out.println("InetAddress.getLocalHost()=> " +InetAddress.getLocalHost());
		
			InetAddress[] iaArr = InetAddress.getAllByName(args[0]);
			
			for(int i = 0; i < iaArr.length; i++){
				System.out.println("iaArr[i].getHostName()=> " + iaArr[i].getHostName());
				System.out.println("iaArr[i].getHostAddress()=> " + iaArr[i].getHostAddress());
			}
			
		} catch (UnknownHostException e) { // ������ ȣ��Ʈ�� ã�� �� ���� ���� �����ϱ�.
			e.printStackTrace();
		}
	}

}
