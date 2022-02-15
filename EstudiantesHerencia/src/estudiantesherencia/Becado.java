
package estudiantesherencia;

public class Becado extends Estudiante{
    float porcentajeBeca;
   
    float totalPagar;

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public float getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(float porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }
    
    public float colegiaturaNeto(){
        return this.colegiatura-((this.porcentajeBeca/100)*this.colegiatura);
    }

    
    
}
