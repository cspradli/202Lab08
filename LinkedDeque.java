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
    head.next.previous = node;
    head.next = node;
    node.previous = head;
  }

  public E removeFirst() {
    if (isEmpty()) throw new NoSuchElementException();
    E data = head.next.data;
    head.next = head.next.next;
    head.next.previous = head;
    return data;
  }

  public E getFirst() {
    if(isEmpty()) throw new NoSuchElementException();
    return head.next.data;
  }

  public boolean removeFirstOccurrence(Object obj) {
    DNode<E> current = head.next;
    while(current.next != null){
      if (current.data.equals(obj)){
        current.previous.next = current.next;
        current.next.previous = current.previous;
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public void addLast(E element) {
    if(isEmpty()) throw new NoSuchElementException();
    DNode<E> node = new DNode<>(element);
    node.previous = tail.previous;
    tail.previous.next = node;
    tail.previous = node;
    node.next = tail;
  }

  public E removeLast() {
    E data = tail.previous.data;
    tail.previous = tail.previous.previous;
    tail.previous.next = tail;
    return data;
  }

  public E getLast() {
    if (isEmpty()) throw new NoSuchElementException();
    return tail.previous.data;
  }

  public boolean removeLastOccurrence(Object obj) {
    DNode<E> current = tail.previous;
    while(current != null){
      if (current.data.equals(obj)){
        current.previous.next = current.next;
        current.next.previous = current.previous;
        return true;
      }
      current = current.previous;
    }
    return false;
  }

  public void printForward() {
    System.out.println("The deque printed forward:");
    DNode<E> current = head.next;
    while (current != tail) {
      System.out.println(current.data);
      current = current.next;
    }
    System.out.println();
  }

  public void printBackward() {
    System.out.println("The deque printed backward:");
    DNode<E> current = tail.previous;
    while (current != head) {
      System.out.println(current.data);
      current = current.previous;
    }
    System.out.println();
  }
}