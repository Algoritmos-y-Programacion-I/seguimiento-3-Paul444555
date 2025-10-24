

package model;

/**
 * _________________________________________________________________________________________________________________________
 * CONTRATO 
 * DESCRIPCION: Representa un incidente o daño reportado en un computador.
 *              Guarda el código, lo que pasó, la fecha, el nivel de gravedad y si ya se resolvió.

 * PARAMETROS:
     * Constructor para crear un nuevo incidente.
     * 
     * @param code Código único del incidente.
     * @param details Descripción breve de lo que ocurrió.
     * @param reportDate Fecha en la que se reportó el problema.
     * @param level Qué tan grave fue el incidente.
     * 
*
  *RETURN: Devuelve los datos principales del incidente en una línea.

  ___________________________________________________________________________________________________________________________
     */

public class Incident {

    private String code;
    private String details;
    private String reportDate;
    private Severity level;
    private boolean fixed;

  
    public Incident(String code, String details, String reportDate, Severity level) {
        this.code = code;
        this.details = details;
        this.reportDate = reportDate;
        this.level = level;
        this.fixed = false; 
    }

    
    public String getCode() { return code; }
    public String getDetails() { return details; }
    public String getReportDate() { return reportDate; }
    public Severity getLevel() { return level; }
    public boolean isFixed() { return fixed; }

    
    public void setCode(String code) { this.code = code; }
    public void setDetails(String details) { this.details = details; }
    public void setReportDate(String reportDate) { this.reportDate = reportDate; }
    public void setLevel(Severity level) { this.level = level; }
    public void setFixed(boolean fixed) { this.fixed = fixed; }

    
    public void markAsFixed() {
        this.fixed = true;
    }

    
    public String showData() {
        return "Código: " + code + " | Descripción: " + details +
               " | Fecha: " + reportDate + " | Nivel: " + level +
               " | Solucionado: " + (fixed ? "Sí" : "No");
    }
}




