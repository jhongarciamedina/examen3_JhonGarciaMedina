package com.idat.Ec3_JhonGarciaMedina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.Ec3_JhonGarciaMedina.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>  {

}