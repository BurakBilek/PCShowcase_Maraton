package com.burak.repository;

import com.burak.repository.entity.Computer;
import com.burak.utility.HibernateUtility;
import com.burak.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;
    public ComputerRepository() {
        super(new Computer());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder=entityManager.getCriteriaBuilder();
    }
}
