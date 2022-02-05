package hafta1AlgoritmaOdeviPalindromSayi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromSayi {

	public static void main(String[] args) {
		Map<Long, Long> palindromeMap = new HashMap<>(); //o anki sayiyi ve kac kere ters cevirildigini tutmak icin map 
		for (Long i = 10L; i <= 100; i++) {
			Long step = 0L, temp = i;
			while (!temp.equals(reverseNumber(temp))  ) { //10dan 100e kadar olan sayilarin kac step sonra palindrome sayi oldugu bulunur
				temp = temp + reverseNumber(temp);
				step++;
			}
			palindromeMap.put(i, step);
		}
		Long maxValue = Collections.max(palindromeMap.values()); //En cok tekrar eden basamak alýnýr ve onun denk oldugu sayilar bulunur
		List<Long> keys = new ArrayList<>();
		for (Entry<Long, Long> entry : palindromeMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
            	keys.add(entry.getKey());
            }
        }
		for(int i = 0; i < keys.size(); i++) { //Konsola yazdirma islemi
			System.out.println("--------------------------------");
			System.out.println(keys.get(i).toString() + " sayisi icin " + maxValue + " kere islem yapilmistir.");
			System.out.println("--------------------------------");
			Long temp = keys.get(i);
			while (!temp.equals(reverseNumber(temp))  ) {
				System.out.print(temp + " + " + reverseNumber(temp) + " = ");
				temp = temp + reverseNumber(temp);
				System.out.print(temp);
				System.out.println("");
			}
		}
	}

	public static Long reverseNumber(Long num) { //Sayinin reverse edilerek kontrol edilmesi saglanir
		char[] number = String.valueOf(num).toCharArray();
        String reverseNumber = "";
        for (int count = number.length - 1; count >= 0; count--) {
            reverseNumber = reverseNumber + number[count];
        }
        return Long.parseLong(reverseNumber);
	}

}
