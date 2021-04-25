package stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StacksTest {

	 @Test
	    public void given3IntegersWhenAddedShouldBeLast(){
	        MyNode<Integer> myFirstNode = new MyNode<>(70);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(56);

	        Stacks<Integer> stacks = new Stacks<>();

	        stacks.push(myFirstNode);
	        stacks.push(mySecondNode);
	        stacks.push(myThirdNode);
	        stacks.printStack();

	        INode<Integer> peak = stacks.peak();
	        Assertions.assertEquals(myThirdNode, peak);
	    }
	}