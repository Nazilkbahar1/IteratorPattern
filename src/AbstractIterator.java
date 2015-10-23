
interface AbstractIterator {

	public void moveToNext();

	public void moveToPrevious();

	public Boolean isFirst();

	public Boolean isLast();
	
	public Object getNextItem();
	
	public Object getPreviousItem();
}
