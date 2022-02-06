package hepsiemlakClone;

import java.util.Date;

public class IlanArsa {
	private Long id;
	private Gayrimenkul gayrimenkul;
	private String baslik;
	private Kullanici kullanici;
	private String[] resimList = new String[5];
	private Integer fiyat;
	private String ilgiliBelediye;
	private Integer parselNo;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;
	
	public IlanArsa() {
		super();
	}

	public IlanArsa(Long id, Gayrimenkul gayrimenkul, String baslik, Kullanici kullanici, String[] resimList, Integer fiyat,
			String ilgiliBelediye, Integer parselNo, int suresi, boolean oneCikarilsinMi, boolean incelendiMi,
			Date olusturulmaTarihi, boolean aktifMi) {
		this.id = id;
		this.gayrimenkul = gayrimenkul;
		this.baslik = baslik;
		this.kullanici = kullanici;
		this.resimList = resimList;
		this.fiyat = fiyat;
		this.ilgiliBelediye = ilgiliBelediye;
		this.parselNo = parselNo;
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

	public String getIlgiliBelediye() {
		return ilgiliBelediye;
	}

	public void setIlgiliBelediye(String ilgiliBelediye) {
		this.ilgiliBelediye = ilgiliBelediye;
	}

	public Integer getParselNo() {
		return parselNo;
	}

	public void setParselNo(Integer parselNo) {
		this.parselNo = parselNo;
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
