package com.sist.web.vo;

import lombok.Data;

@Data
public class FoodVO {
	private int fno;
	private String name,type,phone,address,theme,images,time,parking,content,price,poster;
	private double score;
}
