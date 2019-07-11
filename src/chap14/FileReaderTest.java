package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���Ϸκ��� �����͸� �о ����Ϳ� ��� 
//���Ͽ���, ���Ͼ׼���, ���ϴݱ� - 3�ܰ�� �۾�
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/chap14/data/test.txt");//���Ͽ���
			while(true){
				int data = fr.read();	//���Ͼ׼���
				if(data == -1){
					break;
				}
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();		//���ϴݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
