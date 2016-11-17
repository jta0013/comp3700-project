package main.domain;

import java.util.Date;

import main.etc.MembershipStatus;
import main.etc.Role;

public class Membership {
	private MembershipStatus status;
	private int memberId;
	private Date startDate;
	private Role role;
	private Date expireDate;
	
	public Membership(Role r, Date ed) {
		memberId = 0;//TODO: generate unique member IDs
		role = r;
		expireDate = ed;
	}
	public MembershipStatus getStatus() {
		return status;
	}
	public void setStatus(MembershipStatus status) {
		this.status = status;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
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
}
