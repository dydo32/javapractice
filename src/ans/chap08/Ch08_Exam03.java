package ans.chap08;

interface Const {
	int am = 85, pm = 94;
	default String getName(){
		return "�۸���";
	}
}
class Total implements Const {
	private int tot,avg;
	public void Tsum () {
		tot=am+pm;
		System.out.println (getName()+"�� �Ϸ� ¢�� �� ȸ��  :"+ tot);		
	}
	public void TAvg(){
		avg =tot / 2;
		System.out.println (getName()+ "�� �Ϸ� ¢�� ��� ȸ��  :"+ avg);
	}
}
public class Ch08_Exam03 {
	public static void main(String[] args) {
		Total obj = new Total ();
		obj.Tsum ();
		obj.TAvg();
	}	
}
