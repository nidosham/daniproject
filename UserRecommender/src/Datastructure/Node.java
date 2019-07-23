

public class Node
{
	public String name, address ,rel;
	public int number;

	
	public  Node next;
	
    /*	public Node()
	    {
		    this(null,null,null,null,null,null);
	    }*/
	    public Node(String a,String b,String c,int d)
		{
			this(a,b,c,d,null);
		}
			
		public Node(String a,String b,String c,int d, Node e)
		{
			name=a;
			address=b;
			rel=c;
			number=d;
			
			next=e;
			
			}
			
	}