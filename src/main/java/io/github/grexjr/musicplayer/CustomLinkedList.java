package io.github.grexjr.musicplayer;

public class CustomLinkedList<T> {

    class Node<T> {

        private T data;
        private Node<T> next,prev;

        public Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public T getData(){ return data;}
        public void setData(T data) {this.data = data;}
        public Node<T> getNext() {return next;}
        public Node<T> getPrev() {return prev;}
        public void setNext(Node<T> next) {this.next = next;}
        public void setPrev(Node<T> prev) {this.prev = prev;}

    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public CustomLinkedList(int size){
        this.first = null;
        this.last = null;
        this.size = size;
    }

    public CustomLinkedList(){
        this.first = null;
        this.last = null;
    }

    public void setFirst(Node<T> first) { this.first = first;}
    public void setLast(Node<T> last) { this.last = last;}

    public Node<T> getFirst() { return first; }
    public Node<T> getLast() { return last; }

    /**
     *   Insert a node at the position after last
     * @param data the value to insert
     */
    public void insert(T data){
        // Create the new node
        Node<T> newNode = new Node<T>(data);
        // If the list is empty, need to set first and last to the new node, and set new node's next to itself
        if(first == null){
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
            first = newNode;
            last = newNode;
            return;
        }

        // If list is not empty, insert at end
        // Set new node's next to first
        newNode.setNext(first);
        // Set new node's prev to last
        newNode.setPrev(last);
        // Set previous last node's next to the new node
        last.setNext(newNode);
        // Set first node's prev to new node
        first.setPrev(newNode);
        // Move the last pointer to the new node
        last = newNode;
    }

    // TODO: Insert, search, reverse, shuffle/randomize etc.

}
