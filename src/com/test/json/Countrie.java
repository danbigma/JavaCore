package com.test.json;

public class Countrie {
	
	private String name;
	private String code;
	private String capital;
	private String region;
	private String flag;
	
	public Countrie(String name, String code, String capital, String region, String flag) {
		super();
		this.name = name;
		this.code = code;
		this.capital = capital;
		this.region = region;
		this.flag = flag;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Countrie [name=" + name + ", code=" + code + ", capital=" + capital + ", region=" + region + ", flag="
				+ flag + "]";
	}
	
}
