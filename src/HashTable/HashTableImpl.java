package HashTable;

import java.util.ArrayList;

class HashNode<K, V>
{
    K key;
    V value;
 
    // Reference to next node
    HashNode<K, V> next;
 
    // Constructor
    public HashNode(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}
public class HashTableImpl <K ,V>{
	// bucketArray is used to store array of chains
    private ArrayList<HashNode<K, V>> bucketArray;
 
    // Current capacity of array list
    private int numBuckets;
 
    // Current size of array list
    private int size;
}
