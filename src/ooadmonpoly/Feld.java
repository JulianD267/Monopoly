package ooadmonpoly;

import java.util.Vector;

public abstract class Feld {
	private int _wert;
	public Brett _besteht_aus;
	public Vector<Spielfigur> _steht_auf = new Vector<Spielfigur>();
}