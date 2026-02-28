package com.pucmm.csti18104833.practica4App1;

import io.javalin.Javalin;

public class Main {
    static void main() {
        var app = Javalin.create(config -> {
            config.routes.get("/", ctx -> ctx.result("Hola desde App 1"));
        }).start(7000);

    }
}
