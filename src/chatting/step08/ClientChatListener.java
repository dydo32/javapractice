package chatting.step08;
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
	String secretUser = "";
	
	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.btnsend || e.getSource() == view.txtinput){
			// 3.======서버로 대화 전송, chatting접두사를 함께 보낸다.
			// 서버가 대화인지 구분하도록 하기 위해서 또한 어떤 클라리언트가 입력한 대화인지 구분해야 하므로
			// 대화내용을 입력해서 전송한 서버가 어떤 nickname인지도 같이 보낸다.======
			if(secretUser.equals("")){
				view.sendMsg("chatting/"+view.txtinput.getText().trim()+"/"+view.nickname);
			}else{
				view.sendMsg("secretChatting/"+view.txtinput.getText().trim()+"/"+view.nickname+"/"+secretUser);
			}
			// =====================================================
			
			
			view.txtinput.setText("");
		}
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(!state){
			secretUser = view.lstconnect.getSelectedValue();
		}
		state = !state;
	}
}
