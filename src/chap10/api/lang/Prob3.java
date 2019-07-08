package chap10.api.lang;

/*
 * 배열 크기 : 4
 * 서울시 구로구 코오롱싸이언스밸리1차 KITRI
 */
public class Prob3 {

	public static void main(String[] args) {
		Prob3 p = new Prob3();
		String addr = "서울시,구로구,코오롱싸이언스밸리1차,KITRI";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for (int i = 0; i < addrArr.length; i++) {
			System.out.print(addrArr[i] + " ");
		}

		// 테스트
		System.out.println();
		String addr2 = "서울시,구로구,코오롱,싸이언스,밸리,1차,KITRI";
		String[] addrArr2 = p.split(addr2, ',');
		System.out.println("배열 크기 : " + addrArr2.length);
		for (int i = 0; i < addrArr2.length; i++) {
			System.out.print(addrArr2[i] + " ");
		}
	}

	public String[] split(String str, char separator) {
		String[] result = null;
		String temp = "";
		int count = 0;
		int num = 0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== separator){
				count=count+1;	//,다음 한개 더 있으므로 +1
			}
		}
		result = new String[count+1];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!= separator){
				temp = temp + str.charAt(i)+"";
			}else{
				result[num] = temp;
				num++;
				temp="";
			}
		}
		
		result[num]=temp; // 마지막, 뒤 문자열 
		return result;
	}
}
