package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DepartmentExample {
	public static void main(String[] args) throws Exception {
		// 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@192.168.142.15:1521:xe";
		String id = "pc18";
		String pw = "java";
		Connection connection = DriverManager.getConnection(url,id,pw);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select dept_id,dept_name,dept_tel from department");
		while(resultSet.next()) {
			String deptId = resultSet.getString("dept_id");
			String deptName = resultSet.getString("dept_name");
			String deptTel = resultSet.getString("dept_tel");
			System.out.printf("%s\t%s\t%s\t\n",deptId,deptName,deptTel);
		}
		//리소스 닫기
		resultSet.close();
		statement.close();
		connection.close();
		
	}
}
