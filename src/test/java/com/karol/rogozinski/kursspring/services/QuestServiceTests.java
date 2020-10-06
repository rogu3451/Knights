package com.karol.rogozinski.kursspring.services;

import com.karol.rogozinski.kursspring.domain.Quest;
import com.karol.rogozinski.kursspring.domain.repository.QuestRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class QuestServiceTests {

    @Mock
    QuestRepository repositoryMock;

    @Test
    public void returnsNotStartedQuests(){

        List<Quest> quests = new ArrayList<>();
        Quest q1 = new Quest (1,"Test quest 1");
        Quest q2 = new Quest (2,"Test quest 2");
        Quest q3 = new Quest (3,"Test quest 3");

        q2.setStarted(true);

        quests.add(q1);
        quests.add(q2);
        quests.add(q3);

        when(repositoryMock.getAll()).thenReturn(quests);

        QuestService qs = new QuestService();

        qs.setQuestRepository(repositoryMock);

        List<Quest> allNotStartedQuests = qs.getAllNotStartedQuests();

        assertEquals("Size of returned quest", 2 , allNotStartedQuests.size());
        assertThat(allNotStartedQuests, containsInAnyOrder(q1,q3));
    }
}
