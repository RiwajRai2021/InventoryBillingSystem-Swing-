
package com.service;

import java.util.List;

import com.model.RegisterModel;

public interface RegisterService {
	
	boolean addRegisterModel (RegisterModel R);
	boolean deleteRegisterModel(int id); 
	boolean updateStudent (RegisterModel R);
	RegisterModel getAllRegisterModelById(int id);
	List<RegisterModel> getAllRegisterModel();
	List<RegisterModel>searchRegisterModel(String data);
	boolean login(String un,String pss);
	
}
