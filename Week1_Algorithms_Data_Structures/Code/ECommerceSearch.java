import java.util.*;

public class ECommerceSearch {
    public static List<String> searchProducts(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();
        for (String product : products) {
            if (product.toLowerCase().contains(lowerKeyword)) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Smartphone", "smartWatch", "Laptop", "Camera", "Smartspeaker");
        String keyword = "smart";

        List<String> matchingProducts = searchProducts(products, keyword);
        System.out.println("Matching Products: " + matchingProducts);
    }
}
