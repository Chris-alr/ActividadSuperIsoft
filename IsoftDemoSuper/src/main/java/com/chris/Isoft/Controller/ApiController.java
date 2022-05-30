package com.chris.Isoft.Controller;

import com.chris.Isoft.Model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Api")
public class ApiController {

    private static List<Producto> listaProductos = new ArrayList<Producto>();
    private static List<Cajero> listaCajero = new ArrayList<Cajero>();
    private static List<Reponedor> listaReponedor = new ArrayList<Reponedor>();
    private static List<Usuario> listaUsuario = new ArrayList<Usuario>();
    private static List<Merma> listaMerma = new ArrayList<Merma>();

    @GetMapping("/productos")

    public List<Producto> getProductos(){
        listaProductos.add(new Producto("Leche","Lacteos",1,850,"seccion de lacteos"));
        listaProductos.add(new Producto("Chocolate","Dulceria",3,1000,"seccion dulceria"));
        listaProductos.add(new Producto("Choclo","Congelaos",12,1850,"seccion de congelados"));
        listaProductos.add(new Producto("Mani","Snacks",32,500,"seccion de snacks"));
        listaProductos.add(new Producto("Agua","Bebestibles",6,1250,"seccion de bebestibles"));
        listaProductos.add(new Producto("Papas Fritas","Snacks",34,2500,"seccion de snacks"));
        listaProductos.add(new Producto("Doritos","Snacks",86,1800,"seccion de snacks"));
        listaProductos.add(new Producto("Ice coffe","Bebestibles",27,5000,"seccion de bebestibles"));

        return listaProductos;
    }

    @GetMapping("/cajero")
    public List<Cajero> getCajero(){
        listaCajero.add(new Cajero("Carlos","20658658-1","carlitos23","contra123","250"));
        listaCajero.add(new Cajero("Luz","20329954-2","luz42","321contra","1000"));
        listaCajero.add(new Cajero("Benito","14658658-1","benito52","123sisi","500"));
        listaCajero.add(new Cajero("Juan","12658658-1","juan9342","123dx","2346"));
        listaCajero.add(new Cajero("Martin","22222222-1","juan8438","214g","235"));


        return listaCajero;
    }
    @GetMapping("/reponedor")
    public List<Reponedor> getReponedor(){
        listaReponedor.add(new Reponedor("Pedro","15658328-1","pedro97","asd123"));
        listaReponedor.add(new Reponedor("Maria","10352954-2","maria853","xd123"));
        listaReponedor.add(new Reponedor("Cesar","14658658-1","cesar256","fafa212"));


        return listaReponedor;
    }
    @GetMapping("/merma")
    public List<Merma> getMerma(){
        listaMerma.add(new Merma("Papas fritas","sobrante",1000));
        listaMerma.add(new Merma("Pollo asado","sobrante",10));
        listaMerma.add(new Merma("Cecina","expiracion",650));


        return listaMerma;
    }



}
