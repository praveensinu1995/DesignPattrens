package designPattren.builderDP;

public class SoldItems {
    private int id;
    private String productName;
    private double prize;

    @Override
    public String toString() {
        return "SoldItems{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", prize=" + prize +
                '}';
    }

    private SoldItems() {
    }

    private SoldItems(int id, String productName, double prize) {
        this.id = id;
        this.productName = productName;
        this.prize = prize;
    }

    public static SoldItemsBUilder getBuilder() {

        return new SoldItemsBUilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public static class SoldItemsBUilder {
        private int id;
        private String productName;
        private double prize;


        public int getId() {
            return id;
        }

        public SoldItemsBUilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getProductName() {
            return productName;
        }

        public SoldItemsBUilder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public double getPrize() {
            return prize;
        }

        public SoldItemsBUilder setPrize(double prize) {
            this.prize = prize;
            return this;
        }

        public SoldItems build() {
            return new SoldItems(id, productName, prize);
        }
    }
}
