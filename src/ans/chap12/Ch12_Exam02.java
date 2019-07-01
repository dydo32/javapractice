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
	        System . out . println ( "private �޼ҵ尡 ȣ��Ǿ����ϴ�." );
	    }
	    void Method ()  {
	        System . out . println ( "�׼��� �����ھ��� �޼ҵ尡 ȣ��Ǿ����ϴ�." );
	    }
	    protected  void protectedMethod ()  {
	        System . out . println ( "protected �޼ҵ尡 ȣ��Ǿ����ϴ�." );
	    }
	    public  void publicMethod ()  {
	        System . out . println ( "public �޼ҵ尡 ȣ��Ǿ����ϴ�." );
	    }
	    private  static  void staticMethod ()  {
	        System . out . println ( "static �޼ҵ尡 ȣ��Ǿ����ϴ�." );
	    }
	    public  static  void main ( String [] args )  {
	    	Ch12_Exam02 sample =  new  Ch12_Exam02 ();
	        sample . process ();
	    }
	}
