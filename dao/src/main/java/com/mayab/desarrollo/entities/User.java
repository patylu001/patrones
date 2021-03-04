package com.mayab.desarrollo.entities;



public class User {

	private int id;
	private String name;
	private String tel;
	private String passwd;
	
	public User(int id,String name, String tel, String passwd)
	{
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.passwd = passwd;
	}

		public User()
		{}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
