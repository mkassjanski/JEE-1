package kass.domain;

public class Uczen {
private int id=0;
private String imie ="";
private String nazwisko="";
private String plec="";
private long pesel;

	public Uczen(){
		super();
	}
	public Uczen(String imie, String nazwisko, String plec, long pesel){
		super();
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.pesel=pesel;
		this.plec=plec;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImie(){
		return imie;
	}
	public String getNazwisko(){
		return nazwisko;
	}
	public long getPesel(){
		return pesel;
	}
	public void setImie(String imie){
		this.imie=imie;
	}
	public void setNazwisko(String nazwisko){
		this.nazwisko=nazwisko;
	}
	public void setPesel(long pesel){
		this.pesel=pesel;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
}
