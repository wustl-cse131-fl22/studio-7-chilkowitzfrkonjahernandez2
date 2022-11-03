package studio7;

public class Die {
	private int n;
	
	public Die(int initN) {
		n = initN;
	}
	
	public int dieThrown() {
		return (int)(Math.random()*(n-1))+1;
	}
	
}

