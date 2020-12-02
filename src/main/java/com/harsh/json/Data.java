package com.harsh.json;

public class Data {
	
	private AssetDayLog assetDayLog;

	public Data() {
	
	}

	@Override
	public String toString() {
		return "Data [assetDayLog=" + assetDayLog + "]";
	}

	public AssetDayLog getAssetDayLog() {
		return assetDayLog;
	}

	public void setAssetDayLog(AssetDayLog assetDayLog) {
		this.assetDayLog = assetDayLog;
	}
}
