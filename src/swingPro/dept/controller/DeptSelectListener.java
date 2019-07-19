package swingPro.dept.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;

import swingPro.dept.dto.DeptDTO;
import swingPro.dept.service.DeptService;
import swingPro.dept.service.DeptServiceImpl;
import swingPro.dept.view.InsaMain;

public class DeptSelectListener implements ActionListener {
	InsaMain mainView;
	String deptName;
	public DeptSelectListener() {
	}

	public DeptSelectListener(InsaMain mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mainView.deptSelectPage.btnsearch) {
			mainView.deptSelectPage.tainfo.setText("");
			
			//�μ��ڵ带 �ؽ�Ʈ �ʵ忡 �Է��ؼ� �˻�
			String deptNo = mainView.deptSelectPage.txtsearch.getText();
			DeptService service = new DeptServiceImpl();
			DeptDTO dept = service.findByDeptNo(deptNo);
			
			if(dept == null){ //��ȸ����
				JOptionPane.showMessageDialog(mainView, "�Է��Ͻ� �μ��ڵ尡 �������� ������ �ٽ� �Է��ϼ���.");
				mainView.deptSelectPage.txtsearch.setText("");
		
			}else { //��ȸ����
				mainView.deptSelectPage.tainfo.append("�μ��ڵ�: " +dept.getDeptNo()+"\n");
				mainView.deptSelectPage.tainfo.append("�μ���: " +dept.getDeptName()+"\n");
				mainView.deptSelectPage.tainfo.append("��ġ: " +dept.getLoc()+"\n");
				mainView.deptSelectPage.tainfo.append("��ȭ��ȣ: " +dept.getTelNum()+"\n");
				mainView.deptSelectPage.tainfo.append("������: " +dept.getMgr()+"\n");
				
			}
			
		}else if(e.getSource() == mainView.deptSelectPage.btnsearch2){
			mainView.deptSelectPage.tainfo.setText("");
			//����ڰ� �Է��� �����͸� ����
			deptName = mainView.deptSelectPage.txtsearch.getText();
			//Service�� �޼ҵ带 ȣ��
			DeptService service = new DeptServiceImpl();
			Vector<DeptDTO> deptlist = service.findByDeptName(deptName);
			System.out.println("������: "+deptlist.size());
			
			for(int i=0; i<deptlist.size();i++){
				//���Ϳ� ����� ���ڵ� ����
				DeptDTO deptInfo = deptlist.get(i);
				//�����ѷ��ڵ带 JTextArea�� ���
				mainView.deptSelectPage.tainfo.append("�μ��ڵ�: " + deptInfo.getDeptNo()+"\n");
				mainView.deptSelectPage.tainfo.append("�μ���: " + deptInfo.getDeptName()+"\n");
				mainView.deptSelectPage.tainfo.append("��ġ: " + deptInfo.getLoc()+"\n");
				mainView.deptSelectPage.tainfo.append("��ȭ��ȣ: " + deptInfo.getTelNum()+"\n");
				mainView.deptSelectPage.tainfo.append("������: " + deptInfo.getMgr()+"\n");
				mainView.deptSelectPage.tainfo.append("-------------------------------------\n");
			}		
		}else if(e.getSource() == mainView.deptSelectPage.btnsave){
			SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
			FileWriter fw = null;
			String file = simple.format(new Date());
			deptName = mainView.deptSelectPage.txtsearch.getText();
			try {
				
				fw = new FileWriter("src/swingPro/log/"+file+"_"+deptName+".txt");
				
				fw.write(mainView.deptSelectPage.tainfo.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally{
				try {
					if(fw != null) fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		if(e.getSource()==mainView.empListPage.cboMgr){
			mainView.empListPage.taEmpList.setText("");
			String mgr = mainView.empListPage.cboMgr.getSelectedItem()+"";
			DeptService service = new DeptServiceImpl();
			Vector<DeptDTO> deptlist = service.findByMgr(mgr);
			
			for(int i=0;i<deptlist.size();i++){
				DeptDTO deptInfo = deptlist.get(i);
				mainView.empListPage.taEmpList.append("�μ��ڵ�: "+ deptInfo.getDeptNo()+"\n");
				mainView.empListPage.taEmpList.append("�μ���: " + deptInfo.getDeptName()+"\n");
				mainView.empListPage.taEmpList.append("��ġ: " + deptInfo.getLoc()+"\n");
				mainView.empListPage.taEmpList.append("��ȭ��ȣ: " + deptInfo.getTelNum()+"\n");
				mainView.empListPage.taEmpList.append("������: " + deptInfo.getMgr()+"\n");
				mainView.empListPage.taEmpList.append("-------------------------------------\n");
			}
		}

	}
}
