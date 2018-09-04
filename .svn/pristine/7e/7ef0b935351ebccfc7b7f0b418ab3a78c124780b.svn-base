package com.fenbi.codemart.test;

import com.fenbi.codemart.dao.DeveloperDao;
import com.fenbi.codemart.dao.ItemDao;
import com.fenbi.codemart.dao.impl.DeveloperDaoImpl;
import com.fenbi.codemart.dao.impl.ItemDaoImpl;

public class TestSum {

	public static void main(String[] args) {
		ItemDao id = new ItemDaoImpl();
		DeveloperDao dd = new DeveloperDaoImpl();
		int allItems = id.getAllItems();
		System.out.println(allItems);
		int allMoney = id.getAllMoney();
		int allDeveloper = dd.getAllDeveloper();
		System.out.println(allItems+"-"+allMoney+"-"+allDeveloper);
	}

}
