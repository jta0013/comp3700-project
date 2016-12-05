package main.domain;

import java.util.Date;

import main.etc.MembershipStatus;
import main.etc.Role;

public class Membership {
	private MembershipStatus status;
	private String name;
	private Date startDate;
	private Role role;
	private Date expireDate;
	
	public Membership(String name, Role r, Date ed) {
		this.name = name;
		role = r;
		expireDate = ed;
	}
	public MembershipStatus getStatus() {
		return status;
	}
	public void setStatus(MembershipStatus status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
