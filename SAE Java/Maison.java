import java.util.ArrayList;

import ardoise.*;

public class Maison extends Forme {
    private String type;
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    private PointPlan p4;
    private PointPlan p5;
    private PointPlan p6;
    private Quadrilatere corps;
    private Quadrilatere porte;
    private Chapeau toit;
    

    public Maison() {
    }

    public Maison(String nom, PointPlan Point1, PointPlan Point2, PointPlan Point3, PointPlan Point4, 
                    PointPlan Point5) {
        super(nom);
        this.type = "GF";
        this.p1 = Point1;
        this.p2 = Point2;
        this.p3 = Point3;
        this.p4 = Point4;
        this.p5 = Point5;
        this.p6 = new PointPlan(Point2.getAbscisse(), Point1.getOrdonnee());
        this.corps = new Quadrilatere(nom, Point1, Point2);
        this.porte = new Quadrilatere(nom, Point3, Point4);
        this.toit = new Chapeau(nom, Point1, Point5, p6);
    }


    public void deplacer(int PointX, int PointY) {
        this.p1.deplacer(PointX, PointY);
        this.p2.deplacer(PointX, PointY);
        this.p3.deplacer(PointX, PointY);
        this.p4.deplacer(PointX, PointY);
        this.p5.deplacer(PointX, PointY);
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> maison = new ArrayList<Segment>();
        maison.addAll(this.corps.dessiner());
        maison.addAll(this.porte.dessiner());
        maison.addAll(this.toit.dessiner());
        return maison;
    }

    @Override
    public String typeForme() {

        return this.type;
    }

}