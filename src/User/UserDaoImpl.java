package User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveIntoDB(User user) {
		System.out.println("User data saved into DB");
	}

	@Override
	public boolean validateUser(User user) {
		/*
		 *	Logic to validate login
		 */
		return true;
	}
	
}
