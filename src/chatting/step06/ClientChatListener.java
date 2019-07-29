package chatting.step06;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class ClientChatListener implements ActionListener{
	ClientChatView view;

	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 6. ======Ŭ���̾�Ʈ�� �Է��� �� ���� ������ ���޵ǵ��� ����======
		if(e.getSource()==view.btnsend || e.getSource() == view.txtinput){
			view.sendMsg(view.txtinput.getText());
			view.txtinput.setText("");
		}
	
	}
}
