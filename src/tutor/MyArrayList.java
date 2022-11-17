package tutor;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyArrayList<T> {

    private T[] list = (T[]) new Object[0];

    
    public boolean add(T o) {
        T[] newList = (T[]) new Object[this.size() +1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        newList[this.size()] = (T) o;
        list = newList;
        return true;
    }

    
    public int size() {
        return list.length;
    }

    
    public boolean isEmpty() {
        return list.length == 0;
    }


    public boolean contains(T o) {
        for (int i = 0; i < list.length; i++) {
            if (o.equals(list[i])) {
                return true;
            }
        }
        return false;
    }

    
    public Iterator iterator() {
        return null;
    }

    
    public Object[] toArray() {
        return list;
    }

    
    public boolean remove(T o) {
        if (!this.contains(o)) {
            return false;
        }
        int indexOfObjectNeedToDelete = Arrays.binarySearch(list, o);
        for (int i = indexOfObjectNeedToDelete; i < list.length -1; i++) {
            list[i] = list[i +1];
        }
        //new array
        T[] newList = (T[]) new Object[list.length -1];
        for (int i = 0; i < newList.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
        return true;
    }

    
    public boolean addAll(MyArrayList o) {
        for (int i = 0; i < o.size(); i++) {
            this.add((T) o.get(i));
        }
        return true;
    }

    
    public boolean addAll(int index, Collection c) {
        return false;
    }

    
    public void replaceAll(UnaryOperator operator) {

    }

    
    public void sort(Comparator c) {

    }

    
    public void clear() {
        this.list = (T[]) new Object[0];

    }

    
    public Object get(int index) {
        return list[index];
    }

    
    public Object set(int index, Object element) {
        this.list[index] = (T) element;
        return this.list[index];
    }

    
    public void add(int index, Object element) {

    }

    
    public Object remove(int index) {
        return null;
    }

    
    public int indexOf(Object o) {
        return 0;
    }

    
    public int lastIndexOf(Object o) {
        return 0;
    }

    
    public ListIterator listIterator() {
        return null;
    }

    
    public ListIterator listIterator(int index) {
        return null;
    }

    
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    
    public Spliterator spliterator() {
        return null;
    }

    
    public boolean retainAll(Collection c) {
        return false;
    }

    
    public boolean removeAll(Collection c) {
        return false;
    }

    
    public boolean containsAll(Collection c) {
        return false;
    }

    
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    
    public String toString() {
        String result = "[";
        for (int i = 0; i < list.length; i++) {
            result += list[i];
            if (i < list.length -1) {
                result += ",";
            }
        }

        return result + "]";
    }
}
