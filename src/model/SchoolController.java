

    /*
    _________________________________________________________________________________________________________________
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */
    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los
     * requerimientos.
     * Para cada metodo:
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos.
     */
//______________________________________________________________________________________________________________--



package model;

import java.util.ArrayList;




public class SchoolController {

    private Computer[][] building; 
    private ArrayList<Computer> computers; 


    public SchoolController() {
        building = new Computer[5][10];
        computers = new ArrayList<>();
    }

    /**
     * _____________________________________________________________________________________________________________
     * CONTRATO
     * DESCRIPCION:Agrega un nuevo computador a un piso, buscando la primera posición vacía.
     * 
     * PARAMETROS:
     * @param serial Número de serie único.
     * @param floor Piso en el que se va a ubicar.
     * @return true si se agregó correctamente, false si ya existe o no hay espacio.
     * 
     * -_____________________________________________________________________________________________________________
     */

    
    public boolean addComputer(String serial, int floor) {

        for (Computer c : computers) {
            if (c.getSerial().equals(serial)) {
                System.out.println(" Este serial esta registrado en el sistema.");
                return false;
            }
        }

        for (int col = 0; col < building[floor].length; col++) {
            if (building[floor][col] == null) {
                Computer newPC = new Computer(serial, floor, col);
                building[floor][col] = newPC;
                computers.add(newPC);
                System.out.println(" Compu agregado en piso " + floor + ", columna " + col);
                return true;
            }
        }

        System.out.println(" Ya no hay más espacio en ese piso.");
        return false;
    }

    /**
     * ___________________________________________________________________________________________________________________
     * CONTRATO:
     * 
     * DESCRIPCION: Registra un incidente en un computador específico.
     * PARAMETROS:
     * @param serial Serial del computador.
     * @param description Qué pasó.
     * @param date Fecha del incidente.
     * @param level Gravedad del problema.
     *
     * RETURN
     * @return true si el incidente se agregó, false si no se encontró el computador.
     * 
     * ____________________________________________________________________________________________________________________
     */


    public boolean addIncidentToComputer(String serial, String description, String date, Severity level) {
        for (Computer c : computers) {
            if (c.getSerial().equals(serial)) {
                String code = "INC" + (c.getIncidents().size() + 1);
                Incident incident = new Incident(code, description, date, level);
                c.addIncident(incident);
                System.out.println(" Incidente añadido al compu " + serial);
                return true;
            }
        }
        System.out.println("No existe un compu con ese serial.");
        return false;
    }

    public Computer getComputerWithMostIncidents() {
        if (computers.isEmpty()) {
            System.out.println(" No hay compus registrados.");
            return null;
        }

        Computer max = computers.get(0);
        for (Computer c : computers) {
            if (c.getIncidents().size() > max.getIncidents().size()) {
                max = c;
            }
        }

        System.out.println(" El compu que contiene mas incidentes es:");
        System.out.println(max.showData());
        return max;
    }

   
    public ArrayList<Computer> getAllComputers() {
        return computers;
    }
}
