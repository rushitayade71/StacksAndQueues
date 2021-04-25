package stacksandqueues;


public class MyNode<K> implements INode<K> {

	 public K key;
	    public INode<K> next;

	    public MyNode(K key){
	        this.key = key;
	        this.next = null;
	    }

	    public K getKey() {
	        return key;
	    }
	    
	    @Override
		public void setKey(K key) {
			this.key = key;
			
		}

		public INode<K> getNext() {
	        return next;
	    }
		
		@Override
		public void setNext(INode<K> next) {
			this.next = (INode<K>) next;			
		}
	
	}


