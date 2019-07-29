package chatting.step05;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ChatServerListener implements ActionListener{
	ChatServerView view;

	public ChatServerListener(ChatServerView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.btnstartServer){
			String port = JOptionPane.showInputDialog(view, 
					"port를 입력하세요",JOptionPane.INFORMATION_MESSAGE);
			view.startServer(Integer.parseInt(port));

		}else if(e.getSource()==view.btnstop){
			System.out.println("서버중지");
		}
		
	}
	
	
}
