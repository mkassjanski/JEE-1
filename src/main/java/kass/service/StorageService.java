package kass.service;
import java.util.ArrayList;
import java.util.List;

import kass.domain.Przedmiot;
import kass.domain.Uczen;
public class StorageService {
		
		private List<Uczen> UczenDB = new ArrayList<Uczen>();
		private int idUczen;
	
		private List<Przedmiot> PrzedmiotDB = new ArrayList<Przedmiot>();
		private int idPrzedmiot;
		
		
		
		public List<Uczen> getAllUczen(){
		return UczenDB;
		}
		
		public List<Przedmiot> getAllPrzedmiot(){
			return PrzedmiotDB;
		}
		
		
		public void dodajUczen(Uczen uczen){
			Uczen newUczen = new Uczen(uczen.getImie(), uczen.getNazwisko(), uczen.getPlec(), uczen.getPesel());
			newUczen.setId(idUczen);
			UczenDB.add(newUczen);
			idUczen=idUczen+1;
		}
		
		public void dodajPrzedmiot(Przedmiot przedmiot){
			Przedmiot newPrzedmiot = new Przedmiot(przedmiot.getNazwa(), przedmiot.getTyp(), przedmiot.getGodz());
			newPrzedmiot.setId(idPrzedmiot);
			PrzedmiotDB.add(newPrzedmiot);
			idPrzedmiot=idPrzedmiot+1;
		}
		
		
		public void edytujUczen(Uczen uczen){
			int i = 0;
			for (Uczen uczenTEMP : getAllUczen()) {
				if(uczenTEMP.getId() == uczen.getId())
					break;
				i++;
			}
			UczenDB.set(i, uczen);
		}
		
		
		public void edytujPrzedmiot(Przedmiot przedmiot){
			int i = 0;
			for (Przedmiot przedmiotTEMP : getAllPrzedmiot()) {
				if(przedmiotTEMP.getId() == przedmiot.getId())
					break;
				i++;
			}
			PrzedmiotDB.set(i, przedmiot);
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
		
		public void usunPrzedmiot(Przedmiot przedmiot){
			int i = 0;
			for (Przedmiot przedmiotTEMP : getAllPrzedmiot()) {
				if(przedmiotTEMP.getId() == przedmiot.getId())
					break;
				i++;
			}
			PrzedmiotDB.remove(i);
		} 
		
}
