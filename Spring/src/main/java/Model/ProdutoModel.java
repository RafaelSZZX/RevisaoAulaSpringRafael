package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBPRODUTO")
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto")
    private int idProduto;

    private String nmProduto;
    private String dsProduto;
    private double vlProduto;


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public String getDsProduto() {
        return dsProduto;
    }

    public void setDsProduto(String dsProduto) {
        this.dsProduto = dsProduto;
    }


    public double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(double vlProduto) {
        this.vlProduto = vlProduto;
    }
}
