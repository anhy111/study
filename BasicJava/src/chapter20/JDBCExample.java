package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCExample {
	public static void main(String[] args) throws Exception {
		// JDBC(Java DataBase Connectivity)
		/*
		 *  0. 준비물
		 * JDBC Driver 
		 * Java <-> DB 간에 데이터 형식 통합
		 * Oracle JDBC => ojdbc.jar
		 * 1. 오라클 드라이버를 로딩 
		 * 2. 접속 정보를 통해 접속
		 * 3. 쿼리를 전송
		 * 4. 쿼리 결과 받기
		 * 5. 리소스 닫기
		*/
		
		// 1. 드라이버 로딩
		// 1-1. reflection 기법을 사용한 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		// 1-2. DriverManager 클래스를 이용하여 드라이버 로딩
		// 		드라이버 등록
//		DriverManager.registerDriver(new OracleDriver());
		
		// 2. 접속 정보를 통해 데이터베이스 접속
		// 		localhost == 127.0.0.1
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "pc18", "java");
		
		// 3. 쿼리를 작성(sqldeveloper의 워크시트에서 작성하는 것처럼)
		// 		createStatement : 새로운 워크시트 생성, statement객체 반환
		//		statement에서 워크시트 작성
		Statement statement = connection.createStatement();
		
		// 4. 쿼리 전송 후 결과 받기
		//		쿼리 작성시 ;은 붙이지 않는다.
		ResultSet resultSet = statement.executeQuery("select mem_id, mem_name, mem_hp, mem_mail from member");
		
		// 5. 결과분석(Parsing)
		while(resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s\t%s\t%s\t%s\n",memId,memName,memHp,memMail);
		}
		
		// 6. 리소스 닫기
		resultSet.close();
		statement.close();
		connection.close();
		
		
	
	}
}
