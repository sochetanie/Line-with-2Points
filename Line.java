public class Line {

    private Point lineStart;
    private Point lineEend;


    public Line(Point lineStart, Point lineEend) {
        this.lineStart = lineStart;
        this.lineEend = lineEend;
    }

    public Point getLineStart() {
        return lineStart;
    }

    public Point getLineEend() {
        return lineEend;
    }


    public String toString() {
        return "Line with start and end points: [" + lineStart + "," + lineEend + "]";
    }

}
