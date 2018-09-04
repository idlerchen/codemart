package com.fenbi.codemart.service;

import java.util.List;

import com.fenbi.codemart.bean.Item;
import com.fenbi.codemart.bean.ItemState;
import com.fenbi.codemart.bean.ItemType;

public interface ItemService {
	
	/**
	 * 处理创建一条项目的业务逻辑
	 * @param item 包含项目信息的项目对象
	 * @return 创建是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean createItem(Item item);
	
	/**
	 * 处理查询所有项目信息的业务逻辑
	 * @return 所有项目信息对象的List集合
	 */
	public List<Item> getItems();
	
	/**
	 * 处理根据用户id获取该用户所有项目列表的业务逻辑
	 * @param userId 用户id
	 * @return 该用户所有项目的List集合
	 */
	public List<Item> getItemByUserId(int userId);
	
	
	/**处理根据项目类型获取该用户所有项目列表的业务逻辑
	 * @param itemtype
	 * @return
	 */
	public List<Item> getItemByItemtype(int itemtype);
	
	/**处理根据项目状态获取该用户所有项目列表的业务逻辑
	 * @param state
	 * @return
	 */
	public List<Item> getItemByState(int state);
	
	/**处理根据角色获取该用户所有项目列表的业务逻辑
	 * @param roleId
	 * @return
	 */
	public List<Item> getItemByRoleId(int roleId);
	
	/**处理根据角色获取该用户所有项目列表的业务逻辑
	 * @param name
	 * @return
	 */
	public List<Item> getItemByName(String name);
	/**
	 * 处理根据项目id获取对应项目信息的业务逻辑
	 * @param itemId 项目id
	 * @return 封装对应项目信息的项目对象
	 */
	public Item selectItemByItemId(int itemId);
	
	/**
	 * 处理更新项目信息的业务逻辑
	 * @param item 封装更新后项目信息的项目对象
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateItemInfo(Item item);
	
	/**
	 * 处理更新项目状态的业务逻辑
	 * @param state 更新后的项目状态
	 * @param itemId 项目id
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateStateByItemId(int state, int itemId);
	
	/**
	 * 处理更新项目申请人数的业务逻辑
	 * @param applicantNum 更新后的申请人数
	 * @param itemId 项目id
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public int addApplicantNumByItemId(int itemId);
	
	public int delApplicantNumByItemId(int itemId);
	
	/**
	 * 处理更新项目访问人数的业务逻辑
	 * @param viewNum 更新后的访问人数
	 * @param itemId 项目id
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateViewNunByItemId(int viewNum, int itemId);
	
	/**
	 * 处理查询所有行业类型信息的业务逻辑
	 * @return 所有行业类型的List集合
	 */
	public List<ItemType> getItemTypes();
	
	/**
	 * 处理根据项目类型id查询对应项目信息的业务逻辑
	 * @param itemTypeId 项目类型id
	 * @return 项目类型id对应的项目类型信息
	 */
	public ItemType getItemTypesByItemTypeId(String itemTypeId);
		
	/**
	 * 处理查询项目进度的业务逻辑
	 * @return 所有项目进度类型的List集合
	 */
	public List<ItemState> getItemStates();
	
	
	/**
	 * 获取所有项目进度类型包括取消的业务逻辑
	 * @return 所有项目进度类型的List集合
	 */
	public List<ItemState> getItemStateList();
	
	/***
	 * 根据项目的状态获取我的项目列表
	 * @param userid
	 * @param stateId
	 * @return
	 */
	public List<Item> getMyitemBystate(int userid,int stateId);
	
	/**
	 * 处理根据项目类型、项目状态、角色类型及当前页数查询当前页对应的项目信息的业务逻辑
	 * 
	 * @param itemtype  项目类型
	 * @param state     项目状态
	 * @param roleId    角色类型
	 * @param pageIndex 当前页数
	 * @return 对应项目信息的列表
	 */
	public List<Item> getItemListByTypeAndStateAndRoleAndPageIndex(String itemtype, String state, String roleId,
			int pageIndex);

}
