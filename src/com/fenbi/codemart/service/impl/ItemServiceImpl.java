package com.fenbi.codemart.service.impl;

import java.util.List;

import com.fenbi.codemart.bean.Item;
import com.fenbi.codemart.bean.ItemState;
import com.fenbi.codemart.bean.ItemType;
import com.fenbi.codemart.dao.ItemDao;
import com.fenbi.codemart.dao.ItemStateDao;
import com.fenbi.codemart.dao.ItemTypeDao;
import com.fenbi.codemart.dao.impl.ItemDaoImpl;
import com.fenbi.codemart.dao.impl.ItemStateDaoImpl;
import com.fenbi.codemart.dao.impl.ItemTypeDaoImpl;
import com.fenbi.codemart.service.ItemService;

public class ItemServiceImpl implements ItemService {

	ItemDao itemDao = new ItemDaoImpl();
	ItemTypeDao itemTypeDao = new ItemTypeDaoImpl();
	ItemStateDao itemStateDao = new ItemStateDaoImpl();
	
	@Override
	public boolean createItem(Item item) {
		return itemDao.createItem(item) > 0;
	}

	@Override
	public List<Item> getItems() {
		return itemDao.selectItemList();
	}
	
	@Override
	public List<Item> getItemByUserId(int userId) {
		return itemDao.selectItemByUserId(userId);
	}
	@Override
	public List<Item> getItemByItemtype(int itemtype) {
		// TODO Auto-generated method stub
		return itemDao.selectItemByItemType(itemtype);
	}

	@Override
	public List<Item> getItemByState(int state) {
		// TODO Auto-generated method stub
		return itemDao.selectItemByState(state);
	}

	@Override
	public List<Item> getItemByRoleId(int roleId) {
		// TODO Auto-generated method stub
		return itemDao.selectItemByRoleId(roleId);
	}
	@Override
	public List<Item> getItemByName(String name) {
		// TODO Auto-generated method stub
		return itemDao.selectItemByName(name);
	}
	@Override
	public Item selectItemByItemId(int itemId) {
		return itemDao.selectItemByItemId(itemId);
	}

	@Override
	public boolean updateItemInfo(Item item) {
		return itemDao.updateItemInfo(item) > 0;
	}
	
	@Override
	public List<ItemType> getItemTypes() {
		return itemTypeDao.selectItemTypes();
	}

	@Override
	public ItemType getItemTypesByItemTypeId(String itemTypeId) {
		return itemTypeDao.selectItemTypesByItemTypeId(itemTypeId);
	}

	@Override
	public boolean updateStateByItemId(int state, int itemId) {
		return itemDao.updateStateByItemId(state, itemId) > 0;
	}

	

	@Override
	public boolean updateViewNunByItemId(int viewNum, int itemId) {
		return itemDao.updateViewNunByItemId(viewNum, itemId) > 0;
	}

	@Override
	public List<ItemState> getItemStates() {
		return itemStateDao.selectItemStates();
	}

	public List<ItemState> getItemStateList() {
		// TODO Auto-generated method stub
		return itemStateDao.getItemStates();
	}

	@Override
	public List<Item> getMyitemBystate(int userid, int stateId) {
		
		List<Item> myItems = itemDao.getMyitemBystate(userid, stateId);
		
		return myItems;
	}

	@Override
	public int addApplicantNumByItemId(int itemId) {
		// TODO Auto-generated method stub
		return itemDao.addApplicantNumByItemId(itemId);
	}

	@Override
	public int delApplicantNumByItemId(int itemId) {
		// TODO Auto-generated method stub
		return itemDao.delApplicantNumByItemId(itemId);
	}

	@Override
	public List<Item> getItemListByTypeAndStateAndRoleAndPageIndex(String itemtype, String state, String roleId,
			int pageIndex) {
		String regex = "[0-9]+";
		if(!itemtype.matches(regex) || !(Integer.parseInt(itemtype) > 0)) {
			itemtype = "%";
		}
		if(!state.matches(regex) || !(Integer.parseInt(state) > 0)) {
			state = "%";
		}
		if(!roleId.matches(regex) || !(Integer.parseInt(roleId) > 0)) {
			roleId = "%";
		}
		return itemDao.selectItemsByTypeAndStateAndRoleAndPageIndex(itemtype, state, roleId, pageIndex);
	}

	

	
	
}
