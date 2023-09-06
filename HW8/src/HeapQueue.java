public class HeapQueue<E extends Comparable<E>> implements Queue<E> {
    private Heap<E> heap;
    
    public HeapQueue() {
        heap = new Heap<E>();
    }
    public int size() {
        return heap.size;
        //TODO: implement this method
    }
    public boolean isEmpty() {
        //TODO: implement this method
        return heap.isEmpty();
    }
    public void enqueue(E e) {
        //TODO: implement this method
        heap.add(e);
    }
    public E dequeue() {
        //TODO: implement this method
        return heap.remove();
    }
    public E first() {
        //TODO: implement this method
        return heap.min();
    }
}
