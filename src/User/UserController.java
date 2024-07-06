package User;

public class UserController {
	private UserService userService = new UserServiceImpl();
	
	public User createUser() {
		return userService.createUser();
	}
	
	public void login(User user) {
		userService.login(user);
	}
}
