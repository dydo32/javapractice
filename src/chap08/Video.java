package chap08;

public class Video extends Content {
	//변수
	private String genre;
	//생성자
	public Video(){
		
	}
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	//setter/getter메소드
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//totalPrice() 구현
	@Override
	public void totalPrice(){
		if(genre.equals("new")){
			setPrice(2000);
		}else if(genre.equals("comic")){
			setPrice(1500);
		}else if(genre.equals("child")){
			setPrice(1000);
		}else{
			setPrice(500);
		}
	}	
}
