package com.BikkadIT.AutowiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.BikkadIT.AutowiringModes.dao.ReportDaoI;

@Service
public class ReportServiceImpl {
	
	
	@Autowired
	@Qualifier("oracleReportDaoImpl")
	
	private ReportDaoI ReportDaoI;
	public void GenrateReport() {
		
		ReportDaoI.GenrateReport();
		
	}

}
