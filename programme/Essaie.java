package programme;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class Essaie {
	
	private static int count = 0;
	private int idEssaie;
	private ArrayList<Image> listImages;
	private String description;
	private String dateEssaie;
	
	//constructeur avec description 
	
	public Essaie(String Description)
	{
		//voir instanciation de date et id automatic? 
		this.listImages = new ArrayList<Image>();
		this.description = Description;
		this.idEssaie = count ++; // voir pour une list static d'objet pour gerer les id dynamiquement 
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		this.dateEssaie = s.format(date);
		
		/*
		 * reqette update pour crée un essaie avec "deeescription" en parametre, date et heure a prendre  
		 */
		
	}
	
	public Essaie (String description, ArrayList<Image> ListImages)
	{
		this.description = description;
		this.listImages = ListImages;
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		this.dateEssaie = s.format(date);
		
		/*
		 *  requette upadate création d'un essaie avec description, un groupe d'image a analysé et heur/date
		 */
	}
	
	//getter/setter
	
	public String getDescription() {
		
		/*
		 * requette executeQuery avec idEssaie = this.id et renvoie description de l'essaie 
		 * 
		 */
		
		return this.description;
	}

	
	public void setDescription(String description) {
		
		/*
		 * requette update pour modifier description d'un essaie (this.id)
		 */
		
		this.description = description;
	}

	
	public int getIdEssaie() {
		
		/*
		 * requette executeQuery renvoie id de l'essaie 
		 */
		
		return idEssaie;
	}

	//renvoie date de création de l'esssaie 
		public String getDateEssaie() {
			
			
			
			return this.dateEssaie;
		}

		
		
		
		//methodes
	
		//ajout une image a l'essaie
	public void ajoutImage(Image a ) //pas sur du parametre 
	{
		
		for(int i = 0;i<this.listImages.size();i++ )
		{
			
			if(listImages.get(i).equals(a))
			{
				Exception e = new Exception("image deja dans l'essaie");
				System.out.println(e);
			}
			
			else
			{
				this.listImages.add(a);
			}
		}	
	}

	//methode supp une image d'un essaie
	public void removeImage(int idImage,String statutUser)
	{
		if(statutUser == "responsable")
		{
			for(Image a : this.listImages)
			{
				if(a.getIdImage() == idImage )
				{
					this.listImages.remove(a);
				}
			}
		}
		
	}

	

	
	//renvoie la desciption de l'essaie
	public String getDesciptionEssaie() {
		return this.description;
	}

	
	// renvoie stat du nombre d'images de l'essaie
	public int getNbImagesEssaie() {
		
		if(this.listImages.size() == 0)
		{
			return 0;
		}
		else
		{
			return this.listImages.size();
		}
	}

	

	// renvoie le nombre total de cellule de l'essaie
	public Double getNbCellulesEssaie() {
		
		Double resultat = 0.0;
		
		for(Image a : this.listImages)
		{
			resultat += a.getNbrCellulesImage();
		}
		return resultat;
	}

	//renvoie la moyenne de cellule de l'essaie
	public double getMoyNbCellules() {
		
		Double resultat = 0.0;
		resultat = this.getNbCellulesEssaie() / this.listImages.size();
		
		return resultat;
	}
	
	
	//revoir interface admin avec equipe
	
	public void ModifyDescriptionEssaie(String description, String statutUser) throws Exception 
	{
		
		if(statutUser == "responsable") 
		{
			this.description = description;
		} throw new Exception( "Vous n'ete pas autortisé à modifier ce champs " ) ;
	}
	
	
	
	
}


