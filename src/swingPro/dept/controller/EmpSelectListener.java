package swingPro.dept.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import swingPro.dept.service.DeptService;
import swingPro.dept.service.DeptServiceImpl;
import swingPro.dept.view.InsaMain;

public class EmpSelectListener implements ActionListener, MouseListener{
	InsaMain mainView;
	public EmpSelectListener() {
		
	}
	public EmpSelectListener(InsaMain mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//DeptEmpSelectPage
				/*System.out.println("���õ� ������ ==> " + mainView.deptEmpSelectPage.cbodnamelist.getSelectedItem());
				String deptName = mainView.deptEmpSelectPage.cbodnamelist.getSelectedItem()+"";
				DeptService service = new DeptServiceImpl();
				Vector<Vector<String>> vemplist = service.getMemberList(deptName);
				
				for(int i = 0; i<vemplist.size();i++){
					Vector<String> emplist = vemplist.get(i);
					for(int j = 0; j<emplist.size(); j++){
						System.out.print(emplist.get(j)+"\t");
					}
					System.out.println();
					System.out.println("-------------------------------");
				}*/
		if(e.getSource()==mainView.deptEmpSelectPage.cbodnamelist){
			String deptName = mainView.deptEmpSelectPage.cbodnamelist.getSelectedItem()+"";
			System.out.println("���õ� �μ���: "+deptName);
			DeptService service = new DeptServiceImpl();
			Vector<Vector<String>> emplist = service.getMemberList(deptName);
			
			//JTable�� ����� �÷��� �ޱ�
			Vector<String> colNames = getColumn();
			//�����Ϳ� �÷����� �̿��ؼ� JTable�� �����͸� ����ϴ� �޼ҵ�
			showData(emplist, colNames);
			
		}
		
	}
	
	//JTable�� �����͸� ����ϴ� �޼ҵ�
	private void showData(Vector<Vector<String>> tableData, Vector<String> colNames) {
		//JTable�� �����͸� �����ϴ� Model��ü�� �̿��ؼ� �����͸� �߰�
		DefaultTableModel model = new DefaultTableModel();
		//Model��ü�� JTable���� ����� �����Ϳ� �÷����͸� �߰��ϴ� �۾�
		model.setDataVector(tableData, colNames);
		//JTable�� �� ��ü�� ����
		mainView.deptEmpSelectPage.table.setModel(model);
		
	}
	//JTable��  ����� �÷����͸� ����� �޼ҵ�
	public Vector<String> getColumn(){
		Vector<String> colNames = new Vector<String>();
		
		colNames.add("���̵�");
		//colNames.add("password");
		colNames.add("����");
		colNames.add("�ּ�");
		colNames.add("�Ի糯¥");
		//colNames.add("���");
		//colNames.add("����Ʈ");
		colNames.add("�μ��ڵ�");
		colNames.add("�μ���");
		return colNames;
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Ŭ��");
		//JTable���� ������ row�� ���� ���
		int row = mainView.deptEmpSelectPage.table.getSelectedRow();
		System.out.println("row=>"+row);
		//ĳ�����ؾ���  (DefaultTableModel)
		DefaultTableModel model = (DefaultTableModel)mainView.deptEmpSelectPage.table.getModel();
		//ĳ�����ؾ���
		String data = (String)model.getValueAt(row, 0);
		System.out.println("������ row�� 0�� �÷��� ��=>"+data);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
