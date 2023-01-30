package com.BikkadIT.AutowiringModes.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MysqlReprotDaoImpl implements ReportDaoI{

	@Override
	public void GenerateReport() {
System.out.println("Mysql report genrated");		
	}

}
