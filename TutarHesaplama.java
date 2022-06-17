import java.util.Scanner;
public class TutarHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar,kdvOran;
        boolean kdvDurumu;
        System.out.println("Ücret giriniz : ");
        tutar = input.nextDouble();
        kdvDurumu=(0<tutar) && (tutar<1000);
        kdvOran=kdvDurumu ? 0.18: 0.08;


        double kdvTutar = tutar * kdvOran;
        double sonTutar = tutar + kdvTutar;

        System.out.println(kdvOran);


        System.out.println("KDV'li tutar =" + sonTutar);

    }
}
