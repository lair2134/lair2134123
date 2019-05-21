package lair2134.repository;

import lair2134.model.Elev;

import java.util.List;

public interface EleviRepository {
	public void addElev(Elev e);
	public List<Elev> getElevi();
	public void readElevi(String fisier);
}
