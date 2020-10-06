package com.karol.rogozinski.kursspring;


import com.karol.rogozinski.kursspring.domain.PlayerInformation;
import com.karol.rogozinski.kursspring.domain.repository.KnightRepository;
import com.karol.rogozinski.kursspring.domain.repository.PlayerInformationRepository;
import com.karol.rogozinski.kursspring.domain.repository.QuestRepository;
import com.karol.rogozinski.kursspring.services.QuestService;
import com.karol.rogozinski.kursspring.utils.Role;
import com.karol.rogozinski.kursspring.utils.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Scope("singleton")
@Transactional
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Autowired
    PlayerInformationRepository playerInformationRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {  // przyjmuje dowolna ilosc stringow
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        knightRepository.createKnight("Percival", 32);

        PlayerInformation playerInformation1 = new PlayerInformation("user1","user1");
        playerInformationRepository.createPlayerInformation(playerInformation1);

        PlayerInformation playerInformation2 = new PlayerInformation("user2","user2");
        playerInformationRepository.createPlayerInformation(playerInformation2);

        questService.assignRandomQuest("Percival");

        Role user1RoleUSER = new Role("user1","USER");
        Role user2RoleUSER = new Role("user2","USER");
        Role user2RoleADMIN = new Role("user2","ADMIN");

        roleRepository.persistRole(user1RoleUSER);
        roleRepository.persistRole(user2RoleUSER);
        roleRepository.persistRole(user2RoleADMIN);
    }
}
