
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gael
 */
public class ReservacionDTO {
    
    private MesaDTO MesaDTO;
    
    private ClienteDTO clienteDTO;
    
    private LocalDate fechahora;

    public ReservacionDTO() {
    }

    public ReservacionDTO(MesaDTO MesaDTO, ClienteDTO clienteDTO, LocalDate fechahora) {
        this.MesaDTO = MesaDTO;
        this.clienteDTO = clienteDTO;
        this.fechahora = fechahora;
    }

    public MesaDTO getMesaDTO() {
        return MesaDTO;
    }

    public void setMesaDTO(MesaDTO MesaDTO) {
        this.MesaDTO = MesaDTO;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public LocalDate getFechahora() {
        return fechahora;
    }

    public void setFechahora(LocalDate fechahora) {
        this.fechahora = fechahora;
    }

    @Override
    public String toString() {
        return "ReservacionDTO{" + "MesaDTO=" + MesaDTO + ", clienteDTO=" + clienteDTO + ", fechahora=" + fechahora + '}';
    }
    
   
}
