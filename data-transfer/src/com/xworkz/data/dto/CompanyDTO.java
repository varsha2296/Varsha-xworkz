package com.xworkz.data.dto;

public class CompanyDTO {
	private String name;
	private String type;
	private String location;
	private int companyId;
	private String cCEO;
	private String webSite;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getcCEO() {
		return cCEO;
	}
	public void setcCEO(String cCEO) {
		this.cCEO = cCEO;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
    
}
