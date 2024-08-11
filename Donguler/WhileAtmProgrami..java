public static void main(String[] args) {
    /*
		 
		  While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
		  
		  İşlemler
		  1.İşlem : Bakiye Öğrenme
		  2.İşlem : Para Çekme
		  3.İşlem : Para Yatırma
		  Çıkış : q
		 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bankadaki Toplam Paranız : (Örn : 12854,54)");
		double bakiye=scanner.nextDouble();
		scanner.nextLine();
		String processes="1 - Bakiye Öğrenme \n"
				+ "2 - Para Çekme \n"
				+ "3 - Para Yatırma \n"
				+ "q - Çıkış";
		System.out.println("*********************");
		System.out.println(processes);
		System.out.println("*********************");
		while(true) {
			System.out.print("Yapmak istediğiniz işlem numarasını giriniz : ");
			String process=scanner.nextLine();
			if(process.equals("1")) {
				System.out.println("Bankadaki Toplam Bakiyeniz : "+bakiye);
			}else if(process.equals("2")) {
				System.out.print("Çekmek istediğiniz miktarı giriniz : ");
				int cekilenMiktar=scanner.nextInt();
				scanner.nextLine();
				if(bakiye-cekilenMiktar<0) {
					System.out.println("Bakiye Yetersiz ");
				}else {
					bakiye=bakiye-cekilenMiktar;
					System.out.println("Kalan Toplam Bakiyeniz : "+bakiye);
				}
			}else if(process.equals("3")) {
				System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
				int yatirilanMiktar=scanner.nextInt();
				scanner.nextLine();
				bakiye=bakiye+yatirilanMiktar;
				System.out.println("Yeni Toplam Bakiyeniz : "+bakiye);
			}else if(process.equals("q")) {
				System.out.print("Çıkış Yapılıyor ... ");
				break;
			}else {
				System.out.println("Hatalı Giriş Yaptınız !!! ");
			}
		}
}