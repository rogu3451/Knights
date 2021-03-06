package com.karol.rogozinski.kursspring;

import com.karol.rogozinski.kursspring.controllers.QuestController;
import com.karol.rogozinski.kursspring.domain.Knight;
import com.karol.rogozinski.kursspring.domain.PlayerInformation;
import com.karol.rogozinski.kursspring.domain.Quest;
import com.karol.rogozinski.kursspring.services.KnightService;
import com.karol.rogozinski.kursspring.services.QuestService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@WebAppConfiguration
public class WebContextTest {

    @Mock
    KnightService knightService;

    @Mock
    QuestService questService;

    @Mock
    PlayerInformation playerInformation;

    @InjectMocks
    QuestController questController;

    private MockMvc mockMvc;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(questController).build();

    }

//    @Test
//    public void testCheckQuest() throws Exception{
//
//        mockMvc.perform(get("/checkQuests"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/knights"));
//
//    }

}
