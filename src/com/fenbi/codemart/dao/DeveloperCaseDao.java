package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.DeveloperCase;

public interface DeveloperCaseDao {

	/**
	 * 创建一条开发者项目经验记录并存入数据库
	 * @param developerCase 包含开发者项目经验记录信息的开发者项目经验记录对象
	 * @return 返回存入数据库的信息条数
	 */
	public int createDeveloperCase(DeveloperCase developerCase);
	
	/**
	 * 根据开发者id查询开发者项目经验记录信息
	 * @param developerId 开发者id
	 * @return 返回该开发者对应的开发者项目经验记录信息
	 */
	public List<DeveloperCase> selectDeveloperCaseByDeveloperId(int developerId);
	
	/**
	 * 根据开发者项目经验记录id更新该记录的信息
	 * @param developerCase 封装更新后信息的开发者项目经验记录对象
	 * @return 返回已修改的信息条数
	 */
	public int updateDeveloperCase(DeveloperCase developerCase);

}
