package br.unb.dali.models.agg.exceptions;

public class AggModelConstructionException extends Exception {
	private static final long serialVersionUID = 3071573625912837449L;
	
	public AggModelConstructionException() {
		super("Error when trying to construct a new UnB-DALi Agg Model!");
	}
	
	public AggModelConstructionException(String desc) {
		super(desc);
	}
}