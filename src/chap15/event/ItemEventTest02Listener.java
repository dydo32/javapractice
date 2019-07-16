package chap15.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventTest02Listener implements ItemListener{
	ItemEventTest02 mainView;
	public ItemEventTest02Listener(){}
	public ItemEventTest02Listener(ItemEventTest02 mainView){
		super();
		this.mainView = mainView;
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		/*
		 *  isSelected()�� JCheckBox�� JRadioButton�� ���õǾ����� boolean���� �����ϴ� �޼ҵ�
		 *  itemStateChanged��� �������� �޼ҵ�� ���°��� �ٲ𶧸��� ȣ��Ǵ� �̺�Ʈ �ڵ鷯�̹Ƿ�
		 *  JRadioButton�� ���� ���� ���� itemStateChanged�� �� �� ȣ��ȴ�
		 */
		for (int i = 0; i < mainView.rdoitems.length; i++) {
			if(mainView.rdoitems[i].isSelected()){
				mainView.lblimg.setIcon(mainView.images[i]);
			}
		}
		System.out.println("�̺�Ʈ����");
		System.out.println(e.getSource());
		/*
		//�̺�Ʈ�� �߻���Ű�� ��ü�� JRadioButton�̸� JRadioButton���� Casting�� �ϰڴٴ� �ǹ�
		if(e.getSource() instanceof JRadioButton){
			JRadioButton obj = (JRadioButton)e.getSource();
			System.out.println("��������: "+obj.isSelected()); //isSelected() -> ����: true, ����: false
		}
		*/
	}
	
}
