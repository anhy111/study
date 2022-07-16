package main;
import Professor.ProfessorController;
import common.AdminMenu;
import common.LoginMenu;
import common.ProfessorMenu;
import common.ScannerUtil;
import common.StudentMenu;
import lecture.LectureController;
import record.RecordController;
import sign.SignController;
import sign.SignVO;
import student.StudentController;
import subject.SubjectController;

public class Main {
	private static SignVO session = new SignVO();
	private static StudentPortalView view = StudentPortalView.getInstance();
	private static SignController signController = SignController.getInstance();
	private static StudentController studentController = StudentController.getInstance();
	private static LectureController lectureController = LectureController.getInstance();
	private static ProfessorController professorController = ProfessorController.getInstance();
	private static SubjectController subController = SubjectController.getInstance();
	private static RecordController rcController = RecordController.getInstance();
	public static void main(String[] args) {
		new Main().run();
		ScannerUtil.close();
	}
	
	
	public void run() {
		MainLoop:
		while(true) {
			try {
				System.out.print(LoginMenu.HOME.getMenuString());
				int intMenu = view.getMenu();
				LoginMenu menu = LoginMenu.findMenu(intMenu);
				switch(menu) {
				case LOGIN:
					LoginMenu resultLogin = view.sign(signController);
					System.out.println(resultLogin.getMenuString());
					Logout:
					while(true) {
						try {
							switch(resultLogin) {
								case STUDENT:
									System.out.print(StudentMenu.HOME.getMenuString());
									intMenu = view.getMenu();
									StudentMenu stdMenu = StudentMenu.findMenu(intMenu);
									switch (stdMenu) {
										case AUDIT_SIGN:
											stdMenu = view.auditSign(lectureController);
											break;
										case ALL_RECORD:
											stdMenu = view.myLectureRecord(rcController);
											break;
										case AUDIT_HISTORY:
											stdMenu = view.myAuditHistory(lectureController);
											break;
										case HOME:
											break;
										case LOGOUT:
											break Logout;
									}
									break;
									
									
								case PROFESSOR:
									System.out.print(ProfessorMenu.HOME.getMenuString());
									intMenu = view.getMenu();
									ProfessorMenu pfMenu = ProfessorMenu.findMenu(intMenu);
									switch(pfMenu) {
										case RECORD_LIST:
											pfMenu = view.recordList(rcController);
											break;
										case RECORD_ENTER:
											pfMenu = view.recordEnter(rcController);
											break;
										case HOME:
											break;
										case LOGOUT:
											break Logout;
									}
									break;
									
									
								case ADMIN:
									System.out.print(AdminMenu.HOME.getMenuString());
									intMenu = view.getMenu();
									AdminMenu adminMenu = AdminMenu.findMenu(intMenu);
									SubMenu:
									while(true) {
										switch(adminMenu) {
											case STUDENT_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findStudentMenu(intMenu);
												switch(adminMenu) {
													case STUDENT_LIST:
														adminMenu = view.studentList(studentController);
														break;
													case STUDENT_INSERT:
														adminMenu = view.studentInsert(studentController);
														break;
													case STUDENT_UPDATE:
														
														break;
													case STUDENT_DELETE:
														
														break;
													case HOME:
														break SubMenu;
												}
												break;
											case PROFESSOR_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findProffesorMenu(intMenu);
												switch(adminMenu) {
													case PROFESSOR_LIST:
														adminMenu = view.professorList(professorController);
														break;
													case PROFESSOR_INSERT:
														adminMenu = view.professorListInsert(professorController);
														break;
													case PROFESSOR_UPDATE:
														adminMenu = view.professorUpdate(professorController);
														break;
													case PROFESSOR_DELETE:
														adminMenu = view.professorDelete(professorController);
														break;
													case HOME:
														break SubMenu;
												}
												break;
											case LECTURE_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findLectureMenu(intMenu);
												switch(adminMenu) {
													case LECTURE_LIST:
														adminMenu = view.lectureList(lectureController);
														break;
													case LECTURE_INSERT:
														adminMenu = view.lectureInsert(lectureController);
														break;
													case LECTURE_UPDATE:
														
														break;
													case HOME:
														break SubMenu;
												}
												break;
											case SUBJECT_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findSubjectMenu(intMenu);
												switch(adminMenu) {
													case SUBJECT_LIST:
														adminMenu = view.subjectList(subController);
														break;
													case SUBJECT_INSERT:
														adminMenu = view.subjectInsert(subController);
														break;
													case SUBJECT_UPDATE:
														
														break;
													case HOME:
														break SubMenu;
												}
												break;
												
											case DEPARTMENT_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findDepartMentMenu(intMenu);
												switch(adminMenu) {
													case DEPARTMENT_LIST:
														
														break;
													case DEPARTMENT_INSERT:
														
														break;
													case DEPARTMENT_UPDATE:
														
														break;
													case DEPARTMENT_DELETE:
														
														break;
													case HOME:
														break SubMenu;
												}
												break;
											case ROOM_MANAGEMENT:
												System.out.print(adminMenu.getMenuString());
												intMenu = view.getMenu();
												adminMenu = AdminMenu.findRoomMenu(intMenu);
												switch(adminMenu) {
													case ROOM_LIST:
														
														break;
													case ROOM_INSERT:
														
														break;
													case ROOM_UPDATE:
														
														break;
													case ROOM_DELETE:
														
														break;
													case HOME:
														break SubMenu;
												}
												break;
											case LOGOUT:
												System.out.println(adminMenu.getMenuString());
												break Logout;
										}
										System.out.println();
									}
									System.out.println();
									break;
								case RETURN:
									System.out.println("이전메뉴로 돌아갑니다");
									break Logout;
							}
						}catch(Exception e) {
							System.out.println("\n잘못된 입력입니다.");
							System.out.println("메인화면으로 돌아갑니다.");
							System.out.println();
						}
					}
					break;
				case EXIT:
					System.out.println(menu.getMenuString());
					break MainLoop;
				default:
					throw new NullPointerException();
				}
			
			}catch(NullPointerException e) {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("로그인화면으로 돌아갑니다.");
				System.out.println();
			}
		}
	}

	public static SignVO getSession() {
		return session;
	}

	
}
