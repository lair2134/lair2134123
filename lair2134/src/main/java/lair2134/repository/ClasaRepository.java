package lair2134.repository;

import lair2134.main.ClasaException;
import lair2134.model.Corigent;
import lair2134.model.Elev;
import lair2134.model.Medie;
import lair2134.model.Nota;

import java.util.HashMap;
import java.util.List;

public interface ClasaRepository {
	
	public void creazaClasa(List<Elev> elevi, List<Nota> note);
	public HashMap<Elev, HashMap<String, List<Double>>> getClasa();
	public List<Medie> calculeazaMedii() throws ClasaException;
	public void afiseazaClasa();
	public List<Corigent> getCorigenti();
}
