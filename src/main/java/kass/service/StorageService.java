package kass.service;
import java.util.ArrayList;
import java.util.List;

import kass.domain.Uczen;
public class StorageService {
		
		private List<Uczen> UczenDB = new ArrayList<Uczen>();
		private int idUczen;
	
		
		public List<Uczen> getAllUczen(){
		return UczenDB;
		}
		
		public void dodajUczen(Uczen uczen){
			Uczen newUczen = new Uczen(uczen.getImie(), uczen.getNazwisko(), uczen.getPlec(), uczen.getPesel());
			newUczen.setId(idUczen);
			UczenDB.add(newUczen);
			idUczen=idUczen+1;
		}
		
		public void edytujUczen(Uczen oldUczen, Uczen newUczen){
			int i = 0;
			for (Uczen uczenTEMP : getAllUczen()) {
				if(uczenTEMP.getId() == oldUczen.getId())
					break;
				i++;
			}
			newUczen.setId(oldUczen.getId());
			UczenDB.set(i, newUczen);
		}
		
		
		public void usunUczen(Uczen uczen){
			int i = 0;
			for (Uczen uczenTEMP : getAllUczen()) {
				if(uczenTEMP.getId() == uczen.getId())
					break;
				i++;
			}
			UczenDB.remove(i);
		} 
		
}
