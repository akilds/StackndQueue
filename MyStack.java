public class MyStack {

	private MyLinkedList myLinkedList;

   //USE CASE 1 - Stack Creation
	public MyStack()
	{
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode<Integer> myNode)
	{
		myLinkedList.add(myNode);
	}

	public void printStack()
	{
		myLinkedList.printMyNodes();
	}

   //USE CASE 2 - PEEK and POP
   public INode peek()
	{
		return myLinkedList.head;
	}

	public INode popStack()
	{
		return myLinkedList.pop();
	}

   //USE CASE  3- Queue Creation
   public void pushQueue(INode<Integer> myNode)
   {
      myLinkedList.append(myNode);
   }

   public void printQueue()
   {
      myLinkedList.printMyNodes();
   }

   //USE CASE 3 - Queue -> PEEK and POP

   public INode popQueue()
   {
      return myLinkedList.pop();
   }

}

