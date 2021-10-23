package com.hastable;

import java.util.ArrayList;

public class MyHashMap<K, V> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> myBucketArray;

	MyHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		// Create Empty Buckets LinkedList
		for (int i = 0; i < numBuckets; i++)
			this.myBucketArray.add(null);
	}

	private int getBucketIndex(K key) {
		int indexOfHasCode = Math.abs(key.hashCode());
		int index = indexOfHasCode % numBuckets;
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myList = this.myBucketArray.get(index);
		if (myList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> LinkedList = this.myBucketArray.get(index);
		if (LinkedList == null) {
			LinkedList = new LinkedList<>();
			this.myBucketArray.set(index, LinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) LinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			LinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + myBucketArray + '}';
	}
}
