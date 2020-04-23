package com.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Dao.DaoList;
import com.userModel.Details;

@Service
public class LService {
	@Autowired
	DaoList dao;
	
	
	
	public List<Details> getAll(){
		return dao.getDetails();
	}
	

}
