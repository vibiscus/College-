public class eleve extends personne{
	int ine;
	float absence=0;
	
	public eleve(String nom, String prenom, int ine){
		super(nom, prenom);
		this.ine=ine;
	}
	
	public eleve(String nom, String prenom,String adresse, String dateNaissance, int ine, float absence){
		super(nom, prenom, adresse, dateNaissance);
		this.ine=ine;
		this.absence=absence;
	}
	
	public String toString(){
		return super.nom+", "+super.prenom+", "+super.dateNaissance+", "+super.adresse+", "+ine+", "+absence;
	}
	

}
