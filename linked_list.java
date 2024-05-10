public class linked_list {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        //create new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        //link
        newnode.next=head;
        //head=newnode
        head=newnode;
    } 
    public void addlast(int data){
        //create new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.print("the LL is empty");
        }
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removefirst(){
        if(size==0){
            System.out.print("LL is empty");
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removelast(){
        if(size == 0){
            System.out.print("the LL is empty");
        }
        else if(size == 0){
            int val=head.data;
            head=tail=null;
            size =0;
            return val;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                    return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;

    }
    public int helper(node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx ==-1){
                return -1;
            }
            return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        node prev=null;
        node curr=head;
        node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        node temp=head;
        while(temp != null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String args[]){
        linked_list ll=new linked_list();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(4,5);
        ll.print();

        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();

       
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);

        ll.removelast();
        ll.print();
        System.out.println(ll.size); 
        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(4));
        
    }
    
}
