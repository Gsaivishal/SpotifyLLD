package User;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User createUser() {
		/*
		 * Hard-coding for now. But can get input via command line
		 */
		User user = User.getBuilder().setName("Vishal").setAge(25).setContactNumber("123456789").setNationality("India")
				.setPremiumUser(false).build();
		
		// save user Info into DB
		userDao.saveIntoDB(user);
		
		return user;
	}

	@Override
	public void login(User user) {
		if(userDao.validateUser(user))
			System.out.println("You are now logged into Spotify");
		else
			System.out.println("Invalid creds");
	}

}
