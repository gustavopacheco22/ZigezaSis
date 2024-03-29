package DAO;

import Conexion.Conectar;
import VO.CategoriaVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class CategoriaDAO{
    
    final String INSERT = "INSERT INTO categoria(montoACobrar, descripcion) VALUES (?,?,?)";
    final String UPDATE = "UPDATE categoria SET montoACobrar= ?, descrpcion = ? WHERE idCategoria = ?";
    final String DELETE = "DELETE FROM categoria WHERE idCategoria = ?";
    final String GETALL = "SELECT idCategoria, montoACobrar, descripcion FROM categoria";
    final String GETONE = "SELECT montoACobrar, descripcion FROM categoria WHERE idCategoria = ?";

    public ArrayList<CategoriaVO> Listar_CategoriaVO(){
        ArrayList<CategoriaVO> list = new ArrayList<CategoriaVO>();
        Conectar conec = new Conectar();
        //String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                CategoriaVO vo = new CategoriaVO();
                vo.setIdcategoria(rs.getInt(1));
                vo.setMontoacobrar(rs.getInt(2));
                vo.setDescripcion(rs.getString(3));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        //String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(INSERT);
            ps.setInt(1, vo.getIdcategoria());
            ps.setInt(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        //String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(UPDATE);
            ps.setInt(1, vo.getIdcategoria());
            ps.setInt(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        //String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(DELETE);
            ps.setInt(1, vo.getIdcategoria());
            ps.setInt(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
