package entities;

public class Priority {
	
	private int idPriority;
	private String priorityType;
	
	public Priority(){}
	public Priority(String priorityType){
		this.priorityType=priorityType;
	}
	public int getIdPriority() {
		return idPriority;
	}
	public void setIdPriority(int idPriority) {
		this.idPriority = idPriority;
	}
	public String getPriorityType() {
		return priorityType;
	}
	public void setPriorityType(String priorityType) {
		this.priorityType = priorityType;
	}
	
	
}
