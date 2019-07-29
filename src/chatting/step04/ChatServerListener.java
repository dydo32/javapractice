package chatting.step04;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
					"port�� �Է��ϼ���",JOptionPane.INFORMATION_MESSAGE);
			//4. ======���� ���� ��ư�� ������ ������ start�ϴ� �޼ҵ带 ȣ��======
			view.startServer(Integer.parseInt(port));
			//=====================================================
			
		}else if(e.getSource()==view.btnstop){
			System.out.println("��������");
		}
	}
	
	
}
