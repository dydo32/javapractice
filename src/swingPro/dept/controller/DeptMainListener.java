package swingPro.dept.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import swingPro.dept.dto.DeptDTO;
import swingPro.dept.service.DeptService;
import swingPro.dept.service.DeptServiceImpl;
import swingPro.dept.view.InsaMain;
//�ַ� ����ȭ�鿡�� ����ϴ� �����ʸ� �����Ҷ���
//ȭ�鿬��� ���õ� ����̳� �ʱ�ȭ�� �����(ó������)�� ó���ؾ��ϴ� �۾��� �ִ� ��� ������ ����
public class DeptMainListener implements ActionListener{
	InsaMain mainView;
	public DeptMainListener() {
	}
	public DeptMainListener(InsaMain mainView) {
		super();
		this.mainView = mainView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//mainView.deptEmpSelectPage.cbodnamelist.removeAllItems();
		if(e.getSource() == mainView.btnDeptInsert){
			//mainView.card.next(mainView.cardPanel);
			mainView.card.show(mainView.cardPanel, "insertView");
		}else if(e.getSource() == mainView.btnDeptSelect){
			mainView.card.show(mainView.cardPanel, "selectView");
		}else if(e.getSource() == mainView.btnEmpSelect){
			mainView.card.show(mainView.cardPanel, "deptEmpView");
			
			DeptService service = new DeptServiceImpl();
			Vector<String> deptnamelist = service.getDeptName();
			
			System.out.println("������: "+deptnamelist.size());
			//JComboBox�� ��ȸ�� �μ����� ����ϱ� ���� JComboBox�� �������� �����͸� 
			//�����ϱ� ���� ��ü ComboBoxModel
			//1. ��ȸ�� �����͸� �̿��ؼ� ComboBoxModel��ü�� ����
			ComboBoxModel<String> model = new DefaultComboBoxModel<String>(deptnamelist);
			//2. ������ ComboBoxModel��ü�� JComboBox�� �����ϱ�
			mainView.deptEmpSelectPage.cbodnamelist.setModel(model);
			/*
			 * 	for(int i=0; i<deptnamelist.size();i++){
				String deptname = deptnamelist.get(i);
				System.out.println(deptname); 	//sysout���� ���
				mainView.deptEmpSelectPage.cbodnamelist.insertItemAt(deptname,i);
			}*/
		}else if(e.getSource() == mainView.btnMgrSearch){
			mainView.card.show(mainView.cardPanel, "empListPage");
		}else if(e.getSource() == mainView.deptInsertPage.btninsert){
			//1. deptInsertPage���� �Է��� ������ ���� - Ŭ���̾�Ʈ�� �Է��� ������
			String deptNo = mainView.deptInsertPage.tfdeptno.getText();
			String deptName = mainView.deptInsertPage.tfdeptname.getText();
			String loc = mainView.deptInsertPage.tfloc.getText();
			String telNum = mainView.deptInsertPage.tftel.getText();
			String mgr = mainView.deptInsertPage.tfmgr.getText();
			
			//2. Service�� insert�޼ҵ带 ȣ���ϸ鼭 Ŭ���̾�Ʈ�� �Է°��� �Ű������� ����
			//	 => �����Ͻ� �޼ҵ� ȣ��
			//JTextField�� �Է��� �����͸� �̿��ؼ� DTO��ü�� ���� ����
			DeptDTO dept = new DeptDTO(deptNo, deptName, loc, telNum, mgr);
			DeptService service = new DeptServiceImpl();
			int result = service.insert(dept);
			//int result = service.insert(deptNo, deptName, loc, telNum, mgr);
			
			//3. ���ȭ��
			System.out.println(result);
			if(result<=0){//���� ����
				int type = JOptionPane.showConfirmDialog(mainView, 
						"��Ͻ���... �ٽ��ұ�?","���Խ���",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				System.out.println(type);
				//OK_CANCEL_OPTION -> OK��ư 0, CANCEL��ư 2
				if(type == JOptionPane.OK_OPTION){
					mainView.deptInsertPage.tfdeptno.setText("");
					mainView.deptInsertPage.tfdeptname.setText("");
					mainView.deptInsertPage.tfloc.setText("");
					mainView.deptInsertPage.tftel.setText("");
					mainView.deptInsertPage.tfmgr.setText("");
					mainView.deptInsertPage.tfdeptno.requestFocusInWindow();
				}
			}else{
				mainView.card.show(mainView.cardPanel, "insertOK");
				mainView.deptInsertPage.tfdeptno.setText("");
				mainView.deptInsertPage.tfdeptname.setText("");
				mainView.deptInsertPage.tfloc.setText("");
				mainView.deptInsertPage.tftel.setText("");
				mainView.deptInsertPage.tfmgr.setText("");
			}
		}
	}
	
}
