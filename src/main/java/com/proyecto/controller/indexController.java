/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

/**
 *
 * @author 2003a
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/finnk")
public class indexController {

    @GetMapping("/")
    public String inicio(Model model) {
        return "index";
    }
    @GetMapping("/Ropa")
    public String categoriaRopa(Model model) {
        return "/catalogos/Ropa";
    }
    @GetMapping("/Bolsos")
    public String categoriaBolsos(Model model) {
        return "/catalogos/Bolsos";
    }
    @GetMapping("/New arrivals")
    public String categoriaNewArrivals(Model model) {
        return "/informativo/New arrivals";
    }
     @GetMapping("/blogs")
    public String categoriaBlogs(Model model) {
        return "/informativo/blogs";
    }
     @GetMapping("/informacion")
    public String categoriaInformacion(Model model) {
        return "/informativo/informacion";
    }
    @GetMapping("/joyeria")
    public String categoriaJoyeria(Model model) {
        return "/catalogos/joyeria";
    }

}
