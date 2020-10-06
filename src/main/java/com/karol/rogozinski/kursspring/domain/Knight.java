package com.karol.rogozinski.kursspring.domain;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Knight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min=2, max=40, message = "Imie rycerza musi mieć między 2, a 40 znaków")
    private String name;

    @NotNull
    @Range(min=18, max=60, message = "Rycerz musi mieć conajmniej 18 lat, a nie wiecej niz 60")
    private int age;


    private int level;

    @OneToOne
    private Quest quest;

    public Knight(){

    }

    public Quest getQuest() {
        return quest;
    }

    public Knight(String name, int age){
       this.name =  name;
       this.age = age;
       this.level = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setQuest(Quest quest){

        if(quest!=null) {
            quest.setStarted(true);
        }

        this.quest = quest;
    }

    public void setAge(int age){
       this.age = age;
    }

    public int getAge(){
       return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu " + name + "(" + age +"). Ma za zadanie: "+quest;
    }



}
