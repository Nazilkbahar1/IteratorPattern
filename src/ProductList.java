import java.util.List;


public class ProductList extends AbstractObjectList {

	public ProductList(List objectList) {
		super(objectList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductIterator creatIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}

}
