package binarno_stablo;

public class BinarnoStablo {
	
	CvorStabla koren;
	
	public String vratiPoKljucu (int kljuc,CvorStabla k) {
		if(k==null)
			return null;
		
		if(k.key == kljuc)
			return k.data;
		
		if(k.key>kljuc)
			return vratiPoKljucu(kljuc, k.levo);
		
		return vratiPoKljucu(kljuc,k.desno);
	}

}
