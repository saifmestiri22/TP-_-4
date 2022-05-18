package Beans;

public class ClientJavaBean {
 public String nom;
 public String prenom;
 public String adresse;
 public int num;
 public String email;
 
public ClientJavaBean() {
	
	nom = "";
	prenom = "";
	adresse = "";
	num = 0;
	email = "";
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

	
	
}
