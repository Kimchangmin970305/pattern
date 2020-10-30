package builder;

public class BuilderTest {
	public static void main(String[] args) {
		PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
		PersonInfo result = personInfoBuilder
				.setName("name")
				.setAge(24)
				.setFavoriteColor("Black")
				.setFavoriteHobby("Game")
				.setName("Chnagmin Kim")
				.setFavoriteNumber(39)
				.build();
		
		System.out.println(result.getPersonInfo());		
	}
}
