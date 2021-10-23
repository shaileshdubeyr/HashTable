package com.queue;

import org.junit.Assert;
import org.junit.Test;
import com.linkedlist.*;

public class MyQueueTest {
	@Test
	public void given3NumberQueueWhenDeQueueShouldMatchWithSecondLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		Queue myQueue = new Queue();
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode deQueu = myQueue.deQueu();
		INode peak = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(mySecondNode, peak);
	}
}
