package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	List<Knjiga> knjige = new ArrayList<>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, int isbn, String naslov, String izdavac) {
		if(autor==null && isbn<0 && naslov==null && izdavac==null)
			return null;
		
		List<Knjiga> result = new ArrayList<>();
		
		for(Knjiga k: knjige) {
			if(k.getNaziv().toLowerCase().contains(naslov.toLowerCase().trim())) {
				result.add(k);
			}
		}
		
		return result;
	}

}
