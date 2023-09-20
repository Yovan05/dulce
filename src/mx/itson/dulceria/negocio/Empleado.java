
package mx.itson.dulceria.negocio;

/**
 *
 * @author alexi
 */
public class Empleado extends Entidad{
    
    private int idOperador=0;
    private String curp=new String();
    private double sueldo=0;
    private String horario=new String();
    private String puesto=new String();
    private String nss=new String();
    
    public Empleado() {
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }
    
    
    
    
    
    
    
}
