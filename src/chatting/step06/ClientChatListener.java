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
		// 6. ======클라이언트가 입력할 때 마다 서버에 전달되도록 구현======
		if(e.getSource()==view.btnsend || e.getSource() == view.txtinput){
			view.sendMsg(view.txtinput.getText());
			view.txtinput.setText("");
		}
	
	}
}
