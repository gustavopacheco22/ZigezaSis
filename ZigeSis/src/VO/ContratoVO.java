package VO;

public class ContratoVO {

/*Todo los atributos*/
    int idcontrato;
    int fechafirma;
    int fechavencimiento;
    int estadoCo;
    int dni;
    int idcategoria;

public ContratoVO(){}

    public ContratoVO(int idcontrato, int fechafirma, int fechavencimiento, int estadoCo, int dni, int idcategoria) {
        this.idcontrato = idcontrato;
        this.fechafirma = fechafirma;
        this.fechavencimiento = fechavencimiento;
        this.estadoCo = estadoCo;
        this.dni = dni;
        this.idcategoria = idcategoria;
    }

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
    public int getEstado(){
        return estadoCo;
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
    public void setEstado(int estadoCo){
        this.estadoCo = estadoCo;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }

    
}
