
package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.db.DB;
import com.model.UpdateStockModel;

public class UpdateStockServiceImpl implements UpdateStockService {
	
	Connection con = null; 
	public UpdateStockServiceImpl() {		
	con = DB.getDbObject();
	}

	@Override 
	public boolean addUpdateStockModel(UpdateStockModel U) {
		String sql ="insert into updatestock (ProductName,QuantityAvailable,QuantityAdded,MRP)values(?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setString(1, U.getProductName());
			pstm.setString(2, U.getQuantityAvailable());
			pstm.setString(3,U.getQuantityAdded());
			pstm.setString(4, U.getMRP());
					
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
			
		return false;
	}

	@Override
	public boolean deleteUpdateStockModel(int Id) {
		
		String sql = "delete from updatestock where id="+Id;
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
	public boolean updateDetails(UpdateStockModel U) {
		
		
		
		return false;
	}

	@Override
	public UpdateStockModel getAllUpdateStockModelById(int id) {
		
	UpdateStockModel u= new UpdateStockModel();	
	
	String sql = "select * from updatestock where id ="+id;
	try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if(rs.next()) {
			u.setProductName(rs.getString("ProductName"));
			u.setQuantityAvailable(rs.getString("QuantityAvailable"));
			u.setQuantityAdded(rs.getString("QuantityAdded"));
			u.setMRP(rs.getString("MRP"));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 		
		return u;
	}

	@Override
	public List<UpdateStockModel> getAllUpdateStockModel() {
		
		List<UpdateStockModel>uList = new ArrayList<>();
				
		String sql = "select* from updatestock";
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while (rs.next()) {
				
				UpdateStockModel U = new UpdateStockModel();
				
				U.setId(rs.getInt("id"));
				U.setProductName(rs.getString("ProductName"));
				U.setQuantityAvailable(rs.getString("QuantityAvailable"));
				U.setQuantityAdded(rs.getString("QuantityAdded"));
				U.setMRP(rs.getString("MRP"));
				uList.add(U);
						
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uList;
	}

	@Override
	public List<UpdateStockModel> searchUpdateStockModel(String data) {
		List<UpdateStockModel>uList = new ArrayList<>();
		
		String sql = "select* from updatestock where ProductName like '%"+data+"%'";
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while (rs.next()) {
				
				UpdateStockModel U = new UpdateStockModel();
				
				U.setId(rs.getInt("id"));
				U.setProductName(rs.getString("ProductName"));
				U.setQuantityAvailable(rs.getString("QuantityAvailable"));
				U.setQuantityAdded(rs.getString("QuantityAdded"));
				U.setMRP(rs.getString("MRP"));
				uList.add(U);
				
			}			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uList;
		
	}

	@Override
	public boolean login(String un, String pss) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UpdateStockModel getUpdateStockModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
