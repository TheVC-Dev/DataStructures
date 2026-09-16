class DoublyLinkedList<T>{

    private static class Node<T>{
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value){
            this.value = value;
        }
    }
    private Node<T> head;
    private Node<T> tail;

    public void addBack(T value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void addFront(T value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;
        }
        else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void popBack(){
        if(tail == null){
            System.out.println("Cannot popBack. List is empty.");
            return;
        }

        if(head == tail){
            head = tail = null;
        }
        else {
            tail = tail.previous;
            tail.next = null;
        }
    }

    public void popFront(){
        if(head == null){
            System.out.println("Cannot popFront. List is empty.");
            return;
        }
        if(head == tail){
            head = tail = null;
        }
        else {
            head = head.next;
            head.previous = null;
        }
    }

    public void addBefore(T value, T target){
        Node<T> current = head;

        while(current != null && !current.value.equals(target)){
            current = current.next;
        }

        if (current == null){
            addBack(value);
        } else if (current == head){
            addFront(value);
        }
        else{
            Node<T> newNode = new Node<>(value);
            newNode.next = current;
            newNode.previous = current.previous;
            current.previous.next = newNode;
            current.previous = newNode;
        }
    }

    public void addAfter(T value, T target){
        Node<T> current = head;

        while(current != null && !current.value.equals(target)){
            current = current.next;
        }

        if (current == null || current.next == null){
            addBack(value);
        }
        else{
            Node<T> newNode = new Node<>(value);
            newNode.previous = current;
            newNode.next = current.next;
            current.next.previous = newNode;
            current.next = newNode;
        }
    }

    public void remove(T target){
        Node<T> current = head;

        while(current != null && !current.value.equals(target)){
            current = current.next;
        }

        if (current == null){
            return;
        }

        if(current.previous != null){
            current.previous.next = current.next;
        }else{
            head = current.next;
        }

        if(current.next != null){
            current.next.previous = current.previous;
        }
        else{
            tail = current.previous;
        }

        current.next = null;
        current.previous = null;

    }

    public void moveFront(T target){

        Node<T> current = head;

        while(current != null && !current.value.equals(target)){
            current = current.next;
        }

        if (current == null || current == head){
            return;
        }

        remove(current.value);
        addFront(current.value);
    }

    public void moveBack(T target){

        Node<T> current = head;

        while(current != null && !current.value.equals(target)){
            current = current.next;
        }

        if (current == null || current == tail){
            return;
        }

        remove(current.value);
        addBack(current.value);
    }

    public void printNodes(){
        Node current = head;

        if(head == null){
            System.out.println("List ia Empty.");
            return;
        }

        while(current.next != null){
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println(current.value);

    }

}
