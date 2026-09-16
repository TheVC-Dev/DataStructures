public class Tester{
    public static void main(String[] args){
       DoublyLinkedList test1 = new DoublyLinkedList();
       test1.addBack('C');
       test1.addBack('O');
       test1.addBack('M');
       test1.addBack('P');
       test1.addBack('U');
       test1.addBack('T');
       test1.addBack('E');
       test1.printNodes();
       test1.addFront('M');
       test1.printNodes();
       test1.addBack('R');
       test1.printNodes();
       test1.popFront();
       test1.printNodes();
       test1.popBack();
       test1.printNodes();
       test1.addBefore('M', 'P');
       test1.printNodes();
       test1.addBefore('H', 'M');
       test1.printNodes();
       // task 8. does not make sense there is no A in the list to place B before.
       test1.addAfter('C','P');
       test1.printNodes();
       test1.addAfter('L','M');
       test1.printNodes();
       test1.remove('M');
       test1.remove('G');
       test1.moveFront('P');
       test1.moveBack('L');

    }
}
