package chap08;

public class Tea extends Beverage {
	static int amount; //������Ű�Ƿ� static.
	
	public Tea(){
		
	}
	public Tea(String name){
		super(name);
		amount++;
		caloPrice();
	}
	
	@Override
	public void caloPrice() {
		if(getName().equals("lemonTea")){
			setPrice(1500);
		}else if(getName().equals("ginsengTea")){
			setPrice(2000);
		}else if(getName().equals("redginsengTea")){
			setPrice(2500);
		}
	}
}
