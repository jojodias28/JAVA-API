package br.com.ibm.Algacrmapi.repository;

import br.com.ibm.Algacrmapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClenteRepository extends JpaRepository<Cliente, Long> {
}
