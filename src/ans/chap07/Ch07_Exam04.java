package ans.chap07;

//주석의 숫자는 실행 순서를 나타냅니다 참고하세요 
class SuperClass
{
	int x, y,z;
	
	public SuperClass()
	{
		System.out.println("**** x,y,z에 값채우기***");  //---6
	}
	public SuperClass(int k)
	{
                this();                     //---5
                this.x=k;                   //---7
		System.out.println(k + "을 넘겨받은 생성자"); //---8
	}
	public SuperClass(int a, int b)
	{
	  	this(a);                    //---4
                this.y=b;                   //---9
		System.out.println(a + "   " +b+"   을 넘겨받은 생성자");//---10
	}
	public SuperClass(int x,int y,int z)
	{
                this(x,y);                   //---3
                this.z=z;                    //---11
		System.out.println(x+ "  " +y+" " +z+" 을 넘겨받은 생성자");//---12
	}
	public void display()
	{
		System.out.println(this.x+"   "+this.y+"   "+this.z);//---14
	}
}
class SubClass extends SuperClass
{
	public SubClass(int a,int b,int c)
	{
                super(a,b,c);                //---2
                super.display();             //---13
                this.sumData();              //---15
	}	
	public void sumData()
	{
		System.out.println("합 : " + (x+y+z)); //---16
	}
}
public class Ch07_Exam04 {
	public static void main(String[] args) {
		new SubClass(10,20,30);  
	}

}
