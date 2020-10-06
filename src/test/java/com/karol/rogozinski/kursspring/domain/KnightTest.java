package com.karol.rogozinski.kursspring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {

    @Test
    public void testIfQuestMarkedAsStrated(){
        Knight knight = new Knight("Percival",25);
        Quest quest = new Quest(1,"Testowe zadanie");
        knight.setQuest(quest);
        assertTrue(quest.isStarted());
    }
}
