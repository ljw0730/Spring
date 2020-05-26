package com.javalec.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.dto.BDTO;
import com.javalec.ex.util.Constant;

public class BDAO {

	JdbcTemplate template;
	
	public BDAO() {
		template = Constant.template;
	}
	
	
	public ArrayList<BDTO> list() {
		
		String sql = "select * from mvc_board order by bGroup desc, bStep asc";
	
		return (ArrayList<BDTO>)template.query(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
	
	}

	

	public BDTO contentView(String bId) {
		
		upHit(bId);
		
		String sql = "select * from mvc_board where bId=" + bId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
	}
	

	
	public void upHit(final String bId) {
		
		
		String sql = "update mvc_board set bHit=bHit+1 where bId=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
		
//		String sql = "update mvc_board set bHit=bHit+1 where bId="+bId;
//		template.update(sql);
	}


	public void write(final String bName, final String bTitle, final String bContent) {
		
		
		// PreparedStatementCreator() 시 sql 문이 함수 안에 있어야 한다.
		template.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board values"
						+ "(mvc_board_seq.nextval , ?, ?, ?, "
						+ "sysdate, 0, mvc_board_seq.currval, 0, 0)";
				
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);
				
				
				return pstmt;
			}
		});
		
		
		
	}


	public void delete(final String bId) {

		String sql = "delete from mvc_board where bId=?";
		
		
		// PreparedStatementSetter()
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bId);
				
			}
		});
		
		
		
	}


	public BDTO reply_view(String bId) {
		
		String sql = "select * from mvc_board where bID="+bId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
		
	}


	public void reply(String bId, final String bName, final String bTitle, final String bContent, String bDate, String bHit,
			final String bGroup, final String bStep, final String bIndent) {
		
		//replyShape(bGroup, bStep)
		
		String sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,?,?,?) ";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep+1));
				ps.setInt(6, Integer.parseInt(bIndent+1));
				
			}
		});
		
	}


	
}
