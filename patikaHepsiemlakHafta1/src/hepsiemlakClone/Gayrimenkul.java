package hepsiemlakClone;

public class Gayrimenkul {
	private Long id;
	private String gayrimenkulTuru;
	private String il;
	private String ilce;
	private int alan;
	
	public Gayrimenkul() {
	}
	
	public Gayrimenkul(Long id, String gayrimenkulTuru, String il, String ilce, int alan) {
		this.id = id;
		this.gayrimenkulTuru = gayrimenkulTuru;
		this.il = il;
		this.ilce = ilce;
		this.alan = alan;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGayrimenkulTuru() {
		return gayrimenkulTuru;
	}

	public void setGayrimenkulTuru(String gayrimenkulTuru) {
		this.gayrimenkulTuru = gayrimenkulTuru;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public int getAlan() {
		return alan;
	}

	public void setAlan(int alan) {
		this.alan = alan;
	}
}
