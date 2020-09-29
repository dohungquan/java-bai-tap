package HinhHoc;

public class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    private int area ;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public int getArea() {
        return area;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Math.max(this.getArea(), o.getArea());
    }

    public void howToColor() {
    }
}
