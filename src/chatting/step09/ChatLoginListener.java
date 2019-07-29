
package chatting.step09;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;


public class ChatLoginListener  implements ActionListener{
	ChatLogin view;
	String nickname;

	
	public ChatLoginListener(ChatLogin view) {
		super();
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==view.btnConnect){
			nickname = view.txtId.getText().trim();
			if(nickname.isEmpty()) {
				JOptionPane.showMessageDialog(view,
						"대화명을 입력하세요", "대화명오류", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String ip = view.cboServer.getSelectedItem()+"";
			int port = Integer.parseInt(view.cboPort.getSelectedItem()+"");
			System.out.println(ip+port);
			
			ClientChatView clientView = new ClientChatView(ip, port, nickname);
			view.dispose();
			
		
		}
	}
}