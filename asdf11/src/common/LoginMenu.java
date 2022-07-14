package common;

public enum LoginMenu {
	HOME("------------------------------------------------\n"
    		+ "\t\t학사관리시스템\n"
    		+ "------------------------------------------------\n"
    		+ "1.로그인\t\t0.프로그램 종료\n번호를 선택하세요\n> ");
	
    private final String menuString;

    LoginMenu(String menuString) {
		this.menuString = menuString;
	}

    public String getMenuString() {
        return menuString;
    }
}