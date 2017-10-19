/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ControladorDetalleOfertaEmpleo extends Conexion{
    
    static int idExperiencias=0;
    static int idEstudioSecundario=0;
    static int idEstudiosuperior=0;
    static int idIdiomaOferta=0;
    
    public ArrayList<OfertaEmpleo> mostrarOferta(){
        ResultSet rs; 
        ArrayList<OfertaEmpleo> lista = new ArrayList();
        
        try{
            this.conectar();
            
            String sql="select idOfertaEmpleo, detalleofertaempleo.idDetalleOfertaEmpleo," +
            " detalleofertaempleo.descripcionPuesto,categoria.idCategoria as idCategoria, categoria.nombreCategoria as categoria," +
            " cargo.idCargo as idCargo, cargo.nombreCargo," +
            " pais.idPais as idPais, pais.pais," +
            " departamento.idDepartamento as idDepartamento, departamento.departamento," +
            " detalleofertaempleo.numVacantes as numVacantes, detalleofertaempleo.genero as genero," +
            " detalleofertaempleo.edad as edad, detalleofertaempleo.aniosExperiencia as anioExperiencia," +
            " detalleofertaempleo.candidatoVehiculo candidatoV, detalleofertaempleo.descripcionPuesto descripcion," +
            " tipocontratacion.idTipoContratacion idTipoContratacion, tipocontratacion.tipoContratacion tipoContratacion," +
            " detalleofertaempleo.salarioMin salarioMin, detalleofertaempleo.salarioMax," +
            " tipopago.idTipoPago, tipopago.tipoPago tipoPago," +
            " idiomanivel.idIdiomaNivel, idioma.idioma," +
            " nivel.nivel, idiomaoferta.idIdiomaOferta," +
            " idiomaoferta.requerido requeridoOfer," +
            " idiomaoferta.idDetalleOfertaEmpleo as idDetalleOfertaEmpleo," +
            " estudiosuperior.idEstudioSuperior," +
            " estudiosuperior.estudiosSuperior, puesto.idPuesto," +
            " nivelestudiosuperior.idNivelEstudioSuperior, nivelestudiosuperior.nivelEstudioSuperior," +
            " areaestudio.idAreaEstudio, areaestudio.areaEstudio," +
            " estudiosuperior.requerido requeridoEstudio," +
            " estudiosecundario.idEstudioSecundario, estudiosecundario.estudioSecundario," +
            " estudiosecundario.requerido requeridoSecundario," +
            " experiencias.idExperiencias, experiencias.experiencia, experiencias.puestosExperiencia, " +
            " experiencias.cargo, experiencias.requerido," +
            " empresa.idEmpresa, empresa.nombreEmpresa" +
            " from ofertaempleo" +
            " inner join detalleofertaempleo on ofertaempleo.idDetalleOfertaEmpleo = detalleofertaempleo.idDetalleOfertaEmpleo" +
            " inner join pais on pais.idPais = ofertaempleo.idPais" +
            " inner join idiomaoferta on detalleofertaempleo.idIdiomaOferta = idiomaoferta.idIdiomaOferta" +
            " inner join idiomanivel on idiomaoferta.idIdiomaNivel = idiomanivel.idIdiomaNivel" +
            " inner join nivel on idiomanivel.idNivel = nivel.idNivel" +
            " inner join idioma on idiomanivel.idIdioma = idioma.idIdioma" +
            " inner join departamento on departamento.idDepartamento = ofertaempleo.idDepartamento" +
            " inner join tipopago on tipopago.idTipoPago = detalleofertaempleo.idTipoPago" +
            " inner join tipocontratacion on tipoContratacion.idTipoContratacion = detalleofertaempleo.idTipoContratacion" +
            " inner join puesto on ofertaempleo.idPuesto = puesto.idPuesto" +
            " inner join categoria on categoria.idCategoria = puesto.idCategoria" +
            " inner join cargo on cargo.idCargo = puesto.idCargo" +
            " inner join estudiosuperior on estudiosuperior.idEstudioSuperior = detalleofertaempleo.idEstudioSuperior" +
            " inner join nivelEstudioSuperior on nivelEstudioSuperior.idNivelEstudioSuperior = estudiosuperior.idNivelEstudioSuperior" +
            " inner join areaestudio on areaEstudio.idAreaEstudio = estudiosuperior.idAreaEstudio" +
            " inner join estudiosecundario on estudiosecundario.idEstudioSecundario = detalleofertaempleo.idEstudioSecundario" +
            " inner join experiencias on experiencias.idExperiencias = detalleofertaempleo.idExperiencias" +
            " inner join empresa on empresa.idEmpresa = detalleofertaempleo.idEmpresa"
          + " where ofertaempleo.activo=1";
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                    
                Idioma idioma = new Idioma();
                idioma.setIdioma(rs.getString("idioma"));
                
                NivelI nivel = new NivelI();
                nivel.setNivelIdioma(rs.getString("nivel"));
                
                NivelIdioma nivelIdioma = new NivelIdioma(
                        rs.getInt("idIdiomaNivel")
                );
                nivelIdioma.setIdioma(idioma);
                nivelIdioma.setNivel(nivel);
                
                IdiomaOferta idiomaOferta = new IdiomaOferta();
                idiomaOferta.setIdIdiomaOferta(rs.getInt("idIdiomaOferta"));
                idiomaOferta.setIdiomaNivel(nivelIdioma);
                
                AreaEstudio1 areaEstudio = new AreaEstudio1();
                areaEstudio.setIdAreaEstudio(rs.getInt("idAreaEstudio"));
                areaEstudio.setAreaEstudio(rs.getString("areaEstudio"));
                
                NivelEstudioSuperior nivelES = new NivelEstudioSuperior();
                nivelES.setIdNivelEstudioSuperior(rs.getInt("idNivelEstudioSuperior"));
                nivelES.setNivelEstudioSuperior(rs.getString("nivelEstudioSuperior"));
               
                
                EstudioSuperior estudioSuperior = new EstudioSuperior();
                estudioSuperior.setIdEstudioSuperior(rs.getInt("idEstudioSuperior"));
                estudioSuperior.setEstudiosSuperior(rs.getString("estudiosSuperior"));
                estudioSuperior.setRequerido(rs.getInt("requeridoEstudio"));
                estudioSuperior.setAreaEstudio(areaEstudio);
                estudioSuperior.setNivelEstudioSuperior(nivelES);
                
                
                EstudioSecundario estudioSE = new EstudioSecundario();
                estudioSE.setIdEstudioSecundario(rs.getInt("idEstudioSecundario"));
                estudioSE.setEstudioSecundario(rs.getString("estudioSecundario"));
                estudioSE.setRequerido(rs.getInt("requeridoSecundario"));
                
                //---- ofertaEmpleo
                Cargo cargo = new Cargo();
                cargo.setIdCargo(rs.getInt("idCargo"));
                cargo.setCargo(rs.getString("nombreCargo"));
                
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setCategoria(rs.getString("categoria"));
                
                Puesto puesto = new Puesto();
                puesto.setIdPuesto(rs.getInt("idPuesto"));
                puesto.setCargo(cargo);
                puesto.setCategoria(categoria);
                
                Pais pais = new Pais();
                pais.setIdPais(rs.getInt("idPais"));
                pais.setPais(rs.getString("pais"));
                
                Departamento depto = new Departamento();
                depto.setIdDepartamento(rs.getInt("idDepartamento"));
                depto.setDepartamento(rs.getString("departamento"));
                
                Municipio municipio = new Municipio();
               
                OfertaEmpleo oferEmpleo = new OfertaEmpleo(
                        rs.getInt("idOfertaEmpleo"),
                        rs.getString("nombreCargo"),
                        new DetalleOfertaEmpleo(
                            rs.getInt("idDetalleOfertaEmpleo"),
                            rs.getInt("numVacantes"),
                            rs.getString("genero"),
                            rs.getInt("edad"),
                            rs.getInt("anioExperiencia"),
                            rs.getInt("candidatoV"),
                            rs.getString("descripcionPuesto"),
                            rs.getDouble("salarioMin"),
                            rs.getDouble("salarioMax"),
                            idiomaOferta,
                            estudioSuperior,
                            estudioSE,
                            new Experiencias(
                                    rs.getInt("idExperiencias"),
                                    rs.getString("experiencia"),
                                    rs.getString("puestosExperiencia"),
                                    rs.getString("cargo"),
                                    rs.getInt("requerido")
                            ),
                            new Empresa(
                                        rs.getInt("idEmpresa"),
                                        rs.getString("nombreEmpresa")           
                            ),
                            new TipoContratacion1(
                                    rs.getInt("idTipoContratacion"),
                                    rs.getString("tipoContratacion")
                            ),
                            new TipoPago1(
                                    rs.getInt("idTipoPago"),
                                    rs.getString("tipoPago")
                            )
                        ),
                        puesto,
                        pais,
                        depto,
                        municipio
                );//Constructor con parámetros      
         
                
                lista.add(oferEmpleo); 
            }//FINAL WHILE*/
           
           
        }catch(Exception e){
           OfertaEmpleo s = new OfertaEmpleo();
           s.getPais().setPais(e.toString());   
           lista.add(s);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
    public ArrayList<OfertaEmpleo> mostrarEditarOferta(int idOferta){
        ResultSet rs; 
        ArrayList<OfertaEmpleo> lista = new ArrayList();
        
        try{
            this.conectar();
            String sql="select idOfertaEmpleo, detalleofertaempleo.idDetalleOfertaEmpleo, " +
                    " detalleofertaempleo.descripcionPuesto,categoria.idCategoria as idCategoria, categoria.nombreCategoria as categoria, " +
                    " cargo.idCargo as idCargo, cargo.nombreCargo, " +
                    " pais.idPais as idPais, pais.pais, " +
                    " departamento.idDepartamento as idDepartamento, departamento.departamento, " +
                    " detalleofertaempleo.numVacantes as numVacantes, detalleofertaempleo.genero as genero, " +
                    " detalleofertaempleo.edad as edad, detalleofertaempleo.aniosExperiencia as anioExperiencia, " +
                    " detalleofertaempleo.candidatoVehiculo candidatoV, detalleofertaempleo.descripcionPuesto descripcion, " +
                    " tipocontratacion.idTipoContratacion idTipoContratacion, tipocontratacion.tipoContratacion tipoContratacion, " +
                    " detalleofertaempleo.salarioMin salarioMin, detalleofertaempleo.salarioMax, " +
                    " tipopago.idTipoPago, tipopago.tipoPago tipoPago, " +
                    " idiomanivel.idIdiomaNivel, idioma.idIdioma, idioma.idioma, " +
                    " nivel.idNivel, nivel.nivel, idiomaoferta.idIdiomaOferta," +
                    " puesto.idPuesto," +
                    " idiomaoferta.requerido requeridoOfer, " +
                    " idiomaoferta.idDetalleOfertaEmpleo as idDetalleOfertaEmpleo, " +
                    " estudiosuperior.idEstudioSuperior, " +
                    " estudiosuperior.estudiosSuperior, " +
                    " nivelestudiosuperior.idNivelEstudioSuperior, nivelestudiosuperior.nivelEstudioSuperior, " +
                    " areaestudio.idAreaEstudio, areaestudio.areaEstudio, " +
                    " estudiosuperior.requerido requeridoEstudio, " +
                    " estudiosecundario.idEstudioSecundario, estudiosecundario.estudioSecundario, " +
                    " estudiosecundario.requerido requeridoSecundario, " +
                    " experiencias.idExperiencias, experiencias.experiencia, experiencias.puestosExperiencia,  " +
                    " experiencias.cargo, experiencias.requerido, " +
                    " empresa.idEmpresa, empresa.nombreEmpresa " +
                    " from ofertaempleo " +
                    " inner join detalleofertaempleo on ofertaempleo.idDetalleOfertaEmpleo = detalleofertaempleo.idDetalleOfertaEmpleo " +
                    " inner join pais on pais.idPais = ofertaempleo.idPais " +
                    " inner join idiomaoferta on detalleofertaempleo.idIdiomaOferta = idiomaoferta.idIdiomaOferta " +
                    " inner join idiomanivel on idiomaoferta.idIdiomaNivel = idiomanivel.idIdiomaNivel " +
                    " inner join nivel on idiomanivel.idNivel = nivel.idNivel " +
                    " inner join idioma on idiomanivel.idIdioma = idioma.idIdioma " +
                    " inner join departamento on departamento.idDepartamento = ofertaempleo.idDepartamento " +
                    " inner join tipopago on tipopago.idTipoPago = detalleofertaempleo.idTipoPago " +
                    " inner join tipocontratacion on tipoContratacion.idTipoContratacion = detalleofertaempleo.idTipoContratacion " +
                    " inner join puesto on ofertaempleo.idPuesto = puesto.idPuesto " +
                    " inner join categoria on categoria.idCategoria = puesto.idCategoria " +
                    " inner join cargo on cargo.idCargo = puesto.idCargo " +
                    " inner join estudiosuperior on estudiosuperior.idEstudioSuperior = detalleofertaempleo.idEstudioSuperior " +
                    " inner join nivelEstudioSuperior on nivelEstudioSuperior.idNivelEstudioSuperior = estudiosuperior.idNivelEstudioSuperior " +
                    " inner join areaestudio on areaEstudio.idAreaEstudio = estudiosuperior.idAreaEstudio " +
                    " inner join estudiosecundario on estudiosecundario.idEstudioSecundario = detalleofertaempleo.idEstudioSecundario " +
                    " inner join experiencias on experiencias.idExperiencias = detalleofertaempleo.idExperiencias " +
                    " inner join empresa on empresa.idEmpresa = detalleofertaempleo.idEmpresa" +
                    " where ofertaempleo.idOfertaEmpleo=?";
            
            PreparedStatement psm = this.getCon().prepareStatement(sql);
            psm.setInt(1, idOferta);
            
            rs = psm.executeQuery();
            
            while(rs.next()){
                Idioma idioma = new Idioma(
                        rs.getInt("idIdioma"),
                        rs.getString("idioma")
                );
               
                
                NivelI nivel = new NivelI(
                        rs.getInt("idNivel"),
                        rs.getString("nivel")
                );
                NivelIdioma nivelIdioma = new NivelIdioma();
                nivelIdioma.setIdioma(idioma);
                nivelIdioma.setNivel(nivel);
                
                nivel.setIdNivelIdioma(rs.getInt("idIdiomaNivel"));
                
                IdiomaOferta idOfer = new IdiomaOferta(
                        nivelIdioma
                );
                idOfer.setIdIdiomaOferta(rs.getInt("idIdiomaOferta"));
                idOfer.setRequerido(rs.getInt("requeridoOfer"));
                
                //AREA ESTUDIO
                AreaEstudio1 areaEstudio = new AreaEstudio1();
                
                areaEstudio.setIdAreaEstudio(rs.getInt("idAreaEstudio"));
                areaEstudio.setAreaEstudio(rs.getString("areaEstudio"));
                
                //NIVELESTUDIOSUPERIOR
                NivelEstudioSuperior nivelEstudioSuperior = new NivelEstudioSuperior();
                                        
                nivelEstudioSuperior.setIdNivelEstudioSuperior(rs.getInt("idNivelEstudioSuperior"));
                nivelEstudioSuperior.setNivelEstudioSuperior(rs.getString("nivelEstudioSuperior"));
                
                //ESTUDIO SUPERIOR
                
                EstudioSuperior estudioSuperior = new EstudioSuperior();
                
                estudioSuperior.setIdEstudioSuperior(rs.getInt("idEstudioSuperior"));
                estudioSuperior.setEstudiosSuperior(rs.getString("estudiosSuperior"));
                estudioSuperior.setRequerido(rs.getInt("requeridoEstudio"));
                estudioSuperior.setAreaEstudio(areaEstudio);
                estudioSuperior.setNivelEstudioSuperior(nivelEstudioSuperior);
                
                //PAIS  
                Pais pais = new Pais();
                pais.setIdPais(rs.getInt("idPais"));
                pais.setPais(rs.getString("pais"));
                
                //DEPARTAMENTO
                Departamento depto = new Departamento();
                depto.setIdDepartamento(rs.getInt("idDepartamento"));
                depto.setDepartamento(rs.getString("departamento"));
                
    
                
                OfertaEmpleo oferEmpleo = new OfertaEmpleo(
                        rs.getInt("idOfertaEmpleo"),
                        rs.getString("nombreCargo"),
                        new DetalleOfertaEmpleo(
                            rs.getInt("idDetalleOfertaEmpleo"),
                            rs.getInt("numVacantes"),
                            rs.getString("genero"),
                            rs.getInt("edad"),
                            rs.getInt("anioExperiencia"),
                            rs.getInt("candidatoV"),
                            rs.getString("descripcionPuesto"),
                            rs.getDouble("salarioMin"),
                            rs.getDouble("salarioMax"),
                            idOfer,
                            estudioSuperior,
                            
                            new EstudioSecundario(
                                    rs.getInt("idEstudioSecundario"),
                                    rs.getString("estudioSecundario"),
                                    rs.getInt("requeridoSecundario")
                            ),
                            new Experiencias(
                                    rs.getInt("idExperiencias"),
                                    rs.getString("experiencia"),
                                    rs.getString("puestosExperiencia"),
                                    rs.getString("cargo"),
                                    rs.getInt("requerido")
                            ),
                            new Empresa(
                                        rs.getInt("idEmpresa"),
                                        rs.getString("nombreEmpresa")           
                            ),
                            new TipoContratacion1(
                                    rs.getInt("idTipoContratacion"),
                                    rs.getString("tipoContratacion")
                            ),
                            new TipoPago1(
                                    rs.getInt("idTipoPago"),
                                    rs.getString("tipoPago")
                            )
                        ),
                        new Puesto(
                                rs.getInt("idPuesto"),
                                new Cargo(
                                        rs.getInt("idCargo"),
                                        rs.getString("nombreCargo")
                                ),
                                new Categoria(
                                        rs.getInt("idCategoria"),
                                        rs.getString("categoria")
                                )
                        ),        
                       pais,
                       depto,
                        new Municipio()
                
                );//Constructor con parámetros      
          
                lista.add(oferEmpleo);
                
           }//FINAL WHILE
        }catch(Exception e){
           OfertaEmpleo s = new OfertaEmpleo();
           s.getPais().setPais(e.toString());   
           lista.add(s);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
    public int seleccionarPuesto(Puesto puesto){
        ResultSet rs;  
        int id=0;
        
        try{
            this.conectar();
            String sql="select idPuesto as id from puesto "
                    + "where idCargo="+ puesto.getCargo().getIdCargo()+""
                    + " and idCategoria="+puesto.getCategoria().getIdCategoria();
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                
                    id = rs.getInt("id");
               
           }//FINAL WHILE
            
            
        }catch(Exception e){
           
        }
           
        return id;
    }
    
    public int seleccionarNivelIdioma(NivelIdioma nivelIdioma){
        ResultSet rs;  
        int id=0;
        
        try{
            this.conectar();
            String sql="select idIdiomaNivel as id from idiomaNivel "
                    + "where idIdioma="+nivelIdioma.getIdioma().getIdIdioma()+""
                    + " and idNivel="+nivelIdioma.getNivel().getIdNivelIdioma();
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                
                    id = rs.getInt("id");
               
            }//FINAL WHILE          
            
        }catch(Exception e){
            
        }
           
        return id;
    }
    
    
    public ArrayList<Selec> llenarSelecDependiente(String sql){
        ResultSet rs; 
        ArrayList lista = new ArrayList();
        
        try{
            this.conectar();
                     
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                        Selec selec = new Selec(
                        rs.getInt("id"),
                        rs.getString("registro")
                );//Constructor con parámetros
                
                        
                lista.add(selec); 
            }//FINAL WHILE
        }catch(Exception e){
           Selec s = new Selec();
           s.setRegistros(e.toString());
           
           lista.add(s);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
    public ArrayList<Selec> llenarSelec(String id, String name, String tabla){
        ResultSet rs;  
        ArrayList lista = new ArrayList();
        
        try{
            this.conectar();
            String sql="select * from "+tabla;
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                
              /*  String[] p = {
                    rs.getString(id),
                    rs.getString(name)
                };
                
                lista.add(p);
             */
                
               Selec selec = new Selec(
                        rs.getInt(id),
                        rs.getString(name)
                );//Constructor con parámetros
                
               
                lista.add(selec); 
            }//FINAL WHILE
        }catch(Exception e){
           Selec s = new Selec();
           s.setRegistros(e.toString());
           
           lista.add(s);
        }
        
        return lista;
    }//FINAL MOSTRAR
    
    public String modificar(DetalleOfertaEmpleo detalleEmp, OfertaEmpleo ofertaEmp, IdiomaOferta idiomaOfer){
 
        PreparedStatement ps;
        
        String msj="";
        try{
            
              //INSERTAR LOS DATOS DE LA TABLA EXPERIENCIAS
            this.conectar();
            
            String sql="update experiencias set experiencia=?, puestosExperiencia=?, cargo=?, requerido=? where idExperiencias=?";
            
            ps = this.getCon().prepareStatement(sql);
           
            ps.setString(1, detalleEmp.getExperiencia().getExperiencia() );
            ps.setString(2, detalleEmp.getExperiencia().getPuestosExperiencia());
            ps.setString(3, detalleEmp.getExperiencia().getCargo());
            ps.setInt(4, detalleEmp.getExperiencia().getRequerido());
            ps.setInt(5, detalleEmp.getExperiencia().getIdExperiencias());
            
            ps.executeUpdate();

            //INSERTANDO SECUNDARIO
            String sqlES="update estudiosecundario set estudioSecundario=?, requerido=? where idEstudioSecundario=?";
            
            PreparedStatement ps1 = this.getCon().prepareStatement(sqlES);
            
            ps1.setString(1, detalleEmp.getEstudioSecundario().getEstudioSecundario() );
            ps1.setInt(2, detalleEmp.getEstudioSecundario().getRequerido());
            ps1.setInt(3, detalleEmp.getEstudioSecundario().getIdEstudioSecundario());
            
            ps1.executeUpdate();
            
            //LIMPIANDO
        
            
             //MODIFICANDO ESTUDIOSUPERIOR
            sqlES="update estudiosuperior set estudiosSuperior=?, requerido=?, idAreaEstudio=?, idNivelEstudioSuperior=?"
                    + " where idEstudioSuperior=?";
            
            PreparedStatement ps2 = this.getCon().prepareStatement(sqlES);
            
            ps2.setString(1, detalleEmp.getEstudioSuperior().getEstudiosSuperior() );
            ps2.setInt(2, detalleEmp.getEstudioSuperior().getRequerido());
            ps2.setInt(3, detalleEmp.getEstudioSuperior().getNivelEstudioSuperior().getIdNivelEstudioSuperior());
            ps2.setInt(4, detalleEmp.getEstudioSuperior().getAreaEstudio().getIdAreaEstudio() );
            ps2.setInt(5, detalleEmp.getEstudioSuperior().getIdEstudioSuperior());
            
            ps2.executeUpdate();
            
            //MODIFICAR IDIOMAOFERTA
            
            sqlES="update idiomaOferta set idIdiomaNivel=?, requerido=? where idIdiomaOferta=?";
            
            PreparedStatement ps3 = this.getCon().prepareStatement(sqlES);
            
            ps3.setInt(1, idiomaOfer.getIdiomaNivel().getIdNivelIdioma());
            ps3.setInt(2, idiomaOfer.getRequerido());
            ps3.setInt(3, detalleEmp.getIdDetalleOfertaEmpleo());
            
            ps3.executeUpdate();
            
            //INSERTAR DETALLEOFERTAEMPLEO
            
            sqlES="update detalleOfertaEmpleo set numVacantes=?, genero=?, edad=?, aniosExperiencia=?, candidatoVehiculo=?,"
                    + " descripcionPuesto=?, salarioMin=?, salarioMax=?, idIdiomaOferta=?, idEstudioSuperior=? "
                    + " idEstudioSecundario=?, idExperiencias=?"
                    + " where idDetalleOfertaEmpleo=?";
            
            PreparedStatement ps4 = this.getCon().prepareStatement(sqlES);
            
            ps4.setInt(1, detalleEmp.getNumVacantes() );
            ps4.setString(2, detalleEmp.getGenero());
            ps4.setInt(3, detalleEmp.getEdad() );
            ps4.setInt(4, detalleEmp.getAniosExperiencia() );
            ps4.setInt(5, detalleEmp.getCandidatoVehiculo());
            ps4.setString(6, detalleEmp.getDescripcionPuesto());
            ps4.setDouble(7, detalleEmp.getSalarioMin() );
            ps4.setDouble(8, detalleEmp.getSalarioMax() );
            ps4.setInt(9,   detalleEmp.getIdiomaOferta().getIdIdiomaOferta() );
            ps4.setInt(10,  detalleEmp.getEstudioSuperior().getIdEstudioSuperior() );
            ps4.setInt(11, detalleEmp.getEstudioSecundario().getIdEstudioSecundario());

 
            ps4.setInt(12, detalleEmp.getIdDetalleOfertaEmpleo());
            
            sqlES="update ofertaempleo set nombreCargo=?, idPuesto=? where idOfertaEmpleo=? ";
            
            PreparedStatement ps5 = this.getCon().prepareStatement(sqlES);
            
            ps5.setString(1, ofertaEmp.getNombreCargo());
            ps5.setInt(2, ofertaEmp.getPuesto().getIdPuesto() );
            ps5.setInt(3, detalleEmp.getIdDetalleOfertaEmpleo());
            
            ps5.executeUpdate();
            
            msj="Datos modificados correctamente!";
        }catch(Exception e){
            msj= e.toString();
        }
        
        return msj;
    }//FINAL MODIFICAR
    
    public String insertar(DetalleOfertaEmpleo detalleEmp, OfertaEmpleo ofertaEmp, IdiomaOferta idiomaOfer){
 
        PreparedStatement ps;
        
        String msj="";
        try{
            
              //INSERTAR LOS DATOS DE LA TABLA EXPERIENCIAS
            this.conectar();
            
            String sql="insert into experiencias values(null,?,?,?,?)";
            
            ps = this.getCon().prepareStatement(sql);
           
            ps.setString(1, detalleEmp.getExperiencia().getExperiencia() );
            ps.setString(2, detalleEmp.getExperiencia().getPuestosExperiencia());
            ps.setString(3, detalleEmp.getExperiencia().getCargo());
            ps.setInt(4, detalleEmp.getExperiencia().getRequerido());
            
            ps.executeUpdate();
            
            //LIMPIANDO
  
          
            //INSERTANDO SECUNDARIO
            String sqlES="insert into estudiosecundario values(null,?,?)";
            
            PreparedStatement ps1 = this.getCon().prepareStatement(sqlES);
            
            ps1.setString(1, detalleEmp.getEstudioSecundario().getEstudioSecundario() );
            ps1.setInt(2, detalleEmp.getEstudioSecundario().getRequerido());
            
            ps1.executeUpdate();
            
            //LIMPIANDO
        
            
             //INSERTANDO ESTUDIOSUPERIOR
            sqlES="insert into estudiosuperior values(null,?,?,?,?)";
            
            PreparedStatement ps2 = this.getCon().prepareStatement(sqlES);
            
            ps2.setString(1, detalleEmp.getEstudioSuperior().getEstudiosSuperior() );
            ps2.setInt(2, detalleEmp.getEstudioSuperior().getRequerido());
            ps2.setInt(3, detalleEmp.getEstudioSuperior().getNivelEstudioSuperior().getIdNivelEstudioSuperior());
            ps2.setInt(4, detalleEmp.getEstudioSuperior().getAreaEstudio().getIdAreaEstudio() );
            
            ps2.executeUpdate();
            
            //INSERTAR IDIOMAOFERTA
            
            sqlES="insert into idiomaOferta values(null,?,null,?)";
            
            PreparedStatement ps3 = this.getCon().prepareStatement(sqlES);
            
            ps3.setInt(1, idiomaOfer.getIdiomaNivel().getIdNivelIdioma());
            ps3.setInt(2, idiomaOfer.getRequerido() );
            
            ps3.executeUpdate();
           
            msj="Datos insertados correctamente! exp:"+idExperiencias+" ese:"+idEstudioSecundario+" ess:"+idEstudiosuperior;
        }catch(Exception e){
            msj= e.toString();
        }
        
        return msj;
    }//FINAL INSERTAR
    
    public String insertarDetalleOfertaEmpleo(DetalleOfertaEmpleo detalleEmp, OfertaEmpleo ofertaEmpleo) throws Exception{
        ResultSet rs1;
        String msj="";
        try{
            this.conectar();
            String sqlIDS="SELECT auto_increment as idEstudioSecundario, " +
                            " 	(SELECT auto_increment au FROM INFORMATION_SCHEMA.TABLES " +
                            " 		WHERE table_name = 'experiencias' order by au desc limit 1) idExperiencias," +
                            " 	(SELECT auto_increment aut FROM INFORMATION_SCHEMA.TABLES" +
                            " 		WHERE table_name = 'estudioSuperior' order by aut desc limit 1) idEstudioSuperior," +
                            " 	(SELECT auto_increment ai  FROM INFORMATION_SCHEMA.TABLES" +
                            " 		WHERE table_name = 'idiomaOferta' order by ai desc limit 1) idIdiomaOferta " +
                            "  FROM INFORMATION_SCHEMA.TABLES " +
                            "  WHERE table_name = 'estudiosecundario' order by idEstudioSecundario desc limit 1";
            
            rs1 = this.getCon().prepareCall(sqlIDS).executeQuery();
            
            while(rs1.next()){
                
                    idExperiencias = rs1.getInt("idExperiencias");
                    idEstudioSecundario = rs1.getInt("idEstudioSecundario");
                    idEstudiosuperior = rs1.getInt("idEstudioSuperior");
                    idIdiomaOferta = rs1.getInt("idIdiomaOferta");
            }  
            
            //INSERTAR DETALLEOFERTAEMPLEO
            String sqlES="insert into detalleOfertaEmpleo values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps4 = this.getCon().prepareStatement(sqlES);
            
            ps4.setInt(1, detalleEmp.getNumVacantes() );
            ps4.setString(2, detalleEmp.getGenero());
            ps4.setInt(3, detalleEmp.getEdad() );
            ps4.setInt(4, detalleEmp.getAniosExperiencia() );
            ps4.setInt(5, detalleEmp.getCandidatoVehiculo());
            ps4.setString(6, detalleEmp.getDescripcionPuesto());
            ps4.setDouble(7, detalleEmp.getSalarioMin() );
            ps4.setDouble(8, detalleEmp.getSalarioMax() );
            ps4.setInt(9,   idIdiomaOferta-1 );
            ps4.setInt(10,  idEstudiosuperior-1);
            ps4.setInt(11, idEstudioSecundario-1);
            ps4.setInt(12, idExperiencias-1);
            ps4.setInt(13, detalleEmp.getEmpresa().getIdEmpresa() );
            ps4.setInt(14, detalleEmp.getTipoContratacion().getIdTipoContratacion());
            ps4.setInt(15, detalleEmp.getTipoPago().getIdTipoPago() );
            
            ps4.executeUpdate();  
            
            //RESCATANDO ID DE DETALLEOFERTAEMPLEO
            
            sqlIDS="select LAST_INSERT_ID() id";
            int id=0;
            ResultSet rs2;
            rs2 = this.getCon().prepareCall(sqlIDS).executeQuery();
            
            while(rs2.next()){       
                    id= rs2.getInt("id");
            }  
            
            //INSERTAR OFERTAEMPLEO
            sqlES="insert into ofertaempleo values(null,?,null,?,null,null,?,1)";
            
            PreparedStatement ps5 = this.getCon().prepareStatement(sqlES);
            
            ps5.setString(1, ofertaEmpleo.getNombreCargo() );
            ps5.setInt(2, ofertaEmpleo.getPuesto().getIdPuesto() );
            ps5.setInt(3, id);
            
            ps5.executeUpdate();
            msj="Datos insertados correctamente!";
            
            //INSERTAR EL IDIOMAOFERTA EL ID DE DETALLEOFERTAEMPLEO
            
            sqlES="update idiomaOferta set idDetalleOfertaEmpleo=? where idIdiomaOferta=?";
            
            PreparedStatement ps6 = this.getCon().prepareStatement(sqlES);
            
            ps6.setInt(1, id);
            ps6.setInt(2, idIdiomaOferta-1 );
            
            ps6.executeUpdate();
            
        }catch(Exception e){
            msj=e.toString();
        }
     
        return msj;
    }
    
    public String eliminarOferta(int id){
        String msj="";
        
        try{
            this.conectar();
            String sqlES="update ofertaEmpleo set activo=0 where idOfertaEmpleo=?";
            
            PreparedStatement ps7 = this.getCon().prepareStatement(sqlES);
            
            ps7.setInt(1, id);
            
            ps7.executeUpdate();
            
            msj="Datos eliminados correctamente";
        }catch(Exception e){
            msj= e.toString();
        }
     
        return msj;
    }//FINAL ELIMINAROFERTA
    
    
    /*
    public String insertarOfertaEmpleo(OfertaEmpleo ofertaEmpleo) throws Exception{
        ResultSet rs2;
        String id="";
        String msj="";
        try{
            this.conectar();
            String sqlIDS="select LAST_INSERT_ID() id";
            
            rs2 = this.getCon().prepareCall(sqlIDS).executeQuery();
            
            while(rs2.next()){       
                    id= rs2.getString("id");
            }  
            
            msj="Ultimo id: ";
        }catch(Exception e){
            msj=e.toString();
        }
        
        
        return msj+id;
    }*/
/*    
    public String insertarEstudioSecundario(DetalleOfertaEmpleo detalleEmp, OfertaEmpleo ofertaEmp){
        
        String msj="";
        ResultSet rs1;
        String lastId="";
        
        try{
            //INSERTAR LOS DATOS DE LA TABLA EXPERIENCIAS
            this.conectar();
            
            String sql="insert into estudiosecundario values(null,?,?)";
            
            PreparedStatement ps1 = this.getCon().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            rs1 = ps1.getGeneratedKeys();
            
            ps1.setString(1, detalleEmp.getEstudioSecundario().getEstudioSecundario() );
            ps1.setInt(2, detalleEmp.getEstudioSecundario().getRequerido());
            
            ps1.executeUpdate();
            
            
            
            if (rs1 != null && rs1.first()) {
                lastId = rs1.getString(1);
            }    
                        
            
            msj="Datos insertados correctamente! " + lastId;
        }catch(Exception e){
            msj= e.toString()+"  "+lastId;
        }
        
        return msj;
    }//FINAL MODIFICAR
    
 */   
    
   /* public <clase> ArrayList<clase> llenarSelec(Class<clase> type) {
      ArrayList<clase> arrayList = new ArrayList<clase>();
      return arrayList;
   }
    
    public <clase> ArrayList<clase> llenarSelec(Class<clase> clase,String id, String name, String tabla){
       
        
        ArrayList lista = new ArrayList();
        
        try{
            this.conectar();
            String sql="select * from "+tabla;
            
            rs = this.getCon().prepareCall(sql).executeQuery();
            
            while(rs.next()){
                Selec selec = new Selec(
                        rs.getInt(id),
                        rs.getString(name)
                );//Constructor con parámetros
                
                lista.add(selec);
            }//FINAL WHILE
        }catch(Exception e){
           Selec s = new Selec();
           s.setRegistros(e.toString());
           
           lista.add(s);
        }
        
        return lista;
    }//FINAL MOSTRAR
*/
    
    
    
}
