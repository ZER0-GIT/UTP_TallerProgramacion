package semana7;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2_Ejercicio1 {
    public static void main(String[] args) {
        Pattern patronNombre = Pattern.compile("^((?i)[a-z]\\w+(\\s[a-z]\\w+)?)$");
        double salEne = 0,salFeb = 0,salMar = 0,salAbr=0,salMay=0,salJun=0,salJul=0,salAgo=0,salSet=0,salOct=0,salNov=0,salDic=0;
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        String nombres="";
        String apellidos="";
        String menuOpc ="###############################\n" +
                "#      MENÚ DE OPCIONES       #\n" +
                "###############################\n" +
                "# 1. Ingresar Empleado        #\n" +
                "# 2. Ingresar Salario Mensual #\n" +
                "# 3. Emitir Boleta            #\n" +
                "# 4. Salir                    #\n" +
                "###############################\n";
        boolean salirOpc2=false;
        boolean salirOpc1=false;
        do {
            System.out.println(menuOpc);
            int opc = leer.nextInt();
            switch (opc){
                case 1:{
                    salirOpc1=false;
                    do {
                        System.out.println("Ingrese los nombres del empleado");
                        leer.nextLine();
                        nombres = leer.nextLine();
                        System.out.println("Ingrese los apellidos del empleado");
                        leer.reset();
                        apellidos = leer.nextLine();
                        Matcher buscarNombre = patronNombre.matcher(nombres);
                        Matcher buscarApellido = patronNombre.matcher(apellidos);
                        if (buscarNombre.find()&&buscarApellido.find()){
                            salirOpc1=true;
                        }else{
                            System.out.println("ERROR-VUELVA A INTRODUCIR LOS DATOS");
                        }
                    }while (!salirOpc1);
                    break;
                }
                case 2:{
                    salirOpc2=false;
                    do {
                        System.out.println("Ingrese el sueldo del mes de Enero");
                        salEne = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Febrero");
                        salFeb = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Marzo");
                        salMar = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Abril");
                        salAbr = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Mayo");
                        salMay = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Junio");
                        salJun = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Julio");
                        salJul = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Agosto");
                        salAgo = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Setiembre");
                        salSet = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Octubre");
                        salOct = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Noviembre");
                        salNov = leer.nextDouble();
                        System.out.println("Ingrese el sueldo del mes de Diciembre");
                        salDic = leer.nextDouble();
                        if (salEne>=0&&salFeb>=0&&salMar>=0&&salAbr>=0&&salMay>=0&&salJun>=0&&salJul>=0&&salAgo>=0&&salSet>=0&&salOct>=0&&salNov>=0&&salDic>=0){
                            salirOpc2=true;
                        }else{
                            System.out.println("ERROR, DATOS ERRONEOS");
                        }
                    }while(!salirOpc2);
                    break;
                }
                case 3:{
                    if (salirOpc1&&salirOpc2){
                        System.out.println("************************************************************");
                        System.out.println("RESUMEN DE BOLETAS DE PAGO");
                        System.out.println("************************************************************");
                        System.out.println("NOMBRES DEL EMPLEADO: "+nombres);
                        System.out.println("APELLIDOS DEL EMPLEADO: "+apellidos);
                        System.out.println("SALARIO ENE: "+salEne+" SALARIO FEB: "+salFeb);
                        System.out.println("SALARIO MAR: "+salMar+" SALARIO ABR: "+salAbr);
                        System.out.println("SALARIO MAY: "+salMay+" SALARIO JUN: "+salJun);
                        System.out.println("SALARIO JUL: "+salJul+" SALARIO AGO: "+salAgo);
                        System.out.println("SALARIO SET: "+salSet+" SALARIO OCT: "+salOct);
                        System.out.println("SALARIO NOV: "+salNov+" SALARIO DIC: "+salDic);
                        System.out.println("************************************************************");
                        System.out.println("SALARIO TOTAL: "+(salEne+salFeb+salMar+salAbr+salMay+salJun+salJul+salAgo+salSet+salOct+salNov+salDic));
                        System.out.println("************************************************************");
                    }
                    break;
                }
                case 4: salir=true;
            }

        }while(!salir);

    }
}
