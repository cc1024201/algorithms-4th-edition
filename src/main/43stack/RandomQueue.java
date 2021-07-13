
public class RandomQueue<Item> {
    private Item[] item;
    private int N;

    public RandomQueue() {
        item = (Item[]) (new Object[10]);
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void resize(int n) {
        @SuppressWarnings("unchecked")
        Item[] temp = (Item[]) (new Object[n]);
        for (int i = 0; i < N; ++i) {
            temp[i] = item[i];
        }
        item = temp;
    }

    public void enqueue(Item data) {
        if (N == item.length) {
            resize(2 * N);
        }
        item[N++] = data;
    }

    public Item dequeue() {
        if (isEmpty()) {
            return null;
        }
        //random swap
        int r = StdRandom.uniform(N);
        Item temp = item[r];
        item[r] = item[--N];
        item[N] = null;
        return temp;
    }

    public Item sample() {
        if (isEmpty()) {
            return null;
        }
        int r = StdRandom.uniform(N);
        Item ret = item[r];
        return ret;
    }

    public int size() {
        return N;
    }
}