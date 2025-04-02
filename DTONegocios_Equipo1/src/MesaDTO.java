/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gael
 */
public class MesaDTO {
    
    private int numeroMesa;
    private int capacidadMesa;

    public MesaDTO() {
    }

    public MesaDTO(int numeroMesa, int capacidadMesa) {
        this.numeroMesa = numeroMesa;
        this.capacidadMesa = capacidadMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidadMesa() {
        return capacidadMesa;
    }

    public void setCapacidadMesa(int capacidadMesa) {
        this.capacidadMesa = capacidadMesa;
    }

    @Override
    public String toString() {
        return "MesaDTO{" + "numeroMesa=" + numeroMesa + ", capacidadMesa=" + capacidadMesa + '}';
    }
    
    
    
}
