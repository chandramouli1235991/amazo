package com.amazon1.service;

import com.amazon1.dao.AmazonDao;
import com.amazon1.dao.AmazonDaoInterface;

public class AmazonService implements AmazonServiceInterface{

	public static AmazonServiceInterface createServiceObject() {
		
		return new AmazonService();
	}

	@Override
	public int createProfile(String ac) {
		AmazonDaoInterface ad=AmazonDao.createDaoObject();
		return ad.createProfileDao(ac) ;
	}
	

}
