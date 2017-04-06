package pkgException;

import pkgPokerBLL.Hand;

public class HandException extends Exception {
	private Hand h;
	
	public HandException(){
		super();
	}
	public HandException(Hand h){
		super();
		this.h = h;
	}
	
	public Hand getH(){
		return h;
	}

}
