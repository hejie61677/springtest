package entity;

import java.util.Date;

/**
 * <p>Title:User </p>
 * <p>Description: 用户表javabean</p>
 * <p>Company: test</p>
 * @author 何杰
 * @date 上午9:38:48
 */
public class User {
	private int id;

	private String username;

	private String password;

	private String gender;

	private String email;

	private String province;

	private String city;

	private Date birthday;

	private Date last_visit;

	private String last_ip;

	public int getId() {

		return this.id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getUsername() {

		return this.username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {

		return this.password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getGender() {

		return this.gender;
	}

	public void setGender(String gender) {

		this.gender = gender;
	}

	public String getEmail() {

		return this.email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public String getProvince() {

		return this.province;
	}

	public void setProvince(String province) {

		this.province = province;
	}

	public String getCity() {

		return this.city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public Date getBirthday() {

		return this.birthday;
	}

	public void setBirthday(Date birthday) {

		this.birthday = birthday;
	}

	public Date getLast_visit() {

		return this.last_visit;
	}

	public void setLast_visit(Date last_visit) {

		this.last_visit = last_visit;
	}

	public String getLast_ip() {

		return this.last_ip;
	}

	public void setLast_ip(String last_ip) {

		this.last_ip = last_ip;
	}
}
