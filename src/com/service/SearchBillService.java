package com.service;

import java.util.List;

import com.model.SearchBillModel;

public interface SearchBillService {
	
	boolean addSearchBillModel(SearchBillModel S);
	
	boolean deleteSearchBillModel (int id);
	
	boolean updateSearchBillModel (SearchBillModel S);
	
	SearchBillModel getSearchBillModel(int id);
	
	SearchBillModel getAllSearchBillModelById(int Id);
	
	List<SearchBillModel>getAllSearchBillModel();
	
	List<SearchBillModel>searchSearchBillModel(String data);
	
}
