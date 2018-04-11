package as;

public class Main {

    public static void main(String[] args) {
        Segment s1 = new Segment(10, 20, 50, 50);
        Segment s2 = new Segment(10, 20, -0.1, 0.1);
        Segment s3 = new Segment(50, 50, 0.1, -0.1);
        Segment s4 = new Segment(10, 50, 50, 10);
        Segment s5 = new Segment(0.1, -0.1, -0.1, 0.1);

        System.out.println(s1.isAdjacentTo(s2)); //should be true
        System.out.println(s1.isAdjacentTo(s3)); //should be true
        System.out.println(s3.isAdjacentTo(s1)); //should be true
        System.out.println(s2.isAdjacentTo(s3)); //should be false
        System.out.println(s3.isAdjacentTo(s4)); //should be false

    }


}

public class Segment {
    double attx1;
    double atty1;
    double attx2;
    double atty2;

    Segment(double x1, double y1, double x2, double y2){
        attx1 = x1;
        atty1 = y1;
        attx2 = x2;
        atty2 = y2;
    }

    public boolean isAdjacentTo(Segment s){
        if (attx1==s.attx1 && atty1==s.atty1){
            return true;
        }else if (attx1==s.attx2 && atty1==s.atty2) {
            return true;
        }else if (attx2==s.attx1 && atty2==s.atty1) {
            return true;
        }else if (attx2==s.attx2 && atty2==s.atty2) {
            return true;
        }
        return false;

    }


}
