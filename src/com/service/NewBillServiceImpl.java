
package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.NewBillModel;

public class NewBillServiceImpl implements NewBillService {
	
Connection con = null; 
public  NewBillServiceImpl() {
	con = DB.getDbObject();
	
}
	@Override
	public boolean addNewBillModel(NewBillModel n) {
		
		String sql="insert into newbill(BillNo,CustomerName,ProductName,MRP,ProductPrice,Quantity,Discount,Date)values(?,?,?,?,?,?,?,?)";		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, n.getBillNo());
			pstm.setString(2, n.getCustomerName());
			pstm.setString(3, n.getProductName());
			pstm.setString(4, n.getMRP());
			pstm.setString(5, n.getProductPrice());
			pstm.setString(6, n.getQuantity());
			pstm.setString(7, n.getDiscount());
			pstm.setDate(8, n.getDate());
			
			pstm.execute();
			return true; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteNewBillModel(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateNewBillModel(NewBillModel n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NewBillModel getNewBillModel(int id) {
		
		NewBillModel N = new NewBillModel();
		String sql = "select * from newbill where id = "+id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				N.setBillNo(rs.getString("BillNo"));
				N.setCustomerName(rs.getString("CustomerName"));
				N.setProductName(rs.getString("ProductName"));
				N.setProductPrice(rs.getString("ProductPrice"));
				N.setMRP(rs.getString("MRP"));
				N.setQuantity(rs.getString("Quantity"));
				N.setDiscount(rs.getString("Discount"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return N;
	}

	@Override
	public List<NewBillModel> getAllNewBillModel() {
		
		List<NewBillModel>nList = new ArrayList<>();
				
		String sql = "select * from newbill";
		try {
			Statement stm = con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while (rs.next()) {
				
				NewBillModel n= new NewBillModel();
				n.setCustomerName(rs.getString("CustomerName"));
				n.setProductName(rs.getString("ProductName"));
				n.setQuantity(rs.getString("Quantity"));
				n.setMRP(rs.getString("MRP"));
				n.setDate(rs.getDate("Date"));;
				nList.add(n);
				
							}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			return nList;
	}

	@Override
	public List<NewBillModel> searchNewBillModel(String data) {
		
		List<NewBillModel>nList = new ArrayList<>();
		 
		String sql = "select * from newbill where CustomerName like '%"+data+"%'OR ProductName like'%"+data+"%'";
		try {
			Statement stm = con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while (rs.next()) {
				
				NewBillModel n= new NewBillModel();
				n.setCustomerName(rs.getString("CustomerName"));
				n.setProductName(rs.getString("ProductName"));
				n.setQuantity(rs.getString("Quantity"));
				n.setMRP(rs.getString("MRP"));
				nList.add(n);
							}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			return nList;
	
	}
	@Override
	public NewBillModel getAllNewBillModelById(int Id) {
		
		return null;
	}

}
