
package mx.itson.dulceria.negocio;

/**
 *
 * @author alexi
 */
public class Empresa extends Entidad{
  
    private int idEmpresa=0;
    private String registroPatronal=new String();
    private String permisoMaterualPeligroso=new String();
    private String paginaWeb=new String();

    public Empresa() {
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRegistroPatronal() {
        return registroPatronal;
    }

    public void setRegistroPatronal(String registroPatronal) {
        this.registroPatronal = registroPatronal;
    }

    public String getPermisoMaterualPeligroso() {
        return permisoMaterualPeligroso;
    }

    public void setPermisoMaterualPeligroso(String permisoMaterualPeligroso) {
        this.permisoMaterualPeligroso = permisoMaterualPeligroso;
    }

    
    
    
    
}
