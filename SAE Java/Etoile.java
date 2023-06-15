import java.util.ArrayList;

import ardoise.*;

public class Etoile extends Forme{
    private String type;
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    private PointPlan p4;
    private PointPlan p5;
    private PointPlan p6;
    private PointPlan p7;
    private PointPlan p8;
    private Chapeau chap1;
    private Chapeau chap2;
    private Chapeau chap3;
    private Chapeau chap4;

    public Etoile(String nom, PointPlan p1, PointPlan p2, PointPlan p3, PointPlan p4, PointPlan p5, PointPlan p6, PointPlan p7, PointPlan p8){
        this.chap1 = new Chapeau("Branche 1", p1, p2, p3);
        this.chap2 = new Chapeau("Branche 2", p3, p4, p5);
        this.chap3 = new Chapeau("Branche 3", p5, p6, p7);
        this.chap4 = new Chapeau("Branche 4", p7, p8, p1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.type = "GF";
    }

    @Override
    public void deplacer(int arg0, int arg1) {
        this.p1.deplacer(arg0, arg1);
        this.p2.deplacer(arg0, arg1);
        this.p3.deplacer(arg0, arg1);
        this.p4.deplacer(arg0, arg1);
        this.p5.deplacer(arg0, arg1);
        this.p6.deplacer(arg0, arg1);
        this.p7.deplacer(arg0, arg1);
        this.p8.deplacer(arg0, arg1);
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> etoile = new ArrayList<Segment>();
        etoile.addAll(this.chap1.dessiner());
        etoile.addAll(this.chap2.dessiner());
        etoile.addAll(this.chap3.dessiner());
        etoile.addAll(this.chap4.dessiner());
        return etoile;
    }

    @Override
    public String typeForme() {
        return this.type;
    }

    @Override
    public String getNomForme() {
        return super.getNomForme();
    }

    @Override
    public void setNomForme(String arg0) {
        super.setNomForme(arg0);
    }
    
}
