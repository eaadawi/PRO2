package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {

		V value = null;
		if(start.value != null) {
			Node current = start;
			while (current != null && value == null) {
				if (current.key.equals(key))
					value = current.value;
				current = current.next;
			}
		}
		return value;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public V put(K key, V value) {

		if(key == null || value == null) throw new IllegalArgumentException("key and value can't be null");

		Node current = start;
		while(current != null) {
			if(current.value != null) {
				if (current.key.equals(key)) {
					V returnValue = current.value;
					current.value = value;
					return returnValue;
				}
				current = current.next;
			} else current = null;
		}

		Node n = new Node();
		n.key = key;
		n.value = value;
		n.next = start;
		start = n;
		size++;
		return null;
	}

	@Override
	public V remove(K key) {

		V value = null;

		if(start.value != null) {
			if (start.key.equals(key)) {
				value = start.value;
				start = start.next;
			}

			Node prev = start;
			Node current = start.next;

			while (current != null && value == null) {
				if (current.key.equals(key)) {
					value = current.value;
					prev.next = current.next;
					size--;
				}
				prev = current;
				current = current.next;
			}
		}
		return value;
	}

	@Override
	public int size() {

		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
