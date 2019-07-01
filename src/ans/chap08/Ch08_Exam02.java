package ans.chap08;
	interface SayHello {
	    public void  print();
	}
	class SayHelloEng implements SayHello {
	    public void  print(){
	       System.out.println( "Hello");
	    }
	}
	class SayHelloKo implements SayHello {
	    public void  print(){
	       System.out.println( "¾È³ç!");
	    }
	}
public class Ch08_Exam02{	
	    public static void main(String [] args){	   
	    	   SayHello[]  sh=new SayHello[2];
	    	   sh[0]=new SayHelloEng();
	    	   sh[1]=new SayHelloKo();
	    	   
	    	   for(int i=0; i<sh.length;i++)
	    		   sh[i].print();
	    }
	}
