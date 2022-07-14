package common;

public enum StudentMenu {
	STUDENTMAIN(-1, "-----------------------------------------------------\n"
			+ "메뉴를 선택하세요\n1. 수강신청 \t2. 전체수강내역조회\t 3. 전체성적확인\n>>");
	
	
	private final int menu;
    private final String menuString;

	StudentMenu(int menu, String menuString) {
		this.menu = menu;
		this.menuString = menuString;
	}
	
	public int getMenu() {
        return menu;
    }

    public String getMenuString() {
        return menuString;
    }
}
