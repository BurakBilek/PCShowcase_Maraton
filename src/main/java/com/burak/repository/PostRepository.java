package com.burak.repository;

import com.burak.repository.entity.Post;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PostRepository extends MyFactoryRepository<Post,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public PostRepository() {
        super(new Post());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }
}
