package es.uned.master.java.kwic.basico;

public class KwicException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public KwicException(){
		super("Kwic Excepcion:\n");
	}
	public KwicException(String str){
		super("Kwic Excepcion:\n"+str);
	}
}