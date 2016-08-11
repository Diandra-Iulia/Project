package entities;

public class Team {

	private int idTeam;
	private String teamName;
	
	public Team(){};
	
	public Team(String teamName){
		this.teamName=teamName;
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
}
