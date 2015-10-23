import java.util.ArrayList;
import java.util.List;


public class Client {

	public static void main(String args[]) {
		List products = new ArrayList();

		products.add("lvhang");
		products.add("dagou");
		products.add("xiaomei");
		products.add("dandan");
		products.add("lulu");
		
		ProductList productList = new ProductList(products);
		ProductIterator iterator = productList.creatIterator();
		
		System.out.print("正向遍历");
		while(!iterator.isLast()) {
			System.out.print(" " + iterator.getNextItem());
		}
		
		System.out.print("反向遍历");
		while(!iterator.isFirst()) {
			System.out.print(" " + iterator.getPreviousItem());
		}
	}
}
