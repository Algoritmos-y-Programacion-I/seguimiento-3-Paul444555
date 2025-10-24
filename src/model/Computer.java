
    /*
    PROFE INSTRUCCIONES :D
    
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */
    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
  //______________________________________________________________________________________________________________

  package model;

  import java.util.ArrayList;

/**

 * 
 * DESCRIPCION:Representa un computador dentro de la escuela.
 * Tiene su número de serie, su posición (piso, columna) y los incidentes que se le han reportado.
 * 
 * ________________________________________________________________________________________________________________
 */
public class Computer {

    private String serial;
    private int floor;
    private int column;
    private ArrayList<Incident> incidents;

    /**
     * _____________________________________________________________________________________________________________
     * CONTRATO
     *
     * DESCRIPCION:Crea un nuevo computador con su posición y número de serie.
     * PARAMETROS:
     * @param serial Número de serie único.
     * @param floor Piso en el que se encuentra.
     * @param column Columna donde está ubicado.
     * 
     *  * RETURN: Retorna un texto con la información básica del computador.
     * ______________________________________________________________________________________________________________
     */
    
     public Computer(String serial, int floor, int column) {
        this.serial = serial;
        this.floor = floor;
        this.column = column;
        this.incidents = new ArrayList<>();
    }

    public String getSerial() { return serial; }
    public int getFloor() { return floor; }
    public int getColumn() { return column; }
    public ArrayList<Incident> getIncidents() { return incidents; }


    public void addIncident(Incident incident) {
        incidents.add(incident);
    }

    public String showData() {
        return "Serial: " + serial + 
               " | Piso: " + floor + 
               " | Columna: " + column + 
               " | Incidentes: " + incidents.size();
    }
}
