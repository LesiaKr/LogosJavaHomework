package fourteen.homework.commodity;

public class Commodity {

    private String nameProduct;
    private double length;
    private double width;
    private double weight;

    public Commodity(String nameProduct, double length, double width, double weight) {
        this.nameProduct = nameProduct;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product: " + nameProduct + ", size: " + length + "x" + width + ", weight: " + weight + "g";
    }

}
