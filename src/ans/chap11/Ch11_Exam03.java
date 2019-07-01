package ans.chap11;

import java.util.HashMap;
import java.util.Set;

public class Ch11_Exam03 {

	public static void main(String a[]){        
        HashMap<String, Price> hm = new HashMap<>();
        hm.put("바나나", new Price("Banana", 2500));
        hm.put("사과", new Price("Apple", 4000) );
        hm.put("오렌지", new Price("Orange", 30000));
        printMap(hm);
    
    }
     
    public static void printMap(HashMap<String, Price> map){         
        Set<String> keys = map.keySet();
        for(String p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
 
class Price{     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
          
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+",  price: "+price;
    }
}
