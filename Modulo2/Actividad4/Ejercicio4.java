//Queremos construir una aplicación que permita almacenar la información relevante sobre empresas y sus empleados:
//
//        La clase empresa tendrá como mínimo dos atributos: nombre de tipo String y anyodefundacion de tipo string.
//        La clase empleado tendrá como mínimo cuatro atributos: nombre de tipo String, apellidos de tipo String,
//        fechanacimiento de tipo String y fechaContrato de tipo String El programa mostrará un menu que tendrá las
//        siguientes opciones:
//        Crear nueva empresa.
//        Añadir empleado a empresa existente.
//        Listado de empresas.
//        Informacion de una empresa en particular.
//        Crear empleado.
//        Listado de empleados.
//        Información de un empleado en particular.
//        Salir. Se deberá implementar toda la funcionalidad en las clases para que la aplicación sea funciona.

package Modulo2.Actividad4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

class Empresa {
    String nombre;
    String anyodefundacion;
    ArrayList<Empleado> plantilla;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyodefundacion() {
        return anyodefundacion;
    }

    public void setAnyodefundacion(String anyodefundacion) {
        this.anyodefundacion = anyodefundacion;
    }

    public static void CreaEmpresa (ArrayList<Empresa> empresas, Empresa empresa) {
        empresas.add(empresa);
    }

    public static void ListadoEmpresas (ArrayList<Empresa> empresas) {
        for (int i = 0; i < empresas.size(); i++ ){
            System.out.println(empresas.get(i).nombre);
        }
    }

    public static void InfoEmpresa (Empresa empresa) {
        System.out.println(empresa.nombre);
        System.out.println(empresa.anyodefundacion);
    }

    public static Empresa BuscaEmpresa (String nombre, ArrayList<Empresa> empresas) {
        Empresa res = new Empresa();
        for (int i = 0 ; i< empresas.size(); i++) {
            if (empresas.get(i).nombre == nombre) {
                res = empresas.get(i);
            }
        }
        return res;
    }

    public static void AnyadeEmpleado (String nombreempresa, String apempleado, ArrayList<Empleado> empleados, ArrayList<Empresa> empresas) {
        Empresa empresa = BuscaEmpresa(nombreempresa, empresas);
        Empleado empleado = Empleado.BuscaEmpleado(apempleado, empleados);
        int i = empleados.indexOf(empleado.apellidos);
        if (empleados.contains(empleado.apellidos)) {
            int j = empresas.indexOf(empresa.nombre);
            empresas.get(j).plantilla.add(empleados.get(i));
            System.out.println("Se ha añadido a " + empleado.apellidos + " a empresa " + empresa.nombre);
        } else {
            System.out.println("No se ha encontrado al empleado");
        }
    }
}

class Empleado {
    String nombre;
    String apellidos;
    String fechanacimiento;
    String fechacontrato;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getFechacontrato() {
        return fechacontrato;
    }

    public void setFechacontrato(String fechacontrato) {
        this.fechacontrato = fechacontrato;
    }

    public static void CreaEmpleado(Empleado empleado, ArrayList<Empleado> empleados){
        empleados.add(empleado);
    }

    public static void ListadoEmpleados (ArrayList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++ ){
            System.out.println(empleados.get(i).nombre);
            System.out.println(empleados.get(i).apellidos);
            System.out.println(empleados.get(i).fechanacimiento);
            System.out.println(empleados.get(i).fechacontrato);
        }
    }

    public static void InfoEmpleado (Empleado empleado) {
        System.out.println(empleado.nombre);
        System.out.println(empleado.apellidos);
        System.out.println(empleado.fechanacimiento);
        System.out.println(empleado.fechacontrato);
    }

    public static Empleado BuscaEmpleado (String nombre, ArrayList<Empleado> empleados) {
        Empleado res = new Empleado();
        for (int i = 0 ; i< empleados.size(); i++) {
            if (empleados.get(i).nombre == nombre) {
                res = empleados.get(i);
            }
        }
        return res;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Boolean appOn = true;
        while (appOn) {
            System.out.println("1. Crear nueva empresa");
            System.out.println("2. Añadir empleado a empresa");
            System.out.println("3. Listado de empresas");
            System.out.println("4. Información de la empresa");
            System.out.println("5. Crear empleado");
            System.out.println("6. Listado de empleados");
            System.out.println("7. Información de empleado");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            String op = scanner.nextLine();

            switch (op) {
                case "1": {
                    //Crear empresa
                    Empresa empresa = new Empresa();
                    System.out.println("Nombre de la empresa: ");
                    empresa.nombre = scanner.nextLine();
                    System.out.println("Año de fundación: ");
                    empresa.anyodefundacion = scanner.nextLine();
                    Empresa.CreaEmpresa(empresas, empresa);
                    System.out.println("Se ha creado " + empresa.nombre + ", fundada en " + empresa.anyodefundacion);
                    break;
                }
                case "2": {
                    //Añadir empleado a empresa existente
                    String nombre, apellidos;
                    System.out.print("Introduzca nombre de empresa: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellidos del empleado: ");
                    apellidos = scanner.nextLine();
                    Empresa.AnyadeEmpleado(nombre, apellidos, empleados, empresas);
                    break;
                }

                case "3": {
                    //Listado de empresas

                    Empresa.ListadoEmpresas(empresas);
                    break;
                }

                case "4": {

                    //Informacion de una empresa en particular.
                    String nombreempresa;
                    System.out.print("Nombre de la empresa: ");
                    nombreempresa = scanner.nextLine();
                    Empresa empresa = Empresa.BuscaEmpresa(nombreempresa, empresas);
                    Empresa.InfoEmpresa(empresa);
                    break;
                }

                case "5": {

                    // Crear empleado.

                    Empleado empleado = new Empleado();
                    System.out.print("Nombre: ");
                    empleado.nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    empleado.apellidos = scanner.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    empleado.fechanacimiento = scanner.nextLine();
                    System.out.print("Fecha de contratación: ");
                    empleado.fechacontrato = scanner.nextLine();
                    Empleado.CreaEmpleado(empleado, empleados);
                    System.out.println("Se ha añadido al empleado " + empleado.nombre + " " + empleado.apellidos);
                    Empleado.ListadoEmpleados(empleados);
                    break;
                }

                case "6": {
                    // Listado de empleados

                    Empleado.ListadoEmpleados(empleados);
                    break;
                }

                case "7": {

                    // Información de un empleado en particular.

                    String apempleado;
                    System.out.print("Apellidos del empleado: ");
                    apempleado = scanner.nextLine();
                    Empleado empleado = Empleado.BuscaEmpleado(apempleado, empleados);
                    Empleado.InfoEmpleado(empleado);
                    break;
                }

                case "8": {
                    appOn = false;
                    break;
                }

                default: {
                    System.out.println("Elija otra vez");
                }
            }
        }
    }
}