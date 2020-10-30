package builder;

public class UserInfo {
	private String name;
	private int age;
	private String hobby;
	
	public UserInfo(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String getUserInfo() {
		return String.format("name:%s, age:%d, hobby:%s", name, age, hobby);
	}
}
