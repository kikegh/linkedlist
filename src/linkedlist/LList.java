/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author drago
 */
public class LList {
     Node firstNode;
        

    public void add(Object data) {
        if (firstNode == null) {
            firstNode = new Node(data);
        } else {
            Node current = firstNode;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(new Node(data));
        }
    }

    public void prepends(Object data) {
        if (firstNode == null) {
            firstNode = new Node(data);
        } else {
            Node node = new Node(data);
            Node aux = firstNode;
            node.setNextNode(aux);
        }
    }
    public Object get(int index){
        Node current = firstNode;
        if(firstNode == null){
            return null;
        }else{
            int counter = 0;
            while(counter < index){
                counter++;
                if(current.getNextNode() != null){
                    current = current.getNextNode();
                }else{
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        return current.getData();
    }
    public Object shift(){
         Object first;
        if(firstNode == null){
            return null;
        }else{
            first = firstNode.getData();
            Node second = firstNode.getNextNode();
            firstNode = second;
        }
        return first;
    }
    
}
