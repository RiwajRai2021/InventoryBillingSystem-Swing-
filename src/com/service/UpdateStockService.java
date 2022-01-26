package com.service;
import java.util.List;
import com.model.UpdateStockModel;

public interface UpdateStockService {
	
	boolean addUpdateStockModel (UpdateStockModel U);
	
	boolean deleteUpdateStockModel(int Id); 
	
	boolean updateDetails (UpdateStockModel U);
	
	UpdateStockModel getUpdateStockModel (int id); 
	
	UpdateStockModel getAllUpdateStockModelById(int Id);
			
	List<UpdateStockModel> getAllUpdateStockModel();
	
	List<UpdateStockModel>searchUpdateStockModel(String data);
	
	
	
	boolean login(String un,String pss);


}
