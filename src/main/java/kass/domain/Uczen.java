package kass.domain;

public class Uczen {
private String imie;
private String nazwisko;
private int pesel;

	public Uczen(){
		super();
	}
	public Uczen(String imie, String nazwisko, int pesel){
		super();
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.pesel=pesel;
	}
	public String getImie(){
		return imie;
	}
	public String getNazwisko(){
		return nazwisko;
	}
	public int getPesel(){
		return pesel;
	}
	public void setImie(String imie){
		this.imie=imie;
	}
	public void setNazwisko(String nazwisko){
		this.nazwisko=nazwisko;
	}
	public void setPesel(int pesel){
		this.pesel=pesel;
	}
}
