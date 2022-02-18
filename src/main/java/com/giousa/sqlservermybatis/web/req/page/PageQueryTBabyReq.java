package com.giousa.sqlservermybatis.web.req.page;

import com.giousa.sqlservermybatis.web.req.PageQueryReq;
import lombok.Data;

import java.util.List;

@Data
public class PageQueryTBabyReq extends PageQueryReq {

    private static final long serialVersionUID = 1L;

	/**
     * ID列表
     */
	private List<Long> ids;
	
	/**
     * 
     */
    private Integer id;
	
	/**
     * 
     */
    private Integer areaId;
	
	/**
     * 
     */
    private Integer hId;
	
	/**
     * 
     */
    private String name;
	
	/**
     * 
     */
    private Integer sex;
	
	/**
     * 
     */
    private String birth;
	
	/**
     * 
     */
    private Integer isEchocardiography;
	
	/**
     * 
     */
    private String number;
	
	/**
     * 
     */
    private String mother;
	
	/**
     * 
     */
    private Integer cardType;
	
	/**
     * 
     */
    private String maIdcart;
	
	/**
     * 
     */
    private String nation;
	
	/**
     * 
     */
    private String city;
	
	/**
     * 
     */
    private String address1;
	
	/**
     * 
     */
    private String address;
	
	/**
     * 
     */
    private Integer guardian;
	
	/**
     * 
     */
    private String mobile;
	
	/**
     * 
     */
    private String tel;
	
	/**
     * 
     */
    private Integer guardianT;
	
	/**
     * 
     */
    private String mobileT;
	
	/**
     * 
     */
    private String telT;
	
	/**
     * 
     */
    private Integer guardianS;
	
	/**
     * 
     */
    private String mobileS;
	
	/**
     * 
     */
    private String telS;
	
	/**
     * 
     */
    private Integer mode;
	
	/**
     * 
     */
    private String createDate;
	
	/**
     * 
     */
    private String updateDate;
	
	/**
     * 
     */
    private Integer operatorId;
	
	/**
     * 
     */
    private Integer status;
	
	/**
     * 
     */
    private Integer agree;
	
	/**
     * 
     */
    private Integer step;
	
	/**
     * 
     */
    private String jscode;
	
	/**
     * 
     */
    private String jsimg;
	
	/**
     * 
     */
    private Integer additional;
	
	/**
     * 
     */
    private Integer followup;
	
	/**
     * 
     */
    private Integer followupResult;
	
	/**
     * 
     */
    private String deleteDate;
	
	/**
     * 
     */
    private String createUser;
	
	/**
     * 
     */
    private String updateUser;
	
	/**
     * 
     */
    private String deleteUser;
	
	/**
     * 
     */
    private Integer screenId;
	
	/**
     * 
     */
    private Integer diagnosisId;
	
	/**
     * 
     */
    private Integer treatId;
	
	/**
     * 
     */
    private Integer dr;
	
	/**
     * 
     */
    private Integer bStatus;
	
	/**
     * 
     */
    private String issupplement;
	
	/**
     * 
     */
    private Integer problem;
	
	/**
     * 
     */
    private Integer isInterface;
	
	/**
     * 
     */
    private Integer interFaceId;
	
}

