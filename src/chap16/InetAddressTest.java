package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress - 자바에서 IP주소를 모델링해 놓은 객체
//- 로컬과 호스트네임(도메인)을 통해서 IP주소를 가져올 수 있는 기능을 제공
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
			
		} catch (UnknownHostException e) { // 지정한 호스트를 찾을 수 없을 수도 있으니까.
			e.printStackTrace();
		}
	}

}
