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
