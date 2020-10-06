package com.karol.rogozinski.kursspring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestTest {

    @Test
    public void settingStartedFlagToFalseShouldSetStartDate(){
        Quest quest = new Quest(1,"Testowe zadanie");
        quest.setStarted(true);

        assertNotNull(quest.startDate);
    }

    @Test
    public void questShouldBeCompleted(){
        Quest quest = new Quest(1,"Testowe zadanie");
        quest.setStarted(true);
        quest.lenghtInSeconds = -60; // gdy, quest wystartowal juz sie zakonczy, typowy whiteBox testing bo wiemy jak wyglada implementacja
        assertTrue(quest.isCompleted());
        assertTrue(quest.isCompleted()); // sprawdzenie czy odpowiednia flaga zostala ustawiona
    }

    @Test
    public void questShouldBeNotCompleted(){
        Quest quest = new Quest(1,"Testowe zadanie");
        quest.setStarted(true);
        quest.lenghtInSeconds = 60000; // gdy, quest wystartowal juz sie zakonczy, typowy whiteBox testing bo wiemy jak wyglada implementacja
        assertFalse(quest.isCompleted());
        assertFalse(quest.isCompleted()); // sprawdzenie czy odpowiednia flaga zostala ustawiona
    }
}
