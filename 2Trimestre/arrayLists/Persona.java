package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Persona {

	private String names;
	private String surnames;

	public Persona() {
		this.names = "";
		this.surnames = "";

	}

	public Persona(String names, String surnames) {
		super();
		this.names = names;
		this.surnames = surnames;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSurnames() {
		return this.surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	
	@Override
	public String toString() {
		return this.names + " " +  this.surnames;
	}
	
	
}

	