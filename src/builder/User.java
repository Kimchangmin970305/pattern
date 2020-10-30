package builder;

public class User {
	public static void main(String[] args) {
		UserInfoBuilder userInfoBuilder = new UserInfoBuilder();
		UserInfo user = userInfoBuilder
				.setName("Changmin Kim")
				.setAge(24)
				.setHobby("Game")
				.build();
		
		System.out.println(user.getUserInfo());
	}
}
