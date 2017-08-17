

public class Cliente {

    protected String nombre;
    protected String numero;
    protected String direc;
    protected String correo;
    protected int m2;
    protected float valorProp;
    protected float valorVenta;
    

    public Cliente() {
	this.nombre=nombre;
	this.numero=numero;
	this.direc=direc;
	this.correo=correo;
	this.m2=m2;
	this.valorProp=valorProp;
	this.valorVenta=valorVenta;

    }


    public String getNombre() {
	   return this.nombre;
    }


    public String getNumero() {
	   return this.numero;
    }

    public String getDirec() {
	   return this.direc;
    }

    public String getCorreo() {
	   return this.correo;
    }

    public int getMetros() {
	   return this.m2;
    }

    public float getValorProp() {
	   return this.valorProp;
    }

    public float getValorVenta() {
	   return this.valorVenta;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setNumero(String numero) {
        this.numero=numero;
    }

    public void setDirec(String direc) {
        this.direc=direc;
    }

    public void setCorreo(String correo) {
        this.correo=correo;
    }


    public void setMetros(int m2) {
        this.m2=m2;
    }

    public void setValorProp(float valorProp) {
        this.valorProp=valorProp;
    }

    public void setValorVenta(float valorVenta) {
        this.valorVenta=valorVenta;
    }


}
