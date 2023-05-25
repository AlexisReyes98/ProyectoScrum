
package Model;

/**
 *
 * @author alexis
 */
public class Mark {
    private String claveMark;
    private String nombre;
    private String sitioWeb;

    public Mark() {
    }

    public Mark(String claveMark, String nombre, String sitioWeb) {
        this.claveMark = claveMark;
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
    }

    public String getClaveMark() {
        return claveMark;
    }

    public void setClaveMark(String claveMark) {
        this.claveMark = claveMark;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    
}
