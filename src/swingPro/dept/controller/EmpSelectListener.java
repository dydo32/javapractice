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
				/*System.out.println("선택된 아이템 ==> " + mainView.deptEmpSelectPage.cbodnamelist.getSelectedItem());
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
			System.out.println("선택된 부서명: "+deptName);
			DeptService service = new DeptServiceImpl();
			Vector<Vector<String>> emplist = service.getMemberList(deptName);
			
			//JTable에 출력할 컬럼명 받기
			Vector<String> colNames = getColumn();
			//데이터와 컬럼명을 이용해서 JTable에 데이터를 출력하는 메소드
			showData(emplist, colNames);
			
		}
		
	}
	
	//JTable에 데이터를 출력하는 메소드
	private void showData(Vector<Vector<String>> tableData, Vector<String> colNames) {
		//JTable의 데이터를 관리하는 Model객체를 이용해서 데이터를 추가
		DefaultTableModel model = new DefaultTableModel();
		//Model객체에 JTable에서 사용할 데이터와 컬럼명벡터를 추가하는 작업
		model.setDataVector(tableData, colNames);
		//JTable에 모델 객체를 셋팅
		mainView.deptEmpSelectPage.table.setModel(model);
		
	}
	//JTable에  출력할 컬럼벡터를 만드는 메소드
	public Vector<String> getColumn(){
		Vector<String> colNames = new Vector<String>();
		
		colNames.add("아이디");
		//colNames.add("password");
		colNames.add("성명");
		colNames.add("주소");
		colNames.add("입사날짜");
		//colNames.add("등급");
		//colNames.add("포인트");
		colNames.add("부서코드");
		colNames.add("부서명");
		return colNames;
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("클릭");
		//JTable에서 선택한 row의 정보 출력
		int row = mainView.deptEmpSelectPage.table.getSelectedRow();
		System.out.println("row=>"+row);
		//캐스팅해야함  (DefaultTableModel)
		DefaultTableModel model = (DefaultTableModel)mainView.deptEmpSelectPage.table.getModel();
		//캐스팅해야함
		String data = (String)model.getValueAt(row, 0);
		System.out.println("선택한 row의 0번 컬럼의 값=>"+data);
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
