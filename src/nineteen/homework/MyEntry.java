package nineteen.homework;

import java.util.*;

public class MyEntry<K,V>{
    private Map<K,V> something = new HashMap<>();

    public Map<K, V> getSomething() {
        return something;
    }

    public void setSomething(Map<K, V> something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "something=" + something +
                '}';
    }
    //Додавали новий об’єкт в мапу
    public void addSomeNew(K someKey, V someValue){
        something.put(someKey, someValue);
    }
    //Видаляли об’єкт мапи за ключем
    public void removeSomeKey(K someKey){
        something.remove(someKey);
    }
    //Видаляли об’єкт мапи за значенням
    public void removeSomeValue(V someValue){

        Iterator<Map.Entry<K, V>> iterator = something.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<K, V> nextMyEntry = iterator.next();
            if (nextMyEntry.getValue().equals(someValue)){
                iterator.remove();
            }
        }
    }
    //Виводили на екран Set ключів
    public void showSetOfKey(){
        Iterator<Map.Entry<K, V>> iterator = something.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<K, V> nextMyEntry = iterator.next();
            System.out.println(nextMyEntry.getKey());
        }
    }
    //Виводили на екран List значень
    public void showListOfValue(){
        Collection<V> list = something.values();
        for (V l: list) {
            System.out.println(l);
        }
    }
    //Виводили на екран цілу мапу
    public void showMap(){
        System.out.println(something);
    }
}
