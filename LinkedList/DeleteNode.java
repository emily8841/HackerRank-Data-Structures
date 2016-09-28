Node Delete(Node head, int position) {
    
    Node n = head;
    int count = 0;
    if(position == 0){
        return head.next;
    }
    while(n.next != null){
        
        if( count == position-1){
            n.next = n.next.next; 
            return head;
        }        
        count ++;       
        n = n.next;        
    }
return head;
}