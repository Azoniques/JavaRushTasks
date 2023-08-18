package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        int count =  0;
        for(List<V> list : map.values()){
            count += list.size();
        }
        return count;
    }

    @Override
    public V put(K key, V value) {
        if(!map.containsKey(key)){
            ArrayList <V> arrayList = new ArrayList<>();
            arrayList.add(value);
            map.put(key, arrayList);
            return null;
        }else{
            if(map.get(key).size()<repeatCount){
                map.get(key).add(value);
                return map.get(key).get(map.get(key).size() -2);
            }else{
                List<V> list = map.get(key);
                list.add(value);
                list.remove(0);
                return list.get(repeatCount -2);
            }
        }
    }

    @Override
    public V remove(Object key) {
        if(map.get(key) != null){
            List<V> list = map.get(key);
            V temp = list.remove(0);
            if (list.isEmpty()){
                map.remove(key);
            }
            return temp;
        }else{
            return null;
        }
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
}

    @Override
    public Collection<V> values() {
        List<V> temp = new ArrayList<>();
        for(Map.Entry<K, List<V>> entry : map.entrySet()){
            temp.addAll(entry.getValue());
        }
        return temp;
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for(Map.Entry<K,List<V>> entry : map.entrySet()){
            for(V v :entry.getValue()){
                if(v.equals(value)){
                    return true;
                }
            }
        }return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}