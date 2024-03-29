package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URL클래스
//- 웹상의 주소를 나타내는 클래스이고, 이를 통해서 네크워크 연결도 가능하다.
//- 웹상의 리소스를 가져올 수 있다.

public class URLTest01 { // http://도 넣어주어야함.

	public static void main(String[] args) {

		try {
			URL url = new URL(args[0]);
			System.out.println(url.toString());		//toString호출하는것과 같다.
			System.out.println("url.getHost()=> " + url.getHost());
			System.out.println("url.getPath()=> " + url.getPath());
			//getPort가 -1로 출력
			//-1포트로 접속했다는 의미가 아니라 프로토콜에 등록되어있는 기본 port로 접속했다는 의미.
			//http프로토콜은 기본 port가 80이고, 우리가 접속한 모든 url은 80포트를 사용한다.
			System.out.println("url.getPort()=> " + url.getPort());
			System.out.println("url.getProtocol()=> " + url.getProtocol());
			System.out.println("url.getFile()=> " + url.getFile());
			
			//지정한 URL에 접속해서 자원을 읽는 작업을 수행
			//InputStream is = url.openStream();  	//IOException발생.
			//타입을 변환하는 작업 InputStream -> Reader타입으로 변환
			//InputStreamReader ir = new InputStreamReader(is);
			//BufferedReader br = new BufferedReader(ir);	
			//BufferedReader는 BufferedReader만 받으니까 InputStreamReader타입으로 변환
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while(true){
				String line = br.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {	//Malformed -> URL의 형식을 제대로 입력하지 않아서 발생하는것.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
