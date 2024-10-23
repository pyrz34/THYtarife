import java.util.Scanner;


public class ThyTarife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,secim;
        double normalTutar,gidisdönüsİndirimi,yasindirimi,toplamTutar;
        System.out.print("Lütfen uçacağınız Mesafeyi giriniz : ");
        mesafe = input.nextInt();
        normalTutar = mesafe*(0.10);
        System.out.println("Lütfen yaşınızı giriniz :");
        yas =input.nextInt();
        System.out.println("lütfen bilet türünüzü seçiniz");
        secim = input.nextInt();
        if(yas>0&&mesafe>0&&secim>=1&&secim<=2){
            if(yas<12&&secim==1){
                yasindirimi=normalTutar-normalTutar*(0.5);
                System.out.println("ödeyeceğiniz Tutar: " + yasindirimi);
                }
            else if(yas<12&&secim==2){
                yasindirimi=normalTutar-normalTutar*(0.5);
                gidisdönüsİndirimi = yasindirimi-(yasindirimi*0.2);
                toplamTutar=gidisdönüsİndirimi*2;

                System.out.println("Ödeyeceğiniz tutar: "+toplamTutar);

            }
            else if(yas>=12&& yas<=24&&secim==1){
                normalTutar=normalTutar-normalTutar*(0.10);
                System.out.println("Ödeyeceğiniz tutar : " + normalTutar);
            }
            else if(yas>=12&&yas<=24&&secim==2){
                yasindirimi=normalTutar-normalTutar*(0.10);
                gidisdönüsİndirimi = yasindirimi-(yasindirimi*0.2);
                toplamTutar=gidisdönüsİndirimi*2;
                System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
            }
            else if(yas>65&&secim==1){
                normalTutar=normalTutar-normalTutar*(0.30);
                System.out.println("Ödeyecğiniz tutar: "+normalTutar);
            }
            else if(yas>65&&secim==2){
                yasindirimi=normalTutar-normalTutar*(0.30);
                gidisdönüsİndirimi=yasindirimi-(yasindirimi*0.2);
                toplamTutar=gidisdönüsİndirimi*2;
                System.out.println("Ödeyeceğiniz Tutat : "+toplamTutar);

            }
            else if(secim==1){
                System.out.println("Ödeyeceğiniz tutar :"+normalTutar);
            }
            else if(secim==2){
                gidisdönüsİndirimi=normalTutar-normalTutar*(0.20);
                toplamTutar=gidisdönüsİndirimi*2;
                System.out.println("Ödeyeceğiniz tutar : "+toplamTutar);
            }


        }
        else{
            System.out.println("Hatalı veri girdiniz!!!");
        }


    }

}
