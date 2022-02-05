package hepsiemlakClone;

import java.util.Date;

public class Mesaj {
	private Long id;
	private String baslik;
	private String icerigi;
	private Date gonderilenTarih;
	private Date okunduguTarihi;
	private boolean gorulduMu;
	private Kullanici gonderici;
	private Kullanici alici;

	public Mesaj() {
	}

	public Mesaj(Long id, String baslik, String icerigi, Date gonderilenTarih, Date okunduguTarihi, boolean gorulduMu,
			Kullanici gonderici, Kullanici alici) {
		this.id = id;
		this.baslik = baslik;
		this.icerigi = icerigi;
		this.gonderilenTarih = gonderilenTarih;
		this.okunduguTarihi = okunduguTarihi;
		this.gorulduMu = gorulduMu;
		this.gonderici = gonderici;
		this.alici = alici;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public String getIcerigi() {
		return icerigi;
	}

	public void setIcerigi(String icerigi) {
		this.icerigi = icerigi;
	}

	public Date getGonderilenTarih() {
		return gonderilenTarih;
	}

	public void setGonderilenTarih(Date gonderilenTarih) {
		this.gonderilenTarih = gonderilenTarih;
	}

	public Date getOkunduguTarihi() {
		return okunduguTarihi;
	}

	public void setOkunduguTarihi(Date okunduguTarihi) {
		this.okunduguTarihi = okunduguTarihi;
	}

	public boolean isGorulduMu() {
		return gorulduMu;
	}

	public void setGorulduMu(boolean gorulduMu) {
		this.gorulduMu = gorulduMu;
	}

	public Kullanici getGonderici() {
		return gonderici;
	}

	public void setGonderici(Kullanici gonderici) {
		this.gonderici = gonderici;
	}

	public Kullanici getAlici() {
		return alici;
	}

	public void setAlici(Kullanici alici) {
		this.alici = alici;
	}
}
