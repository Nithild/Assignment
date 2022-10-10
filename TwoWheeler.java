 package week1.day1;

public class TwoWheeler {
	 int noOfWheels=2;
	 short noOfMirrors=2;
	 long chassisNumber=192800L;
	 boolean isPunctured = false;
	 double bikeKM=5909.8;
	 String bikeName= "Honda H'ness CB350";
	 
public static void main(String[] args) {
     TwoWheeler bike = new TwoWheeler();
     System.out.println("NO OF WHEELS="   +bike.noOfWheels);
     System.out.println("NO OF MIRRORS =" +bike.noOfMirrors);
     System.out.println("CHASSIS NUMBER ="+bike.chassisNumber);
     System.out.println("IS PUNCTURED ="  +bike.isPunctured);
     System.out.println("KILOMETERS ="    +bike.bikeKM);
     System.out.println("BIKENAME="       +bike.bikeName);

}
}