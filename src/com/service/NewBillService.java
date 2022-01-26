package com.service;

import java.util.List;
import com.model.NewBillModel;

public interface NewBillService {
	
	boolean addNewBillModel(NewBillModel n);
	
	boolean deleteNewBillModel (int id);
	
	boolean updateNewBillModel (NewBillModel n);
	
	NewBillModel getNewBillModel(int id);
	
	NewBillModel getAllNewBillModelById(int Id);
	
	List<NewBillModel>getAllNewBillModel();
	
	List<NewBillModel>searchNewBillModel(String data);
	
}
