package stacksandqueues;

public class Stacks<K> {
    private MyLinkedList<K> myLinkedList = new MyLinkedList<>();

    public void push(INode<K> myNode) {
        myLinkedList.add(myNode);
    }

    public INode<K> peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printNodes();
    }
}
