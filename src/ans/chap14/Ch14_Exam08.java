package ans.chap14;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ch14_Exam08 {
    public static void main(String[] args) {
    	  System.out.println("���ϴ� ���丮,����, �ɺ����� �̸��� �Է��ϼ���:");
    	  String name= new Scanner(System.in).nextLine();
    	  Path ph=Paths.get(name);
    	  System.out.println("�Է��Ͻ� ������:"+pathType(ph));
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
        return "�ٸ�����?";
    }
}
