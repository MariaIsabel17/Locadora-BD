
package DAO;

import Modelo.Aluguel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gabri
 */
public class AluguelDAO  extends ExecuteSQL{

    public AluguelDAO(Connection con){
    super(con);
    }
    
public  String Inserir_Aluguel(Aluguel a){

        String sql = "INSERT INTO  aluguel VALUES (0,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1,a.getCod());
            ps.setInt(2,a.getCoddvd());
            ps.setInt(3,a.getCodcliente());
            ps.setString(4,a.getData_aluguel());
            ps.setString(5,a.getHorario());
            ps.setString(6,a.getData_devolucao());

        if(ps.executeUpdate() > 0){
            return "Inserido com sucesso";
        }else{
            return "Erro ao Insessir";
        }
        }catch(SQLException e){
            return e.getMessage();
        }
}

public List<Aluguel>  ListarAluguel(){
    
    String sql = "SELECT * FROM aluguel";
    List<Aluguel> lista = new ArrayList<>();
    
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs =  ps.executeQuery();
    
    if(rs != null){
        while(rs.next()){
            Aluguel a = new Aluguel();
            ps.setInt(1,a.getCod());
            ps.setInt(2,a.getCoddvd());
            ps.setInt(3,a.getCodcliente());
            ps.setString(4,a.getData_aluguel());
            ps.setString(5,a.getHorario());
            ps.setString(6,a.getData_devolucao());

            lista.add(a);
        }
            return lista;
        }else{
            return null;
        }
    
         }catch( SQLException e){
            return null;
        }
    
}

   public List<Aluguel> Pesquisar_Cod_Aluguel( String cod){
    String sql = "SELECT * FROM aluguel WHERE idaluguel LIKE '%"+cod+"%'";
    List<Aluguel> lista = new ArrayList<>();
    
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs =  ps.executeQuery();
    
    if(rs != null){
        while(rs.next()){
            Aluguel a = new Aluguel();
            ps.setInt(1,a.getCod());
            ps.setInt(2,a.getCoddvd());
            ps.setInt(3,a.getCodcliente());
            ps.setString(4,a.getData_aluguel());
            ps.setString(5,a.getHorario());
            ps.setString(6,a.getData_devolucao());

            lista.add(a);
        }
            return lista;
        }else{
            return null;
        }
    
        }catch( SQLException e){
            return null;
         }
    
   }
   
   public List<Aluguel> Pesquisar_Cod_Filme( String cod){
        String sql = "SELECT * FROM aluguel WHERE idcliente LIKE '%"+cod+"%'";
        List<Aluguel> lista = new ArrayList<>();
    
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs =  ps.executeQuery();
    
    if(rs != null){
        while(rs.next()){
            Aluguel a = new Aluguel();
            ps.setInt(1,a.getCod());
            ps.setInt(2,a.getCoddvd());
            ps.setInt(3,a.getCodcliente());
            ps.setString(4,a.getData_aluguel());
            ps.setString(5,a.getHorario());
            ps.setString(6,a.getData_devolucao());
            
            lista.add(a);
        }
            return lista;
        }else{
            return null;
        }
    
        }catch( SQLException e){
            return null;
        }
    
   }
    
    public boolean Testar_Aluguel (int cod){
    boolean Resultado = false;
    try{
        String sql  = "SELECT * FROM aluguel WHERE idaluguel = "+cod+"";
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet  rs = ps.executeQuery();

    if( rs!= null){
            while(rs.next()){
            Resultado = true;
            }
        }
        }catch(SQLException ex){
        ex.getMessage();
        }
            return Resultado;
        }

    public List<Aluguel> CapturarAluguel(int cod){
        String sql = "SELECT *  FROM aluguel WHERE idaluguel = "+cod+"";
        List<Aluguel> lista = new ArrayList<>();
        
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if( rs!= null){
        while(rs.next()){
        Aluguel a = new Aluguel();
        ps.setInt(1,a.getCod());
        ps.setInt(2,a.getCoddvd());
        ps.setInt(3,a.getCodcliente());
        ps.setString(4,a.getData_aluguel());
        ps.setString(5,a.getHorario());
        ps.setString(6,a.getData_devolucao());
        lista.add(a);

      }
        return lista;

     }else{
        return null;
    }
    }catch( SQLException ex ){
        return null;
    }

    }
    
    public String Alterar_Aluguel( Aluguel a){
    String sql = "UPDATE cliente SET iddvd = ? ,idcliente = ?,hora_aluguel = ?, data_aluguel = ? , data_devolucao = ? WHERE idaluguel = ? ";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
    
        ps.setInt(1,a.getCod());
        ps.setInt(2,a.getCoddvd());
        ps.setInt(3,a.getCodcliente());
        ps.setString(4,a.getData_aluguel());
        ps.setString(5,a.getHorario());
        ps.setString(6,a.getData_devolucao());
    
        if(ps.executeUpdate() > 0){
            return "Atualizado com sucesso";}else{ return "Erro ao Atualizar, Verifique!";}
        }catch(SQLException e){
        return e.getMessage();
        }

        }

    public List<Aluguel> ListarComboAluguel(){
        String sql = "SELECT idaluguel FROM aluguel ORDER BY idaluguel";
        List<Aluguel> lista = new ArrayList<>();
   try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
   
        if(rs != null){
        while(rs.next()){
            Aluguel a = new Aluguel();
            a.setCod(rs.getInt(1));
            lista.add(a);
        }
            return lista;
        }else{

            return null;}

        }catch(Exception e){
            return null;}
        }

   
   public List<Aluguel> ConsultaCodigoAluguel( String cod){
        String sql = "SELECT idaluguel FROM aluguel WHERE idaluguel = '"+ cod +"'";
        List<Aluguel> lista = new ArrayList<>();
   try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
   
        if(rs != null){
        while(rs.next()){
            Aluguel a = new Aluguel();
            a.setCod(rs.getInt(1));
            lista.add(a);
        }
            return lista;
        }else{
            return null;}
        }catch( Exception ex){
            return null;
        }
        }
   
   public String Excluir_Aluguel(Aluguel a){
        String sql = "DELETE FROM aluguel WHERE idaluguel = ? AND iddvd = ?";
   try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setInt(1, a.getCod());
        ps.setInt(2,a.getCoddvd());
   
   if(ps.executeUpdate() > 0){
        return "Excluido com Sucesso";
   
   }else{
        return "Erro ao Excluir";}
   }catch( SQLException e){
        return e.getMessage();
   }
   }
   
    public List<Aluguel> Pesquisar_Cod_Cliente(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}