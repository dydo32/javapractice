package chap15.event;

public class ItemEventExamLogic {
	// 작업할 JCheckBox와 JRadioButton배열객체와 가격배열을 넘겨 받아서 토탈금액을 계산해서 리턴
	// => 추후에 반드시 수정되어야 하는 메소드
	// 비즈니스 로직을 처리하는 클래스에서는 view적인 요소를 직접 제어하지 않고 값으로 제어할 수 있도록 설정

	/*public int calcTotalPrice(int[] priceArr, JToggleButton[] menu) {
		int totalPrice = 0;

		for (int i = 0; i < menu.length; i++) { // 전체 메뉴만큼 for문을 실행
			if (menu[i] instanceof JRadioButton) {
				totalPrice = priceArr[i];
			} else {
				totalPrice = totalPrice + priceArr[i];
			}
		}
		return totalPrice;
	}*/

	public int calcTotalPrice(int subPrice, int totalPrice, String opr) {

		switch (opr) {
		case "+":
			totalPrice = totalPrice + subPrice;
			break;
		case "-":
			totalPrice = totalPrice - subPrice;
			break;
		}
		return totalPrice;
	}
}
