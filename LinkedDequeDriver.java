public class LinkedDequeDriver{
    public static void main(String[] args) {
        LinkedDeque<String> list = new LinkedDeque<>();
        list.addFirst("james");
        list.printForward();
        list.addFirst("bill");
        list.printForward();
        list.addFirst("cromwell");
        list.printForward();
        list.removeFirst();
        list.printForward();
    }
}