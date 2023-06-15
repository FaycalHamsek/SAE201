import ardoise.*;

public class TestArdoise{
    public static void main(String[] args) {
        Ardoise ardoise = new Ardoise();
        
        PointPlan p1 = new PointPlan(118,13);
        PointPlan p2 = new PointPlan(123,20);
        PointPlan p3 = new PointPlan(128,13);

        Chapeau ois1 = new Chapeau("Oiseau 1", p1, p2, p3);
        ardoise.ajouterForme(ois1);

        PointPlan p4 = new PointPlan(133,30);
        PointPlan p5 = new PointPlan(136,32);
        PointPlan p6 = new PointPlan(138,30);

        Chapeau ois2 = new Chapeau("Oiseau 2", p4, p5, p6);
        ardoise.ajouterForme(ois2);
        PointPlan p7 = new PointPlan(142,14);
        PointPlan p8 = new PointPlan(144,17);
        PointPlan p9 = new PointPlan(146,14);

        Chapeau ois3 = new Chapeau("Oiseau 3", p7, p8, p9);
        ardoise.ajouterForme(ois3);

        PointPlan p10 = new PointPlan(170, 52);
        PointPlan p11 = new PointPlan(173, 45);
        PointPlan p12 = new PointPlan(177, 52);
        PointPlan p13 = new PointPlan(184, 57);
        PointPlan p14 = new PointPlan(177, 60);
        PointPlan p15 = new PointPlan(174, 66);
        PointPlan p16 = new PointPlan(170, 60);
        PointPlan p17 = new PointPlan(164, 57);

        Etoile etoile = new Etoile("Etoile", p10, p11, p12, p13, p14, p15, p16, p17);
        ardoise.ajouterForme(etoile);

        PointPlan p21 = new PointPlan(3, 14);
        PointPlan p22 = new PointPlan(43, 3);
        PointPlan p23 = new PointPlan(112, 14);
        Triangle montagne1 = new Triangle("Montagne 1", p21, p22, p23);
        ardoise.ajouterForme(montagne1);

        PointPlan p24 = new PointPlan(152, 7);
        PointPlan p25 = new PointPlan(166, 3);
        PointPlan p26 = new PointPlan(172, 7);
        Triangle montagne2 = new Triangle("Montagne 2", p24, p25, p26);
        ardoise.ajouterForme(montagne2);

        PointPlan p27 = new PointPlan(9, 100);
        PointPlan p28 = new PointPlan(20, 198);
        Quadrilatere tour = new Quadrilatere("tour", p27, p28);
        ardoise.ajouterForme(tour);

        PointPlan p18 = new PointPlan(80, 140);
        PointPlan p19 = new PointPlan(180, 198);
        PointPlan p20 = new PointPlan(120, 170);
        PointPlan p29 = new PointPlan(140, 198);
        PointPlan p30 = new PointPlan(130, 100);
        Maison maison = new Maison("Maison", p18, p19, p20, p29, p30);
        ardoise.ajouterForme(maison);

        ardoise.dessinerGraphique();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ardoise.deplacer("C", 10, 20);

    }
}