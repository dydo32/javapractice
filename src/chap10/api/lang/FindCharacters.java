package chap10.api.lang;

public class FindCharacters {

	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious", 'b');
		System.out.println("bȽ��: "+count);
		//�׽�Ʈ
		count=fc.countChar("Boys, be ambitious", 'i');
		System.out.println("iȽ��: "+count);
	}
	
	public int countChar(String str, char c){
		// Method�� �ϼ��ϼ���...		
		int count = 0;
		int size = str.length();
		
		for(int i=0; i<size; i++){
			if((str.charAt(i))==c){
				count = count + 1;
			}
		}
		return count;
	}
}
