package common;

public enum AdminMenu {
	HOME(0, "------------------------------------------------------\n"
    		+ "1.학생관리\t 2. 교수관리\t 3. 강의개설 \t4. 로그아웃\n번호를 선택하세요>> "),
	STUDENT_MANAGEMENT(1,"\n11. 학생조회\t12. 학생등록\t0. 이전메뉴\n번호를 선택하세요>>"),
	STUDENT_SEARCH(11,"\n학생을 조회합니다.\n"),
	STUDENT_INSERT(12,"\n학생을 등록합니다.\n"),
	PROFESSOR_MANAGEMENT(2,"\n21. 교수조회\t22. 교수등록\t0. 이전메뉴\n번호를 선택하세요>>"),
	PROFESSOR_SEARCH(21,"\n교수을 조회합니다.\n"),
	PROFESSOR_INSERT(22,"\n교수을 등록합니다.\n"),
	LECTURE_MANAGEMENT(3,"\n31. 강의조회\t32. 강의개설\t0. 이전메뉴\n번호를 선택하세요>>"),
	LECTURE_SEARCH(31,"\n강의를 조회합니다.\n"),
	LECTURE_INSERT(32,"\n강의를 개설합니다.\n"),
	LOGOUT(4, "\n로그아웃 합니다.\n");
	
	private final int menu;
    private final String menuString;

    AdminMenu(int menu, String menuString) {
		this.menu = menu;
		this.menuString = menuString;
	}
	
	public int getMenu() {
        return menu;
    }

    public String getMenuString() {
        return menuString;
    }
    public static AdminMenu findMenu(int menu) {
    	for(AdminMenu number : values()) {
    		if(number.getMenu() == menu) {
    			return number;
    		}
    	}
    	return null;
    }
}
