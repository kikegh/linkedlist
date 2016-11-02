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
public class Node {
    Object data;
    Node NextNode;

    public Node(Object data) {
        this.NextNode =null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node NextNode) {
        this.NextNode = NextNode;
    }
    
}
