package claseJoaco;

public class NotValidAgeException extends Exception{
	public NotValidAgeException() {
		super("Age < 0");
	}
}
