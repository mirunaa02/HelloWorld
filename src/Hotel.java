
import java.util.ArrayList;
import java.util.List;


public class Hotel implements Cloneable{ //Implementam o interfata care este deja existenta : Cloneable
	
	private List<String> Lista;

	public Hotel()
	{
		this.Lista = new ArrayList<String>(); //Se face o lista noua ,care este goala 
	}
	
	public Hotel(List<String>List)
	{
		this.Lista = List;  //Constructorul de suprascriere a metodei de clonare !
	}
	
	public void ContinutPachet()
	{
		Lista.add("Cazare");
		Lista.add("Mic Dejun");
		Lista.add("Loc Parcare");
		Lista.add("WiFi");
	}
	
	public List<String> Servicii()
	{
		return Lista;
	}
	
	@Override  //Suprascriem metoda de clonare
	public Hotel clone() throws CloneNotSupportedException
	{
		List<String>temp = new ArrayList<String>();
		for(String s : this.Servicii())  //Va copia din Lista in temp
		{
			temp.add(s);  //Introduce in lista temp elementele din lista Lista
		}
		return new Hotel(temp);
	}
}
