package chap10.api.lang;

public class Vehicle extends Owner{
	Owner owner;
	int price;
	
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Vehicle){
			Vehicle v = (Vehicle)obj;
			if(this.owner.equals(v.getOwner())){
				return true;	//��ġ�Ѵ�.
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "���������� : "+ owner+"\n �������� : ������ " +price+"�Դϴ�."; //owner.toString()���� ���ص��ȴ�.
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
