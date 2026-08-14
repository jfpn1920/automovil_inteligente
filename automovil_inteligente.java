import java.util.Scanner;
public class automovil_inteligente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] marcas = new String[10];
        String[] modelos = new String[10];
        int[] anios = new int[10];
        String[] placas = new String[10];
        String[] combustibles = new String[10];
        double[] baterias = new double[10];
        double[] kilometrajes = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------------//
        //--|menu_principal_de_automovil_inteligente|--//
        //---------------------------------------------//
        do {
            System.out.println("menu principal de automovil inteligente");
            System.out.println("1) Registrar automovil");
            System.out.println("2) Editar automovil");
            System.out.println("3) Listar automoviles");
            System.out.println("4) Buscar automovil");
            System.out.println("5) Eliminar automovil");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_automovil|--//
                //-------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del automovil");
                    System.out.println("id del automovil a registrar: " + id);
                    System.out.print("marca: ");
                    marcas[total] = entrada.nextLine();
                    System.out.print("modelo: ");
                    modelos[total] = entrada.nextLine();
                    System.out.print("ano: ");
                    anios[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("placa: ");
                    placas[total] = entrada.nextLine();
                    System.out.print("tipo de combustible: ");
                    combustibles[total] = entrada.nextLine();
                    System.out.print("nivel de bateria o combustible (%): ");
                    baterias[total] = entrada.nextDouble();
                    System.out.print("kilometraje: ");
                    kilometrajes[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("estado del vehiculo: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Automovil registrado correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_automovil|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen automoviles registrados.");
                        break;
                    }
                    System.out.println("Datos de los automoviles");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Ano: " + anios[i] + " | Placa: " + placas[i] + " | Combustible: " + combustibles[i] + " | Bateria/Combustible: " + baterias[i] + "% | Kilometraje: " + kilometrajes[i] + " km | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del automovil: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del automovil");
                        System.out.print("Nueva marca: ");
                        marcas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo modelo: ");
                        modelos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo ano: ");
                        anios[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nueva placa: ");
                        placas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de combustible: ");
                        combustibles[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nivel de bateria o combustible (%): ");
                        baterias[posicion] = entrada.nextDouble();
                        System.out.print("Nuevo kilometraje: ");
                        kilometrajes[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nuevo estado del vehiculo: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Automovil actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_automoviles|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen automoviles registrados.");
                    } else {
                        System.out.println("Lista de automoviles");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Ano: " + anios[i] + " | Placa: " + placas[i] + " | Combustible: " + combustibles[i] + " | Bateria/Combustible: " + baterias[i] + "% | Kilometraje: " + kilometrajes[i] + " km | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_automovil|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen automoviles registrados.");
                        break;
                    }
                    System.out.println("busqueda de automovil");
                    System.out.print("ingresa la id para buscar automovil: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del automovil encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Marca: " + marcas[posicion] + " | Modelo: " + modelos[posicion] + " | Ano: " + anios[posicion] + " | Placa: " + placas[posicion] + " | Combustible: " + combustibles[posicion] + " | Bateria/Combustible: " + baterias[posicion] + "% | Kilometraje: " + kilometrajes[posicion] + " km | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_automovil|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen automoviles registrados.");
                        break;
                    }
                    System.out.println("Datos de los automoviles");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Ano: " + anios[i] + " | Placa: " + placas[i] + " | Combustible: " + combustibles[i] + " | Bateria/Combustible: " + baterias[i] + "% | Kilometraje: " + kilometrajes[i] + " km | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del automovil a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            marcas[i] = marcas[i + 1];
                            modelos[i] = modelos[i + 1];
                            anios[i] = anios[i + 1];
                            placas[i] = placas[i + 1];
                            combustibles[i] = combustibles[i + 1];
                            baterias[i] = baterias[i + 1];
                            kilometrajes[i] = kilometrajes[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Automovil eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Automovil Inteligente.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}