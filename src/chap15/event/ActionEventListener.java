package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {
	ActionEventTest mainView;

	public ActionEventListener() {
	}

	public ActionEventListener(ActionEventTest mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mainView.send | e.getSource() == mainView.text) {
			System.out.println("send¹öÆ°");
			//mainView.content.setText(mainView.text.getText());
			mainView.content.append(mainView.text.getText()+"\n");
			mainView.text.setText("");
		}
	}

}
