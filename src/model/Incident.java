//CONTRATOS: 



package model;

import javax.print.attribute.standard.Severity;

public class Incident {
    private String id;              
    private String description;    
    private String date;            
    private Severity severity;      
    private boolean solved;    
    
    public Incident(String id, String description, String date, Severity severity) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.severity = severity;
        this.solved = false; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
    

    
     
    public void solveIncident() {
        this.solved = true;
    }

    
     
    public String showInfo() {
        return "ID: " + id + " | Descripción: " + description +
               " | Fecha: " + date + " | Severidad: " + severity +
               " | Resuelto: " + (solved ? "Sí" : "No");
    }
}



