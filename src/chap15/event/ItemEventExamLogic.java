package chap15.event;

public class ItemEventExamLogic {
	// �۾��� JCheckBox�� JRadioButton�迭��ü�� ���ݹ迭�� �Ѱ� �޾Ƽ� ��Ż�ݾ��� ����ؼ� ����
	// => ���Ŀ� �ݵ�� �����Ǿ�� �ϴ� �޼ҵ�
	// ����Ͻ� ������ ó���ϴ� Ŭ���������� view���� ��Ҹ� ���� �������� �ʰ� ������ ������ �� �ֵ��� ����

	/*public int calcTotalPrice(int[] priceArr, JToggleButton[] menu) {
		int totalPrice = 0;

		for (int i = 0; i < menu.length; i++) { // ��ü �޴���ŭ for���� ����
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
