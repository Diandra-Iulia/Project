package entities;

public class Role {
	private int idRole;
	private int manager;
	private int admin;
	private int user;
	
	public Role(){}
	
	public Role(int manager, int admin, int user){
		this.manager=manager;
		this.admin=admin;
		this.user=user;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}
	
}
