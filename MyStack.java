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
}

