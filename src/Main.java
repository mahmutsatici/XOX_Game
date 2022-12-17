import java.util.*;

public class Main
{
    static List<String> liste = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("XOX OYUNUNA HOŞGELDİNİZ");
        for (int i=1; i<10; i++ ){
            liste.add(Integer.toString(i));
        }



        Scanner nesne = new Scanner(System.in);
        kazanmakontrol kntrl = new kazanmakontrol();
        yazdirmasinifi yaz = new yazdirmasinifi();
        int kontrol =0;
        String sirakontrol = "sıraX";
        yaz.yazdirma();


        while (kontrol == 0) {

            int koordinat;

            if (sirakontrol == "sıraX") {
                System.out.print("Lütfen X koymak istediğiniz yerin koordinatını yazınız: ");
                koordinat = nesne.nextInt();

                if (1<=koordinat && koordinat <=9 && liste.get(koordinat - 1) != "X" && liste.get(koordinat - 1) != "O"   ) {

                    liste.set(koordinat-1,"X");
                    yaz.yazdirma();
                    sirakontrol="sıraO";
                    kontrol=kntrl.kazanmakontrol(liste.get(0),liste.get(1),liste.get(2),liste.get(3),liste.get(4),liste.get(5),liste.get(6),liste.get(7),liste.get(8));


                }
                else if (1>koordinat || koordinat >9){

                    yaz.yazdirma();
                    System.out.println("!!!Lütfen 1-9 arasında bir sayı giriniz!!!");
                }
                else{

                    yaz.yazdirma();
                    System.out.println("!!!Lütfen boş bir yer seçiniz!!!");
                }
            }
            else if (sirakontrol == "sıraO")
            {
                System.out.println("----------------------------------------------------------");
                System.out.print("Lütfen O koymak istediğiniz yerin koordinatını yazınız: ");

                koordinat = nesne.nextInt();
                if (1<=koordinat && koordinat <=9 && liste.get(koordinat - 1) != "X" && liste.get(koordinat - 1) != "O"  ) {

                    sirakontrol="sıraX";
                    liste.set(koordinat - 1, "O");
                    yaz.yazdirma();
                    kontrol=kntrl.kazanmakontrol(liste.get(0),liste.get(1),liste.get(2),liste.get(3),liste.get(4),liste.get(5),liste.get(6),liste.get(7),liste.get(8));
                }
                else if (1>koordinat || koordinat >9){

                    yaz.yazdirma();
                    System.out.println("!!!Lütfen 1-9 arasında bir sayı giriniz!!!");
                }
                else{

                    yaz.yazdirma();
                    System.out.println("!!!Lütfen boş bir yer seçiniz!!!");
                }
            }
            int c=0;
            for (int n=0;n<=8;n++)
            {
                if((liste.get(n)=="X"))
                {
                    c++;

                }
            }
            if (c==5){
                kontrol=2;
            }
        }
        System.out.println("---------------------------------------------------------");
        if (kontrol==2){
            System.out.println("BERABERE BİTTİ");
        }
        else if (sirakontrol=="sıraX"){
            System.out.println("BRAVO 'O' oynayan oyuncu kazandı");
        }
        else if (sirakontrol=="sıraO") {
            System.out.println("BRAVO 'X' oynayan oyuncu kazandı");
        }
        System.out.println("---------------------------------------------------------");

    }



}