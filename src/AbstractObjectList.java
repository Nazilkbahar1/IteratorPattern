import java.util.ArrayList;
import java.util.List;


abstract class AbstractObjectList {

	List<Object> objectList =  new ArrayList<Object>();
	
	public AbstractObjectList(List objectList) {
		this.objectList = objectList;
	};
	
	public void addObject(Object object) {
		objectList.add(object);
	}
	
	public void deleteObject(Object object) {
		objectList.remove(object);
	}
	
	public List getObjects() {
		return this.objectList;
	}
	
	
	public abstract AbstractIterator creatIterator();
}
