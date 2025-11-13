// Brenda Romero
// Brice Yang
// James McKean
// CPSC-39-12705
// 11/13/25
// MapADT.java

/**
 * MapADT is a generic interface for a key-value mapping data structure.
 * It defines the contract for basic map operations like insert, search, and remove.
 */
public interface MapADT<K, V> {
    
    /**
     * Inserts a key-value pair into the map. If the key already exists,
     * the corresponding value is updated.
     * 
     * @param key   the key to insert
     * @param value the value associated with the key
     * @return true if the key-value pair was inserted or updated, false otherwise
     */
    boolean insert(K key, V value);
    
    /**
     * Searches for a value associated with the given key.
     * 
     * @param key the key to search for
     * @return the value associated with the key, or null if not found
     */
    V search(K key);
    
    /**
     * Removes the key-value pair associated with the given key.
     * 
     * @param key the key to remove
     * @return true if the key-value pair was removed, false if not found
     */
    boolean remove(K key);
}
