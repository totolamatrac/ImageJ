package programme;

import java.util.ArrayList;

public class User {

	
	private int idUser;
	private String login;
	private String password;
	private String statut;
	private static ArrayList<User> listUser;
	
	//voir instanciation idUser
	public User(String Login, String Password,String Statut)
	{
		this.login = Login;
		this.password = Password;
		this.statut = Statut;
		
		
		listUser.add(this);
	}
	
	//getter
	
	public int getIdUser() {
		return idUser;
	}

	public String getStatut() {
		return statut;
	}

	
	
	//ajout user
	public void CreatUser(String Login,String Password,String Statut) throws Exception
	{
		
		if(this.statut != "admin")
		{
			throw new Exception("Vous n'avez pas les droits admin");
		}
		else {
			new User(Login, Password, Statut);
		}
	}
	
	
	//suprimer un user
	public void deleteUser(int userId) throws Exception
	{
		if(this.statut != "admin")
		{
			throw new Exception("Vous n'avez pas les droitrs admin");
		}
		else
		{
			for(User a : this.listUser)
			{
				if(a.idUser == userId)
				{
					this.listUser.remove(a);
				}
			}
		}
	}
	
}
