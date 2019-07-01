package ans.chap14;


import java.io.IOException;
import java.nio.file. *;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.FileVisitResult;
public  class Ch14_Exam10 {

   public  static  void  main (String [] args) throws IOException {
       execute (Paths.get ( "C:\\MYTest"), "*.txt" );
   }

   public  static  void execute (Path path, String pattern)
            throws IOException {
       Finder finder = new Finder (pattern);    
       Files.walkFileTree (path, finder);  
       finder.done ();   
   }


   public  static  class Finder extends SimpleFileVisitor <Path> {
       private  final PathMatcher matcher;
        private  int numMatches = 0 ;

       Finder (String pattern) {
           this.matcher = FileSystems.getDefault ().getPathMatcher("glob:" + pattern);
       }

       @Override 
       public FileVisitResult visitFile (Path file, BasicFileAttributes atts) {
           Path name = file.getFileName ();
           if (name != null && this .matcher.matches (name)) {
                this .numMatches ++;
               System.out.println (file);
           }
           return FileVisitResult.CONTINUE;
       }

       @Override 
       public FileVisitResult visitFileFailed (Path file, IOException exc) {
           System.err.println (exc);
           return FileVisitResult.CONTINUE;
       }
   
       void done() {
           System.out.println ( "Matched :" + this .numMatches);
       }
   }
}