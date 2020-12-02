package com.harsh.json;

import java.util.List;


public class AssetDayLog {


	private String idAsset;

	private List<Log> log;

	public AssetDayLog() {

	}

	public String getIdAsset() {
		return idAsset;
	}

	public void setIdAsset(String idAsset) {
		this.idAsset = idAsset;
	}

	public List<Log> getLog() {
		return log;
	}

	public void setLog(List<Log> log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "AssetDayLog [idAsset=" + idAsset + ", log=" + log + "]";
	}

}
