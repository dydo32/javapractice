package chap08;

public class Coffee extends Beverage{
	static int amount; //누적시키므로 static.
	
	public Coffee(){
		
	}
	public Coffee(String name){
		super(name);
		amount++;
		caloPrice();
	}
	
	@Override
	public void caloPrice() {
		if(getName().equals("Americano")){
			setPrice(1500);
		}else if(getName().equals("CafeLatte")){
			setPrice(2500);
		}else if(getName().equals("Cappuccino")){
			setPrice(3000);
		}
	}
}
