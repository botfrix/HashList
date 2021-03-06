public interface SimpleCollection<K,V> {
    int size();

    boolean isEmpty();

    boolean contains(V value);

    boolean containsKey(K key);

    boolean add(K key, V value);

    boolean remove(K key);

    boolean removeValue(V value);

    void clear();
}