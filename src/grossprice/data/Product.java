package grossprice.data;

public class Product {
    private String name;
    private String desc;
    private double netPrice;
    private String cat;

    public Product() {
    }

    public Product(String name, String desc, double netPrice, String cat) {
        this.name = name;
        this.desc = desc;
        this.netPrice = netPrice;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public String getCat() {
        return cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", netPrice=" + netPrice +
                ", cat='" + cat + '\'' +
                '}';
    }
}
