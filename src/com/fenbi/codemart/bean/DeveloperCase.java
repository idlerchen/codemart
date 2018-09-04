package com.fenbi.codemart.bean;

/**
 * 开发者项目经验信息的实体类，封装developer_case表的信息
 *
 */
public class DeveloperCase {

	private int id;
	private int developerId;
	private String name;
	private int caseType;
	private String period;
	private int industryId;
	private String detail;
	private String link;
	
	private String industryName;

	public DeveloperCase() {
		super();
	}

	public DeveloperCase(int id, int developerId, String name, int caseType, String period, int industryId,
			String detail, String link) {
		super();
		this.id = id;
		this.developerId = developerId;
		this.name = name;
		this.caseType = caseType;
		this.period = period;
		this.industryId = industryId;
		this.detail = detail;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCaseType() {
		return caseType;
	}

	public void setCaseType(int caseType) {
		this.caseType = caseType;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDetail() {
		return detail;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustry(int industryId) {
		this.industryId = industryId;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "DeveloperCase [id=" + id + ", developerId=" + developerId + ", name=" + name + ", caseType=" + caseType
				+ ", period=" + period + ", industryId=" + industryId + ", detail=" + detail + ", link=" + link
				+ ", industryName=" + industryName + "]";
	}

}
