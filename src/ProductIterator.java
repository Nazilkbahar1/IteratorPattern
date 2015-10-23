import java.util.List;


public class ProductIterator implements AbstractIterator {

	private ProductList productList;
	private List products;
	private int cursor1;
	private int cursor2;
	
	public ProductIterator(ProductList productList) {
		this.productList = productList;
		this.products = productList.getObjects();
		cursor1 = 0;
		cursor2 = products.size() - 1;
	}
	
	@Override
	public void moveToNext() {
		// TODO Auto-generated method stub
		if(cursor1 < products.size()) {
			cursor1++;
		}
	}

	@Override
	public void moveToPrevious() {
		// TODO Auto-generated method stub
		if(cursor2 > -1) {
			cursor2--;
		}
	}

	@Override
	public Boolean isFirst() {
		// TODO Auto-generated method stub
		return (cursor2 == -1);
	}

	@Override
	public Boolean isLast() {
		// TODO Auto-generated method stub
		return (cursor1 == products.size());
	}

	@Override
	public Object getNextItem() {
		// TODO Auto-generated method stub
		return this.products.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		// TODO Auto-generated method stub
		return this.products.get(cursor2);
	}

}
