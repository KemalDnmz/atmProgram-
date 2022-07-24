import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  /*ok-

        While döngüsü yardımıyla bir tane ATM programı yapalım

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q

        */

        Scanner scanner=new Scanner(System.in);

        String islemler= " 1.İşlem : Bakiye Öğrenme \n "
                + "2.İşlem : Para Çekme \n"
                +"3.İşlem : Para Yatırma \n"
                +"Çıkış: q ";
        System.out.println("işlemler:"+islemler);
        System.out.println("****************************");


        int bakiye=1000;

        while(true){
            System.out.println("Bir işlem giriniz:");
            String islem=scanner.nextLine();
            if(islem.equals("1")){
                System.out.println("Bakiyeniz="+bakiye);

            }
            else if(islem.equals("2")){
                System.out.println("Tutar giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                if(bakiye<tutar){
                    System.out.println("yeterli bakiyeniz bulunmamaktadır");

                }
                else{
                    bakiye-=tutar;
                    System.out.println("kalan bakiyeniz:"+bakiye);

                }
            }
            else if(islem.equals("3")){
                System.out.println("yatırmak istediğiniz tutar:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("yeni bakiye:"+bakiye);

            }
            else if(islem.equals("q")){

                System.out.println("çıkış yapıyorsunuz....\n" +
                        "çıkış yapıldı.\n" +
                        "İyi günler...");
                break;

            }
            else{
                System.out.println("geçersiz işlem");
            }



        }

    }
}
