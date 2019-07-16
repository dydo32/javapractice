package chap15.event;

public class CalcLogic {
	public int calc(String su1, String su2, String opr){
		int result = 0;
		int num1 = Integer.parseInt(su1);
		int num2 = Integer.parseInt(su2);
		switch (opr) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		return result;
	}
	/*
	public int calc(String su1, String su2, String btn){
		int result=0;
		int num1 = Integer.parseInt(su1);
		int num2 = Integer.parseInt(su2);
		if(btn.equals("+")){
			result = num1 + num2;
		}else if(btn.equals("-")){
			result = num1 - num2;
		}else if(btn.equals("*")){
			result = num1 * num2;
		}else if(btn.equals("/")){
			result = num1 / num2;
		}
		
		return result;
	}
	*/
}
