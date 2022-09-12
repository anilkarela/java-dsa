package Patterns;

import java.util.Scanner;

class Stack{
    int a[];
    int n;
    int top;
    Stack(int n){
        this.n=n;
        this.a=new int[n];
        this.top=-1;
    }


    //push 

//overflow-> when there is no space left to insert data 
void push(){
    System.out.println("Enter your data");
int data=new Scanner(System.in).nextInt();



if(top==(a.length-1))
{
    System.out.println("OVERFLOW CONDITION");
}
else{
   
    top++;
    a[top]=data;
    System.out.println(data+" successfully inserted in the stack");
}



}



    //pop

//underflow-> when there is no element in the stack

void pop(){
    if(top==-1){
        System.out.println("underflow");
    }
    else{
        int data=a[top];
        top--;
        System.out.println(data+" successfully deleted");
    }
}




    //peek
void peek(){
    if(top==-1){
        System.out.println("underflow, not able to find peek element");
    }
    else{
System.out.println(a[top]+ " peek element");
    } 
}

void display(){
    
}


}

public class StackUsingArray {

    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        int size=new Scanner(System.in).nextInt();
        Stack s=new Stack(size);
int n=0;
       do{
System.out.println("ENter youur choice \n1for peel \n2for push \n3for pop");
int m=new Scanner(System.in).nextInt();

switch(m){

    case 1:
    s.peek();
    break;

    case 2:
    s.push();
    break;

    case 3:
    s.pop();
    break;

    case 4:
    s.display();
    break;

    default:
    System.out.println("please enter valid choice");
}



        System.out.println("PRESS 1 FOR CONTINUE ");
        n=new Scanner(System.in).nextInt();
       }
while(n==1);
    }
}
