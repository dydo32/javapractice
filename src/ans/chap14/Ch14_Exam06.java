package ans.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Ch14_Exam06{

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("a.txt");
	      BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);      
	 
	      System.out.println("Creation Time      : " + bfa.creationTime());
	      System.out.println("Last Access Time   : " + bfa.lastAccessTime());
	      System.out.println("Last Modified Time : " + bfa.lastModifiedTime());
	      System.out.println("Is Directory       : " + bfa.isDirectory());
	      System.out.println("Is Other           : " + bfa.isOther());
	      System.out.println("Is Regular File    : " + bfa.isRegularFile());
	      System.out.println("Is Symbolic Link   : " + bfa.isSymbolicLink());
	      System.out.println("Size               : " + bfa.size());       


	}

}
