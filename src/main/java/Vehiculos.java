
public class Vehiculos {
    
    //Atributos de la clase
    private String modelo;
    private String marca;
    private String color;
    private String placa;
    private int anho;
    private double kilometraje;
    private double precio;
    private char estado;
    private char tipovehiculo;

    //Metodo constructor
    public Vehiculos(String modelo, String marca, String color, String placa, int anho, double kilometraje, double precio, char estado, char tipovehiculo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.anho = anho;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.estado = estado;
        this.tipovehiculo = tipovehiculo;
    }
    
    //Encapsulamiento
    public void setModelo (String _modelo)
    {
     this.modelo = _modelo;
    }
    
    public String getModelo()
    {
     return this.modelo;
    }
    
    public void setMarca (String _marca)
    {
     this.marca = _marca;
    }
    
    public String getMarca()
    {
     return this.marca;
    }
    
    public void setColor (String _color)
    {
     this.color = _color;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setPlaca (String _placa)
    {
     this.placa = _placa;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    
    public void setAnho (int _anho)
    {
     this.anho = _anho;
    }
    
    public int getAnho()
    {
        return this.anho;
    }
    
    public void setKilometraje (double _kilometraje)
    {
     this.kilometraje = _kilometraje;
    }
    
    public double getKilometraje()
    {
        return this.kilometraje;
    }
    
    public void setPrecio (double _precio)
    {
     this.precio = _precio;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    
    public void setEstado (char _estado)
    {
     this.estado = _estado;
    }
    
    public char getEstado()
    {
        return this.estado;
    }
    
    public void setTipovehiculo(char _tipovehiculo)
    {
     this.tipovehiculo = _tipovehiculo;
    }
    
    public char getTipovehiculo()
    {
        return this.tipovehiculo;
    }
    
    
}
