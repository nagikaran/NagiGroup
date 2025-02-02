package com.nagi.dto.user;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

	private Integer user_login_history_id;

	private Integer user_id;

	private Integer role_id;

	private String email_id;

	private String first_name;

	private String last_name;

	private String department_name;

	private String designation_name;

	private String role_name;

	private String contact_no;

	private Date last_login_time;

	private String last_login_ip_address;

	private Short user_type_id;

	private String login_user_id;
	
	private String mac_address;

	public Integer getUser_login_history_id() {
		return user_login_history_id == null ? Integer.valueOf(0) : user_login_history_id;
	}

	public void setUser_login_history_id(Integer user_login_history_id) {
		this.user_login_history_id = user_login_history_id;
	}

	public Integer getUser_id() {
		return user_id == null ? Integer.valueOf(0) : user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getEmail_id() {
		return email_id == null ? new String("") : email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getFirst_name() {
		return first_name == null ? new String("") : first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name == null ? new String("") : last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDepartment_name() {
		return department_name == null ? new String("") : department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDesignation_name() {
		return designation_name == null ? new String("") : designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public String getRole_name() {
		return role_name == null ? new String("") : role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getContact_no() {
		return contact_no == null ? new String("") : contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	public String getLast_login_ip_address() {
		return last_login_ip_address == null ? new String("") : last_login_ip_address;
	}

	public void setLast_login_ip_address(String last_login_ip_address) {
		this.last_login_ip_address = last_login_ip_address;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Short getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(Short user_type_id) {
		this.user_type_id = user_type_id;
	}

	public String getLogin_user_id() {
		return login_user_id;
	}

	public void setLogin_user_id(String login_user_id) {
		this.login_user_id = login_user_id == null ? new String("") : login_user_id;
	}

	public String getMac_address() {
		return mac_address==null?"":mac_address;
	}

	public void setMac_address(String mac_address) {
		this.mac_address = mac_address;
	}
}
