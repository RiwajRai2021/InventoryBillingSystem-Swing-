package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.db.DB;
import com.model.RegisterModel;

public class RegisterServiceImpl implements RegisterService {

	Connection con = null;

	public RegisterServiceImpl() {
		con = (Connection) DB.getDbObject();

	}

	@Override
	public boolean addRegisterModel(RegisterModel R) {

		String sql = "insert into registertable(fname,lname,username,password,gender,address,dob,phone,email)values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);

			pstm.setString(1, R.getFname());
			pstm.setString(2, R.getLname());
			pstm.setString(3, R.getUsername());
			pstm.setString(4, R.getPassword());
			pstm.setString(5, R.getGender());
			pstm.setString(6, R.getAddress());
			pstm.setDate(7, R.getDob());
			pstm.setString(8, R.getPhone());
			pstm.setString(9, R.getEmail());

			pstm.execute();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteRegisterModel(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(RegisterModel R) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RegisterModel getAllRegisterModelById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegisterModel> getAllRegisterModel() {

//		List<RegisterModel> slist = new ArrayList<>(); 
//		String sql = "select * from RegisterModel";
//		
//		Statement stm = con.createStatement();
//		ResultSet rs = stm.execute(sql);
//		
//		
//		
//		
//		

		return null;
	}

	@Override
	public List<RegisterModel> searchRegisterModel(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String un, String pss) {

		String sql = "select * from registertable where username= '" + un + "' and password = '" + pss + "'   ";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
