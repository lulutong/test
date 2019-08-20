package com.ecej.esmart.model.po;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpCat {

	private Integer empCat;
	
	private String empIds;

	public Integer getEmpCat() {
		return empCat;
	}

	public void setEmpCat(Integer empCat) {
		this.empCat = empCat;
	}

	public List<Integer> getEmpIds() {
		
		if(empIds == null || empIds.isEmpty()){
			return new ArrayList<Integer>();
		}
		
		String list[] = empIds.split(",");
		
		List<String> empIdsStringlist = Arrays.asList(list);
		
		List<Integer> empIdslist = empIdsStringlist.stream().map(x->{return Integer.parseInt(x);}).collect(Collectors.toList());
		
		return empIdslist;
	}

	public void setEmpIds(String empIds) {
		this.empIds = empIds;
	}
	
}
