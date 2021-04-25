package stacksandqueues;

public class MyLinkedList<K> {

	 	public INode<K> head;
	    public INode<K> tail;

	    public MyLinkedList() {
	        this.head = null;
	        this.tail = null;
	    }

	    public void add(INode<K> myNode) {
	        if(this.tail == null) {
	            this.tail = myNode;
	        }if (this.head == null){
	            this.head = myNode;
	        }else {
	            INode tempNode = this.head;
	            this.head = myNode;
	            this.head.setNext(tempNode);
	        }
	    }

	    public void printNodes() {
	        StringBuffer nodes = new StringBuffer();
	        INode<K> tempNode = head;
	        while(tempNode.getNext() != null) {
	            nodes.append(tempNode.getKey());
	            if(tempNode != this.tail){
	                nodes.append("->");
	            }
	            tempNode = tempNode.getNext();
	        }
	        nodes.append(tempNode.getKey());
	        System.out.println(nodes);
	    }


	    public void append(INode<K> myNewNode) {
	        if(this.head == null) {
	            this.head = myNewNode;
	        }
	        if(this.tail == null){
	            this.tail = myNewNode;
	        }else {
	            this.tail.setNext(myNewNode);
	            this.tail = myNewNode;

	        }
	    }

	    public void insert(INode<K> myNode,INode<K> myNewNode) {
	        INode<K> tempNode = myNode.getNext();
	        myNode.setNext(myNewNode);
	        myNewNode.setNext(tempNode);
	    }

	    public INode<K> pop() {
	        INode<K> tempNode = this.head;
	        this.head=head.getNext();
	        return tempNode;
	    }
	    public INode<K> popLast() {
	        INode<K> tempNode = head;
	        while(!tempNode.getNext().equals(tail)){
	            tempNode = tempNode.getNext();
	        }
	        
	        this.tail = tempNode;
	        tempNode.setNext(null);
	        return tempNode;
	    }
	    
	    public boolean search(K key) {
	        INode<K> tempNode = head;
	        while (tempNode != null && tempNode.getNext() != null) {
	            if(tempNode.getNext().getKey().equals(key)){
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public void searchAndInsert(K key, INode<K> myNewNode){
	        INode<K> tempNode = head;
	        while (tempNode.getNext() != null){
	            if(tempNode.getKey().equals(key)) {
	                INode <K>temp = tempNode.getNext();
	                tempNode.setNext(myNewNode);
	                myNewNode.setNext(temp);
	            }
	            tempNode = tempNode.getNext();
	        }
	    }
	    
	    public void searchAndDelete(K key) {
	        INode tempNode = head;
	        while (tempNode.getNext() != null) {
	            if (tempNode.getNext().getKey().equals(key)) {
	                INode temp = tempNode.getNext().getNext();
	                tempNode.setNext(temp);
	            }
	            tempNode = tempNode.getNext();
	        }
	    }

	    public int size()
	    {
	        INode temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.getNext();
	        }
	        return count;
	    }


	}