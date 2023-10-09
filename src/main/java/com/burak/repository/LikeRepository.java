package com.burak.repository;

import com.burak.repository.entity.Like;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class LikeRepository extends MyFactoryRepository<Like,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public LikeRepository() {
        super(new Like());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }
}
