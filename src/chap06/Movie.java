package chap06;

public class Movie {
	private String title;
	private String genre;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void play(){
		System.out.println(title+"("+genre+")"+" 상영중입니다.");
	}
}
