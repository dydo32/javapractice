package ans.chap12;

@FunctionalInterface
interface MyInterface {
	void doSomething();
}
public class Ch12_Exam02 {	
	    private  void process ()  {	 
	    	MyInterface  mytest = ()->{
	            privateMethod ();
	            Method ();
	            protectedMethod ();
	            publicMethod ();
	            staticMethod ();
	        };
	        mytest . doSomething ();
	    }
	    private  void privateMethod ()  {
	        System . out . println ( "private 메소드가 호출되었습니다." );
	    }
	    void Method ()  {
	        System . out . println ( "액세스 한정자없이 메소드가 호출되었습니다." );
	    }
	    protected  void protectedMethod ()  {
	        System . out . println ( "protected 메소드가 호출되었습니다." );
	    }
	    public  void publicMethod ()  {
	        System . out . println ( "public 메소드가 호출되었습니다." );
	    }
	    private  static  void staticMethod ()  {
	        System . out . println ( "static 메소드가 호출되었습니다." );
	    }
	    public  static  void main ( String [] args )  {
	    	Ch12_Exam02 sample =  new  Ch12_Exam02 ();
	        sample . process ();
	    }
	}
