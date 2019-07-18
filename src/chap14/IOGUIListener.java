package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class IOGUIListener implements ListSelectionListener{
	IOGUI mainView;
	boolean state = true;
	public IOGUIListener() {
	}

	public IOGUIListener(IOGUI mainView) {
		super();
		this.mainView = mainView;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(state){
			BufferedReader br = null;
			try {
				mainView.taInfo.setText("");
				br = new BufferedReader(new FileReader("src/chap14/"+ mainView.lstFilelist.getSelectedValue()));
				while(true){
					String line = br.readLine();
					if(line==null){
						break;
					}
					mainView.taInfo.append(line + "\n");
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if( br != null)br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
}
