package builder;

public class PersonInfo {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteHobby;
	private Integer favoriteNumber;
	
	public PersonInfo(String name, Integer age, String favoriteColor, String favoriteHobby, Integer favoriteNumber) {
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
		this.favoriteHobby = favoriteHobby;
		this.favoriteNumber = favoriteNumber;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public String getFavoriteHobby() {
		return favoriteHobby;
	}

	public Integer getFavoriteNumber() {
		return favoriteNumber;
	}
	
	public String getPersonInfo() {
		String personInfo = String.format("name:%s, age:%d, favoriteColor:%s, favoriteHobby:%s, favoriteNumber:%d"
				, name, age, favoriteColor, favoriteHobby, favoriteNumber);
		return personInfo;
	}
}
