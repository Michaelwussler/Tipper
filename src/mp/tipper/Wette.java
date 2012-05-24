package mp.tipper;

public class Wette 
{
	int kategorie;
	int spiel;
	String kurzbeschreibung;
	String langbeschreibung;
	String optionen;
	long wettschluss;
	int[] einsatz;
	int[] kurs;
	public int getKategorie() {
		return kategorie;
	}
	public void setKategorie(int kategorie) {
		this.kategorie = kategorie;
	}
	public int getSpiel() {
		return spiel;
	}
	public void setSpiel(int spiel) {
		this.spiel = spiel;
	}
	public String getKurzbeschreibung() {
		return kurzbeschreibung;
	}
	public void setKurzbeschreibung(String kurzbeschreibung) {
		this.kurzbeschreibung = kurzbeschreibung;
	}
	public String getLangbeschreibung() {
		return langbeschreibung;
	}
	public void setLangbeschreibung(String langbeschreibung) {
		this.langbeschreibung = langbeschreibung;
	}
	public String getOptionen() {
		return optionen;
	}
	public void setOptionen(String optionen) {
		this.optionen = optionen;
	}
	public long getWettschluss() {
		return wettschluss;
	}
	public void setWettschluss(long wettschluss) {
		this.wettschluss = wettschluss;
	}
	public int[] getEinsatz() {
		return einsatz;
	}
	public void setEinsatz(int[] einsatz) {
		this.einsatz = einsatz;
	}
	public int[] getKurs() {
		return kurs;
	}
	public void setKurs(int[] kurs) {
		this.kurs = kurs;
	}
	
	
	public boolean setzen(int[] einsatz)
	{
		return false;
	}
	
	public boolean update()
	{
		return false;
	}
	
	

}
