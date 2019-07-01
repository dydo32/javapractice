package ans.chap14;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ch14_Exam08 {
    public static void main(String[] args) {
    	  System.out.println("원하는 디렉토리,파일, 심볼릭된 이름을 입력하세요:");
    	  String name= new Scanner(System.in).nextLine();
    	  Path ph=Paths.get(name);
    	  System.out.println("입력하신 내용은:"+pathType(ph));
	}
    
    private static String pathType(Path path)
    {
        if (Files.isRegularFile(path,LinkOption.NOFOLLOW_LINKS))
        {
            return "File";
        }
        if (Files.isDirectory(path,LinkOption.NOFOLLOW_LINKS))
        {
            return "Dir";
        }
        if (Files.isSymbolicLink(path))
        {
            return "Symlink";
        }
        return "다른종류?";
    }
}
