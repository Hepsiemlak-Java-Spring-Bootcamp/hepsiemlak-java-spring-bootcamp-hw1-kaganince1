package hepsiemlakClone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kullanici {
	private Long id;
	private String isim;
	private String soyisim;
	private String email;
	private String sehir;
	private String ilce;
	private String mahalle;
	private String adres;
	private String telefonNo;
	private List<Mesaj> mesajKutusu;
	private Set<IlanDaire> favoriDaireIlanlar = new HashSet<>();
	private List<IlanDaire> yayinladigiDaireIlanlar = new ArrayList<>();
	private Set<IlanArsa> favoriArsaIlanlar = new HashSet<>();
	private List<IlanArsa> yayinladigiArsaIlanlar = new ArrayList<>();

	public Kullanici() {
		
	}

	public Kullanici(Long id, String isim, String soyisim, String email, String sehir, String ilce, String mahalle,
			String adres, String telefonNo, List<Mesaj> mesajKutusu, Set<IlanDaire> favoriDaireIlanlar,
			List<IlanDaire> yayinladigiDaireIlanlar, Set<IlanArsa> favoriArsaIlanlar,
			List<IlanArsa> yayinladigiArsaIlanlar) {
		super();
		this.id = id;
		this.isim = isim;
		this.soyisim = soyisim;
		this.email = email;
		this.sehir = sehir;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.adres = adres;
		this.telefonNo = telefonNo;
		this.mesajKutusu = mesajKutusu;
		this.favoriDaireIlanlar = favoriDaireIlanlar;
		this.yayinladigiDaireIlanlar = yayinladigiDaireIlanlar;
		this.favoriArsaIlanlar = favoriArsaIlanlar;
		this.yayinladigiArsaIlanlar = yayinladigiArsaIlanlar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public List<Mesaj> getMesajKutusu() {
		return mesajKutusu;
	}

	public void setMesajKutusu(List<Mesaj> mesajKutusu) {
		this.mesajKutusu = mesajKutusu;
	}

	public Set<IlanDaire> getFavoriDaireIlanlar() {
		return favoriDaireIlanlar;
	}

	public void setFavoriDaireIlanlar(Set<IlanDaire> favoriDaireIlanlar) {
		this.favoriDaireIlanlar = favoriDaireIlanlar;
	}

	public List<IlanDaire> getYayinladigiDaireIlanlar() {
		return yayinladigiDaireIlanlar;
	}

	public void setYayinladigiDaireIlanlar(List<IlanDaire> yayinladigiDaireIlanlar) {
		this.yayinladigiDaireIlanlar = yayinladigiDaireIlanlar;
	}

	public Set<IlanArsa> getFavoriArsaIlanlar() {
		return favoriArsaIlanlar;
	}

	public void setFavoriArsaIlanlar(Set<IlanArsa> favoriArsaIlanlar) {
		this.favoriArsaIlanlar = favoriArsaIlanlar;
	}

	public List<IlanArsa> getYayinladigiArsaIlanlar() {
		return yayinladigiArsaIlanlar;
	}

	public void setYayinladigiArsaIlanlar(List<IlanArsa> yayinladigiArsaIlanlar) {
		this.yayinladigiArsaIlanlar = yayinladigiArsaIlanlar;
	}
}
