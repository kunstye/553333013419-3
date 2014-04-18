package com.rmuti.datastructure;

public class ArrayList {

	private Object[] elementData = new Object[1];
	private int size = 0;
	
	public void add(Object e) {
		add(size, e);
		
	}

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size - 1 ; j>= i; j--){
			elementData[j+1]= elemenData[j];
			
		}
		elementData[i] = e;
		size++;
	
	
	
}
