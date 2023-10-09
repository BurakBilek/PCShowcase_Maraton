package com.burak.repository;

import com.burak.repository.entity.User;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;

public class UserRepository extends MyFactoryRepository<User,Long> {
    Scanner scanner;
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public UserRepository() {
        super(new User());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }

    public User kullaniciOlustur() {
        return
    }
}
