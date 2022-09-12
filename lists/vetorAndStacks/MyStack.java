package lists.vetorAndStacks;

import lists.LinkedLists.MyLinkedList;

public class MyStack<E> {
    private MyLinkedList<E> ll= new MyLinkedList<>();

    void push(E e){
        ll.add(e);
    }
    E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("poping from empty list");
        }
        else{
            E result=ll.removeLast();
            return(E) result;
        }
    }
    E seek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("empty list");
        }
        else{
            E result =  ll.getLast();
            return (E)result;
        }
    }

}
