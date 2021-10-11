package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.enums;

public class PijetTest {

    public static class Test {
        Pijet pijet;


        public Test(Pijet pijet) {
            this.pijet = pijet;
        }


        public void PijaPreferuar() {
            switch (pijet) {
                case COFFEE:
                    System.out.println("Kafeja perdoret me se shumti");
                    break;
                case ESPRESSO:
                    System.out.println("Espresso pa sheqer, me e mira");
                    break;
                case MACHIATO:
                    System.out.println("Qumeshti ia shton shijen");
                    break;
                case TEA:
                    System.out.println("Per dimen me caj nuk ka");
                    break;
                case WATER:
                    System.out.println("E uji nuk mund te zevendsohet");
                    break;
                case MILK:
                    System.out.println("Me qumeshtin Vita u rrita");
                default:
                    System.out.println("Sherbejm dhe pije te tjera, kontaktoni kamarierin");
                    break;
            }
        }

        // Driver method
        public static void main(String[] args) {
            String str = "COFFEE";
            Test t1 = new Test(Pijet.valueOf(str));
            t1.PijaPreferuar();
        }
    }
}
