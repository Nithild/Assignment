package week1.day1;

public class Mobile {
		String mobileBrandName = "Realme GT Master Edition";
		char mobileLogo = 'R';
		short noOfMobilePieces = 50;
		int modelNumber = 1 ;
		long mobileImeiNumber = 6875241245875425642L;
		float mobilePrice = 27499.99F;
		boolean mobileIsDamaged = false;

	public static void main(String[] args) {
		Mobile mobile =new Mobile();
		System.out.println("BRAND NAME="+mobile. mobileBrandName );
		System.out.println("MOBILE LOGO ="+mobile. mobileLogo);
		System.out.println("NO OF MOBILES ="+mobile.noOfMobilePieces );
		System.out.println("MODEL NO =" +mobile.modelNumber );
		System.out.println("IMEI NO ="+mobile.mobileImeiNumber );
		System.out.println("MOBILE PRICE =" +mobile.mobilePrice);
		System.out.println("IS DAMAGED ="+mobile. mobileIsDamaged);
	}
	}
