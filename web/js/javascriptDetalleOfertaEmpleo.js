
/* global tablaDependiente */



function call(obj,selecOtro){
    var IdRecibido;
    
    var IdRecibido = obj[obj.selectedIndex].value;
    
    var Name = obj.getAttribute("ti");
    
    var TablaDependiente = obj.getAttribute("t");
    var IdTablaDependiente = "id"+obj.getAttribute("t");
    
    var TablaIndependiente = obj.name;
    var IdTablaIndependiente = "id"+obj.name;
    
    var TablaLlaves = obj.getAttribute("kol");
    var IdTablaLlaves = "id"+obj.getAttribute("kol");
    
  
    $.get('procesardetalleofertaEmpleo',{
            name:Name,
            tablaIndependiente: TablaIndependiente,
            idTablaIndependiente: IdTablaIndependiente,
            tablaDependiente: TablaDependiente,
            idTablaDependiente: IdTablaDependiente,
            tablaLlaves: TablaLlaves,
            idTablaLlaves: IdTablaLlaves,
            idRecibido: IdRecibido
    }, function(data, status){
        debugger;
        alert("Estatus: "+status);
     }
    );
    
    var sql="select "+TablaDependiente+"."+IdTablaDependiente+" as id, "+Name+" as registro  from "+TablaLlaves +
                        " inner join "+TablaIndependiente+" on "+TablaLlaves+"."+IdTablaIndependiente+" = "+TablaIndependiente+"."+IdTablaIndependiente+
                        " inner join "+TablaDependiente+" on "+TablaDependiente+"."+IdTablaDependiente+" = "+TablaLlaves+"."+IdTablaDependiente+
                        " where "+TablaLlaves+"."+IdTablaIndependiente+" = "+IdRecibido;
    alert(sql);
    
    add(selecOtro);
    
    
    $.get('',
    {
        vriable: valor
    }
    );
    
    //alert("Name:"+name+" Tabla independiente:"+tablaIndependiente+" \nIdTablaIndependiente: "+idTablaIndependiente+
      //    " TablaDependiente: "+tablaDependiente+" idTablaDependiente:"+idTablaDependiente+" TablaLlaves: "+tablaLlaves+"\n"+
        //  " idTablaLlaves: "+idTablaLlaves+" idRecibido: "+idRecibido);
    
    //name, String tablaIndependiente,String idTablaIndependiente,String tablaDependiente
    //idTablaDependiente,String tablaLlaves, String idTablaLlaves, String idRecibido
    
}


