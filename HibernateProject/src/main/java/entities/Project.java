package entities;

public class Project {

	private int idProject;
	private String projectTitle;
	private String description;
	private int projectManager;
	
	public Project(){};
	
	public Project(String projectTitle, String description, int projectManager){
		this.projectTitle=projectTitle;
		this.description=description;
		this.projectManager=projectManager;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(int projectManager) {
		this.projectManager = projectManager;
	}
	
	
}
