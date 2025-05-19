package Controller;

import Dto.ProdutoDto;
import Model.ProdutoModel;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<ProdutoModel> inserir(@RequestBody @Valid ProdutoDto produto) {
        ProdutoModel produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produto, produtoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> buscarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }
}
