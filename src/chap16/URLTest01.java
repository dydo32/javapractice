package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URLŬ����
//- ������ �ּҸ� ��Ÿ���� Ŭ�����̰�, �̸� ���ؼ� ��ũ��ũ ���ᵵ �����ϴ�.
//- ������ ���ҽ��� ������ �� �ִ�.

public class URLTest01 { // http://�� �־��־����.

	public static void main(String[] args) {

		try {
			URL url = new URL(args[0]);
			System.out.println(url.toString());		//toStringȣ���ϴ°Ͱ� ����.
			System.out.println("url.getHost()=> " + url.getHost());
			System.out.println("url.getPath()=> " + url.getPath());
			//getPort�� -1�� ���
			//-1��Ʈ�� �����ߴٴ� �ǹ̰� �ƴ϶� �������ݿ� ��ϵǾ��ִ� �⺻ port�� �����ߴٴ� �ǹ�.
			//http���������� �⺻ port�� 80�̰�, �츮�� ������ ��� url�� 80��Ʈ�� ����Ѵ�.
			System.out.println("url.getPort()=> " + url.getPort());
			System.out.println("url.getProtocol()=> " + url.getProtocol());
			System.out.println("url.getFile()=> " + url.getFile());
			
			//������ URL�� �����ؼ� �ڿ��� �д� �۾��� ����
			//InputStream is = url.openStream();  	//IOException�߻�.
			//Ÿ���� ��ȯ�ϴ� �۾� InputStream -> ReaderŸ������ ��ȯ
			//InputStreamReader ir = new InputStreamReader(is);
			//BufferedReader br = new BufferedReader(ir);	
			//BufferedReader�� BufferedReader�� �����ϱ� InputStreamReaderŸ������ ��ȯ
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while(true){
				String line = br.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {	//Malformed -> URL�� ������ ����� �Է����� �ʾƼ� �߻��ϴ°�.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
