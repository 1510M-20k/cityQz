package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.CityDao;
import com.bw.vo.City;
import com.bw.vo.Qz;

@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityDao cityDao;

	@Override
	public List<Qz> getQzList() {
		// TODO Auto-generated method stub
		return cityDao.getQzList();
	}

	/*@Override
	public List<City> getCityList() {
		// TODO Auto-generated method stub
		return cityDao.getCityList();
	}*/
}
