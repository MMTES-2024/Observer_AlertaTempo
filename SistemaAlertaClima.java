/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ex01.observeralertatempo;

/**
 *
 * @author rafaelamoreira
 */
public interface SistemaAlertaClima {

    void adicionarObservador(Observer observador);

    void removerObservador(Observer observador);

    void notificarObservadores(String alertaTempo);
}
