package LinkedLists;
import java.util.*;

public class l1 {

    //array to linkedlist
    private static node arr2ll(int[] arr){
        node head= new node(arr[0]);
        node current= head;
        for(int i=0;i<arr.length;i++){
            node temp=new node(arr[i]);
            current.next=temp;
            current=temp;

        }
        return current;

    }
    public static void main(String[] args){
        int[] arr= {12,20,10,30};
        node h1= arr2ll(arr);
        System.out.println(h1.data);





    }
    
}

class node{
    int data;
    node next;
    

    //make two constructors , 1st one for case when we don't want to initialize the next pointer
    node(int data){
        this.data=data;
        this.next=null;

    }

    //second one forcase when we have to initialize the next pointer 
    node(int data, node next){
        this.data=data;
        this.next=next;
    }


}
