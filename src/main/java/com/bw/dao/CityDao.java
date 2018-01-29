package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bw.vo.City;
import com.bw.vo.Qz;

@Mapper
public interface CityDao {

	List<Qz> getQzList();

/*	List<City> getCityList();*/

}
