package flam.giftsorter;

public class GiftSorter{
	public String sortGiftCode(String code){
		boolean [] tab = new boolean[26];
		for (char c : code.toCharArray()) {
			int index = c-'a';
			tab[index] = true;
		}
		String strToReturn = "";
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]){
				strToReturn+=(char)('a'+i);
			}
		}
		return strToReturn;
	}
}