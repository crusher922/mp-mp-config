package com.programacion;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//esta clase es similar a un servlet debido, a que no usamos servlets y lo mapeamos directamente a la raíz
@ApplicationPath("/")
public class RestApp extends Application {
}
