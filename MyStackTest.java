import org.junit.Test;

public class MyStackTest {

   //TEST CASE 1
	@Test
	public void stackCheck()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
	   MyStack myStack = new MyStack();
	   myStack.push(myFirstNode);
	   myStack.push(mySecondNode);
	   myStack.push(myThirdNode);
	   myStack.printStack();
	}

   //TEST CASE 2
   @Test
	public void stackCheck1()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
	   MyStack myStack = new MyStack();
      myStack.push(myFirstNode);
      myStack.push(mySecondNode);
	   myStack.push(myThirdNode);
	   myStack.printStack();
	   INode topNode = myStack.peek();
      INode pop = myStack.popStack();
      myStack.printStack();
	   Assert.assertEquals(topNode,myThirdNode);
	   Assert.assertEquals(pop,myThirdNode);
	}

   //TEST CASE 3
   @Test
	public void queueCheck()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
	   MyStack myQueue = new MyStack();
	   myQueue.pushQueue(myFirstNode);
	   myQueue.pushQueue(mySecondNode);
      myQueue.pushQueue(myThirdNode);
	   myQueue.printQueue();
	}

   //TEST CASE 4
   @Test
   public void queueCheck()
   {
      MyNode<Integer> myFirstNode = new MyNode<>(70);
      MyNode<Integer> mySecondNode = new MyNode<>(30);
      MyNode<Integer> myThirdNode = new MyNode<>(56);
      MyStack myQueue = new MyStack();
      myQueue.pushQueue(myFirstNode);
      myQueue.pushQueue(mySecondNode);
      myQueue.pushQueue(myThirdNode);
      myQueue.printQueue();
      INode topNode = myQueue.peek();
	   INode pop = myQueue.popQueue();
	   myQueue.printQueue();
	   Assert.assertEquals(topNode,myFirstNode);
	   Assert.assertEquals(pop,myFirstNode);
   }

}
