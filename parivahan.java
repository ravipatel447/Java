import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class parivahan {
    static HashMap<String,ArrayList<String>> harmles= new HashMap<>();
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter truck height width length");
        int height = sc.nextInt();
        int width = sc.nextInt();
        int length = sc.nextInt();
        int volume = height*width*length;
        System.out.println("this is truck volume "+volume);
        System.out.println("enter single product details with height width length");
        int pheight = sc.nextInt();
        int pwidth = sc.nextInt();
        int plength = sc.nextInt();
        System.out.println("enter total quentity of this product");
        int quentity = sc.nextInt();
        int pvolume = pheight*pwidth*plength*quentity;
        int avail_volume = volume-pvolume;
        System.out.println("total available space in current truck "+avail_volume);
        System.out.println("enter secondary product details with height width length");
        int secondary_product_height = sc.nextInt();
        int secondary_product_width = sc.nextInt();
        int secondary_product_length = sc.nextInt();
        System.out.println("enter total quentity of this product");
        int secondary_product_quentity = sc.nextInt();
        int total_volume_secondary_product = secondary_product_height*secondary_product_width*secondary_product_length*secondary_product_quentity;
        System.out.println("total available space in current truck "+total_volume_secondary_product);



        

    }
    public static void add(){
        harmles.put("glass",new ArrayList<String>() {
            {
                add("paper");
                add("cloth");
                add("cotton");
            }
        });
        harmles.put("steel",new ArrayList<String>() {
            {
                add("curiour");
                add("delivery_boxes");
            }
        });
        harmles.put("tiles", new ArrayList<String>() {
            {
                add("paper");
                add("light_weight_products");
                add("clay_products");
            }
        });
        harmles.put("tiles", new ArrayList<String>() {
            {
                add("paper");
                add("light_weight_products");
                add("clay_products");
            }
        });

    }
}
