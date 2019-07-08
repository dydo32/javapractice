package chap10.api.lang;

public class Vehicle extends Owner{
	Owner owner;
	int price;
	
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Vehicle){
			Vehicle v = (Vehicle)obj;
			if(this.owner.equals(v.getOwner())){
				return true;	//일치한다.
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "소유주정보 : "+ owner+"\n 차량정보 : 가격은 " +price+"입니다."; //owner.toString()으로 안해도된다.
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
