
public class OSistem {
	private Tip tip;
	private int verzija;
	public OSistem() {
		super();
	tip=tip.ANDROID;
	verzija=1;
	}
	public OSistem(Tip tip, int verzija) {
		super();
		this.tip = tip;
		this.verzija = verzija;
	}
	public int getVerzija() {
		return verzija;
	}
	public void setVerzija(int verzija) {
		this.verzija = verzija;
	}
	public Tip getTip() {
		return tip;
	}
	@Override
	public String toString() {
		return "Tip operativnog sistema je " + tip + ", a verzija je " + verzija;
	}
	
}
