package ans.chap13;
import java.io.*;
import java.util.concurrent.CompletableFuture;

public class Ch13_Exam08 {
 public static void main(String[] args) { 	  
	   
       CompletableFuture<String> my_test=new CompletableFuture<>();
       my_test.whenComplete((result, ex) -> System.out.println("start A: "+result+"\t"+ex));
       my_test.exceptionally(ex -> { System.out.println("start B : "+ex); return null; });
       my_test.completeExceptionally(new IOException());

   }
}
