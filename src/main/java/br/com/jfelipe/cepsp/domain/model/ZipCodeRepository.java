package br.com.jfelipe.cepsp.domain.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, String> {
}
