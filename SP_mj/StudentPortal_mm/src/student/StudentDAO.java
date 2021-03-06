package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Professor.ProfessorVO;
import oracle.jdbc.driver.OracleDriver;

public class StudentDAO {
	//필드
	private static StudentDAO studentDAO = new StudentDAO();
	
	//생성자
	private StudentDAO() {}
	
	//메소드
	public static StudentDAO getInstance() {
		return studentDAO;
	}
	
	public List<StudentVO> selectStudent() throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal", "java");
			Statement statement = connection.createStatement();
			StringBuilder builder = new StringBuilder();
			builder.append(" SELECT");
			builder.append("     stu_no,");
			builder.append("     stu_nm,");
			builder.append("     stu_em,");
			builder.append("     stu_pne_no,");
			builder.append("     stu_grd,");
			builder.append("     stu_acd_st,");
			builder.append("     dep_nm,");
			builder.append("     TO_CHAR(stu_bir,'YYYY-MM-DD') bir ");
			builder.append(" FROM");
			builder.append("     stu,");
			builder.append("     dep");
			builder.append(" WHERE");
			builder.append("     stu_dep = dep_no");
			String sql = builder.toString();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			ArrayList<StudentVO> list = new ArrayList<>();
			while(resultSet.next()) {
				String stuNo = resultSet.getString("stu_no");
				String stuNm = resultSet.getString("stu_nm");
				String stuEm = resultSet.getString("stu_em");
				String stuPneNo = resultSet.getString("stu_pne_no");
				String stuGrd = resultSet.getString("stu_grd");
				String stuAcdSt = resultSet.getString("stu_acd_st");
				String dep_nm = resultSet.getString("dep_nm");
				String stuBir = resultSet.getString("bir");
				list.add(new StudentVO(stuNo, stuNm, stuEm, stuPneNo, stuGrd, stuAcdSt, dep_nm, stuBir));
			}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
		
	}
	public StudentVO selectOneStudent(StudentVO vo) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal", "java");
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     stu_no,");
		builder.append("     stu_nm,");
		builder.append("     stu_em,");
		builder.append("     stu_pne_no,");
		builder.append("     stu_grd,");
		builder.append("     stu_acd_st,");
		builder.append("     dep_nm,");
		builder.append("     stu_bir");
		builder.append(" FROM");
		builder.append("     stu,");
		builder.append("     dep");
		builder.append(" WHERE");
		builder.append("     stu_dep = dep_no");
		builder.append(" and    stu_no = ?");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setObject(1,vo.getStuNo());
		ResultSet resultSet = statement.executeQuery(sql);
		StudentVO studentVO = null;
		if(resultSet.next()) {
			String stuNo = resultSet.getString("stu_no");
			String stuNm = resultSet.getString("stu_nm");
			String stuEm = resultSet.getString("stu_em");
			String stuPneNo = resultSet.getString("stu_pne_no");
			String stuGrd = resultSet.getString("stu_grd");
			String stuAcdSt = resultSet.getString("stu_acd_st");
			String dep_nm = resultSet.getString("dep_nm");
			String stuBir = resultSet.getString("stu_bir");
			studentVO = new StudentVO(stuNo, stuNm, stuEm, stuPneNo, stuGrd, stuAcdSt, dep_nm, stuBir);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return studentVO;
	}
	public int insertStudent(StudentVO vo) throws Exception{
		
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO stu (");
		
		//학번 자동생성하도록 쿼리문 수정할 것
		builder.append("    stu_no,");
		builder.append("    stu_nm,");
		builder.append("    stu_em,");
		builder.append("    stu_pne_no,");
		builder.append("    stu_grd,");
		builder.append("    stu_acd_st,");
		builder.append("    stu_dep,");
		builder.append("    stu_bir");
		builder.append(") VALUES (");
		builder.append("    ?,");
		builder.append("    ?,");
		builder.append("    ?,");
		builder.append("    ?,");
		builder.append("    1,");
		builder.append("    '재학',");
		builder.append("    ?,");
		builder.append("    ?");
		builder.append(")");

		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getStuNo());
		statement.setString(2, vo.getStuNm());
		statement.setString(3, vo.getStuEm());
		statement.setString(4, vo.getStuPneNo());
		statement.setString(5, vo.getStuDep());
		statement.setString(6, vo.getStuBir());
		
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		
		return executeUpdate;
	}
	
	public int updateStudent(StudentVO vo) throws Exception {

		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal",
				"java");
		StringBuilder builder = new StringBuilder();
		builder.append("  UPDATE stu     ");
		builder.append("      SET     ");
		
		//학과가 변경되면 학번도 변경되도록 수정
		builder.append("          stu_dep = ?,     ");
		builder.append("          stu_nm = ?,     ");
		builder.append("          stu_em = ?,     ");
		builder.append("          stu_pne_no = ?,  ");
		builder.append("          stu_grd = ?,     ");
		builder.append("          stu_em = ?,     ");
		builder.append("          stu_bir = ?     ");
		builder.append("  WHERE     ");
		builder.append("      pro_no = ?     ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setObject(1, vo.getStuDep());
		statement.setObject(2, vo.getStuNm());
		statement.setObject(3, vo.getStuEm());
		statement.setObject(4, vo.getStuPneNo());
		statement.setObject(5, vo.getStuGrd());
		statement.setObject(6, vo.getStuEm());
		statement.setObject(7, vo.getStuBir());

		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}

	
	public int deleteStudent(StudentVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal",
				"java");
		StringBuilder builder = new StringBuilder();
		builder.append("   DELETE FROM stu WHERE  ");
		builder.append("       stu_no = ?  ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setObject(1, vo.getStuNo());
		int executeUpdate = statement.executeUpdate();

		statement.close();
		connection.close();
		return executeUpdate;

	}
}
