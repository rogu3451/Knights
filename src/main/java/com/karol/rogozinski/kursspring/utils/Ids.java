package com.karol.rogozinski.kursspring.utils;

import java.util.Collections;
import java.util.Set;

public class Ids {

    static public int generateNewId(Set<Integer> existingIds) {
        if(existingIds.isEmpty()){
            return 0;
        }
        else{
            Integer integer = Collections.max(existingIds);
            System.out.println("Nowe id "+integer);
            return integer+1;
        }
    }
}
