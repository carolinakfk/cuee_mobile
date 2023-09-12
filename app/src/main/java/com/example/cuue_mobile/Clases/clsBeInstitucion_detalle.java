package com.example.cuue_mobile.Clases;

import org.simpleframework.xml.Element;

public class clsBeInstitucion_detalle {

    @Element(required=false) public int IdInstitucion=0;
    @Element(required=false) public int IdPeriodoParametros=0;
    @Element(required=false) public String FechaInicio="";
    @Element(required=false) public String FechaFin="";
    @Element(required=false) public double Preciots=0;
    @Element(required=false) public double Preciotns=0;
    @Element(required=false) public double Luz_publica=0;
    @Element(required=false) public double Cargo_fijo=0;
    @Element(required=false) public double Mora=0;
    @Element(required=false) public double Tarifa_demanda=0;
    @Element(required=false) public double Precio_kw=0;
    @Element(required=false) public double Precio_pc=0;
    @Element(required=false) public double Cargo_fijo_btdp=0;
    @Element(required=false) public double Multas_varias=0;
    @Element(required=false) public double Cobro_instalaciones=0;
    @Element(required=false) public double Cobro_reconexiones=0;
    @Element(required=false) public double Cobro_multa=0;
    @Element(required=false) public boolean Activo=false;
    @Element(required=false) public int IdUsuarioCreo=0;
    @Element(required=false) public String Fecha_Creacion="";
    @Element(required=false) public String Fecha_Modificacion="";
    @Element(required=false) public int IdUsuarioModifico=0;
    @Element(required=false) public double Cargo_fijo_btdfp=0;
    @Element(required=false) public double Tarifa_demandafp=0;
    @Element(required=false) public double Precio_kwfp=0;
    @Element(required=false) public double Precio_pcfp=0;
    @Element(required=false) public double Precio_luz_autoproductor=0;
    @Element(required=false) public double Cargo_fijo_autoproductor=0;


    public clsBeInstitucion_detalle() {
    }

    public clsBeInstitucion_detalle(int IdInstitucion,int IdPeriodoParametros,String FechaInicio,String FechaFin,
                                    double Preciots,double Preciotns,double Luz_publica,double Cargo_fijo,
                                    double Mora,double Tarifa_demanda,double Precio_kw,double Precio_pc,
                                    double Cargo_fijo_btdp,double Multas_varias,double Cobro_instalaciones,double Cobro_reconexiones,
                                    double Cobro_multa,boolean Activo,int IdUsuarioCreo,String Fecha_Creacion,
                                    String Fecha_Modificacion,int IdUsuarioModifico,double Cargo_fijo_btdfp,double Tarifa_demandafp,
                                    double Precio_kwfp,double Precio_pcfp,double Precio_luz_autoproductor,double Cargo_fijo_autoproductor
    ) {

        this.IdInstitucion=IdInstitucion;
        this.IdPeriodoParametros=IdPeriodoParametros;
        this.FechaInicio=FechaInicio;
        this.FechaFin=FechaFin;
        this.Preciots=Preciots;
        this.Preciotns=Preciotns;
        this.Luz_publica=Luz_publica;
        this.Cargo_fijo=Cargo_fijo;
        this.Mora=Mora;
        this.Tarifa_demanda=Tarifa_demanda;
        this.Precio_kw=Precio_kw;
        this.Precio_pc=Precio_pc;
        this.Cargo_fijo_btdp=Cargo_fijo_btdp;
        this.Multas_varias=Multas_varias;
        this.Cobro_instalaciones=Cobro_instalaciones;
        this.Cobro_reconexiones=Cobro_reconexiones;
        this.Cobro_multa=Cobro_multa;
        this.Activo=Activo;
        this.IdUsuarioCreo=IdUsuarioCreo;
        this.Fecha_Creacion=Fecha_Creacion;
        this.Fecha_Modificacion=Fecha_Modificacion;
        this.IdUsuarioModifico=IdUsuarioModifico;
        this.Cargo_fijo_btdfp=Cargo_fijo_btdfp;
        this.Tarifa_demandafp=Tarifa_demandafp;
        this.Precio_kwfp=Precio_kwfp;
        this.Precio_pcfp=Precio_pcfp;
        this.Precio_luz_autoproductor=Precio_luz_autoproductor;
        this.Cargo_fijo_autoproductor=Cargo_fijo_autoproductor;

    }


