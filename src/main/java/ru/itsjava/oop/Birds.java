package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Birds {
    private final String name;
    private boolean isTalking;

//    public Birds(String name){
//        this.name = name;
//    }
//
//    public Birds(String name, boolean isTalking){
//        this.name = name;
//        this.isTalking = isTalking;
//    }
//
//    public String toString(){
//        return "{ name:" + name + " isTalking:" + isTalking + "}";
//    }
}
