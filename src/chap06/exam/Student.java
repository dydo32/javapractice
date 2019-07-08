package chap06.exam;
/*���� 3. ���� ������ �а� Student Ŭ������ �ű� �ۼ��Ͻʽÿ�. */
public class Student {
	private String name; 	//�̸�����
	private String subject;	//������ ����
	private int fee;		//������ ����
	private double returnFee;	//ȯ�ޱݺ���
	
	public Student(){
		
	}
	//�̸�(name), ������(subject), ������(fee) �� �Ű������� �޴� ������ 
	public Student(String name, String subject, int fee){
		this.name=name;
		this.subject=subject;
		this.fee=fee;
	}
	
	// void calcReturnFee() �޼ҵ� : 
	// ������(subject)�� ��javaprogram���̸� ȯ�ޱ��� ������(fee)�� 25%�� ���   
	// ������(subject)�� ��jspprogram���̸� ȯ�ޱ��� ������(fee)�� 20%�� ���  
	// ������ �������� ���׷� �������� �����ϴ١� ����ϰ� �޼��� �ߴ� 
	public void calcReturnFee(){
		if(subject=="javaprogram"){
			returnFee=fee*0.25;
		}else if(subject=="jspprogram"){
			returnFee=fee*0.20;
		}else{
			System.out.println("�׷� �������� �����ϴ�.");
		}
	}
	// void print() �޼ҵ� : 
	// ������ ���� �������� Student ���� ���.  
	// - name, subject, fee, returnFee �� ���ʴ�� ���.  
	// ��) xxx ���� �������� xxxx �̰� ������� xxx �̸� ȯ�ޱ��� xxx �Դϴ�.  \
	public void print(){
		System.out.println(name+"���� �������� "+subject+"�̰� ������� "+fee+"�̸� ȯ�ޱ��� "+returnFee+"�Դϴ�.");
	}
	  
	public static void main(String args[]) {
		Student stu = new Student("�嵿��", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
}
