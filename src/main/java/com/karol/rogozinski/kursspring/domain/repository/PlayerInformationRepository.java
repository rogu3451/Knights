package com.karol.rogozinski.kursspring.domain.repository;

import com.karol.rogozinski.kursspring.domain.PlayerInformation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PlayerInformationRepository {

    @PersistenceContext
    private EntityManager em;


    @Transactional
    public void createPlayerInformation(PlayerInformation playerInformation) {

        em.persist(playerInformation);
    }

    public PlayerInformation getFirst() {
        return em.createQuery("from PlayerInformation", PlayerInformation.class).getResultList().get(0);
    }
}
