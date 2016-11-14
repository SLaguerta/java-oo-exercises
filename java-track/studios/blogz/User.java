package blogz;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class User {

	private String username;
	private String password;
	private static ArrayList<User> allUsers = new ArrayList<User>();

	public User (String username, String userPassword)
	{
		this.username = username;
		this.password = hashPassword(userPassword);
		allUsers.add(this);
	}
	
	private static String hashPassword(String userPassword){
		return userPassword;
	}
	
	private boolean isValidPassword(String password)
	{
		if (password.equals(this.password))
		{
			return true;
		}
		else {
			return false;
		}
	}
	private static boolean isValidUsername(String username)
	{
		boolean valid = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", username);
		if (valid){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList getUsers(){
		return allUsers;
	}
}
