/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.observeralertatempo;

/**
 *
 * @author rafaelamoreira
 */
public class NotificacaoApp implements Observer {

    @Override
    public void update(String alertaTempo) {
        System.out.println("Aplicativo de Notificação exibe alerta: " + alertaTempo);
    }
}
