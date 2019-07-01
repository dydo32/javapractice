package chap03;
public class TimeExam {
	public static void main(String[] args){
		int time = 8888; //초 데이터
		//  TimeExam작성
		//	time변수에 저장된 값을 __시간 __분 __초로 변경해서 출력하세요.

		int h = time/60/60; // 몫이 시간 데이터
		int val = time % 3600; // 3600으로 나눈 나머지가 시간을 구하고 남은 나머지
		int m = val/60; //시간 데이터를 구하고 남은 나머지를 60으로 나누면 분 데이터
		int s = val%60; //분 데이터를 구하고 남은 나머지가 초 데이터

		System.out.println(h+"시간 "+m+"분 "+s+"초");
	}
}
