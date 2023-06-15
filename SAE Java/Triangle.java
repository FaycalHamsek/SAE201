import java.util.ArrayList;

import ardoise.*;

public class Triangle extends Forme {
    private String type;
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;

    public Triangle() {
    }

    public Triangle(String nom, PointPlan Point1, PointPlan Point2, PointPlan Point3) {
        super(nom);
        this.type = "T";
        this.p1 = Point1;
        this.p2 = Point2;
        this.p3 = Point3;
    }


    public void deplacer(int PointX, int PointY) {
        this.p1.deplacer(PointX, PointY);
        this.p2.deplacer(PointX, PointY);
        this.p3.deplacer(PointX, PointY);
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> triangle = new ArrayList<Segment>();
        Segment s1 = new Segment(this.p1,this.p2);
        Segment s2 = new Segment(this.p2,this.p3);
        Segment s3 = new Segment(this.p3,this.p1);
        triangle.add(s1);
        triangle.add(s2);
        triangle.add(s3);
        return triangle;
    }

    @Override
    public String typeForme() {

        return this.type;
    }

}
