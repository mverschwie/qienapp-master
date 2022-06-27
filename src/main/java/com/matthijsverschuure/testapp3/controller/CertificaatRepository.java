package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Certificaat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface CertificaatRepository extends CrudRepository<Certificaat, Long> {
}
