package hepsiemlakClone;

import java.util.Date;

public class IlanDaire {
	private Long id;
	private Gayrimenkul gayrimenkul;
	private String baslik;
	private Kullanici kullanici;
	private String[] resimList = new String[5];
	private Integer fiyat;
	private String odaSayisi;
	private String bulunduguKat;
	private Integer aidat;
	private Integer depozito;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;

	public IlanDaire() {
	}

	public IlanDaire(Long id, Gayrimenkul gayrimenkul, String baslik, Kullanici kullanici, String[] resimList, Integer fiyat,
			String odaSayisi, String bulunduguKat, Integer aidat, Integer depozito, int suresi, boolean oneCikarilsinMi,
			boolean incelendiMi, Date olusturulmaTarihi, boolean aktifMi) {
		this.id = id;
		this.gayrimenkul = gayrimenkul;
		this.baslik = baslik;
		this.kullanici = kullanici;
		this.resimList = resimList;
		this.fiyat = fiyat;
		this.odaSayisi = odaSayisi;
		this.bulunduguKat = bulunduguKat;
		this.aidat = aidat;
		this.depozito = depozito;
		this.suresi = suresi;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.incelendiMi = incelendiMi;
		this.olusturulmaTarihi = olusturulmaTarihi;
		this.aktifMi = aktifMi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Gayrimenkul getGayrimenkul() {
		return gayrimenkul;
	}

	public void setGayrimenkul(Gayrimenkul gayrimenkul) {
		this.gayrimenkul = gayrimenkul;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public String[] getResimList() {
		return resimList;
	}

	public void setResimList(String[] resimList) {
		this.resimList = resimList;
	}

	public Integer getFiyat() {
		return fiyat;
	}

	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}

	public String getOdaSayisi() {
		return odaSayisi;
	}

	public void setOdaSayisi(String odaSayisi) {
		this.odaSayisi = odaSayisi;
	}

	public String getBulunduguKat() {
		return bulunduguKat;
	}

	public void setBulunduguKat(String bulunduguKat) {
		this.bulunduguKat = bulunduguKat;
	}

	public Integer getAidat() {
		return aidat;
	}

	public void setAidat(Integer aidat) {
		this.aidat = aidat;
	}

	public Integer getDepozito() {
		return depozito;
	}

	public void setDepozito(Integer depozito) {
		this.depozito = depozito;
	}

	public int getSuresi() {
		return suresi;
	}

	public void setSuresi(int suresi) {
		this.suresi = suresi;
	}

	public boolean isOneCikarilsinMi() {
		return oneCikarilsinMi;
	}

	public void setOneCikarilsinMi(boolean oneCikarilsinMi) {
		this.oneCikarilsinMi = oneCikarilsinMi;
	}

	public boolean isIncelendiMi() {
		return incelendiMi;
	}

	public void setIncelendiMi(boolean incelendiMi) {
		this.incelendiMi = incelendiMi;
	}

	public Date getOlusturulmaTarihi() {
		return olusturulmaTarihi;
	}

	public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
		this.olusturulmaTarihi = olusturulmaTarihi;
	}

	public boolean isAktifMi() {
		return aktifMi;
	}

	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}
}
