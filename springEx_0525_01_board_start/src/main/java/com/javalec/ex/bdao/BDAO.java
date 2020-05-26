package com.javalec.ex.bdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.bdto.BDTO;
import com.javalec.ex.util.Constant;

public class BDAO {
	
	// JDBC tamplate
	JdbcTemplate template;
//	public BDAO() {
//		// DataSource 담겨 있는 jdbvk
//		tamplate = Constant.template;
//		
//		try {
//			context = new InitialContext();
//			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		
//	} // 생성자
	
	//List
	public BDAO() {
		template = Constant.template;
	}
	

	// 객체 선언
//	Context context = null;
//	DataSource ds = null;
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	
//	ArrayList<BDTO> dtos = new ArrayList<BDTO>();
//	BDTO dto = new BDTO();
//	String sql;
	
	// DB 컬럼
//	int bId, bHit, bGroup, bStep, bIndent;
//	String bName, bTitle, bContent;
//	Timestamp bDate;
	
	public ArrayList<BDTO> list() {
		
		String sql = "select * from mvc_board order by bGroup desc, bStep asc";
		
		//Object
		return (ArrayList<BDTO>)template.query(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
		
		
		
//		try {
//			con = ds.getConnection();
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				do {
//					bId = rs.getInt("bId");
//					bName = rs.getString("bName");
//					bTitle = rs.getString("bTitle");
//					bContent = rs.getString("bContent");
//					bDate = rs.getTimestamp("bDate");
//					bHit = rs.getInt("bHit");
//					bGroup = rs.getInt("bGroup");
//					bStep = rs.getInt("bStep");
//					bIndent = rs.getInt("bIndent");
//					
//					dto = new BDTO(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
//					dtos.add(dto);
//					
//				}while(rs.next());
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs != null) {
//					rs.close();
//				}
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(con != null) {
//					con.close();
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
//		return dtos;
	} // list
	
	
	public BDTO contentView(String bId) {
		
		// 조회수 1증가
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
		
		
		
	}
	
	
}
