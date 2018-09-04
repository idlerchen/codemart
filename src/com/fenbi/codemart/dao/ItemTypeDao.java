package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.ItemType;

public interface ItemTypeDao {
	
	/**
	 * 查询所有的行业类型信息
	 * @return 所有行业类型的List集合
	 */
	public List<ItemType> selectItemTypes();
	
	/**
	 * 根据行业类型id查询对应的行业类型信息
	 * @param itemTypeId 行业类型id
	 * @return 行业类型id对应的行业类型信息
	 */
	public ItemType selectItemTypesByItemTypeId(String itemTypeId);

}
