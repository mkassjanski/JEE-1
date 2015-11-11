package resources.service;
import resources.domain;
import java.util.ArrayList;
import java.util.List;
public class StorageService {
	private List<Uczen> db = new ArrayList<Uczen>();
	public void add(Uczen uczen){
		Uczen newUczen = new Uczen(uczen.getImie(), uczen.getNazwisko(), uczen.getPesel());
		db.add(newUczen);
		}
		public List<Uczen> getAllUczen(){
		return db;
		}
}
