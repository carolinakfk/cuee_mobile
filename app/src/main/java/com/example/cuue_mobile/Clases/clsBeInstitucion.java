package com.example.cuue_mobile.Clases;

import org.simpleframework.xml.Element;

public class clsBeInstitucion {

    @Element(required=false) public int IdInstitucion=0;
    @Element(required=false) public String Nombre="";
    @Element(required=false) public Byte Logo;
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
    @Element(required=false) public double Ultima_solicitud=0;
    @Element(required=false) public double Ultimo_usuario=0;
    @Element(required=false) public double Ultimo_contrato=0;
    @Element(required=false) public int Porcentaje_lectura=0;
    @Element(required=false) public double Cargo_fijo_btdfp=0;
    @Element(required=false) public double Tarifa_demandafp=0;
    @Element(required=false) public double Precio_kwfp=0;
    @Element(required=false) public double Precio_pcfp=0;
    @Element(required=false) public String Serie_pf="";
    @Element(required=false) public int Correl_pf=0;
    @Element(required=false) public int Correl_pf_actual=0;
    @Element(required=false) public String Fel_codigo_acceso="";
    @Element(required=false) public String Fel_usuario="";
    @Element(required=false) public String Fel_clave="";
    @Element(required=false) public String Fel_codigo_escenario_IVA="";
    @Element(required=false) public String Fel_tipo_frase_IVA="";
    @Element(required=false) public String Fel_texto_IVA="";
    @Element(required=false) public String Fel_codigo_escenario_ISR="";
    @Element(required=false) public String Fel_tipo_frase_ISR="";
    @Element(required=false) public String Fel_texto_ISR="";
    @Element(required=false) public String Fel_token="";
    @Element(required=false) public String Fel_Requestor="";
    @Element(required=false) public String NIT_Emisor="";
    @Element(required=false) public String Direccion_emisor="";
    @Element(required=false) public String Correo_emisor="";
    @Element(required=false) public String Nombre_Comercial="";
    @Element(required=false) public String Nombre_Emisor="";
    @Element(required=false) public String Codigo_postal="";
    @Element(required=false) public String Municipio="";
    @Element(required=false) public String Departamento="";
    @Element(required=false) public String Pais="";
    @Element(required=false) public String Afiliacion_IVA="";
    @Element(required=false) public String Fecha_Resolucion="1900-01-01T00:00:01";
    @Element(required=false) public String Numero_Resolucion="";
    @Element(required=false) public String Frase_Exento="";
    @Element(required=false) public double Monto_Permitido_CF=0;


    public clsBeInstitucion() {
    }

