package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.CashierModel;

public class CashierServiceImpl implements CashierService{
	
	Connection con = null;
	
	public  CashierServiceImpl() {
		con = (Connection) DB.getDbObject();
		
	}
	
	@Override
	public boolean addCashierModel(CashierModel cf) {
		
		String sql="Insert into cashier(Id,Name,MobileNumber,Address,Email,Password)values(?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, cf.getId());
			pstm.setString(2, cf.getName());
			pstm.setString(3, cf.getMobileNumber());
			pstm.setString(4, cf.getAddress());
			pstm.setString(5, cf.getEmail());
			pstm.setString(6, cf.getPassword());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;  
	}

	@Override
	public boolean deleteCashierModel(int id) {
		
		String sql = "delete from cashier where id = "+id;
		try {
			Statement stm = con.createStatement();
			stm.execute(sql); 
			return true; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public boolean updateDetails(CashierModel C) {
		
		String sql="update cashier set Id=?,Name=?,MobileNumber=?,Address=?,Email=?,Password=? where id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setInt(1,C.getId());
			pstm.setString(2, C.getName());
			pstm.setString(3, C.getMobileNumber());
			pstm.setString(4, C.getAddress());
			pstm.setString(5, C.getEmail());
			pstm.setString(6, C.getPassword());
			pstm.setInt(7, C.getId());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;  
	}


	@Override
	public CashierModel getAllCashierModelById(int id) {
		
		CashierModel s = new CashierModel();
		String  sql = "select *from cashier where id="+id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs =stm.executeQuery(sql);
			if(rs.next()) {
				s.setName(rs.getString("Name"));
				s.setMobileNumber(rs.getString("MobileNumber"));
				s.setAddress(rs.getString("Address"));
				s.setEmail(rs.getString("Email"));
				s.setPassword(rs.getString("Password"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}

	@Override
	public List<CashierModel> getAllCashierModel() {
		List<CashierModel> cmlist = new ArrayList<>();
		
		String sql = "select *from cashier";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				CashierModel cm = new CashierModel();
				
				cm.setId(rs.getInt("Id"));
				cm.setName(rs.getString("Name"));
				cm.setMobileNumber(rs.getString("MobileNumber"));
				cm.setAddress(rs.getString("Address"));
				cm.setEmail(rs.getString("Email"));
				cm.setPassword(rs.getString("Password"));
					
				cmlist.add(cm);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cmlist;
	}

	@Override
	public List<CashierModel> searchCashierModel(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String un, String pss) {
		// TODO Auto-generated method stub
		return false;
	}

}
