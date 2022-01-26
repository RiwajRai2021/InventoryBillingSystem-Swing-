package com.service;

import java.util.List;

import com.model.CashierModel;

public interface CashierService {
	
	boolean addCashierModel (CashierModel C);
	boolean deleteCashierModel(int Id); 
	
	boolean updateDetails (CashierModel C);
	CashierModel getAllCashierModelById(int Id);
	List<CashierModel> getAllCashierModel();
	List<CashierModel>searchCashierModel(String data);
	boolean login(String un,String pss);


}
