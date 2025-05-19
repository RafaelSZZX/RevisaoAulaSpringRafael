package repository;

import Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

    Optional<ProdutoModel> findByIdProduto(int idProduto);

    Optional<ProdutoModel> findAllByIdProduto(int idProduto);
}
