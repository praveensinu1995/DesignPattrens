package designPattren.builderDP;

public class client {
    public static void main(String[] args) {
        SoldItems phone = SoldItems.getBuilder().setId(1).setPrize(100).setProductName("phone").build();
        System.out.println(phone);




    }
}
