package kh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbId = "kh";
		String dbPw = "kh";
		
		return DriverManager.getConnection(url, dbId, dbPw);
	}
	
	public int insertMessage(MessageDTO dto) throws Exception {
		Connection con = getConnection();
		
		String sql = "insert into messages values (message_seq.nextval,?,?)";
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, dto.getName());
		pstat.setString(2, dto.getMessage());
		
		int result = pstat.executeUpdate();
		
		con.close();
		pstat.close();
		
		return result;	
	}
	
	public List<MessageDTO> selectMessage() throws Exception {
		Connection con = getConnection();
		
		String sql = "select * from messages";
		PreparedStatement pstat = con.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		List<MessageDTO> result = new ArrayList<>();
		while(rs.next()) {
			result.add(new MessageDTO(rs.getInt("message_id"), rs.getString("name"), rs.getString("message")));
		}
		rs.close();
		con.close();
		pstat.close();
		
		return result;
	}

}
