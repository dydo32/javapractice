package chap07;

//일반화시킨 후 
class 동물 {
	String 이름;
	String 이동방법;

	public void 이동하다() {
		System.out.println(이동방법 + "으로 이동함");
	}
}

class 뱀after extends 동물 {
	int 몸길이;

	public void set몸길이(int 몸길이) {
		this.몸길이 = 몸길이;
	}
}

class 독수리after extends 동물 {
	int 날개길이;

	public void set날개길이(int 날개길이) {
		this.날개길이 = 날개길이;
	}
}

class 코끼리after extends 동물{
	int 귀크기;

	public void set귀크기(int 귀크기) {
		this.귀크기 = 귀크기;
	}
}

class 고래after extends 동물{
	int 지느러미길이;

	public void set지느러미길이(int 지느러미길이) {
		this.지느러미길이 = 지느러미길이;
	}
}

class 동물after {
	public static void main(String[] args){
		고래after obj = new 고래after();
		obj.이동방법 = "수영";
		obj.이동하다();
	}
}
