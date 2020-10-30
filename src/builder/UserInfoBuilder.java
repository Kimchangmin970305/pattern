package builder;

public class UserInfoBuilder {
	private String name;
	private int age;
	private String hobby;
	
	public UserInfoBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public UserInfoBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public UserInfoBuilder setHobby(String hobby) {
		this.hobby = hobby;
		return this;
	}
	
	public UserInfo build() {
		return new UserInfo(name, age, hobby);
	}
}
