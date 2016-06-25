import java.util.ArrayList;


public class classe {
	private ArrayList<eleve> eleves = new ArrayList<eleve>();
	String profPrincipal;
	int niveau;
	String nomClasse;
	
	public void ajoutEleve(eleve a){
		eleves.add(a);
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(eleve a: eleves){
			s.append(a.toString()).append("\n");
		}
		return s.toString();
	}
	
	

}
