
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
			// 3.======������ ��ȭ ����, chatting���λ縦 �Բ� ������.
			// ������ ��ȭ���� �����ϵ��� �ϱ� ���ؼ� ���� � Ŭ�󸮾�Ʈ�� �Է��� ��ȭ���� �����ؾ� �ϹǷ�
			// ��ȭ������ �Է��ؼ� ������ ������ � nickname������ ���� ������.======
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
	
			//jlist���þ��ִ°ž�������..?
		}
	}
}
