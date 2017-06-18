package br.com.jfelipe.cepsp.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCode, String> {

    @Query("select count(z) from ZipCode z")
    long count();
}
