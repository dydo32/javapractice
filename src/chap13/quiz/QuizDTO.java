package chap13.quiz;

public class QuizDTO {
	private int quiznum;
	private String content;
	private String one;
	private String two ;
	private String three;
	private String four;
	public QuizDTO(int quiznum, String content, String one, String two,
			String three, String four) {
		super();
		this.quiznum = quiznum;
		this.content = content;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}
	public int getQuiznum() {
		return quiznum;
	}
	public void setQuiznum(int quiznum) {
		this.quiznum = quiznum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	public String getThree() {
		return three;
	}
	public void setThree(String three) {
		this.three = three;
	}
	public String getFour() {
		return four;
	}
	public void setFour(String four) {
		this.four = four;
	}
	
}
