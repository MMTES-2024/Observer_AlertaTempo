/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.observeralertatempo;

/**
 *
 * @author rafaelamoreira
 */
public class ServicoAlertaSMS implements Observer {

    @Override
    public void update(String alertaTempo) {
        System.out.println("Serviço de SMS enviando alerta: " + alertaTempo);
    }
}
