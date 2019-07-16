package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//JComboBox와 JList의 이벤트처리
public class ListSelectionEventTestListener implements ActionListener, ListSelectionListener {
	ListSelectionEventTest mainView;
	boolean state = true; // 상태변화를 저장하기 위한 변수

	public ListSelectionEventTestListener() {
	}

	public ListSelectionEventTestListener(ListSelectionEventTest mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트 반응");
		System.out.println("전체 아이템수 ==> " + mainView.cbomovie.getItemCount());
		System.out.println("선택한 아이템의 index ==> " + mainView.cbomovie.getSelectedIndex());
		System.out.println("선택된 아이템 ==> " + mainView.cbomovie.getSelectedItem());
		System.out.println("선택된 아이템 ==> " + mainView.cbomovie.getItemAt(2));
		mainView.text1.setText(mainView.cbomovie.getSelectedItem() + "");
	}

	// JList에서 발생하는 이벤트에 반응하는 메소드
	// valueChanged 마우스 왼쪽 버튼이 클릭될 때 버튼이 눌려지는 순간과 눌렸던 버튼이 나오는 순간에 두 번 호출 된다.
	// e.getValueIsAdjusting()은 마우스가 눌려질때 true를 반환하고 반대의 순간에는 false를 반환한다.
	// 따라서 마우스를 누른 상태로 드래그를 하거나 키보드를 누르면 한 번만 호출된다.
	@Override
	public void valueChanged(ListSelectionEvent e) {
		/*
		 * if (!e.getValueIsAdjusting()) { System.out.println("반응");
		 * System.out.println(e.getSource());
		 * System.out.println(e.getValueIsAdjusting());
		 * System.out.println(mainView.lstsubject.getSelectedIndex() + ": " +
		 * mainView.lstsubject.getSelectedValue());
		 * mainView.text2.setText(mainView.lstsubject.getSelectedValue()); }
		 */
		if (!state) { // state가 true일때 실행하겠다. !state 일때 실행하겠다 (false)
			System.out.println("반응");
			System.out.println(e.getSource());
			System.out.println(e.getValueIsAdjusting());
			System.out.println(mainView.lstsubject.getSelectedIndex() + ": " + mainView.lstsubject.getSelectedValue());
			mainView.text2.setText(mainView.lstsubject.getSelectedValue());
		}
		state = !state;
	}

}
