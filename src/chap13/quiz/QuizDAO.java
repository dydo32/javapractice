package chap13.quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import jdbc.DBUtil;

public class QuizDAO {
	public Vector<QuizDTO> selectAll(){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from quiz";
		QuizDTO quiz = null;
		Vector<QuizDTO> list = new Vector<QuizDTO>();
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
	   			quiz = new QuizDTO(rs.getInt(1),
	   					rs.getString(2), rs.getString(3),rs.getString(4)
	   					,rs.getString(5),rs.getString(6));
	   			list.add(quiz);
			}
			System.out.println("dao==>"+list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return list;
	}
	public QuizDTO select(int num){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from quiz where quiznum=? order by quiznum";
		QuizDTO quiz = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, num);
			rs = stmt.executeQuery();
			if(rs.next()){
	   			quiz = new QuizDTO(rs.getInt(1),
	   					rs.getString(2), rs.getString(3),rs.getString(4)
	   					,rs.getString(5),rs.getString(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return quiz;
	}
}
