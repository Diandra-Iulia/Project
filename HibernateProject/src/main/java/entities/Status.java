package entities;

public class Status {
	private int idStatus;
	private String statusType;
	
	public Status(){}
	public Status(String statusType){
		this.statusType=statusType;
	}
	
	
	public int getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	
}
