package swingPro.dept.view;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import swingPro.dept.controller.DeptMainListener;
import swingPro.dept.controller.DeptSelectListener;
import swingPro.dept.controller.EmpSelectListener;
import swingPro.emp.EmpListener;
import swingPro.emp.EmpTabView;

//이벤트처리는 대부분 main화면에서 처리
public class InsaMain extends JFrame {

	public JPanel contentPane;
	public JButton btnDeptInsert;
	public JButton btnDeptSelect;
	public JButton btnEmpSelect;
	public JPanel topPanel;
	public JPanel cardPanel;
	public CardLayout card;

	public DeptEmpSelectPage deptEmpSelectPage;
	public DeptInsertPage deptInsertPage;
	public InsertOK insertOK;
	public DeptSelectPage deptSelectPage;
	public JButton btnMgrSearch;
	public EmpListPage empListPage;
	public JPanel empTab;
	public JTabbedPane tabbedPane;
	public EmpTabView empList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsaMain frame = new InsaMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InsaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 487, 555);
		contentPane.add(tabbedPane);

		JPanel p_dept = new JPanel();
		tabbedPane.addTab("\uBD80\uC11C\uC815\uBCF4", null, p_dept, null);
		p_dept.setLayout(null);

		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 484, 103);
		p_dept.add(topPanel);
		topPanel.setLayout(null);

		btnDeptInsert = new JButton("\uBD80\uC11C\uB4F1\uB85D");
		btnDeptInsert.setFont(new Font("바탕", Font.BOLD, 12));
		btnDeptInsert.setBounds(4, 26, 102, 53);
		topPanel.add(btnDeptInsert);

		btnDeptSelect = new JButton("\uBD80\uC11C\uC870\uD68C");
		btnDeptSelect.setFont(new Font("바탕", Font.BOLD, 12));
		btnDeptSelect.setBounds(112, 26, 94, 53);
		topPanel.add(btnDeptSelect);

		btnEmpSelect = new JButton("\uBD80\uC11C\uBCC4\uC778\uC6D0\uC870\uD68C");
		btnEmpSelect.setFont(new Font("바탕", Font.BOLD, 12));
		btnEmpSelect.setBounds(212, 26, 131, 53);
		topPanel.add(btnEmpSelect);

		btnMgrSearch = new JButton("\uB9E4\uB2C8\uC800\uBCC4\uC870\uD68C");
		btnMgrSearch.setFont(new Font("바탕", Font.BOLD, 12));
		btnMgrSearch.setBounds(349, 26, 123, 53);
		topPanel.add(btnMgrSearch);

		cardPanel = new JPanel();
		cardPanel.setBounds(0, 101, 484, 427);
		card = new CardLayout(0, 0);
		p_dept.add(cardPanel);
		cardPanel.setLayout(card);

		deptInsertPage = new DeptInsertPage();
		cardPanel.add(deptInsertPage, "insertView");

		deptSelectPage = new DeptSelectPage();
		cardPanel.add(deptSelectPage, "selectView");

		empTab = new JPanel();
		tabbedPane.addTab("\uC0AC\uC6D0\uC815\uBCF4", null, empTab, null);
		empTab.setLayout(null);

		empList = new EmpTabView();
		empList.setBounds(0, 0, 482, 516);
		empTab.add(empList);

		deptEmpSelectPage = new DeptEmpSelectPage();
		cardPanel.add(deptEmpSelectPage, "deptEmpView");

		insertOK = new InsertOK();
		cardPanel.add(insertOK, "insertOK");

		empListPage = new EmpListPage();
		cardPanel.add(empListPage, "empListPage");

		card.show(cardPanel, "insertView");

		startEvent();
	}

	public void startEvent() {
		// InsaMain에 대한 이벤트를 연결
		DeptMainListener listener = new DeptMainListener(this);
		btnDeptInsert.addActionListener(listener);
		btnDeptSelect.addActionListener(listener);
		btnEmpSelect.addActionListener(listener);
		btnMgrSearch.addActionListener(listener);
		// DeptInsertPage패널의 컴포넌트에 이벤트 연결
		deptInsertPage.btninsert.addActionListener(listener);

		// DeptSelectPage패널의 컴포넌트에 이벤트 연결
		DeptSelectListener selectlistener = new DeptSelectListener(this);
		deptSelectPage.btnsearch.addActionListener(selectlistener);
		deptSelectPage.btnsearch2.addActionListener(selectlistener);
		deptSelectPage.btnsave.addActionListener(selectlistener);
		// EmpListPage패널의 컴포넌트에 이벤트 연결
		empListPage.cboMgr.addActionListener(selectlistener);

		EmpSelectListener empselectlistener = new EmpSelectListener(this);
		// DeptEmpSelectPage패널의 컴포넌트에 이벤트 연결
		deptEmpSelectPage.cbodnamelist.addActionListener(empselectlistener);
		deptEmpSelectPage.table.addMouseListener(empselectlistener);

		EmpListener empListener = new EmpListener(this);
		tabbedPane.addChangeListener(empListener);
		empList.cbodeptlist.addActionListener(empListener);

	}
}
