package entities;

public class Task {
	private int idTask;
	private String title;
	private String description;
	private int createdBy;
	private int designedBy;
	private int implementedBy;
	private int testedBy;
	private int id_Project;
	private int id_Status;
	private int id_Release;
	private int id_Priority;
	
	public Task(){}

	public int getIdTask() {
		return idTask;
	}

	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getDesignedBy() {
		return designedBy;
	}

	public void setDesignedBy(int designedBy) {
		this.designedBy = designedBy;
	}

	public int getImplementedBy() {
		return implementedBy;
	}

	public void setImplementedBy(int implementedBy) {
		this.implementedBy = implementedBy;
	}

	public int getTestedBy() {
		return testedBy;
	}

	public void setTestedBy(int testedBy) {
		this.testedBy = testedBy;
	}

	public int getId_Project() {
		return id_Project;
	}

	public void setId_Project(int id_Project) {
		this.id_Project = id_Project;
	}

	public int getId_Status() {
		return id_Status;
	}

	public void setId_Status(int id_Status) {
		this.id_Status = id_Status;
	}

	public int getId_Release() {
		return id_Release;
	}

	public void setId_Release(int id_Release) {
		this.id_Release = id_Release;
	}

	public int getId_Priority() {
		return id_Priority;
	}

	public void setId_Priority(int id_Priority) {
		this.id_Priority = id_Priority;
	}
	
	
}
