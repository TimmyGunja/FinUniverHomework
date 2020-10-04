package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main_29_09_2020 {
    // Задача 2
    public static <K,V>Map<V, HashSet<K>> replace(Map<? extends K, ? extends V> map){
        HashMap<V, HashSet<K>> mapFinal = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet();
        for (K key:keys){
            V value = map.get(key);
            mapFinal.compute(value, (v, k) -> {
                if (k == null)
                    k = new HashSet<>();
                k.add(key);
                return k;
            });
        }
        return mapFinal;
    }
}
