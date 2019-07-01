package ans.chap13;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Ch13_Exam07 {

	public static void main(String[] args) {
		List < String > list =  Arrays . asList ( "�縮" , "�缼" , "���" , "������" ); 
	       
	       list.stream().map(s->CompletableFuture.supplyAsync(()->s+s))
	               .map(f->f.whenComplete((result,error)->System.out.println(result+" Error:"+error))).count();
	 

	}

}
