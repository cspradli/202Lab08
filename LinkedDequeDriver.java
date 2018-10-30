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
        System.out.println("First in list:\n"+list.getFirst());
        list.removeFirstOccurrence("Peter");
        list.printForward();
    }
}