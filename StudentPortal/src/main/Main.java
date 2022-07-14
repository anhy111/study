package main;
import common.AdminMenu;
import common.LoginMenu;
import common.ProfessorMenu;
import common.ScannerUtil;
import common.StudentMenu;
import sign.SignController;
import sign.SignVO;
import student.StudentController;

public class Main {
	private static SignVO session = new SignVO();
	private static StudentPortalView view = StudentPortalView.getInstance();
	private static SignController signController = SignController.getInstance();
	private static StudentController studentController = StudentController.getInstance();
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
						switch(resultLogin) {
						case STUDENT:
							System.out.println(StudentMenu.HOME.getMenuString());
							intMenu = view.getMenu();
							StudentMenu stdMenu = StudentMenu.findMenu(intMenu);
							switch (stdMenu) {
							case AUDIT_SIGN:
								break;
							case ALL_RECORD:
								break;
							case AUDIT_HISTORY:
								break;
							case LOGOUT:
								break;
							}
							break;
						case PROFESSOR:
							System.out.println(ProfessorMenu.HOME.getMenuString());
							intMenu = view.getMenu();
							ProfessorMenu pfMenu = ProfessorMenu.findMenu(intMenu);
							break;
						case ADMIN:
							System.out.println(AdminMenu.HOME.getMenuString());
							intMenu = view.getMenu();
							AdminMenu adminMenu = AdminMenu.findMenu(intMenu);
							break;
						case RETURN:
							break Logout;
						}
					}
					
				case EXIT:
					System.out.println(menu.getMenuString());
					break MainLoop;
				default:
					throw new NullPointerException();
				}
			
			}catch(NullPointerException e) {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("메인화면으로 돌아갑니다.");
				System.out.println();
			}
		}
//			System.out.println(LoginMenu.HOME.getMenuString());
//			switch(view.getMenu()) {
//				case 1:
//				LoginMenu sign = view.sign(signController);
//				System.out.println(sign.getMenuString());
//	LoginLabel: switch(sign) {
//					case STUDENT:
//						while(true) {
//							System.out.println(StudentMenu.HOME.getMenuString());
//							StudentMenu studentMenu = StudentMenu.findMenu(view.getMenu());
//							switch(studentMenu) {
//								case AUDIT_SIGN:
//									break;
//								case SHOW_RECORD:
//									break;
//								case SHOW_HISTORY:
//									break;
//								case LOGOUT:
//									System.out.println(studentMenu.getMenuString());
//									break LoginLabel;
//								default:
//									System.out.println("유효하지 않은 입력입니다.");
//									break;
//							}
//						} 
//						
//					case PROFESSOR:
//						while(true) {
//							System.out.println(ProfessorMenu.HOME.getMenuString());
//							ProfessorMenu professorMenu = ProfessorMenu.findMenu(view.getMenu());
//							switch(professorMenu) {
//								case RECORD_ENTER:
//									break;
//								case RECORD_SEARCH:
//									break;
//								case LOGOUT:
//									System.out.println(professorMenu.getMenuString());
//									break LoginLabel;
//								default:
//									System.out.println("유효하지 않은 입력입니다.");
//									break;
//							}
//						}
//						
//					case ADMIN:
//						while(true) {
//							System.out.print(AdminMenu.HOME.getMenuString());
//							AdminMenu adminMenu = AdminMenu.findMenu(view.getMenu());
//							AdminHome:
//							switch(adminMenu) {
//								case STUDENT_MANAGEMENT:
//									while(true) {
//										System.out.println(AdminMenu.STUDENT_MANAGEMENT.getMenuString());
//										AdminMenu adminMenu2 = view.getAdminMenu();
//										switch(adminMenu2) {
//											case STUDENT_SEARCH:
//												view.studentList(studentController);
//												break;
//											case STUDENT_INSERT:
//												view.studentInsert(studentController);
//												break;
//											case HOME:
//												break AdminHome;
//											default:
//												System.out.println("유효하지 않은 입력입니다.");
//												System.out.println("다시 입력해 주세요.");
//										}
//									}
//									
//								case PROFESSOR_MANAGEMENT:
//									while(true) {
//										System.out.println(AdminMenu.PROFESSOR_MANAGEMENT.getMenuString());
//										
//										}
//								case LECTURE_MANAGEMENT:
//									while(true) {
//										System.out.println(AdminMenu.LECTURE_MANAGEMENT.getMenuString());
//										
//										}
//								case LOGOUT:
//									System.out.println(AdminMenu.LOGOUT.getMenuString());
//									break LoginLabel;
//								default:
//									System.out.println("유효하지 않은 입력입니다.");
//									break;
//							}
//						}
//					default:
//						System.out.println("다시 입력해 주세요.");
//						break;
//					}
//				case 0:
//					break;
//				default:
//					System.out.println("유효하지 않은 입력입니다.");
//					System.out.print("번호를 선택하세요: ");
//			}
//			System.out.println();
//		}
	}

	public static SignVO getSession() {
		return session;
	}

	
}
