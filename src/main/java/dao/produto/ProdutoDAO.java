package dao.produto;

import java.util.List;
import modelo.Produto;

public interface ProdutoDAO {

    public boolean salvar(Produto produto);

    public Produto consultarPK(String produtoId);

    public boolean apagarPK(int produtoId);

    public List consultarTudo();
}