    public int getIdInstitucion() {
        return IdInstitucion;
    }
    public void setIdInstitucion(int value) {
        IdInstitucion=value;
    }
    public int getIdPeriodoParametros() {
        return IdPeriodoParametros;
    }
    public void setIdPeriodoParametros(int value) {
        IdPeriodoParametros=value;
    }
    public String getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(String value) {
        FechaInicio=value;
    }
    public String getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(String value) {
        FechaFin=value;
    }
    public double getPreciots() {
        return Preciots;
    }
    public void setPreciots(double value) {
        Preciots=value;
    }
    public double getPreciotns() {
        return Preciotns;
    }
    public void setPreciotns(double value) {
        Preciotns=value;
    }
    public double getLuz_publica() {
        return Luz_publica;
    }
    public void setLuz_publica(double value) {
        Luz_publica=value;
    }
    public double getCargo_fijo() {
        return Cargo_fijo;
    }
    public void setCargo_fijo(double value) {
        Cargo_fijo=value;
    }
    public double getMora() {
        return Mora;
    }
    public void setMora(double value) {
        Mora=value;
    }
    public double getTarifa_demanda() {
        return Tarifa_demanda;
    }
    public void setTarifa_demanda(double value) {
        Tarifa_demanda=value;
    }
    public double getPrecio_kw() {
        return Precio_kw;
    }
    public void setPrecio_kw(double value) {
        Precio_kw=value;
    }
    public double getPrecio_pc() {
        return Precio_pc;
    }
    public void setPrecio_pc(double value) {
        Precio_pc=value;
    }
    public double getCargo_fijo_btdp() {
        return Cargo_fijo_btdp;
    }
    public void setCargo_fijo_btdp(double value) {
        Cargo_fijo_btdp=value;
    }
    public double getMultas_varias() {
        return Multas_varias;
    }
    public void setMultas_varias(double value) {
        Multas_varias=value;
    }
    public double getCobro_instalaciones() {
        return Cobro_instalaciones;
    }
    public void setCobro_instalaciones(double value) {
        Cobro_instalaciones=value;
    }
    public double getCobro_reconexiones() {
        return Cobro_reconexiones;
    }
    public void setCobro_reconexiones(double value) {
        Cobro_reconexiones=value;
    }
    public double getCobro_multa() {
        return Cobro_multa;
    }
    public void setCobro_multa(double value) {
        Cobro_multa=value;
    }
    public boolean getActivo() {
        return Activo;
    }
    public void setActivo(boolean value) {
        Activo=value;
    }
    public int getIdUsuarioCreo() {
        return IdUsuarioCreo;
    }
    public void setIdUsuarioCreo(int value) {
        IdUsuarioCreo=value;
    }
    public String getFecha_Creacion() {
        return Fecha_Creacion;
    }
    public void setFecha_Creacion(String value) {
        Fecha_Creacion=value;
    }
    public String getFecha_Modificacion() {
        return Fecha_Modificacion;
    }
    public void setFecha_Modificacion(String value) {
        Fecha_Modificacion=value;
    }
    public int getIdUsuarioModifico() {
        return IdUsuarioModifico;
    }
    public void setIdUsuarioModifico(int value) {
        IdUsuarioModifico=value;
    }
    public double getCargo_fijo_btdfp() {
        return Cargo_fijo_btdfp;
    }
    public void setCargo_fijo_btdfp(double value) {
        Cargo_fijo_btdfp=value;
    }
    public double getTarifa_demandafp() {
        return Tarifa_demandafp;
    }
    public void setTarifa_demandafp(double value) {
        Tarifa_demandafp=value;
    }
    public double getPrecio_kwfp() {
        return Precio_kwfp;
    }
    public void setPrecio_kwfp(double value) {
        Precio_kwfp=value;
    }
    public double getPrecio_pcfp() {
        return Precio_pcfp;
    }
    public void setPrecio_pcfp(double value) {
        Precio_pcfp=value;
    }
    public double getPrecio_luz_autoproductor() {
        return Precio_luz_autoproductor;
    }
    public void setPrecio_luz_autoproductor(double value) {
        Precio_luz_autoproductor=value;
    }
    public double getCargo_fijo_autoproductor() {
        return Cargo_fijo_autoproductor;
    }
    public void setCargo_fijo_autoproductor(double value) {
        Cargo_fijo_autoproductor=value;
    }

}

