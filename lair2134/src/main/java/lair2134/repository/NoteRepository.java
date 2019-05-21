package lair2134.repository;

import lair2134.main.ClasaException;
import lair2134.model.Nota;

import java.util.List;

public interface NoteRepository {
	
	public void addNota(Nota nota) throws ClasaException;
	public List<Nota> getNote(); 
	public void readNote(String fisier);
	
}
