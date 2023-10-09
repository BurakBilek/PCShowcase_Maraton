package com.burak.repository;

import com.burak.repository.entity.ComputerSpec;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerSpecRepository extends MyFactoryRepository<ComputerSpec,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public ComputerSpecRepository() {
        super(new ComputerSpec());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }
}
