import java.util.*;
public class file1 {
     public static char matrix[][]=new char[10][10];
     public static List<Node> l1=new LinkedList<Node>();
     public static Node head,tail;
	public static void main(String[] args) {
		
	}
static List snake()
{
	Node body;
	head=new Node('A',1,2);
	l1.add(head);
	l1.add(new Node('X',3,2));
	tail=new Node('B',3,2);
	l1.add(tail);
	return l1;
}
 static void moveLeft()
 {
	 
 }
}
class Node
{
	char ch;
	int x,y;
	Node(char a,int x,int y)
	{
		ch=a;
		this.x=x;
		this.y=y;
	}
}
class Fruit
{
	int x,y,v;
}