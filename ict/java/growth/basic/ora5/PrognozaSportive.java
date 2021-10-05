package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class PrognozaSportive {

    //Te shkruhet program i cili pranon parameter ekipin vendas dhe ekipin musafir dhe
    //prognozen tuaj si vijon:
    // 1 – per fitore te ekipit vendas (gjithmon 1 nese eshte Real Madrid-I si vendas)
    // X – per barazim
    // 2 – per fitore te ekipit musafir (gjithmon 2 nese eshte Real Madrid-I si musafir)
    //Mesazhi qe shfaqet te jete si vijon:
    //- Prognozaime per ndeshjenndermjet ekipi1 vs ekipi2 eshte se (fiton ekipi1 apo fiton
    //ekipi2 apo perfundon me barazim)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cili eshte ekipi vendas?");
        String ekipiVendas = input.nextLine();
        System.out.println("Cili eshte ekipi mysafir?");
        String ekipiMusafir = input.nextLine();

        System.out.println("Cila skuader fiton, zgjedh 1 per vendasit , 2 mysafiret, 0 per barazim");
        int fitonSkuadra = input.nextInt();
        System.out.println("Prognoza ime per ndeshjen ne mes" + ekipiVendas + ekipiMusafir +"eshte" + fitonSkuadra);

        switch (fitonSkuadra) {
            case 1:
                System.out.println("fiton" + ekipiVendas);
                break;
            case 2:
                System.out.println("fiton" + ekipiMusafir);
                break;

            case 0:
                System.out.println("perfundon barazim");
                break;

            default:
                System.out.println("Nuk keni zgjedhur numrin e kerkuar.");
                break;


        }
    }
}
