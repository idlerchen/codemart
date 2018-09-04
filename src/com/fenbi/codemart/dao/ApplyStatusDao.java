package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.ApplyStatus;

public interface ApplyStatusDao {
	
	public List<ApplyStatus> selectApplyStatus();
	
	public ApplyStatus selectApplyStatusByApplyStatusId(int applyStatusId);
	
	public List<ApplyStatus> getApplyStatus();
}
