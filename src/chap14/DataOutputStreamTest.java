package chap14;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public static void main(String[] args) throws Exception {
		// DataOutputStream�� ���� ������ output���� �������� ���ϹǷ�
		// FileOutputStream�� ���� ��Ʈ����ü�� �̿��ؼ� �۾��ؾ߸� �Ѵ�.
		FileOutputStream fos = new FileOutputStream("src/chap14/data/dos.txt");
		DataOutputStream dos = new DataOutputStream(fos); //���õ����Ϳ� ���� ���� �ȵȴ�.  
		
		dos.writeInt(100);
		dos.writeDouble(10.5);
		dos.writeUTF("���ڿ�");
		
		fos.close();
		dos.close();
		
	}

}
