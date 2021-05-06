package com.devsuperior.dsvendas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hw")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "[\n" +
                "        {\n" +
                "            \"data\": \"22/04/2021\",\n" +
                "            \"vendedor\": \"Barry Allen\",\n" +
                "            \"clientes_visitados\": 45,\n" +
                "            \"negocios_fechados\": 31,\n" +
                "            \"valor\": 8900\n" +
                "        },\n" +
                "        {\n" +
                "            \"data\": \"17/03/2021\",\n" +
                "            \"vendedor\": \"Barry Allen\",\n" +
                "            \"clientes_visitados\": 34,\n" +
                "            \"negocios_fechados\": 25,\n" +
                "            \"valor\": 15017\n" +
                "        }\n" +
                "    ]";
    }
}
