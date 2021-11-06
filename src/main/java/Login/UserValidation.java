package Login;

public class UserValidation {

	public boolean isUserValid(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("abcd") && password.equals("12345")) {
			return true;
		}
		return false;
	}

}
