package ro.ase.csie.cts.g1074;

import java.awt.Image;
import java.util.Date;

public class User implements Autentificabil {
	String nume;
	Date data_nasterii;
	String email;
	Image avatar;
	String preferinte;
	String parola;

	public User() {
		super();
	}

	public User(String nume, Date data_nasterii, String email, Image avatar, String preferinte, String parola) {
		super();
		this.nume = nume;
		this.data_nasterii = data_nasterii;
		this.email = email;
		this.avatar = avatar;
		this.preferinte = preferinte;
		this.parola = parola;
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

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	@Override
	public void login(String email, String parola) {
		System.out.println("Utilizatorul s-a logat folosind emailul " + email + " si parola " + parola);

	}
}
