public class LinkedDequeDriver{
    public static void main(String[] args) {
        LinkedDeque<String> list = new LinkedDeque<>();
        list.addFirst("James");
        list.addFirst("Bill");
        list.addFirst("Cromwell");
        list.addFirst("Binky");
        list.addFirst("Popo");
        list.printForward();
        list.removeFirst();
        list.printForward();
        System.out.println("First in list:\n"+list.getFirst()+"\n");
        list.removeFirstOccurrence("Bill");
        list.printForward();
        list.addLast("Ben");
        list.addLast("Bernard");
        list.addLast("Bell");
        list.printForward();
        list.removeLast();
        list.printForward();
        System.out.println("Last in list:\n"+list.getLast()+"\n");
        list.addLast("Bees");
        list.addLast("James");
        list.addLast("Conk");
        list.printForward();
        list.removeLastOccurrence("James");
        list.printForward();
    }
}