    public clsBeInstitucion(int IdInstitucion,String Nombre,Byte Logo,double Preciots,
                            double Preciotns,double Luz_publica,double Cargo_fijo,double Mora,
                            double Tarifa_demanda,double Precio_kw,double Precio_pc,double Cargo_fijo_btdp,
                            double Multas_varias,double Cobro_instalaciones,double Cobro_reconexiones,double Cobro_multa,
                            double Ultima_solicitud,double Ultimo_usuario,double Ultimo_contrato,int Porcentaje_lectura,
                            double Cargo_fijo_btdfp,double Tarifa_demandafp,double Precio_kwfp,double Precio_pcfp,
                            String Serie_pf,int Correl_pf,int Correl_pf_actual,String Fel_codigo_acceso,
                            String Fel_usuario,String Fel_clave,String Fel_codigo_escenario_IVA,String Fel_tipo_frase_IVA,
                            String Fel_texto_IVA,String Fel_codigo_escenario_ISR,String Fel_tipo_frase_ISR,String Fel_texto_ISR,
                            String Fel_token,String Fel_Requestor,String NIT_Emisor,String Direccion_emisor,
                            String Correo_emisor,String Nombre_Comercial,String Nombre_Emisor,String Codigo_postal,
                            String Municipio,String Departamento,String Pais,String Afiliacion_IVA,
                            String Fecha_Resolucion,String Numero_Resolucion,String Frase_Exento,double Monto_Permitido_CF
    ) {

        this.IdInstitucion=IdInstitucion;
        this.Nombre=Nombre;
        this.Logo=Logo;
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
        this.Ultima_solicitud=Ultima_solicitud;
        this.Ultimo_usuario=Ultimo_usuario;
        this.Ultimo_contrato=Ultimo_contrato;
        this.Porcentaje_lectura=Porcentaje_lectura;
        this.Cargo_fijo_btdfp=Cargo_fijo_btdfp;
        this.Tarifa_demandafp=Tarifa_demandafp;
        this.Precio_kwfp=Precio_kwfp;
        this.Precio_pcfp=Precio_pcfp;
        this.Serie_pf=Serie_pf;
        this.Correl_pf=Correl_pf;
        this.Correl_pf_actual=Correl_pf_actual;
        this.Fel_codigo_acceso=Fel_codigo_acceso;
        this.Fel_usuario=Fel_usuario;
        this.Fel_clave=Fel_clave;
        this.Fel_codigo_escenario_IVA=Fel_codigo_escenario_IVA;
        this.Fel_tipo_frase_IVA=Fel_tipo_frase_IVA;
        this.Fel_texto_IVA=Fel_texto_IVA;
        this.Fel_codigo_escenario_ISR=Fel_codigo_escenario_ISR;
        this.Fel_tipo_frase_ISR=Fel_tipo_frase_ISR;
        this.Fel_texto_ISR=Fel_texto_ISR;
        this.Fel_token=Fel_token;
        this.Fel_Requestor=Fel_Requestor;
        this.NIT_Emisor=NIT_Emisor;
        this.Direccion_emisor=Direccion_emisor;
        this.Correo_emisor=Correo_emisor;
        this.Nombre_Comercial=Nombre_Comercial;
        this.Nombre_Emisor=Nombre_Emisor;
        this.Codigo_postal=Codigo_postal;
        this.Municipio=Municipio;
        this.Departamento=Departamento;
        this.Pais=Pais;
        this.Afiliacion_IVA=Afiliacion_IVA;
        this.Fecha_Resolucion=Fecha_Resolucion;
        this.Numero_Resolucion=Numero_Resolucion;
        this.Frase_Exento=Frase_Exento;
        this.Monto_Permitido_CF=Monto_Permitido_CF;

    }


