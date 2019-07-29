
package chatting.step10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class ClientChatListener implements ActionListener, ListSelectionListener, ItemListener{
	ClientChatView view;
	boolean state = true;
	boolean rdoState = false;
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
		}else if(e.getSource()==view.btnChat){
			ChattingRoom chatRoom = new ChattingRoom();
		}
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(rdoState){
			if(!state){
				secretUser = view.lstconnect.getSelectedValue();
			}
			state = !state;
		}else{
			secretUser = "";
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(view.rdoSecretOk.isSelected()){
			rdoState = true;
		}else if(view.rdoSecretCancel.isSelected()){
			rdoState = false;
			secretUser = "";
	
			//jlist선택없애는거어케하지..?
		}
	}
}
