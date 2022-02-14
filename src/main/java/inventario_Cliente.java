
public class inventario_Cliente { 
    //Atributos de la clase
    private String nombres;
    private String apellidos;
    private String correo;
    private String dui;
    private String fechaCompra;
    private char pago;
    private int vehivulos_Comprados;
    
    //Metodo constructor
    public inventario_Cliente(String nombres, String apellidos, String correo, String dui, String fechaCompra, int vehivulos_Comprados, char pago) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dui = dui;
        this.fechaCompra = fechaCompra;
        this.pago = pago;
        this.vehivulos_Comprados = vehivulos_Comprados;
    }
    
    //Encapsulamiento
    public void setNombres (String _nombres)
    {
     this.nombres = _nombres;
    }
    
    public String getNombres()
    {
     return this.nombres;
    }
    
    public void setApellidos (String _apellidos)
    {
     this.apellidos = _apellidos;
    }
    
    public String getApellidos()
    {
     return this.apellidos;
    }
    
    public void setCorreo (String _correo)
    {
     this.correo = _correo;
    }
    
    public String getCorreo()
    {
     return this.correo;
    }
    
    public void setDui (String _dui)
    {
     this.dui = _dui;
    }
    
    public String getDui()
    {
     return this.dui;
    }
    
    public void setVehivulos_Comprados (int _vehivulos_Comprados)
    {
     this.vehivulos_Comprados = _vehivulos_Comprados;
    }
    
    public int getVehivulos_Comprados()
    {
     return this.vehivulos_Comprados;
    }
    
    public void setFecha_compra (String _fechaCompra)
    {
     this.fechaCompra = _fechaCompra;
    }
    
    public String getFecha_compra()
    {
     return this.fechaCompra;
    }
    
    public void setPago (char _pago)
    {
     this.pago = _pago;
    }
    
    public char getPago()
    {
     return this.pago;
    }
}
