package ans.chap13;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Ch13_Exam06 {
	public static void main(String[] args) {
		 List < String > list =  Arrays . asList ( "��" , "��" , "��" , "��" ); 
	       list . stream ()
	       .map ( data -> CompletableFuture . supplyAsync (()-> "��� : " + data ))
	       .map ( compFuture -> compFuture . thenAccept ( s -> System . out . println ( s )))
	       . map ( t -> t . join ()).count();       
	           

	}

}
