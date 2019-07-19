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
//주로 메인화면에서 사용하는 리스너를 구현할때는
//화면연결과 관련된 기능이나 초기화면 실행시(처음실행)에 처리해야하는 작업이 있는 경우 정의할 목적
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
			
			System.out.println("리스너: "+deptnamelist.size());
			//JComboBox에 조회한 부서명을 출력하기 위해 JComboBox에 보여지는 데이터를 
			//관리하기 위한 객체 ComboBoxModel
			//1. 조회한 데이터를 이용해서 ComboBoxModel객체를 생성
			ComboBoxModel<String> model = new DefaultComboBoxModel<String>(deptnamelist);
			//2. 생성한 ComboBoxModel객체를 JComboBox에 설정하기
			mainView.deptEmpSelectPage.cbodnamelist.setModel(model);
			/*
			 * 	for(int i=0; i<deptnamelist.size();i++){
				String deptname = deptnamelist.get(i);
				System.out.println(deptname); 	//sysout으로 출력
				mainView.deptEmpSelectPage.cbodnamelist.insertItemAt(deptname,i);
			}*/
		}else if(e.getSource() == mainView.btnMgrSearch){
			mainView.card.show(mainView.cardPanel, "empListPage");
		}else if(e.getSource() == mainView.deptInsertPage.btninsert){
			//1. deptInsertPage에서 입력한 데이터 추출 - 클라이언트가 입력한 데이터
			String deptNo = mainView.deptInsertPage.tfdeptno.getText();
			String deptName = mainView.deptInsertPage.tfdeptname.getText();
			String loc = mainView.deptInsertPage.tfloc.getText();
			String telNum = mainView.deptInsertPage.tftel.getText();
			String mgr = mainView.deptInsertPage.tfmgr.getText();
			
			//2. Service의 insert메소드를 호출하면서 클라이언트의 입력값을 매개변수로 전달
			//	 => 비지니스 메소드 호출
			//JTextField에 입력한 데이터를 이용해서 DTO객체를 만들어서 전달
			DeptDTO dept = new DeptDTO(deptNo, deptName, loc, telNum, mgr);
			DeptService service = new DeptServiceImpl();
			int result = service.insert(dept);
			//int result = service.insert(deptNo, deptName, loc, telNum, mgr);
			
			//3. 결과화면
			System.out.println(result);
			if(result<=0){//삽입 실패
				int type = JOptionPane.showConfirmDialog(mainView, 
						"등록실패... 다시할까?","삽입실패",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				System.out.println(type);
				//OK_CANCEL_OPTION -> OK버튼 0, CANCEL버튼 2
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
