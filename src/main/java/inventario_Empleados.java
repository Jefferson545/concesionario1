
public class inventario_Empleados {
    //Atributos de la clase 
    private String nombre;
    private String apellido;
    private String dui;
    private String fechaventa;
    private int edad;
    private int ventas;
    private double total_vendido;

    //Metodo constructor
    public inventario_Empleados(String nombre, String apellido, String dui, String fechaventa, int edad, int ventas, double total_Vendido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.fechaventa = fechaventa;
        this.edad = edad;
        this.ventas = ventas;
        this.total_vendido = total_Vendido;
    }
    
    //Encapsulamiento
    public void setNombre (String _nombre)
    {
     this.nombre = _nombre;
    }
    
    public String getNombre()
    {
     return this.nombre;
    }
    
    public void setApellido (String _apellido)
    {
     this.apellido = _apellido;
    }
    
    public String getApellido()
    {
     return this.apellido;
    }
    
    public void setDui (String _dui)
    {
     this.dui = _dui;
    }
    
    public String getDui()
    {
     return this.dui;
    }
    
    public void setEdad (int _edad)
    {
     this.edad = _edad;
    }
    
    public int getEdad()
    {
     return this.edad;
    }
    
    public void setFechaventa (String _fechaventa)
    {
     this.fechaventa = _fechaventa;
    }
    
    public String getFechaventa()
    {
     return this.fechaventa;
    }
    
    public void setVentas (int _ventas)
    {
     this.ventas = _ventas;
    }
    
    public int getVentas()
    {
     return this.ventas;
    }
    
    public void setTotal_vendido (double _total_vendido)
    {
     this.total_vendido = _total_vendido;   
    }
    
    public double getTotal_vendido()
    {
     return this.total_vendido;
    }
}
