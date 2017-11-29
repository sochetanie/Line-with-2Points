public class LineTest {
    public static void main(String[] args) {

        Point newStart = new Point(2,4);
        Point newEnd = new Point(3,6);

        Line abc = new Line(newStart, newEnd);

        System.out.println(abc);
    }
}
