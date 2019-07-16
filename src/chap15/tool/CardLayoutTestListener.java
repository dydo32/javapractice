package chap15.tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTestListener implements ActionListener{
	CardLayoutTest mainView;
	public CardLayoutTestListener() {
		
	}
	public CardLayoutTestListener(CardLayoutTest mainView) {
		super();
		this.mainView = mainView;
	}

	//card´Â CardLayout
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mainView.btnnext){
			mainView.card.next(mainView.cardPanel);
		}else if(e.getSource() == mainView.btnpre){
			mainView.card.previous(mainView.cardPanel);
		}
	}
}
