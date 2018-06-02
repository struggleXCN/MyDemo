package com.oaec.pojo;

import java.util.Set;

public class Department {
	private int depid;
	private String depname;
	/*private List<User> users;*/
	private Set<User> users;
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	/*public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}*/
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", users=" + users + "]";
	}

}
