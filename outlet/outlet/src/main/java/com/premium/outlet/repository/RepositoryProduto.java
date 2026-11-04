package com.premium.outlet.repository;

import com.premium.outlet.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {
}
