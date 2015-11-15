package kass.domain;

public class Przedmiot {
	private int id=0;
	private String nazwa ="";
	private String typ="";
	private int godz;
	
	public Przedmiot(){
		super();
	}
	public Przedmiot(String nazwa, String typ, int godz){
		this.nazwa=nazwa;
		this.typ=typ;
		this.godz=godz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getGodz() {
		return godz;
	}
	public void setGodz(int godz) {
		this.godz = godz;
	}

}
