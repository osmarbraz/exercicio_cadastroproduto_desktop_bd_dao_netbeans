package dao.produto;

import dao.Conexao;
import dao.DadosBanco;
import modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOMySQL implements ProdutoDAO {

    public boolean salvar(Produto produto) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = null;
            if (produto.getProdutoId() != -1) {
                sql = "update produto set NOME=?, PRECOVENDA=?, PRECOCUSTO=?, UNIDADE=?, CATEGORIA=? where PRODUTOID = ?";
            } else {
                sql = "insert into produto (NOME, PRECOVENDA, PRECOCUSTO, UNIDADE, CATEGORIA)  values  (?,?,?,?,?)";
            }

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, produto.getNome());
            pstmt.setString(2, produto.getPrecoVenda());
            pstmt.setString(3, produto.getPrecoCusto());
            pstmt.setString(4, produto.getUnidade());
            pstmt.setString(5, produto.getCategoria());
            if (produto.getProdutoId() != -1) {
                pstmt.setInt(6, produto.getProdutoId());
            }
            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    public boolean apagarPK(int produtoId) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = "delete from produto where produtoId = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, produtoId);
            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    public Produto consultarPK(String produtoId) {
        Produto produto = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from produto where produtoId = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(produtoId));
            rs = pstmt.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                produto.setProdutoId(rs.getInt("produtoId"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoVenda(rs.getString("precoVenda"));
                produto.setPrecoCusto(rs.getString("precoCusto"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setCategoria(rs.getString("categoria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return produto;
    }

    public List consultarTudo() {
        Produto produto = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        try {
            String sql = "select * from produto";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                produto.setProdutoId(rs.getInt("produtoId"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoVenda(rs.getString("precoVenda"));
                produto.setPrecoCusto(rs.getString("precoCusto"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setCategoria(rs.getString("categoria"));
                lista.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return lista;
    }

}
