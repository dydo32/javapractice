package chap10.api.lang;

public class FindCharacters {

	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious", 'b');
		System.out.println("b횟수: "+count);
		//테스트
		count=fc.countChar("Boys, be ambitious", 'i');
		System.out.println("i횟수: "+count);
	}
	
	public int countChar(String str, char c){
		// Method를 완성하세요...		
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
