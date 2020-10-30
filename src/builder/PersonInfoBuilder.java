package builder;

public class PersonInfoBuilder {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteHobby;
	private Integer favoriteNumber;
	
	public PersonInfoBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonInfoBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	public PersonInfoBuilder setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
		return this;
	}
	
	public PersonInfoBuilder setFavoriteHobby(String favoriteHobby) {
		this.favoriteHobby = favoriteHobby;
		return this;
	}
	
	public PersonInfoBuilder setFavoriteNumber(Integer favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
		return this;
	}
	
	public PersonInfo build() {
		PersonInfo personInfo = new PersonInfo(name, age, favoriteColor, favoriteHobby, favoriteNumber);
		return personInfo;
	}
}
