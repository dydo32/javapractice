package ans.chap09;

public class Ch09_Exam02 {

	public static void main(String[] args) {
		 try {
		        newException();
		     }
		     catch(Throwable e) { 		 
		    	  System.out.println(e);
		          System.out.println(e.getMessage());
		     }
		   }
		  
		   public static void newException() throws Exception {
		      System.out.println(" newException() 메소드 영역입니다 ");
		      throw new Exception("Exception 생성과 위임 ");
		   }	
}
