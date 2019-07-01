package ans.chap06;

public class Emp {
	
	 private String empno;
	 private int gi;
	 private double se, su, bong;
	 private  String  grad;
	public Emp() {
		super();	
	}
	public Emp(String empno, int gi) {
		super();
		this.empno = empno;
		this.gi = gi;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public int getGi() {
		return gi;
	}
	public void setGi(int gi) {
		this.gi = gi;
	}
	public double getSe() {
		 se= getGi()*0.20;
		return se;
	}
	public double getSu() {
		 su=getGi()*0.15;
		return su;
	}
	public double getBong() {
		     bong= getGi()+getSu()- getSe();
		return bong;
	}
	public String getGrad() {
		    if(getBong()>=500000)
		    {
		      grad="관리자";
		    }else
		    	{
		    	  grad="영업";
		    	
		    }
		return grad;
	}
	 public String toString()
	 {
	      String str=String.format("%7s  | %7d |  %7.1f |  %7.1f |  %7.1f  | %5s", 
	    		                this.getEmpno(), this.getGi(), this.getSe(),this.getSu(),this.getBong(), this.getGrad());
	      return str;
	 }
	

}
