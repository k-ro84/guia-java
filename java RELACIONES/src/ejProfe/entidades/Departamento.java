/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejProfe.entidades;

/**
 *
 * @author K-RITO
 */
public class Departamento {
     //Declaro los atributos
    private String domicilio;  
    private Integer superficie;
    private boolean tienePropietario; // Este atributo, lo creo para validar de forma rapida si ya tiene dueÃ±o

    //Constructores
    public Departamento() {
    }

    public Departamento(String domicilio, Integer superficie) {
        this.domicilio = domicilio;
        this.superficie = superficie;
    }

    //GET y SET
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public boolean isTienePropietario() {
        return tienePropietario;
    }

    public void setTienePropietario(boolean tienePropietario) {
        this.tienePropietario = tienePropietario;
    }

    
    @Override
    public String toString() {
        return "Departamento{" + "domicilio=" + domicilio + ", superficie=" + superficie + '}';
    }
    
    

}
