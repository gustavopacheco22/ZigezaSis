package VO;

public class EmpeladoVO {

/*Todo los atributos*/
    int dni;
    String nombre;
    String apellido;
    int telefono;
    String domicilio;
    String correoelectronico;
    String estado;
    String nombresindicato;

public EmpeladoVO(){}

/*Todo los codigos get*/
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getCorreoelectronico(){
        return correoelectronico;
    }
    public String getEstado(){
        return estado;
    }
    public String getNombresindicato(){
        return nombresindicato;
    }


/*Todo los codigos set*/
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public void setCorreoelectronico(String correoelectronico){
        this.correoelectronico = correoelectronico;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setNombresindicato(String nombresindicato){
        this.nombresindicato = nombresindicato;
    }

}
