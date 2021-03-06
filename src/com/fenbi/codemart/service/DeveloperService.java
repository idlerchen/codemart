package com.fenbi.codemart.service;

import com.fenbi.codemart.bean.Developer;
import com.fenbi.codemart.bean.DeveloperCase;

public interface DeveloperService {
	
	/**
	 * 处理创建一条开发者记录的业务逻辑
	 * @param developer 包含开发者记录信息的开发者记录对象
	 * @return 创建是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean createDeveloper(Developer developer);
	
	/**
	 * 处理创建一条开发者项目经验记录的业务逻辑
	 * @param developerCase 包含开发者项目经验记录信息的开发者项目经验记录对象
	 * @return 创建是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean createDeveloperCase(DeveloperCase developerCase);
	
	/**
	 * 处理根据用户id获取该用户开发者记录的业务逻辑
	 * @param userId 用户id
	 * @return 该用户对应的开发者记录信息对象
	 */
	public Developer getDeveloperByUserId(int userId);
	
	/**
	 * 处理根据用户id更新该用户角色信息的业务逻辑
	 * @param role 更新后的角色信息
	 * @param userId 用户id
	 * @return 更新是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean updateRoleByUserId(String role, int userId);
	
	/**
	 * 处理根据用户id获取该用户开发者记录的业务逻辑
	 * @param workStatus
	 * @param userId
	 * @return 更新是否成功(true表示创建成功，false表示创建失败)
	 */
	public boolean updateWorkStatusByUserId(String workStatus, int userId);
	
	/**
	 * 处理更新开发者项目经验记录的业务逻辑
	 * @param developerCase 包含更新后信息的开发者项目经验记录对象
	 * @return 更新是否成功(true表示创建成功，false表示创建失败)
	 */
	public int updateDeveloperCase(DeveloperCase developerCase);
	
	Developer selectDeveloperById(int id);

}
