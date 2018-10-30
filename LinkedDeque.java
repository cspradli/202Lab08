import java.util.NoSuchElementException;

public class LinkedDeque<E> implements Deque<E> {

  private static class DNode<E> {

    private E data;
    private DNode<E> previous;
    private DNode<E> next;

    public DNode(E data, DNode<E> previous, DNode<E> next) {
      this.data = data;
      this.previous = previous;
      this.next = next;
    }

    public DNode(E data) {
      this(data, null, null);
    }

    public DNode() {
      this(null, null, null);
    }
  }

  private DNode<E> head;
  private DNode<E> tail;

// Creates both a dummy head and a dummy tail.
  public LinkedDeque() {
    head = new DNode<>();
    tail = new DNode<>();
    head.next = tail;
    tail.previous = head;
  }

  public boolean isEmpty() {
    return head.next == tail;
  }

  public void clear() {
    head.next = tail;
    tail.previous = head;
  }

// Complete the following methods:

  public void addFirst(E element) {
    DNode<E> node = new DNode<>(element);
    node.next = head.next;
    if(head.next != null) head.next.previous = node;
    if(head.next == null) tail = node;
    head.next = node;
  }

  public E removeFirst() {
    if (isEmpty()){
        throw new NoSuchElementException();
    }
    DNode<E> tempFront = head.next.next;
    E data = head.next.data;
    if(tempFront != null) tempFront.previous = head;
    if(tempFront == null) tail = head;
    head.next = tempFront;
    return data;

  }

  public E getFirst() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    return null;
  }

  public boolean removeFirstOccurrence(Object obj) {

    return false;
  }

  public void addLast(E element) {
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    DNode<E> node = new DNode<E>(element);
    node.previous = tail;
    if (tail != null) tail.next = node;
    if (tail == null) head.next = node;
    tail = node;
  }

  public E removeLast() {
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    return null;
  }

  public E getLast() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    return null;
  }

  public boolean removeLastOccurrence(Object obj) {

    return false;
  }

  public void printForward() {
    System.out.println("The deque printed forward:");
    DNode current = head.next;
    while (current != tail) {
      System.out.println(current.data);
      current = current.next;
    }
    System.out.println();
  }

  public void printBackward() {
    System.out.println("The deque printed backward:");
    DNode current = tail.previous;
    while (current != head) {
      System.out.println(current.data);
      current = current.previous;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    LinkedDeque list = new LinkedDeque();
    int j = 12;
    list.addFirst(j);
  }

}