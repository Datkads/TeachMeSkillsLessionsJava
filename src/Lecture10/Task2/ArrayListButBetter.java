package Lecture10.Task2;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListButBetter<E> extends AbstractList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENT_DATA = {};

    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    Object[] elementData;

    private int size;

    public ArrayListButBetter(){
        this.elementData = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
    }
    public ArrayListButBetter(int initialCapacity){
        if (initialCapacity > 0){
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        }else {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
    }
    //Операции добавления эелемента
    public boolean add(E element){
        ensureCapacityInternal(size + 1);
        elementData[size++] = element;
        return true;
    }
    private void ensureCapacityInternal(int minCapacity){
        if (elementData == DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA){
            minCapacity = Math.max(DEFAULT_CAPACITY,minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }
    private void ensureExplicitCapacity(int minCapacity){
        modCount++;

        if (minCapacity - elementData.length > 0){
            grow(minCapacity);
        }
    }
    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0){
            newCapacity = hugeCapacity(minCapacity);
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    private static int hugeCapacity(int minCapacity){
        if (minCapacity < 0){
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }
    //Операции удаления элемента по индексу
    public E remove(int index) {
        Objects.checkIndex(index, size);
        final Object[] array = elementData;

        @SuppressWarnings("unchecked") E oldValue = (E) array[index];
        fastRemove(array, index);

        return oldValue;
    }
    private void fastRemove(Object[] array, int i) {
        modCount++;
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(array, i + 1, array, i, newSize - i);
        array[size = newSize] = null;
    }
    //Операция очистки коллекции
    public void clear() {
        modCount++;
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }
    //Проверка наличия элемента в коллекции
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    //Получение элемента по индексу
    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }
    @SuppressWarnings("unchecked")
    E elementData(int index) {
        return (E) elementData[index];
    }
    @Override
    public int size() {
        return this.size;
    }
}