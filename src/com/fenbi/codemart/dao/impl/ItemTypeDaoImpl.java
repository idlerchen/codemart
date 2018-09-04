package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.ItemType;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.ItemTypeDao;

public class ItemTypeDaoImpl extends BaseDao<ItemType> implements ItemTypeDao {

	@Override
	public List<ItemType> selectItemTypes() {
		String sql = "SELECT id,name" + " FROM item_type";
		return this.getBeanList(sql);
	}

	@Override
	public ItemType selectItemTypesByItemTypeId(String itemTypeId) {
		String sql = "SELECT id,name" + " FROM item_type" + " WHERE id = ?";
		return this.getBean(sql, itemTypeId);
	}

}
