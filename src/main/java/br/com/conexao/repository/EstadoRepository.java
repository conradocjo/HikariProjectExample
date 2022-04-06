package br.com.conexao.repository;

import br.com.conexao.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {


    @Query(value = "SELECT * FROM ESTADO", nativeQuery = true)
    public List<Estado> getEstado();

}
