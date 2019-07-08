package chap10.api.lang;

public class Owner {
	String name;
	String cellPhone;
	
	public Owner() {}
	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Owner){
			Owner o = (Owner)obj;
			if(this.name.equals(o.getName())){
				return true;	//��ġ�Ѵ�.
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "�̸��� " + name + "�̰�, �ڵ��� ��ȣ�� " + cellPhone +"�Դϴ�.";//
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
	
	
}
