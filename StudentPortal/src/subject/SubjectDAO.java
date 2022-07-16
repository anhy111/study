package subject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Professor.ProfessorVO;
import oracle.jdbc.driver.OracleDriver;

public class SubjectDAO {
	// 필드
	private static SubjectDAO subDAO = new SubjectDAO();
	List<SubjectVO> list = new ArrayList<>();

	// 생성자
	private SubjectDAO() {
	}

	public static SubjectDAO getInstance() {
		return subDAO;
	}

	// 과목 조회
	public List<SubjectVO> selectSub() throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal",
				"java");
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     sub_no,");
		builder.append("     sub_nm,");
		builder.append("     com_div,");
		builder.append("     cre,");
		builder.append("     sub_pro,");
		builder.append("     sub_rm");
		builder.append(" FROM");
		builder.append("     sub");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			String subNo = resultSet.getString("sub_no");
			String cre = resultSet.getString("cre");
			String subPro = resultSet.getString("sub_pro");
			String subRm = resultSet.getString("sub_rm");
			String subNm = resultSet.getString("sub_nm");
			String comDiv = resultSet.getString("com_div");
			list.add(new SubjectVO(subNo, cre, subPro, subRm, subNm, comDiv));
		}

		resultSet.close();
		statement.close();
		connection.close();
		return list;

	}

	// 과목 등록
	public int insertSub(SubjectVO vo) throws Exception {
		int executeUpdate = 0;

		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal",
				"java");
		StringBuilder builder = new StringBuilder();
		builder.append("  INSERT INTO sub (   ");
		builder.append("          sub_no,   ");
		builder.append("          sub_nm,   ");
		builder.append("          com_div,   ");
		builder.append("          cre,   ");
		builder.append("          sub_pro,   ");
		builder.append("          sub_rm   ");
		builder.append("      ) VALUES (   ");
		builder.append("          ?,   ");
		builder.append("          ?,   ");
		builder.append("          ?,   ");
		builder.append("          ?,   ");
		builder.append("          ?,   ");
		builder.append("          ?   ");
		builder.append("      )   ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setObject(1, vo.getSubNo());
		statement.setObject(2, vo.getSubNm());
		statement.setObject(3, vo.getComDiv());
		statement.setObject(4, vo.getCre());
		statement.setObject(5, vo.getSubPro());
		statement.setObject(6, vo.getSubRm());

		executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();

		return executeUpdate;

	}
	// 과목 수정
	public int updateSub(SubjectVO vo) throws Exception {

		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.142.15:1521:xe", "StudentPortal",
				"java");
		StringBuilder builder = new StringBuilder();
		builder.append("   update sub    ");
		builder.append("   set   ");
		builder.append("   sub_nm = ?,   ");
		builder.append("   com_div = ?,   ");
		builder.append("   cre = ?,   ");
		builder.append("   sub_rm = ?,   ");
		builder.append("   sub_pro = ?   ");
		builder.append("   WHERE   ");
		builder.append("       sub_no = ?   ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setObject(1, vo.getSubNm());
		statement.setObject(2, vo.getComDiv());
		statement.setObject(3, vo.getCre());
		statement.setObject(4, vo.getSubRm());
		statement.setObject(5, vo.getSubPro());
		statement.setObject(6, vo.getSubNo());

		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;

	}

}
