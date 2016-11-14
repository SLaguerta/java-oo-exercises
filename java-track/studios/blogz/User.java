package blogz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class User extends Entity {

	private String username;
	private String password;
	private static ArrayList<User> allUsers = new ArrayList<User>();

	public User (String username, String userPassword)
	{
		super();
		this.username = username;
		this.password = hashPassword(userPassword);
		allUsers.add(this);
	}
	
	private static String hashPassword(String userPassword){
		return userPassword;
	}
	
	public boolean isValidPassword(String password)
	{
		if (password.equals(this.password))
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isValidUsername(String username)
	{
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		boolean b = m.matches();
		
		if (b == false){
			throw new IllegalArgumentException();
		}
		else {
			return b;
		}
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public static ArrayList getUsers(){
		return allUsers;
	}
	
	public static void main(String[] args){
		User a = new User ("Sandra", "yourface");
		User b = new User ("Morgan", "yourmom");
		a.isValidPassword("yourface");
		a.isValidUsername(a.username);
		for (int i=0; i<User.getUsers().size(); i++){
			System.out.println(((User) User.getUsers().get(i)).getUsername());
			}
	}
}