    public int getIdInstitucion() {
        return IdInstitucion;
    }
    public void setIdInstitucion(int value) {
        IdInstitucion=value;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String value) {
        Nombre=value;
    }
    public Byte getLogo() {
        return Logo;
    }
    public void setLogo(Byte value) {
        Logo=value;
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
    public double getUltima_solicitud() {
        return Ultima_solicitud;
    }
    public void setUltima_solicitud(double value) {
        Ultima_solicitud=value;
    }
    public double getUltimo_usuario() {
        return Ultimo_usuario;
    }
    public void setUltimo_usuario(double value) {
        Ultimo_usuario=value;
    }
    public double getUltimo_contrato() {
        return Ultimo_contrato;
    }
    public void setUltimo_contrato(double value) {
        Ultimo_contrato=value;
    }
    public int getPorcentaje_lectura() {
        return Porcentaje_lectura;
    }
    public void setPorcentaje_lectura(int value) {
        Porcentaje_lectura=value;
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
    public String getSerie_pf() {
        return Serie_pf;
    }
    public void setSerie_pf(String value) {
        Serie_pf=value;
    }
    public int getCorrel_pf() {
        return Correl_pf;
    }
    public void setCorrel_pf(int value) {
        Correl_pf=value;
    }
    public int getCorrel_pf_actual() {
        return Correl_pf_actual;
    }
    public void setCorrel_pf_actual(int value) {
        Correl_pf_actual=value;
    }
    public String getFel_codigo_acceso() {
        return Fel_codigo_acceso;
    }
    public void setFel_codigo_acceso(String value) {
        Fel_codigo_acceso=value;
    }
    public String getFel_usuario() {
        return Fel_usuario;
    }
    public void setFel_usuario(String value) {
        Fel_usuario=value;
    }
    public String getFel_clave() {
        return Fel_clave;
    }
    public void setFel_clave(String value) {
        Fel_clave=value;
    }
    public String getFel_codigo_escenario_IVA() {
        return Fel_codigo_escenario_IVA;
    }
    public void setFel_codigo_escenario_IVA(String value) {
        Fel_codigo_escenario_IVA=value;
    }
    public String getFel_tipo_frase_IVA() {
        return Fel_tipo_frase_IVA;
    }
    public void setFel_tipo_frase_IVA(String value) {
        Fel_tipo_frase_IVA=value;
    }
    public String getFel_texto_IVA() {
        return Fel_texto_IVA;
    }
    public void setFel_texto_IVA(String value) {
        Fel_texto_IVA=value;
    }
    public String getFel_codigo_escenario_ISR() {
        return Fel_codigo_escenario_ISR;
    }
    public void setFel_codigo_escenario_ISR(String value) {
        Fel_codigo_escenario_ISR=value;
    }
    public String getFel_tipo_frase_ISR() {
        return Fel_tipo_frase_ISR;
    }
    public void setFel_tipo_frase_ISR(String value) {
        Fel_tipo_frase_ISR=value;
    }
    public String getFel_texto_ISR() {
        return Fel_texto_ISR;
    }
    public void setFel_texto_ISR(String value) {
        Fel_texto_ISR=value;
    }
    public String getFel_token() {
        return Fel_token;
    }
    public void setFel_token(String value) {
        Fel_token=value;
    }
    public String getFel_Requestor() {
        return Fel_Requestor;
    }
    public void setFel_Requestor(String value) {
        Fel_Requestor=value;
    }
    public String getNIT_Emisor() {
        return NIT_Emisor;
    }
    public void setNIT_Emisor(String value) {
        NIT_Emisor=value;
    }
    public String getDireccion_emisor() {
        return Direccion_emisor;
    }
    public void setDireccion_emisor(String value) {
        Direccion_emisor=value;
    }
    public String getCorreo_emisor() {
        return Correo_emisor;
    }
    public void setCorreo_emisor(String value) {
        Correo_emisor=value;
    }
    public String getNombre_Comercial() {
        return Nombre_Comercial;
    }
    public void setNombre_Comercial(String value) {
        Nombre_Comercial=value;
    }
    public String getNombre_Emisor() {
        return Nombre_Emisor;
    }
    public void setNombre_Emisor(String value) {
        Nombre_Emisor=value;
    }
    public String getCodigo_postal() {
        return Codigo_postal;
    }
    public void setCodigo_postal(String value) {
        Codigo_postal=value;
    }
    public String getMunicipio() {
        return Municipio;
    }
    public void setMunicipio(String value) {
        Municipio=value;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String value) {
        Departamento=value;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String value) {
        Pais=value;
    }
    public String getAfiliacion_IVA() {
        return Afiliacion_IVA;
    }
    public void setAfiliacion_IVA(String value) {
        Afiliacion_IVA=value;
    }
    public String getFecha_Resolucion() {
        return Fecha_Resolucion;
    }
    public void setFecha_Resolucion(String value) {
        Fecha_Resolucion=value;
    }
    public String getNumero_Resolucion() {
        return Numero_Resolucion;
    }
    public void setNumero_Resolucion(String value) {
        Numero_Resolucion=value;
    }
    public String getFrase_Exento() {
        return Frase_Exento;
    }
    public void setFrase_Exento(String value) {
        Frase_Exento=value;
    }
    public double getMonto_Permitido_CF() {
        return Monto_Permitido_CF;
    }
    public void setMonto_Permitido_CF(double value) {
        Monto_Permitido_CF=value;
    }

}

