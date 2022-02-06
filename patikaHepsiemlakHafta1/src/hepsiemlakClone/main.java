package hepsiemlakClone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		List<Kullanici> kullanicilar = kullaniciYarat();
		List<IlanDaire> ilanDaireler = ilanDaireYarat(kullanicilar);
		List<IlanArsa> ilanArsalar = ilanArsaYarat(kullanicilar);
		List<Mesaj> mesajlar = mesajYarat(kullanicilar);
		
		System.out.println("Istanbulda 2+1 ve 3+1 olup fiyatý 3000'den az olanlar:");
		for(int i = 0; i < ilanDaireler.size(); i++) {
			if(ilanDaireler.get(i).getGayrimenkul().getIl().equals("Istanbul")) {
				if((ilanDaireler.get(i).getOdaSayisi().equals("2+1") || ilanDaireler.get(i).getOdaSayisi().equals("3+1")) && ilanDaireler.get(i).getFiyat() < 3000) {
					System.out.println("Ilan Basligi: " + ilanDaireler.get(i).getBaslik());
					System.out.println("Ilan Sehri: " + ilanDaireler.get(i).getGayrimenkul().getIl());
					System.out.println("Ilan Fiyati: " + ilanDaireler.get(i).getFiyat());
					System.out.println("Ilan Oda Sayisi: " + ilanDaireler.get(i).getOdaSayisi());
					System.out.println("----------------------------------------------------");
				}
			}
		}
		System.out.println("\n\n" + "Sistemde bulunan butun mesajlar:");
		for(int i = 0; i < mesajlar.size(); i++) {
			System.out.println("Mesaj Basligi: " + mesajlar.get(i).getBaslik());
			System.out.println("Mesaji gonderen: " + mesajlar.get(i).getGonderici().getIsim() + " " + mesajlar.get(i).getGonderici().getSoyisim());
			System.out.println("Mesaj alicisi: " + mesajlar.get(i).getAlici().getIsim() + " " + mesajlar.get(i).getAlici().getSoyisim());
			System.out.println("----------------------------------------------------");
		}
		
		Set<IlanDaire> ayseFavoriDaireIlanlar = new HashSet<>();
		ayseFavoriDaireIlanlar.add(ilanDaireler.get(2));
		ayseFavoriDaireIlanlar.add(ilanDaireler.get(5));
		ayseFavoriDaireIlanlar.add(ilanDaireler.get(11));
		kullanicilar.get(0).setFavoriDaireIlanlar(ayseFavoriDaireIlanlar);
		System.out.println("\n\n" + "ayse.sari@gmail.com emailine sahip kullanicinin favori ilanlarý:");
		for(int i = 0; i < kullanicilar.size(); i++) {
			if(kullanicilar.get(i).getEmail().equals("ayse.sari@gmail.com")) {
				Set<IlanDaire> favoriDaireIlanlar = kullanicilar.get(i).getFavoriDaireIlanlar();
				for(IlanDaire ilanDaire : favoriDaireIlanlar) {
					System.out.println("Ilan Basligi: " + ilanDaire.getBaslik() + "\n" + "Ilan Sehri: " + ilanDaire.getGayrimenkul().getIl() + "\n" +
										"Ilan Fiyati: " + ilanDaire.getFiyat() + "\n" + "Ilan Oda Sayisi: " + ilanDaire.getOdaSayisi());
					System.out.println("----------------------------------------------------");
				}
			}
		}
		
		System.out.println("\n\n" + "***BONUS***" + "\n" + "Fiyatý 4000 üstü olan arsalar:");
		for(int i = 0; i < ilanArsalar.size(); i++) {
			if(ilanArsalar.get(i).getFiyat() > 4000) {
				System.out.println("Ilan Basligi: " + ilanArsalar.get(i).getBaslik());
				System.out.println("Ilan Sehri: " + ilanArsalar.get(i).getGayrimenkul().getIl());
				System.out.println("Ilan Fiyati: " + ilanArsalar.get(i).getFiyat());
				System.out.println("Ilan Parsel No: " + ilanArsalar.get(i).getParselNo());
				System.out.println("----------------------------------------------------");
			}
		}
	}

	private static List<Mesaj> mesajYarat(List<Kullanici> kullanicilar) {
		List<Mesaj> mesajlar = new ArrayList<>();
		Mesaj mesaj1 = new Mesaj(1L, "Kiralik daire", "Pazarlik olur mu", null, null, false, kullanicilar.get(0), kullanicilar.get(1));
		Mesaj mesaj2 = new Mesaj(2L, "Kelepir daire", "Pazarlik nasýl olur", null, null, false, kullanicilar.get(1), kullanicilar.get(0));
		Mesaj mesaj3 = new Mesaj(3L, "Satilik arsa", "Pazarlik olmazsa olur mu", null, null, false, kullanicilar.get(0), kullanicilar.get(2));
		Mesaj mesaj4 = new Mesaj(4L, "Kelepir arsa", "Pazarlik olsa guzel olur", null, null, false, kullanicilar.get(2), kullanicilar.get(1));
		Mesaj mesaj5 = new Mesaj(5L, "Sahibinden daire", "Pazarlik olmasa da olur", null, null, false, kullanicilar.get(1), kullanicilar.get(2));
		Mesaj mesaj6 = new Mesaj(6L, "Doktordan daire", "Pazarlik candýr", null, null, false, kullanicilar.get(2), kullanicilar.get(0));
		mesajlar.add(mesaj1);
		mesajlar.add(mesaj2);
		mesajlar.add(mesaj3);
		mesajlar.add(mesaj4);
		mesajlar.add(mesaj5);
		mesajlar.add(mesaj6);
		return mesajlar;
	}

	private static List<Kullanici> kullaniciYarat() {
		List<Kullanici> kullanicilar = new ArrayList<>();
		Kullanici kullanici1 = new Kullanici(1L, "Ayse", "Sari", "ayse.sari@gmail.com", "Istanbul", "Umreniye", "Oturanlar",
				"adres1", "5555555555", null, null, null, null, null);
		Kullanici kullanici2 = new Kullanici(2L, "Kagan", "Ince", "kagan.ince@gmail.com", "Antalya", "Konyaalti", "Ogretmenevleri",
				"adres2", "5555555555", null, null, null, null, null);
		Kullanici kullanici3 = new Kullanici(3L, "Ramazan", "Kalin", "ramazan.kalin@gmail.com", "Ankara", "Eryaman", "Kalkanlar",
				"adres3", "5555555555", null, null, null, null, null);
		kullanicilar.add(kullanici1);
		kullanicilar.add(kullanici2);
		kullanicilar.add(kullanici3);
		return kullanicilar;
	}
	
	private static List<IlanDaire> ilanDaireYarat(List<Kullanici> kullanicilar) {
		List<IlanDaire> ilanDaireler = new ArrayList<>();
		Gayrimenkul gayrimenkul1 = new Gayrimenkul(1L, "Daire", "Istanbul", "Kucuk cekmece", 120);
		Gayrimenkul gayrimenkul2 = new Gayrimenkul(2L, "Daire", "Istanbul", "Buyuk cekmece", 130);
		Gayrimenkul gayrimenkul3 = new Gayrimenkul(3L, "Daire", "Istanbul", "Cekme koy", 140);
		Gayrimenkul gayrimenkul4 = new Gayrimenkul(4L, "Daire", "Antalya", "Konyaalti", 125);
		Gayrimenkul gayrimenkul5 = new Gayrimenkul(5L, "Daire", "Antalya", "Kepez", 135);
		Gayrimenkul gayrimenkul6 = new Gayrimenkul(6L, "Daire", "Antalya", "Muratpasa", 145);
		IlanDaire ilanDaire1 = new IlanDaire(1L, gayrimenkul1, "Hepsiemlaktan halka", kullanicilar.get(0), makeResimList(), 1300, "2+1", "3", 100, 1300, 30, false, false, null, true);
		IlanDaire ilanDaire2 = new IlanDaire(2L, gayrimenkul1, "Hepsiemlaktan hasana", kullanicilar.get(0), makeResimList(), 6000, "3+1", "2", 200, 1400, 30, false, false, null, true);
		IlanDaire ilanDaire3 = new IlanDaire(3L, gayrimenkul2, "Hepsiemlaktan memete", kullanicilar.get(0), makeResimList(), 1500, "4+1", "1", 300, 1500, 30, false, false, null, true);
		IlanDaire ilanDaire4 = new IlanDaire(4L, gayrimenkul2, "Hepsiemlaktan kagana", kullanicilar.get(0), makeResimList(), 2999, "3+1", "4", 100, 1600, 30, false, false, null, true);
		IlanDaire ilanDaire5 = new IlanDaire(5L, gayrimenkul3, "Hepsiemlaktan ayseye", kullanicilar.get(1), makeResimList(), 1700, "1+1", "5", 100, 1700, 30, false, false, null, true);
		IlanDaire ilanDaire6 = new IlanDaire(6L, gayrimenkul3, "Hepsiemlaktan aybukeye", kullanicilar.get(1), makeResimList(), 1800, "2+1", "3", 200, 1800, 30, false, false, null, true);
		IlanDaire ilanDaire7 = new IlanDaire(7L, gayrimenkul4, "Hepsiemlaktan minireye", kullanicilar.get(1), makeResimList(), 1900, "3+1", "5", 300, 1900, 30, false, false, null, true);
		IlanDaire ilanDaire8 = new IlanDaire(8L, gayrimenkul4, "Hepsiemlaktan isaya", kullanicilar.get(1), makeResimList(), 3000, "4+1", "1", 500, 3000, 30, false, false, null, true);
		IlanDaire ilanDaire9 = new IlanDaire(9L, gayrimenkul5, "Hepsiemlaktan cihana", kullanicilar.get(2), makeResimList(), 1750, "4+1", "7", 400, 3100, 30, false, false, null, true);
		IlanDaire ilanDaire10 = new IlanDaire(10L, gayrimenkul5, "Hepsiemlaktan ilhana", kullanicilar.get(2), makeResimList(), 3200, "1+1", "4", 300, 3200, 30, false, false, null, true);
		IlanDaire ilanDaire11= new IlanDaire(11L, gayrimenkul6, "Hepsiemlaktan mustafaya", kullanicilar.get(2), makeResimList(), 3300, "2+1", "2", 100, 3300, 30, false, false, null, true);
		IlanDaire ilanDaire12 = new IlanDaire(12L, gayrimenkul6, "Hepsiemlaktan batuya", kullanicilar.get(2), makeResimList(), 3400, "3+1", "1", 200, 3400, 30, false, false, null, true);
		ilanDaireler.add(ilanDaire1);
		ilanDaireler.add(ilanDaire2);
		ilanDaireler.add(ilanDaire3);
		ilanDaireler.add(ilanDaire4);
		ilanDaireler.add(ilanDaire5);
		ilanDaireler.add(ilanDaire6);
		ilanDaireler.add(ilanDaire7);
		ilanDaireler.add(ilanDaire8);
		ilanDaireler.add(ilanDaire9);
		ilanDaireler.add(ilanDaire10);
		ilanDaireler.add(ilanDaire11);
		ilanDaireler.add(ilanDaire12);
		return ilanDaireler;
	}
	
	private static List<IlanArsa> ilanArsaYarat(List<Kullanici> kullanicilar) {
		List<IlanArsa> ilanArsalar = new ArrayList<>();
		Gayrimenkul gayrimenkul1 = new Gayrimenkul(1L, "Arsa", "Istanbul", "Kucuk cekmece", 150);
		Gayrimenkul gayrimenkul2 = new Gayrimenkul(2L, "Arsa", "Istanbul", "Buyuk cekmece", 160);
		Gayrimenkul gayrimenkul3 = new Gayrimenkul(3L, "Arsa", "Istanbul", "Cekme koy", 170);
		Gayrimenkul gayrimenkul4 = new Gayrimenkul(4L, "Arsa", "Antalya", "Konyaalti", 125);
		Gayrimenkul gayrimenkul5 = new Gayrimenkul(5L, "Arsa", "Antalya", "Kepez", 135);
		Gayrimenkul gayrimenkul6 = new Gayrimenkul(6L, "Arsa", "Antalya", "Muratpasa", 145);
		IlanArsa ilanArsa1 = new IlanArsa(1L, gayrimenkul1, "Hepsiemlaktan arsa halka", kullanicilar.get(0), makeResimList(), 1300, "Kartal", 12345, 30, false, false, null, true);
		IlanArsa ilanArsa2 = new IlanArsa(2L, gayrimenkul1, "Hepsiemlaktan arsa hasana", kullanicilar.get(0), makeResimList(), 1400, "Kartal", 12346, 30, false, false, null, true);
		IlanArsa ilanArsa3 = new IlanArsa(3L, gayrimenkul2, "Hepsiemlaktan arsa memete", kullanicilar.get(0), makeResimList(), 4500, "Eminonu", 12347, 30, false, false, null, true);
		IlanArsa ilanArsa4 = new IlanArsa(4L, gayrimenkul2, "Hepsiemlaktan arsa kagana", kullanicilar.get(0), makeResimList(), 1600, "Eminonu", 32131, 30, false, false, null, true);
		IlanArsa ilanArsa5 = new IlanArsa(5L, gayrimenkul3, "Hepsiemlaktan arsa ayseye", kullanicilar.get(1), makeResimList(), 1700, "Besiktas", 45678, 30, false, false, null, true);
		IlanArsa ilanArsa6 = new IlanArsa(6L, gayrimenkul3, "Hepsiemlaktan arsa aybukeye", kullanicilar.get(1), makeResimList(), 18000, "Kadikoy", 44422, 30, false, false, null, true);
		IlanArsa ilanArsa7 = new IlanArsa(7L, gayrimenkul4, "Hepsiemlaktan arsa minireye", kullanicilar.get(1), makeResimList(), 1900, "Kadikoy", 98765, 30, false, false, null, true);
		IlanArsa ilanArsa8 = new IlanArsa(8L, gayrimenkul4, "Hepsiemlaktan arsa isaya", kullanicilar.get(1), makeResimList(), 3000, "Konyaalti", 98768, 30, false, false, null, true);
		IlanArsa ilanArsa9 = new IlanArsa(9L, gayrimenkul5, "Hepsiemlaktan arsa cihana", kullanicilar.get(2), makeResimList(), 7000, "Kepez", 99999, 30, false, false, null, true);
		IlanArsa ilanArsa10 = new IlanArsa(10L, gayrimenkul5, "Hepsiemlaktan arsa ilhana", kullanicilar.get(2), makeResimList(), 3200, "Konyaalti", 88888, 30, false, false, null, true);
		IlanArsa ilanArsa11= new IlanArsa(11L, gayrimenkul6, "Hepsiemlaktan arsa mustafaya", kullanicilar.get(2), makeResimList(), 3300, "Muratpasa", 76543, 30, false, false, null, true);
		IlanArsa ilanArsa12 = new IlanArsa(12L, gayrimenkul6, "Hepsiemlaktan arsa batuya", kullanicilar.get(2), makeResimList(), 3400, "Lara", 11111, 30, false, false, null, true);
		ilanArsalar.add(ilanArsa1);
		ilanArsalar.add(ilanArsa2);
		ilanArsalar.add(ilanArsa3);
		ilanArsalar.add(ilanArsa4);
		ilanArsalar.add(ilanArsa5);
		ilanArsalar.add(ilanArsa6);
		ilanArsalar.add(ilanArsa7);
		ilanArsalar.add(ilanArsa8);
		ilanArsalar.add(ilanArsa9);
		ilanArsalar.add(ilanArsa10);
		ilanArsalar.add(ilanArsa11);
		ilanArsalar.add(ilanArsa12);
		return ilanArsalar;
	}
	
	private static String[] makeResimList() {
		String[] resimList = new String[5];
		resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return resimList;
	}
}
