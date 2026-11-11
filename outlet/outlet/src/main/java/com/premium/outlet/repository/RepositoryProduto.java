package com.premium.outlet.repository;

import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {

    Page<Produto> findByTipo(String tipo, Pageable pageable);

    Page<Produto> findByMarca(String Marca, Pageable pageable);

    Page<Produto>  findByTipoContainingIgnoreCase(String tipo, Pageable pageable);
}
