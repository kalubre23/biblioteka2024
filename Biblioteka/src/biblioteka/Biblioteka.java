package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	List<Knjiga> knjige = new ArrayList<>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga==null)
			throw new NullPointerException("Knjiga je null!");
		if(knjige.contains(knjiga))
			throw new IllegalArgumentException("Knjiga vec postoji u biblioteci!");
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		//Nije potrebna logicka kontrola ovde, pitanje je dal ocemo tiho da prodje ovo
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		//ne treba logicka kontrola
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, int isbn, String naslov, String izdavac) {
		if(autor==null && isbn<=0 && naslov==null && izdavac==null)
			throw new IllegalArgumentException("Morate uneti bar neki kriterijum pretrage!");
		
		List<Knjiga> result = new ArrayList<>();
		
		for(Knjiga k: knjige) {
			if(k.getNaziv().toLowerCase().contains(naslov.toLowerCase().trim())) {
				result.add(k);
			}
		}
		
		return result;
	}

}
