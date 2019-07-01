package ans.chap16;
import java.io.Serializable;

public class SendData implements Serializable {
	private int year;	
	private String result;	
	
	public SendData(int year ) {
		super();
		this.year = year;		
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
