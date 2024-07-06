package User;

public interface UserDao {
	public void saveIntoDB(User user);
	public boolean validateUser(User user);
}
