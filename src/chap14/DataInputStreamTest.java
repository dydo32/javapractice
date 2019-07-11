package chap14;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//IO�۾��� �����ϴ� ���� �ƴ϶� �߰��� ����� ǥ���� ���� ��Ʈ��Ŭ�����̹Ƿ� ���� ���õ����Ϳ� �������� ���Ѵ�.
public class DataInputStreamTest {

	public static void main(String[] args) throws Exception {
		// �̷��� �ٷ� �����ϴ� �͵� ����
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("src/chap14/data/dos.txt"));
	
		int data1 = dis.readInt();
		double data2 = dis.readDouble();
		String data3 = dis.readUTF();	// �������
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
