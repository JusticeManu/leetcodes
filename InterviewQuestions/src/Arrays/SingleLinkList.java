package Arrays;

public class SingleLinkList {
	
   public Node head;
   public Node tail;
   int size=0;
   
   public Node createSingleLinkedList(int nodevalue) {
	   
	   head= new Node();
	   Node node=new Node();
	   node.data=nodevalue;
	   node.next=null;
	   head=node;
	   tail=node;
	   size=1;
	   
	   return head; 
	   
   }

   
   public void linkedList(int nodevalue,int position) {
	   
	   Node node=new Node();
	   node.data=nodevalue;
	   if(head == null) {
		  
		   createSingleLinkedList(nodevalue);
	   } else if( position == 0) {
		   
		   Node currenthead=head;
		   node.next=currenthead; 
		   head=node;
	   }else if(position >= size) {
		   node.next=null;
		   tail.next=node;
		   tail=node;
		   
	   } else {
		   
		   Node tempHead=head;
		   int index=1;
		   while(index <= position-1) {
			   
			   tempHead=tempHead.next;
			   index++;
		   }
		   
		   
		   Node nextNode=tempHead.next;
		   tempHead.next=node;
		   node.next=nextNode;
		   
		   
	   }
	   
	   size++;
	   
	   
   }
   
   public void transversal() {
	   if( head == null) {
		   System.out.println("No node added");
	   }
	   Node tempnode=head;
	   for(int i=0;i<size;i++) {
		   
		   System.out.println(tempnode.data);
		   tempnode=tempnode.next;
	   }
	   System.out.println();
   }
  
}
