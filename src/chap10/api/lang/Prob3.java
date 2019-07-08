package chap10.api.lang;

/*
 * �迭 ũ�� : 4
 * ����� ���α� �ڿ��ս��̾𽺹븮1�� KITRI
 */
public class Prob3 {

	public static void main(String[] args) {
		Prob3 p = new Prob3();
		String addr = "�����,���α�,�ڿ��ս��̾𽺹븮1��,KITRI";
		String[] addrArr = p.split(addr, ',');
		System.out.println("�迭 ũ�� : " + addrArr.length);
		for (int i = 0; i < addrArr.length; i++) {
			System.out.print(addrArr[i] + " ");
		}

		// �׽�Ʈ
		System.out.println();
		String addr2 = "�����,���α�,�ڿ���,���̾�,�븮,1��,KITRI";
		String[] addrArr2 = p.split(addr2, ',');
		System.out.println("�迭 ũ�� : " + addrArr2.length);
		for (int i = 0; i < addrArr2.length; i++) {
			System.out.print(addrArr2[i] + " ");
		}
	}

	public String[] split(String str, char separator) {
		String[] result = null;
		String temp = "";
		int count = 0;
		int num = 0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== separator){
				count=count+1;	//,���� �Ѱ� �� �����Ƿ� +1
			}
		}
		result = new String[count+1];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!= separator){
				temp = temp + str.charAt(i)+"";
			}else{
				result[num] = temp;
				num++;
				temp="";
			}
		}
		
		result[num]=temp; // ������, �� ���ڿ� 
		return result;
	}
}
