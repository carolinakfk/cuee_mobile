package com.example.cuue_mobile.Clases;

import org.simpleframework.xml.Element;

public class clsBeUsuarios_servicio {

    @Element(required=false) public int IdUsuarioServicio=0;
    @Element(required=false) public String DPI="";
    @Element(required=false) public String NIT="";
    @Element(required=false) public String Nombres="";
    @Element(required=false) public String Telefono="";
    @Element(required=false) public int IdUsuario=0;
    @Element(required=false) public String Fecha_creacion="";
    @Element(required=false) public int Idusuario_modifica=0;
    @Element(required=false) public String Fecha_modificacion="";
    @Element(required=false) public boolean Activo=false;
    @Element(required=false) public String Correo_electronico="";
    @Element(required=false) public boolean Exento_IVA=false;


    public clsBeUsuarios_servicio() {
    }

    public clsBeUsuarios_servicio(int IdUsuarioServicio,String DPI,String NIT,String Nombres,
                                  String Telefono,int IdUsuario,String Fecha_creacion,int Idusuario_modifica,
                                  String Fecha_modificacion,boolean Activo,String Correo_electronico,boolean Exento_IVA
    ) {

        this.IdUsuarioServicio=IdUsuarioServicio;
        this.DPI=DPI;
        this.NIT=NIT;
        this.Nombres=Nombres;
        this.Telefono=Telefono;
        this.IdUsuario=IdUsuario;
        this.Fecha_creacion=Fecha_creacion;
        this.Idusuario_modifica=Idusuario_modifica;
        this.Fecha_modificacion=Fecha_modificacion;
        this.Activo=Activo;
        this.Correo_electronico=Correo_electronico;
        this.Exento_IVA=Exento_IVA;

    }


    public int getIdUsuarioServicio() {
        return IdUsuarioServicio;
    }
    public void setIdUsuarioServicio(int value) {
        IdUsuarioServicio=value;
    }
    public String getDPI() {
        return DPI;
    }
    public void setDPI(String value) {
        DPI=value;
    }
    public String getNIT() {
        return NIT;
    }
    public void setNIT(String value) {
        NIT=value;
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String value) {
        Nombres=value;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String value) {
        Telefono=value;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }
    public void setIdUsuario(int value) {
        IdUsuario=value;
    }
    public String getFecha_creacion() {
        return Fecha_creacion;
    }
    public void setFecha_creacion(String value) {
        Fecha_creacion=value;
    }
    public int getIdusuario_modifica() {
        return Idusuario_modifica;
    }
    public void setIdusuario_modifica(int value) {
        Idusuario_modifica=value;
    }
    public String getFecha_modificacion() {
        return Fecha_modificacion;
    }
    public void setFecha_modificacion(String value) {
        Fecha_modificacion=value;
    }
    public boolean getActivo() {
        return Activo;
    }
    public void setActivo(boolean value) {
        Activo=value;
    }
    public String getCorreo_electronico() {
        return Correo_electronico;
    }
    public void setCorreo_electronico(String value) {
        Correo_electronico=value;
    }
    public boolean getExento_IVA() {
        return Exento_IVA;
    }
    public void setExento_IVA(boolean value) {
        Exento_IVA=value;
    }

}


