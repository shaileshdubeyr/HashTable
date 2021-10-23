package com.hastable;

public class MyHashMap<K, V> {
	LinkedList<K> myLinkList;

	MyHashMap() {
		this.myLinkList = new LinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + myLinkList + "}";
	}
}
