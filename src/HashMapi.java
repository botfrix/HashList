import java.util.Arrays;


public class HashMapi<K, V> implements SimpleCollection<K, V> {

    private static final int DEFAULT_SIZE = 5;
    private static final int MAX_COLLISION_COUNT = 10;

    @SuppressWarnings("unchecked")
    Object[][] arr = new Object[DEFAULT_SIZE][MAX_COLLISION_COUNT];

    public void test() {

        System.out.println(Arrays.deepToString(arr));
    }

    @Override
    public int size() {
        int count = 0;
        for (Object[] b : arr) {
            for (Object a : b) {
                if (a != null) {
                    count += 1;
                }

            }

        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }


    @Override
    public boolean contains(V value) {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean add(K key, V value) {
        int counter = 0;
        int hash = key.hashCode();
        int newIndex = hash & DEFAULT_SIZE - 1;
        //сделать проверку на то, что counter > MAX_COLLISION_COUNT, тогда делается перерасчет DEFAULT_SIZE*2 и ищется новыйй hash и т д и тп если ты не вспомнишь ублюдок я сильно стукну себя коленом
        while (counter != MAX_COLLISION_COUNT && arr[newIndex][counter] != null) {
            if (((Pair<K, V>) arr[newIndex][counter]).getKey() != key) {
                counter += 1;
            } else {
                throw new KeyExistException();
            }
        }
        Pair<K, V> addElement = new Pair<K, V>(key, value);
        arr[newIndex][counter] = addElement;
        System.out.println(arr[newIndex][counter].toString());
        System.out.println(Arrays.toString(arr[newIndex]));
        return true;

    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public boolean removeValue(V value) {
        return false;
    }

    @Override
    public void clear() {

    }

}

