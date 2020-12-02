package com.harsh.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		// objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Data data = new Data();
		init(data);

		try {
			 Data data1 = objectMapper.readValue(new File("E:\\workspace\\assetDayLog.json"), Data.class);
			//objectMapper.writeValue(new File("E:\\workspace\\assetDayLog.json"), data);
			 System.out.println(data1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void init(Data data) {

		AssetDayLog assetDayLog = new AssetDayLog();
		assetDayLog.setIdAsset("IDsjdasjkd");

		Log log = new Log();
		log.setMileage(100);
		log.setFuel(50);
		log.setSpeed(80);

		List<Log> list = new ArrayList<Log>();
		list.add(log);
		
		log.setMileage(0);
		log.setFuel(43);
		log.setSpeed(12);
		
		
		log.setMileage(54);
		log.setFuel(46);
		log.setSpeed(80);
		
		
		log.setMileage(100);
		log.setFuel(78);
		log.setSpeed(80);
		
		

		assetDayLog.setLog(list);
		
		data.setAssetDayLog(assetDayLog);

	}
}
