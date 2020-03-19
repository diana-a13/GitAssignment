package ro.ase.csie.cts.g1074;

import java.awt.Image;
import java.util.Date;

public class User {
	String nume;
	Date data_nasterii;
	String email;
	Image avatar;
	String preferinte;
	
	public User(String nume, Date data_nasterii, String email, Image avatar, String preferinte) {
		super();
		this.nume = nume;
		this.data_nasterii = data_nasterii;
		this.email = email;
		this.avatar = avatar;
		this.preferinte = preferinte;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Date getData_nasterii() {
		return data_nasterii;
	}
	public void setData_nasterii(Date data_nasterii) {
		this.data_nasterii = data_nasterii;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Image getAvatar() {
		return avatar;
	}
	public void setAvatar(Image avatar) {
		this.avatar = avatar;
	}
	public String getPreferinte() {
		return preferinte;
	}
	public void setPreferinte(String preferinte) {
		this.preferinte = preferinte;
	}
}
