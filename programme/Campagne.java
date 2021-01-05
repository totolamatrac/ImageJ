package programme;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Campagne {

	private int idCampagne;  //rajouter dans diagS
	private String description;
	private String dateCampagne;
	private ArrayList<Essaie> listEssaies;
	
	
	
	//constructeur avec description
	public Campagne(String Description)
	{
		//voir pour instanciattion date automatique et id auto-increment
		this.description = Description;
		this.listEssaies = new ArrayList<Essaie>();
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		this.dateCampagne = s.format(date);
		
	}
	
	public Campagne(String Description, ArrayList<Essaie> ListEssaies)
	{
		this.description = Description;
		this.listEssaies = ListEssaies;
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		this.dateCampagne = s.format(date);
	}
	

	//getter/setter
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	

	public ArrayList<Essaie> getListEssaies() {
		return listEssaies;
	}


	public int getIdCampagne() {
		return idCampagne;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDate() {
		// TODO Auto-generated method stub
		return this.dateCampagne;
	}
	
	
	//methode supp un essaie d'une campagne si statut user est responsable voir avec equipe 
	public void removeEssaie(int idEssaie , String statutUser)
	{
		if(statutUser == "responsable")
		{
			for(Essaie a : this.listEssaies )
			{
				if(a.getIdEssaie() == idEssaie)
				{
					this.listEssaies.remove(a);
				}
			}
		}
	}
	
	// ajout un essaie à la campagne
	public void addEssaie(Essaie a ) throws Exception 
	{
		for(Essaie b : this.listEssaies)
		{
			if(a.getIdEssaie() == b.getIdEssaie())
			{
				throw new Exception("Essaie est deja dans la campagne");
			}
			
		}
		this.listEssaies.add(a);
	}
	
	//renvoie le nombre d'essaie de la campagne
	public int getNbEssaieCampagne(int idCampagne)
	{
		if(this.listEssaies.size() == 0)
		{
			return 0;
		}
		else
		{
			return this.listEssaies.size();
		}
	}
	
	//moyenne du nombre de cellules par essaie de la campagne
	public Double getMoyCellulesEssaie()
	{
		Double resultat = 0.0;
		
		resultat = this.getNmCellulesCampagne() / this.listEssaies.size();
	return resultat;
	}
	
	
	//nombre cellules de la campagne
	public Double getNmCellulesCampagne()
	{
		Double resultat = 0.0;
		for(Essaie a : this.listEssaies)
		{
			resultat += a.getNbCellulesEssaie();
		}
		return resultat;
	}
	
	//renvoie le nombre total d'image de la campagne
	public int getNbImagesCampagne()
	{
		int resultat = 0;
		
		for(Essaie a : this.listEssaies)
		{
			resultat += a.getNbImagesEssaie();
		}
		return resultat;
	}
	
	
	
	
}
