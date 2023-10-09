package com.burak.repository;

import com.burak.repository.entity.Photo;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PhotoRepository extends MyFactoryRepository<Photo,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public PhotoRepository() {
        super(new Photo());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }
}
