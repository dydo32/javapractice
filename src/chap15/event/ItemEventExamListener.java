package chap15.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*
 * view���� �̺�Ʈ�� �߻��ϸ� � ������Ʈ�� �̺�Ʈ�� �߻����״��� Ȯ���ϰ� ó���� �����Ͻ� �޼ҵ带 ȣ��
 * (�����Ͻ��޼ҵ忡�� ó���� �������� �信 ���� ������ �ʿ��ϸ� �޼ҵ��� �Ű������� �Ѱ��ش�.)
 * �����Ͻ� �޼ҵ� ó�� ����� view���� �ʿ��ϸ� �����Ͻ� �޼ҵ��� ���ϰ����� �����Ѵ�.
 */
public class ItemEventExamListener implements ItemListener {

	ItemEventExam mainView;

/*	int mainTotal = 0;
	int subTotal = 0;*/
	
	int totalPrice = 0;	// ��ü�ݾ�
	int mainPrice = 0; 	// �ָ޴�
	int subPrice = 0;	// �θ޴�
	

	public ItemEventExamListener() {}
	public ItemEventExamListener(ItemEventExam mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// �ָ޴��� �θ޴��� ���� �۾� ���� ó��
		ItemEventExamLogic logic = new ItemEventExamLogic();

		// �ָ޴��� ���� ����ϱ� ���ؼ� �ָ޴��� ������ ����� �迭�� �ָ޴� ��ü�� �ѱ�� �ִ�.
		// mainPrice = logic.calcTotalPrice(mainView.mainPrice, mainView.rbomenu);
		// �θ޴��� ���� ����ϱ� ���ؼ� �θ޴��� ������ ����� �迭�� �ָ޴� ��ü�� �ѱ�� �ִ�.
		// subPrice = logic.calcTotalPrice(mainView.subPrice, mainView.chkmenu);
		
		/*String opr = null;
		if (e.getStateChange() == ItemEvent.SELECTED) {
			opr ="+";
		}else{
			opr="-";
		}*/

		for (int i = 0; i < mainView.rbomenu.length; i++) {
			if (mainView.rbomenu[i].isSelected())
				mainPrice = mainView.mainPrice[i];
		}
		
		for (int i = 0; i < mainView.chkmenu.length; i++) {
			if(e.getSource() == mainView.chkmenu[i] & e.getStateChange() == ItemEvent.SELECTED){
				subPrice = logic.calcTotalPrice(mainView.subPrice[i], subPrice, "+");
			} else if(e.getSource() == mainView.chkmenu[i]) {
				subPrice = logic.calcTotalPrice(mainView.subPrice[i], subPrice, "-");
			}
		}
		
		// === ���Ŀ� �� ������ ���õ� �ָ޴��� �θ޴��� ���� �����۾��� �����ʿ��� ó���ϰ� ���������� �ջ길 �Ҽ� �ֵ��� ���� : ����
		totalPrice = mainPrice + subPrice;
		mainView.tfPrice.setText(totalPrice+"");		
	}
}

