package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.DeveloperCase;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.DeveloperCaseDao;

public class DeveloperCaseDaoImpl extends BaseDao<DeveloperCase> implements DeveloperCaseDao {

	@Override
	public int createDeveloperCase(DeveloperCase developerCase) {
		String sql = "INSERT INTO developer_case(developer_id,name,case_type,period,industry_id,detail,link)"
				+ " VALUES(?,?,?,?,?,?,?)";
		return this.update(sql, developerCase.getDeveloperId(), developerCase.getName(), developerCase.getCaseType(), developerCase.getPeriod(), developerCase.getIndustryId(), developerCase.getDetail(), developerCase.getLink());
	}

	@Override
	public List<DeveloperCase> selectDeveloperCaseByDeveloperId(int developerId) {
		String sql = "SELECT id,developer_id developerId,name,case_type caseType,period,industry_id industryId,detail,link"
				+ " FROM DeveloperCase"
				+ " WHERE developer_id = ?";
		return this.getBeanList(sql, developerId);
	}

	@Override
	public int updateDeveloperCase(DeveloperCase developerCase) {
		String sql = "UPDATE developer_case"
				+ "	SET name = ?,case_type = ?,period = ?,industry_id = ?,detail = ?,link = ?"
				+ " WHERE id = ?";
		return this.update(sql, developerCase.getName(), developerCase.getCaseType(), developerCase.getPeriod(), developerCase.getIndustryId(), developerCase.getDetail(), developerCase.getLink(),developerCase.getId());
	}
	

}
