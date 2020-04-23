package com.user.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.userModel.Details;
@Repository
public class DaoList {
	List<Details> list;
	
	public List<Details> getDetails(){
		list=new ArrayList<Details>();
		list.add(new Details(1,"Pooja"));
		list.add(new Details(2,"Patil"));
		return list;
	}

}
