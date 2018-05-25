package com.example.demo.bean;

//import lombok.Getter;
//import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
//@Getter
//@Setter
public class InfoCompanyUser implements Serializable {
    /**
     * 企业员工表id  123123
     */
    private String id;

    // 员工昵称
    private String name;

    /**
     * 企业id
     */
    private String companyId;

    /**
     * 员工账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门id
     */
    private String companyDeptId;

    /**
     * 状态(1使用中 2已冻结 3已卸载)
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 磁盘加密状态(0不加密 1加密)
     */
    private Integer encryptStatus;
    
    /**
     * 昵称
     */
    private String nickname;
    
    

    private static final long serialVersionUID = 1L;



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCompanyId() {
		return companyId;
	}



	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCompanyDeptId() {
		return companyDeptId;
	}



	public void setCompanyDeptId(String companyDeptId) {
		this.companyDeptId = companyDeptId;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public Integer getEncryptStatus() {
		return encryptStatus;
	}



	public void setEncryptStatus(Integer encryptStatus) {
		this.encryptStatus = encryptStatus;
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}