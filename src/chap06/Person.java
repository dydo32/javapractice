package chap06;
//Ŭ������ ������ �� ��������� �ִ� ��� ��������� private�� �����ؼ�
//������ ���ܳ��� public �޼ҵ带 ���� ������ �� �ֵ��� �����Ѵ�.
public class Person {
	private String name;	//�������(=����ʵ�), private���� �����ϸ� �ٸ� Ŭ�������� ���� �Ұ�.
	private int age;		//�ڹٿ����� �׻� private���� ���߾�� ��,��������
	private String addr; 	//�׸��� ���� �޼ҵ带 ���� ��������.
	
	//name������ ���� public �޼ҵ� ����
	//name������ ���� �����ϴ� �޼ҵ� - setter�޼ҵ�
	//setter�� getter�޼ҵ带 �ۼ��ϴ� ���
	//set(get) + ���������(��������� ù ���ڸ� �빮�ڷ� ����)
	//=> ex) name ����
	//		 setName, getName
	//=> �⺻ �ڹٿ����� setter/getter�޼ҵ��� �̸��� ����� �� ����� ��Ű�� �ʾƵ� ���� �� ����
	//   ������ �������̳� ������ �� ����Ģ�� ��Ű�� ������ ������ �߻��� �� �ִ�.
	public void setName(String name){ //�Ű����� �̸��� DBMS�� ���� �Ǵ� �̸��� ���� �����Ѵ�.
		this.name = name;	//������� =��������
	}
	public String getName(){ //�Ű���������
		return this.name;  //�׳� return name; �� ����
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return this.addr;
	}
}
