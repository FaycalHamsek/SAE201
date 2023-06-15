import java.util.ArrayList;

import ardoise.*;

public class Chapeau extends Forme {
    private String type;
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;

    public Chapeau() {

    }

    public Chapeau(String nom, PointPlan Point1, PointPlan Point2, PointPlan Point3) {
        super(nom);
        this.type = "C";
        this.p1 = Point1;
        this.p2 = Point2;
        this.p3 = Point3;
    }

    @Override
    public void deplacer(int PointX, int PointY) {
        this.p1.deplacer(PointX, PointY);
        this.p2.deplacer(PointX, PointY);
        this.p3.deplacer(PointX, PointY);
    }

    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> chap = new ArrayList<Segment>();
        Segment s1 = new Segment(this.p1,this.p2);
        Segment s2 = new Segment(this.p2,this.p3);
        chap.add(s1);
        chap.add(s2);
        return chap;
    }

    public String typeForme() {
        return this.type;
    }

}