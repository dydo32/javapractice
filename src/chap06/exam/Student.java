package chap06.exam;
/*문제 3. 다음 설명을 읽고 Student 클래스를 신규 작성하십시오. */
public class Student {
	private String name; 	//이름변수
	private String subject;	//과정명 변수
	private int fee;		//교육비 변수
	private double returnFee;	//환급금변수
	
	public Student(){
		
	}
	//이름(name), 과정명(subject), 교육비(fee) 를 매개변수로 받는 생성자 
	public Student(String name, String subject, int fee){
		this.name=name;
		this.subject=subject;
		this.fee=fee;
	}
	
	// void calcReturnFee() 메소드 : 
	// 과정명(subject)이 “javaprogram”이면 환급금은 교육비(fee)의 25%로 계산   
	// 과정명(subject)이 “jspprogram”이면 환급금은 교육비(fee)의 20%로 계산  
	// 나머지 과정명은 “그런 과정명은 없습니다” 출력하고 메서드 중단 
	public void calcReturnFee(){
		if(subject=="javaprogram"){
			returnFee=fee*0.25;
		}else if(subject=="jspprogram"){
			returnFee=fee*0.20;
		}else{
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	// void print() 메소드 : 
	// 다음과 같은 형식으로 Student 정보 출력.  
	// - name, subject, fee, returnFee 를 차례대로 출력.  
	// 예) xxx 씨의 과정명은 xxxx 이고 교육비는 xxx 이며 환급금은 xxx 입니다.  \
	public void print(){
		System.out.println(name+"씨의 과정명은 "+subject+"이고 교육비는 "+fee+"이며 환급금은 "+returnFee+"입니다.");
	}
	  
	public static void main(String args[]) {
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
}
