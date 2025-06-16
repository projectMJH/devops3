package com.sist.web.dao;

import org.apache.ibatis.annotations.Mapper;

import jakarta.annotation.ManagedBean;
import java.util.*;
import com.sist.web.vo.*;
@Mapper
public interface FoodMapper {
	public List<FoodVO> foodListData(Map map);
	public int foodTotalPage();
}
