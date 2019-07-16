package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//JComboBox�� JList�� �̺�Ʈó��
public class ListSelectionEventTestListener implements ActionListener, ListSelectionListener {
	ListSelectionEventTest mainView;
	boolean state = true; // ���º�ȭ�� �����ϱ� ���� ����

	public ListSelectionEventTestListener() {
	}

	public ListSelectionEventTestListener(ListSelectionEventTest mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�̺�Ʈ ����");
		System.out.println("��ü �����ۼ� ==> " + mainView.cbomovie.getItemCount());
		System.out.println("������ �������� index ==> " + mainView.cbomovie.getSelectedIndex());
		System.out.println("���õ� ������ ==> " + mainView.cbomovie.getSelectedItem());
		System.out.println("���õ� ������ ==> " + mainView.cbomovie.getItemAt(2));
		mainView.text1.setText(mainView.cbomovie.getSelectedItem() + "");
	}

	// JList���� �߻��ϴ� �̺�Ʈ�� �����ϴ� �޼ҵ�
	// valueChanged ���콺 ���� ��ư�� Ŭ���� �� ��ư�� �������� ������ ���ȴ� ��ư�� ������ ������ �� �� ȣ�� �ȴ�.
	// e.getValueIsAdjusting()�� ���콺�� �������� true�� ��ȯ�ϰ� �ݴ��� �������� false�� ��ȯ�Ѵ�.
	// ���� ���콺�� ���� ���·� �巡�׸� �ϰų� Ű���带 ������ �� ���� ȣ��ȴ�.
	@Override
	public void valueChanged(ListSelectionEvent e) {
		/*
		 * if (!e.getValueIsAdjusting()) { System.out.println("����");
		 * System.out.println(e.getSource());
		 * System.out.println(e.getValueIsAdjusting());
		 * System.out.println(mainView.lstsubject.getSelectedIndex() + ": " +
		 * mainView.lstsubject.getSelectedValue());
		 * mainView.text2.setText(mainView.lstsubject.getSelectedValue()); }
		 */
		if (!state) { // state�� true�϶� �����ϰڴ�. !state �϶� �����ϰڴ� (false)
			System.out.println("����");
			System.out.println(e.getSource());
			System.out.println(e.getValueIsAdjusting());
			System.out.println(mainView.lstsubject.getSelectedIndex() + ": " + mainView.lstsubject.getSelectedValue());
			mainView.text2.setText(mainView.lstsubject.getSelectedValue());
		}
		state = !state;
	}

}
