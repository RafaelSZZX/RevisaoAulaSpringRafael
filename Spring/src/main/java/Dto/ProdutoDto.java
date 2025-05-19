package Dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(@NotBlank(message = "Não é permitido inserir em branco") String nmProduto,
                         @NotBlank(message = "Não é permitido inserir em branco") String dsProduto,
                         @NotNull(message = "Não é permitido inserir Vazio") Double vlProduto) {
}
