package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class WorkintechList<E extends Comparable<E>> {


    private List<E> list;
    private Set<E> set;

    public WorkintechList(){
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public List<E> getList() {
        return list;
    }

    public Set<E> getSet() {
        return set;
    }

    public boolean add(E element){
        if(!(set.contains(element))){
            list.add(element);
            set.add(element);
            return true;
        }
        return false;
    }

    public void sort(){
        List<E> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        System.out.println(sortedList);

    }

    public boolean remove(Object o){
        if (set.contains(o)) {
            set.remove(o);
            list.remove(o);

            Collections.sort(list);
            return true;
        }
        return false;
    }
    public int size(){
        return list.size();
    }
    public void WorkintechList(){
        System.out.println(getList());

    };
    public E get(int index){
       return list.get(index);


    }
    public E set(int index,E element){
        if (!set.contains(element)) {
            E oldElement = list.set(index, element);
            set.remove(oldElement);
            set.add(element);
            return oldElement;
        }
        return null;

    }
    public boolean contains(Object o){
        return list.contains(o);
    }


}
