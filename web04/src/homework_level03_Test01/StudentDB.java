package homework_level03_Test01;

public class StudentDB {
	private String name;
	private String sex;
	private String age;
	private String birthday;
	private String tel;
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "StudentDB [姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + ", 生日：" + birthday + ", 电话：" + tel
				+ ", 爱好：" + hobby + "]";
	}
	

}
