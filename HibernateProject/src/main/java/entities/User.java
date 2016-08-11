package entities;

public class User {
	private int idUser;
	private String firstName;
	private String lastName;
	private String userEmail;
	private String password;
	private int role;
	private int team;
	
	public User(){};
	
	public User(String firstName, String lastName, String userEmail, String password, int role, int team){
		this.firstName=firstName;
		this.lastName=lastName;
		this.userEmail=userEmail;
		this.password=password;
		this.role=role;
		this.team=team;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	
}
