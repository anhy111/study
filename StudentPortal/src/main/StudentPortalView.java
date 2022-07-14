package main;
import java.util.List;

import common.AdminMenu;
import common.LoginMenu;
import common.ScannerUtil;
import common.StudentMenu;
import sign.SignController;
import sign.SignVO;
import student.StudentController;
import student.StudentVO;

public class StudentPortalView {
	private static StudentPortalView instance = new StudentPortalView();
	private StudentPortalView() { }
	public static StudentPortalView getInstance() {
		return instance;
	}
	
	public int getMenu() {
		return ScannerUtil.nextInt();
	}
	public LoginMenu sign(SignController signController) {
		while(true) {
			System.out.println("\n이전화면으로 돌아가려면 ID에 0을 눌러주세요.");
			System.out.print("ID: ");
			String id = ScannerUtil.nextLine();
			if(id.equals("0")) {
				return LoginMenu.RETURN;
			}
			System.out.print("PW: ");
			String pw = ScannerUtil.nextLine();
			System.out.println();
			int division = signController.sign(new SignVO(id,pw));
			if(division != 0) {
				return LoginMenu.findMenu(division);
			}
		}
	}
	
	public void studentInsert(StudentController studentController) {
		System.out.println(AdminMenu.STUDENT_INSERT.getMenuString());
		studentController.insertStudent(null);
		
	}
	
	public void studentList(StudentController studentController) {
		System.out.println(AdminMenu.STUDENT_SEARCH.getMenuString());
		List<StudentVO> list = studentController.selectStudent();
		for(StudentVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public AdminMenu getAdminMenu() {
		int temp = getMenu();
		if(temp != 0 && AdminMenu.findMenu(temp) != null) {
			return AdminMenu.findMenu(temp);
		} 
		return AdminMenu.HOME;
	}
	
	
	
}
