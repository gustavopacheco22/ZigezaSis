package VO;

public class ContratoVO {

/*Todo los atributos*/
    int idcontrato;
    int fechafirma;
    int fechavencimiento;
    String estado;
    int dni;
    int idcategoria;

public ContratoVO(){}

/*Todo los codigos get*/
    public int getIdcontrato(){
        return idcontrato;
    }
    public int getFechafirma(){
        return fechafirma;
    }
    public int getFechavencimiento(){
        return fechavencimiento;
    }
    public String getEstado(){
        return estado;
    }
    public int getDni(){
        return dni;
    }
    public int getIdcategoria(){
        return idcategoria;
    }


/*Todo los codigos set*/
    public void setIdcontrato(int idcontrato){
        this.idcontrato = idcontrato;
    }
    public void setFechafirma(int fechafirma){
        this.fechafirma = fechafirma;
    }
    public void setFechavencimiento(int fechavencimiento){
        this.fechavencimiento = fechavencimiento;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }

}
