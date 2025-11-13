// Brenda Romero
// Brice Yang
// James McKean
// CPSC-39-12705
// 11/13/25
// ChainingHashTableItem.java

public class ChainingHashTableItem<K, V> {
   public K key;
   public V value;
   public ChainingHashTableItem<K, V> next;

   public ChainingHashTableItem(K itemKey, V itemValue) {
      key = itemKey;
      value = itemValue;
      next = null;
   }
}