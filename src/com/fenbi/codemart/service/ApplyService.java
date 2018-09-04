package com.fenbi.codemart.service;

import java.util.List;

import com.fenbi.codemart.bean.Apply;
import com.fenbi.codemart.bean.ApplyStatus;

public interface ApplyService {

	/**
	 * 处理创建一条申请的业务逻辑
	 * 
	 * @param apply 封装申请信息的申请对象
	 * @return 创建是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean createApply(Apply apply);

	/**
	 * 处理根据项目id查询该项目的所有申请信息的业务逻辑
	 * 
	 * @param itemId 项目id
	 * @return 该项目的所有申请的List集合
	 */
	public List<Apply> getApplysByItemId(int itemId);

	/**
	 * 处理根据开发者id查询该开发者提交的所有申请信息的业务逻辑
	 * 
	 * @param developerId 开发者id
	 * @return 该开发者的所有申请的List集合
	 */
	public List<Apply> getApplysByDeveloperId(int developerId);

	/**
	 * 处理根据开发者id查询该开发者提交的所有申请信息的业务逻辑
	 * 
	 * @param applyid 申请id
	 * @return 封装该申请信息的申请对象
	 */
	public Apply getApplyByApplyId(int applyid);

	/**
	 * 处理更新申请的申请状态信息的业务逻辑
	 * 
	 * @param state   更新后的状态信息
	 * @param applyId 申请id
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateStateByApplyId(int state, int applyId);

	/**
	 * 处理更新申请的备注信息的业务逻辑
	 * 
	 * @param note    更新后的备注信息
	 * @param applyId 申请id
	 * @return 更新是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateNoteByApplyId(String note, int applyId);
	
	/**
	 * 处理根据项目id获取该项目申请人数的业务逻辑
	 * @param itemId 项目id
	 * @return 该项目申请人数
	 */
	public int countApplysByItemId(int itemId);
	
	/**
	 * 根据开发者ID 和项目ID 去查找是否这个人是否已申请项目，用于匹配参与项目按钮
	 * @param note 更新后的备注信息
	 * @param applyId 申请id
	 * @return 返回已更新的信息条数
	 */
	List<Apply> selectApplyByDeveloperAndItem(int developerId, int itemId);
	
	
	/**获取所有报名的状态
	 * @return
	 */
	public List<ApplyStatus> getApplyStatus();
	
	
	/**根据状态查询该开发者提交的所有申请信息的业务逻辑
	 * @param state
	 * @return
	 */
	public List<Apply> getApplysByState(int developerId,int state);
	
	/**
	 * 更新申请的申请状态信息，项目取消，申请该项目的自动全部取消申请
	 * @param state 更新后的状态信息
	 * @param itemId 项目id
	 * @return 返回已更新的信息条数
	 */
	public int updateStateByItemId(int state, int itemId);
	
}
