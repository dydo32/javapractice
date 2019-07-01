package chap06;
/*문제3. 다음과 같은 설명을 읽고 Duck과 Sparrow 클래스를 작성하십시오. 
 * 		PlayBird 클래스를 참고하세요.(선택) 
 *  오리(Duck) 클래스와 참새(Sparrow) 클래스는 
 *  이름을 나타내는 name과 다리의 수 를 나타내는 legs, 몸길이를 나타내는 length 데이터를 가지고 있다. 
 *  메소드로는 날다 fly, 울다 sing, 이름기록하기 setName, 문자열출력하기 toString 를 가지고 있다. 
 *  PlayBird 클래스를 이용하여 두 클래스의 메소드를 호출시켰을 때 콘솔에 출력되는 결과는 다음과 같다. 
 *  
 *  [PlayBird 실행결과] 
 *  	오리(꽥꽥이)는 날지 않습니다. 
 *  	오리(꽥꽥이)가  소리내어 웁니다. 
 *  	오리의 이름은 꽥꽥이 입니다. 
 *  	참새(짹짹)가 날아다닙니다. 
 *  	참새(짹짹)가  소리내어 웁니다. 
 *  	참새의 이름은 짹짹 입니다
 */
public class BirdPlay {
 	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("꽥꽥이");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("짹짹");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	
	}
}
