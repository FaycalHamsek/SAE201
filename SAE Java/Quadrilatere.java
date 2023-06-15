import java.util.ArrayList;
import ardoise.*;

public class Quadrilatere extends Forme {

    private String type;
    private PointPlan p1;
    private PointPlan p2;

    public Quadrilatere() {}

    public Quadrilatere(String Nom,PointPlan HG, PointPlan BD) {
        super(Nom);
        this.type = "Q";
        this.p1 = HG;
        this.p2 = BD;
    }

    
    public void deplacer(int PointX, int PointY) {
        this.p1.deplacer(PointX, PointY);
        this.p2.deplacer(PointX, PointY);
    }

     public ArrayList<Segment> dessiner() {
        PointPlan HD = new PointPlan(this.p2.getAbscisse(),this.p1.getOrdonnee());
        PointPlan BG = new PointPlan(this.p1.getAbscisse(),this.p2.getOrdonnee());
        ArrayList<Segment> quad = new ArrayList<Segment>();
        Segment s1 = new Segment(this.p1,HD);
        Segment s2 = new Segment(HD,this.p2);
        Segment s3 = new Segment(this.p2, BG);
        Segment s4 = new Segment(BG, this.p1);
        quad.add(s1);
        quad.add(s2);
        quad.add(s3);
        quad.add(s4);
        return quad;
    }

    public String typeForme() {
        return this.type;
    }

}