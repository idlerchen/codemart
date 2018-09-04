package com.fenbi.codemart.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import com.fenbi.codemart.bean.Item;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.ItemDao;

public class ItemDaoImpl extends BaseDao<Item> implements ItemDao {

	@Override
	public int createItem(Item item) {
		String sql = "INSERT INTO item(userid,itemtype,role_id,name,industry_id,money,period,link_man,link_email,link_telephone,refer,detail,state,view_num,applicant_num)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return this.update(sql, item.getUserid(), item.getItemtype(), item.getRoleId(),item.getName(), item.getIndustryId(),item.getMoney(),item.getPeriod(),item.getLinkMan(),item.getLinkEmail(),item.getLinkTelephone(), item.getRefer(), item.getDetail(), item.getState(), item.getViewNum(), item.getApplicantNum());
	}

	@Override
	public List<Item> selectItemList() {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,item.create_time createTime,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 order by item.id desc";
		return this.getBeanList(sql);
	}
	
	@Override
	public List<Item> selectItemByUserId(int userId) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE userid = ?";
		return this.getBeanList(sql, userId);
	}

	@Override
	public Item selectItemByItemId(int itemId) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName,industry.name industryName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " INNER JOIN industry ON item.industry_id = industry.id"
				+ " WHERE item.id = ?";
		return this.getBean(sql, itemId);
	}

	@Override
	public int updateItemInfo(Item item) {
		String sql = "UPDATE item"
				+ " SET itemtype = ?,role_id = ?, name = ?,industry_id = ?,money = ?,period = ?,link_man = ?,link_email = ?,link_telephone = ?,refer = ?,detail = ?"
				+ " WHERE id = ?";
		return this.update(sql, item.getItemtype(), item.getRoleId(), item.getName(), item.getIndustryId(), item.getMoney(), item.getPeriod(), item.getLinkMan(), item.getLinkEmail(), item.getLinkTelephone(), item.getRefer(), item.getDetail(), item.getId());
	}

	@Override
	public int updateStateByItemId(int state, int itemId) {
		String sql = "UPDATE item"
				+ " SET state = ?"
				+ " WHERE id = ?";
		return this.update(sql, state, itemId);
	}

	@Override
	public int addApplicantNumByItemId(int itemId) {
		String sql = "UPDATE item"
				+ " SET applicant_num = applicant_num+1"
				+ " WHERE id = ?";
		return this.update(sql,itemId);
	}
	
	@Override
	public int delApplicantNumByItemId(int itemId) {
		String sql = "UPDATE item"
				+ " SET applicant_num = applicant_num-1"
				+ " WHERE id = ?";
		return this.update(sql,itemId);
	}

	@Override
	public int updateViewNunByItemId(int viewNum, int itemId) {
		String sql = "UPDATE item"
				+ " SET view_num = ?"
				+ " WHERE id = ?";
		return this.update(sql, viewNum, itemId);
	}

	@Override
	public List<Item> selectItemByItemType(int itemtype) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 AND item.itemtype = ?";
		return this.getBeanList(sql,itemtype);
	}

	@Override
	public List<Item> selectItemByState(int state) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 AND item.state = ?";
		return this.getBeanList(sql,state);
	}

	@Override
	public List<Item> selectItemByRoleId(int roleId) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 AND item.role_id = ?";
		return this.getBeanList(sql,roleId);
	}

	@Override
	public List<Item> selectItemByName(String name) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 AND item.name LIKE ?";
		return this.getBeanList(sql,"%"+name+"%");
	}

	

	@Override
	public List<Item> getMyitemBystate(int userid, int stateId) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE userid = ? AND state = ?";
		
		return this.getBeanList(sql,userid, stateId);
	}

	@Override
	public int getAllMoney() {
		String sql = "SELECT SUM(money) FROM item";
		BigDecimal allMoney = (BigDecimal) this.getObject(sql);
		return allMoney.intValue();
	}

	@Override
	public int getAllItems() {
		String sql = "SELECT COUNT(*) FROM item";
		long allItems = (Long) this.getObject(sql);
		return (int)allItems;
	}

	@Override
	public List<Item> selectItemsByTypeAndStateAndRoleAndPageIndex(String itemtype, String state, String roleId,
			int pageIndex) {
		String sql = "SELECT item.id id,userid,itemtype,role_id roleId,item.name name,industry_id industryId,money,period,link_man linkMan,link_email linkEmail,link_telephone linkTelephone,refer,detail,state,view_num viewNum,applicant_num applicantNum,istate.name stateName,itype.name itemtypeName,rtype.name roleName"
				+ " FROM item"
				+ " INNER JOIN item_state istate ON item.state = istate.id"
				+ " INNER JOIN item_type itype ON item.itemtype = itype.id"
				+ " INNER JOIN role_type rtype ON item.role_id = rtype.id"
				+ " WHERE state != 4 AND itemtype LIKE ? AND state LIKE ? AND role_id LIKE ?"
				+ " ORDER BY item.id DESC"
				+ " LIMIT ?,20";
		return this.getBeanList(sql, itemtype, state, roleId, (1+20*(pageIndex-1)));
	}
}
