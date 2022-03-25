public class Sorting {
     public void sortByPriority(){
	    	   Node currNode = this.head, index = null;
	    	   Customer temp;

	    	   if(this.head == null)
	    	       return;
	    	   else {
	    	       while (currNode != null){
	    	           //Node index will point to node next to currNode
	    	           index = currNode.next;

	    	           while (index != null){
	    	               //If current node data is greater than index's node data,
	    	               //swap the data between them
	    	               if(currNode.data.getPriorityNo() > index.data.getPriorityNo()){
	    	                   temp = currNode.data;
	    	                   currNode.data = index.data;
	    	                   index.data = temp;
	    	               }

	    	               index = index.next;
	    	           }
	    	           currNode = currNode.next;
	    	       }
	    	   }
	    	}
	     public void sortByTime(){
	    	   Node currNode = this.head, index = null;
	    	   Customer temp;

	    	   if(this.head == null)
	    	       return;
	    	   else {
	    	       while (currNode != null){
	    	           //Node index will point to node next to currNode
	    	           index = currNode.next;

	    	           while (index != null){
	    	               //If current node data is greater than index's node data,
	    	               //swap the data between them
	    	               if(currNode.data.getTime() > index.data.getTime()){
	    	                   temp = currNode.data;
	    	                   currNode.data = index.data;
	    	                   index.data = temp;
	    	               }

	    	               index = index.next;
	    	           }
	    	           currNode = currNode.next;
	    	       }
	    	   }
	    	}

}
