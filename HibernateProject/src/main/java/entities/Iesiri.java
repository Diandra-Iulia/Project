package entities;

import java.util.Date;

public class Iesiri {

	private int idRelease;
	private Date data;
	private String versiune;
	private int project;
	
	public Iesiri(){}
	public Iesiri(Date date, String version, int project){
		this.data=date;
		this.versiune=version;
		this.project=project;
	}
	public int getIdRelease() {
		return idRelease;
	}
	public void setIdRelease(int idRelease) {
		this.idRelease = idRelease;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getVersiune() {
		return versiune;
	}
	public void setVersiune(String versiune) {
		this.versiune = versiune;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	
}
