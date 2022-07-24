package com.sachin.repository;

import com.sachin.model.Container;
import com.sachin.model.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface HostRepository extends JpaRepository<Host, Integer> {

//    @Query("select c from Container c join Host h where h.host_id = c.host_id AND h.host_id = ?1")
//    public List<Container> getContainers(int id);
}
