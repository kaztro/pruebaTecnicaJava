package com.ingeneo.logistica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ingeneo.logistica.domain.Cliente;
//import com.ingeneo.logistica.service.AlmacenService;
import com.ingeneo.logistica.service.ClienteService;
//import com.ingeneo.logistica.service.ProductoService;
//import com.ingeneo.logistica.service.TransporteService;

@Controller
public class MainController {
    //@Autowired
    //private AlmacenService almacenService;

    @Autowired
    private ClienteService clienteService;

    //@Autowired
    //private ProductoService productoService;

    //@Autowired
    //private TransporteService transporteService;

    @RequestMapping("/listClientes")
    public ModelAndView listaClientes() {
        ModelAndView mav = new ModelAndView();
        List<Cliente> clientesL = null;
        try{
            clientesL = clienteService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        mav.addObject("cliente", new Cliente());
        mav.addObject("clientesL", clientesL);
        mav.setViewName("listCliente");

        return mav;
    }

}
