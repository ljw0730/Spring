package com.javalec.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.dto.BDTO;
import com.javalec.ex.util.Constant;

public class BDAO {

	public JdbcTemplate template;

	public BDAO() {
		template = Constant.template;
	}

	//list
	public ArrayList<BDTO> list() {
		
		String sql = "select * from mvc_board order by bGroup desc, bStep asc";
		return (ArrayList<BDTO>)template.query(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
	}
	
	
	// 작성
	public void write(final String bName, final String bTitle, final String bContent) {
		
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

	
	// 상세 뷰 페이지
	public BDTO contentView(String bId) {
		
		upHit(bId);
		
		String sql="select * from mvc_board where bid="+bId;
		
		BDTO dto = template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
		
		return dto;
	}
	
	// 조회수 1 증가
	public void upHit(final String bId) {
		
		String sql = "update mvc_board set bHit=bHit+1 where bId=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});		
		
		
	}
	
	// 수정페이지 들어가기 위해 해당 글 가져오기
	public BDTO modifyView(String bId) {

		String sql = "select * from mvc_board where bId="+bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
	}
	

	// 수정
	public void modify(final String bId,  final String bTitle, final String bContent) {

		String sql="update mvc_board set bTitle=?, bContent=? where bId=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bTitle);
				ps.setString(2, bContent);
				ps.setInt(3, Integer.parseInt(bId));
			}
		});
	}

	
	// 답글 view
	public BDTO reply_view(String bId) {
		
		String sql = "select * from mvc_board where bId=" + bId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
	}

	
	// 답글 달기
	public void reply(String bId, final String bName, final String bTitle, final String bContent, 
						final String bGroup, final String bStep, final String bIndent) {
		
		replyshape(bGroup, bStep);
		
		String sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,?,?,?)";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep)+1);
				ps.setInt(6, Integer.parseInt(bIndent)+1);
			}
		});
		
	}
	
	// 답변글 입력시 bStep 1씩 증가
	public void replyshape(final String bGroup, final String bStep) {
		
		String sql = "update mvc_board set bStep=bStep+1 where bGroup=? and bStep > ?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bGroup));
				ps.setInt(2, Integer.parseInt(bStep));
				
				
				
			}
		});
		
	}

	public void delete(final String bId) {
		
		//String sql = "delete from mvc_board where bId="+bId;
		//template.update(sql);
		
		String sql = "delete from mvc_board where bId=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
				
			}
		});
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
