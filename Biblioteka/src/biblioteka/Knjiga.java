package biblioteka;

import java.util.List;
import java.util.Objects;

public class Knjiga {

	private String naziv;
	private List<Autor> autori;
	private int izdanje;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	@Override
	public String toString() {
		return "Knjiga [naziv=" + naziv + ", autori=" + autori + ", izdanje=" + izdanje + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(izdanje);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return izdanje == other.izdanje;
	}
	

}
