package chap15.event;
//����Ͻ� ���� �κ��� ���� Ŭ������ �ۼ�
//--------->�̺�Ʈ�� �߻��� �� ���� ó���ϰ� ���� ���
public class LayoutExamLogic {
	public String getMsg(String grade){
		System.out.println("getMsg");
		String msg = "";
		if(grade.equals("vvip")){
			msg = "����Ʈ: 10000";
		}else if(grade.equals("vip")){
			msg = "����Ʈ: 5000";
		}else if(grade.equals("gold")){
			msg = "����Ʈ: 3000";
		}else{
			msg = "�ٽ� �Է��ϼ���.";
		}
		return msg;
	}
}
