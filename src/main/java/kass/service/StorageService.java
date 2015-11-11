package kass.service;
import java.util.ArrayList;
import java.util.List;

import kass.domain.Uczen;
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
