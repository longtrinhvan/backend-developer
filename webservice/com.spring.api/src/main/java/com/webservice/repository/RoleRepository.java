package com.webservice.repository;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Repository
public class RoleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> executeCustomProcedure() {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("your_custom_procedure");
        query.registerStoredProcedureParameter("parameter1", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("parameter2", Integer.class, ParameterMode.IN);

        // Thiết lập các tham số
        query.setParameter("parameter1", "value1");
        query.setParameter("parameter2", 123);

        // Thực thi stored procedure
        query.execute();

        // Lấy kết quả từ stored procedure
        List<Object[]> results = query.getResultList();

        return results;
    }
}
