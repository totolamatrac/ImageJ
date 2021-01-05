package programme;
import java.text.SimpleDateFormat;
/**programme.Image
 * @author thomas
 * 
 */
import java.util.ArrayList;
import java.util.Date;





public class Image  {
	
	
	private static int count = 0;
	private int idImage;
	private String dateImage;
	private String heure;
	private static ArrayList<TripletPosition<Double,Double,Double>> position;
	
	
	//constructeur
	
	public Image()
	{
		
		//faire instanciation  idImage
		this.position = new ArrayList<TripletPosition<Double ,Double,Double>>();
		
		this.idImage = count++;
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		this.dateImage = s.format(date);
		
		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss");
		this.heure = d.format(date);
	
	/* 
	 * requete update pour création d'une image, 
	 * par defaut parametre description ,
	 * heure et date automatique prendre variable programme,
	 * 
	 */
	}
	
	
	//getter et setter
	
	public int getIdImage() {
		return idImage;
	}


	public ArrayList<TripletPosition<Double, Double, Double>> getPosition() {
		return position;
	}

	
	//methodes 

	
	//renvoie date de l'import de l'image
	
	public String getDateImage() {
		
		/*
		 * requette executeQuery renvoie date importation image 
		 */
		
		return this.dateImage;
	}

	

	
	public String getHeure() {
		
		/*
		 * requette executeQuery renvoie heure de l'import de l'image de objet en cours id = this.idImage
		 */
		
		return heure;
	}

	//renvoie le nombre de cellule d'une image
	public Double getNbrCellulesImage() {
		
		Double resultat = 0.0;
		
		for(TripletPosition<Double, Double, Double> a : this.position)
		{
			resultat += a.getZ();
		}
			
		
		return resultat ;
	}



	//renvoie les infos d'une cellule d'apres sa position
	public TripletPosition<Double, Double, Double> getInfosCellule(Double x,Double y) throws Exception
	{
		 TripletPosition<Double, Double, Double> resultat = null;
		
		for(int i = 0; i< this.position.size() ; i++)
		{
			if(this.position.get(i).getX() == x && this.position.get(i).getY() == y)
			{
				return resultat = this.position.get(i);
			}
			
			
		}
		
		throw new Exception("pas de cellules a cette position");
	}



	//renvoie la position et le nombre de cellule de tous les points
	public ArrayList<TripletPosition<Double, Double, Double>> getInfosCellules() {
		
		return this.position;
	}
	
	
	
	
		

	
}
