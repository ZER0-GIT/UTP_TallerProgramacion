package semana12;

public class S1_Ejercicio2_Libro {
    private String titulo;
    private String autor;
    private int stock;
    public long ISBN;
    private double precio;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getStock(){
        return stock;
    }
    public double getPrecio(){
        return precio;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
