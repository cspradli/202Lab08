public class LinkedDequeDriver{
    public static void main(String[] args) {
        LinkedDeque<String> list = new LinkedDeque<>();
        list.addFirst("James");
        list.printForward();
        list.addFirst("Bill");
        list.printForward();
        list.addFirst("Cromwell");
        list.printForward();
        list.removeFirst();
        list.printForward();
        list.addFirst("Peter");
        list.printForward();
        System.out.println("First in list:\n"+list.getFirst()+"\n");
        list.removeFirstOccurrence("Bill");
        list.printForward();
        list.addLast("Ben");
        list.printForward();
        list.addLast("Bernard");
        list.printForward();
        list.removeLast();
        list.printForward();
        System.out.println("Last in list:\n"+list.getLast()+"\n");
    }
}