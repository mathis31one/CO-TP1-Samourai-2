package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;

public class MonHistoire {

	public static void main(String[] args) {  
		  Commercant commercant = new Commercant("Marchand", 35);
		  commercant.direBonjour();
		  Yakusa yakusa = new Yakusa("Yaku␣le␣noir", 42,"biere", "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donner(10, commercant );
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();
		  Samourai musaichi = new Samourai("Akimoto" ,  20, "the", "Miyamoto");
		  musaichi.boire("eau");
		  musaichi.direBonjour();
	}
}
