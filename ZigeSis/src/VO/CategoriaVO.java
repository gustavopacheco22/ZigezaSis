package VO;

public class CategoriaVO {

/*Todo los atributos*/
    int idcategoria;
    int montoacobrar;
    String descripcion;

    public CategoriaVO(){}

    public CategoriaVO(int idcategoria, int montoacobrar, String descripcion) {
        this.idcategoria = idcategoria;
        this.montoacobrar = montoacobrar;
        this.descripcion = descripcion;
    }
    
/*Todo los codigos get*/
    public int getIdcategoria(){
        return idcategoria;
    }
    public int getMontoacobrar(){
        return montoacobrar;
    }
    public String getDescripcion(){
        return descripcion;
    }


/*Todo los codigos set*/
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }
    public void setMontoacobrar(int montoacobrar){
        this.montoacobrar = montoacobrar;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
