public class Point {
    private int x;
    private int y;
    private String label;

    public Point ( String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString() {
        return "Point "+label+" is at x = "+x+", y = "+y;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point temp = (Point) obj;
        return temp.x==this.x&&temp.y==this.y;
    }
}
