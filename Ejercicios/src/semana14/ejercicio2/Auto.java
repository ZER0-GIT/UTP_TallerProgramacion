package semana14.ejercicio2;

public class Auto {
    private String placa, marca, modelo, propietario;
    public Auto(){}
    public Auto(String placa, String marca,String modelo,String propietario){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
