package LinkedLists;
import java.util.*;

public class LLtraversal {
      
      public static void main(String[] args){

        int[] arr= {12,30,56,20,87};

        node head=new node(arr[0]);
        node current=head;


       //making linkedlist from array
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            current.next=temp;
            current=temp;
        }

        node temp=head;
        int count=0;
        //traversing the ll
        while(temp!=null){
            System.out.println(temp.data+ " ");
            temp=temp.next;
            count++;



        }
        System.out.println(count);   //length of LL




    }
    
}

class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
    node(int data,node next){
        this.data=data;
        this.next=next;
    }
}
