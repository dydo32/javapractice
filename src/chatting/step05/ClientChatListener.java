package chatting.step05;
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
		BufferedReader in = null; 
	
		try {
			in = new BufferedReader(new InputStreamReader(view.socket.getInputStream()));
			
			
			String reMsg = "";
			
			while(true){	
				reMsg = in.readLine(); 
				if(reMsg == null){
					break;
				}
				System.out.println(reMsg);
				
				
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
}
