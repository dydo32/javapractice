
package chatting.step09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class ClientChatListener implements ActionListener, ListSelectionListener{
	ClientChatView view;
	boolean state = true;
	
	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.btnsend || e.getSource() == view.txtinput){
			view.sendMsg("chatting/"+view.txtinput.getText().trim()+"/"+view.nickname);
			view.txtinput.setText("");
		}
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
	}
}
