package VO;

public class EmpeladoVO {

/*Todo los atributos*/
    int dni;
    String nombre;
    String apellido;
    int telefono;
    String domicilio;
    String correoelectronico;
    int estadoEm;
    String nombresindicato;

    public EmpeladoVO(){}

    public EmpeladoVO(int dni, String nombre, String apellido, int telefono, String domicilio, String correoelectronico, int estadoEm, String nombresindicato) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.correoelectronico = correoelectronico;
        this.estadoEm = estadoEm;
        this.nombresindicato = nombresindicato;
    }

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
    public int getEstado(){
        return estadoEm;
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
    public void setEstado(int estadoEm){
        this.estadoEm = estadoEm;
    }
    public void setNombresindicato(String nombresindicato){
        this.nombresindicato = nombresindicato;
    }

}
