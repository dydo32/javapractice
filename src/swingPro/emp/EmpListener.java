package swingPro.emp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import swingPro.dept.service.DeptService;
import swingPro.dept.service.DeptServiceImpl;
import swingPro.dept.view.InsaMain;

public class EmpListener implements ChangeListener,ActionListener{
	InsaMain mainView;
	Color[] color = new Color[]{Color.GREEN,Color.PINK,Color.orange,Color.yellow};
	public EmpListener(){
		
	}

	public EmpListener(InsaMain mainView) {
		super();
		this.mainView = mainView;
	}

	
	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println("test");
		if(e.getSource()==mainView.tabbedPane &
				mainView.tabbedPane.getSelectedIndex()==1){	//2��° �� �������� ��
			
			System.out.println("�Ǽ���");
			DeptService service = new DeptServiceImpl();
			Vector<String> deptnamelist = service.getDeptName();
			ComboBoxModel<String> model = 
				new DefaultComboBoxModel<String>(deptnamelist);
			mainView.empList.cbodeptlist.setModel(model);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mainView.empList.cbodeptlist){
			mainView.empList.empPanel.removeAll();	//�гο� �ִ°� �� �����
			String deptname =
					(String)mainView.empList.cbodeptlist.getSelectedItem();
			DeptService service = new DeptServiceImpl();
			Vector<Vector<String>> tabledata =		//���Ϳ� dto����ִ°� �� ����
								service.getMemberList(deptname);
			int size = tabledata.size();
			System.out.println(size);
			if(size>0){		//��ȸ�� ���ڵ尡 �ִ� ���
				int x=0;
				int y=0;
				for(int i=0;i<tabledata.size();i++){
					Vector<String> row = tabledata.get(i);
					EmpView emp = new EmpView();
					emp.setBounds(x, y, 180, 153);
		
					emp.lbliddata.setText(row.get(0));	
					emp.lblNamedata.setText(row.get(2));
					emp.lblgradedata.setText(row.get(5));
					emp.lblhiredatedata.setText(row.get(4));
					emp.setBackground(Color.blue);
			/*		System.out.println(emp.getHeight());
					System.out.println(emp.getWidth());*/
					
					mainView.empList.empPanel.add(emp);
					
					mainView.empList.empPanel.setBackground(color[i]);
					mainView.empList.empPanel.revalidate();
					mainView.empList.empPanel.repaint();
				
					x =x+ emp.getWidth()+10;	// ���� ���� ���������� ���� .
					System.out.println("x="+x);
				}
			}else{
				mainView.empList.empPanel.removeAll();	//�������� �۾��ϱ�����.
				mainView.empList.empPanel.revalidate();
				mainView.empList.empPanel.repaint();
			}
			
		}
		
	}

}













