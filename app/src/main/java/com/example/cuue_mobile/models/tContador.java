package com.example.cuue_mobile.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class tContador extends RealmObject {

    @PrimaryKey
    public int IdContador;

    public int IdMarca;
    public boolean Activo;
    public String No_marchamo;
    public String Color;
    public int IdUsuarioServicio;
    public String Fecha_Cambio;
    public String Fecha_Creacion;
    public double Lectura;

}

