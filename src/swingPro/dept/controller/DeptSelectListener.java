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
			
			//부서코드를 텍스트 필드에 입력해서 검색
			String deptNo = mainView.deptSelectPage.txtsearch.getText();
			DeptService service = new DeptServiceImpl();
			DeptDTO dept = service.findByDeptNo(deptNo);
			
			if(dept == null){ //조회실패
				JOptionPane.showMessageDialog(mainView, "입력하신 부서코드가 존재하지 않으니 다시 입력하세요.");
				mainView.deptSelectPage.txtsearch.setText("");
		
			}else { //조회성공
				mainView.deptSelectPage.tainfo.append("부서코드: " +dept.getDeptNo()+"\n");
				mainView.deptSelectPage.tainfo.append("부서명: " +dept.getDeptName()+"\n");
				mainView.deptSelectPage.tainfo.append("위치: " +dept.getLoc()+"\n");
				mainView.deptSelectPage.tainfo.append("전화번호: " +dept.getTelNum()+"\n");
				mainView.deptSelectPage.tainfo.append("관리자: " +dept.getMgr()+"\n");
				
			}
			
		}else if(e.getSource() == mainView.deptSelectPage.btnsearch2){
			mainView.deptSelectPage.tainfo.setText("");
			//사용자가 입력한 데이터를 추출
			deptName = mainView.deptSelectPage.txtsearch.getText();
			//Service의 메소드를 호출
			DeptService service = new DeptServiceImpl();
			Vector<DeptDTO> deptlist = service.findByDeptName(deptName);
			System.out.println("리스너: "+deptlist.size());
			
			for(int i=0; i<deptlist.size();i++){
				//벡터에 저장된 레코드 추출
				DeptDTO deptInfo = deptlist.get(i);
				//추출한레코드를 JTextArea에 출력
				mainView.deptSelectPage.tainfo.append("부서코드: " + deptInfo.getDeptNo()+"\n");
				mainView.deptSelectPage.tainfo.append("부서명: " + deptInfo.getDeptName()+"\n");
				mainView.deptSelectPage.tainfo.append("위치: " + deptInfo.getLoc()+"\n");
				mainView.deptSelectPage.tainfo.append("전화번호: " + deptInfo.getTelNum()+"\n");
				mainView.deptSelectPage.tainfo.append("관리자: " + deptInfo.getMgr()+"\n");
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
				mainView.empListPage.taEmpList.append("부서코드: "+ deptInfo.getDeptNo()+"\n");
				mainView.empListPage.taEmpList.append("부서명: " + deptInfo.getDeptName()+"\n");
				mainView.empListPage.taEmpList.append("위치: " + deptInfo.getLoc()+"\n");
				mainView.empListPage.taEmpList.append("전화번호: " + deptInfo.getTelNum()+"\n");
				mainView.empListPage.taEmpList.append("관리자: " + deptInfo.getMgr()+"\n");
				mainView.empListPage.taEmpList.append("-------------------------------------\n");
			}
		}

	}
}
