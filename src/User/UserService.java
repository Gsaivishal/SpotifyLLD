package User;

import java.util.List;

import Spotify.*;

public interface UserService {
	public User createUser();
	public void login(User user);
}