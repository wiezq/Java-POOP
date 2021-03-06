package eight;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    public BoundedWaitList(Collection<E> col){
        super(col);
        this.capacity = col.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < this.capacity)
        {
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
