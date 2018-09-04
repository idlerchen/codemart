package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.Apply;

public interface ApplyDao {
	
	/**
	 * 创建一条申请并存入数据库
	 * @param apply 封装申请信息的申请对象
	 * @return 返回存入数据库的信息条数
	 */
	public int createApply(Apply apply);
	
	/**
	 * 根据项目id查询该项目的所有申请的信息
	 * @param itemId 项目id
	 * @return 该项目的所有申请的List集合
	 */
	public List<Apply> selectApplysByItemId(int itemId);
	
	/**
	 * 根据申请id查询该申请的信息
	 * @param applyid 申请id
	 * @return 封装该申请信息的申请对象
	 */
	public Apply selectApplyByApplyId(int applyid);
	
	/**
	 * 根据开发者id查询该开发者提交的所有申请的信息
	 * @param developerId 开发者id
	 * @return 该开发者提交的所有申请的List集合
	 */
	public List<Apply> selectApplysByDeveloperId(int developerId);
	
	/**根据状态查询该开发者提交的所有申请的信息
	 * @param state
	 * @return
	 */
	public List<Apply>selectApplysByState(int developerId,int state);
	
	/**
	 * 更新申请的申请状态信息
	 * @param state 更新后的状态信息
	 * @param applyId 申请id
	 * @return 返回已更新的信息条数
	 */
	public int updateStateByApplyId(int state, int applyId);
	
	/**
	 * 更新申请的申请状态信息，项目取消，申请该项目的自动全部取消申请
	 * @param state 更新后的状态信息
	 * @param itemId 项目id
	 * @return 返回已更新的信息条数
	 */
	public int updateStateByItemId(int state, int itemId);
	/**
	 * 更新申请的备注信息
	 * @param note 更新后的备注信息
	 * @param applyId 申请id
	 * @return 返回已更新的信息条数
	 */
	public int updateNoteByApplyId(String note, int applyId);
	
	/**
	 * 根据开发者ID 和项目ID 去查找是否这个人是否已申请项目，用于匹配参与项目按钮
	 * @param note 更新后的备注信息
	 * @param applyId 申请id
	 * @return 返回已更新的信息条数
	 */
	List<Apply> selectApplysByDeveloperAndItem(int developerId, int itemId);
	
	
}
