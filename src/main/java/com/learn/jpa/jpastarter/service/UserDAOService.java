package com.learn.jpa.jpastarter.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.learn.jpa.jpastarter.entity.User;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);

        return user.getId();

    }

}
