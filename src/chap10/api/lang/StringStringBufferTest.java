package chap10.api.lang;

//String과 StringBuffer의 비교
public class StringStringBufferTest {
	// String으로 객체를 생성하고 제어
	public static void stringCheck(int count) {
		// 시작할때 현재 시간을 측정 - nano초
		long start = System.nanoTime(); // 10억분의 1초
		String str = new String("자바");
		for (int i = 1; i <= count; i++) {
			str = str + "java";
		}
		// 작업이 종료될때 현재 시간을 측정
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str = str + java");
		System.out.println("걸린시간: " + time);
	}

	// StringBuffer로 객체를 생성하고 제어
	public static void stringBufferCheck(int count) {
		// 시작할때 현재 시간을 측정 - nano초
		long start = System.nanoTime(); // 10억분의 1초
		StringBuffer sb = new StringBuffer("자바");
		for (int i = 1; i <= count; i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("sb.append('java')");
		System.out.println("걸린시간: " + time);
	}

	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수:"+count);
		stringCheck(count);
		stringBufferCheck(count);
	}

}
