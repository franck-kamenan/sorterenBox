package be.intecbrussel.opdrachten.sorting;

public class Box implements Comparable<Box> {

    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return length * width * height;
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", width=" + width +
                ", height=" + height;
    }

    @Override
    public int compareTo(Box o) {
        return this.getVolume() - o.getVolume();
    }
}
