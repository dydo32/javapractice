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
		 *  isSelected()는 JCheckBox나 JRadioButton이 선택되었는지 boolean으로 리턴하는 메소드
		 *  itemStateChanged라는 리스너의 메소드는 상태값이 바뀔때마다 호출되는 이벤트 핸들러이므로
		 *  JRadioButton은 최초 선택 빼고 itemStateChanged가 두 번 호출된다
		 */
		for (int i = 0; i < mainView.rdoitems.length; i++) {
			if(mainView.rdoitems[i].isSelected()){
				mainView.lblimg.setIcon(mainView.images[i]);
			}
		}
		System.out.println("이벤트연결");
		System.out.println(e.getSource());
		/*
		//이벤트를 발생시키는 객체가 JRadioButton이면 JRadioButton으로 Casting을 하겠다는 의미
		if(e.getSource() instanceof JRadioButton){
			JRadioButton obj = (JRadioButton)e.getSource();
			System.out.println("선택유무: "+obj.isSelected()); //isSelected() -> 선택: true, 해제: false
		}
		*/
	}
	
}
