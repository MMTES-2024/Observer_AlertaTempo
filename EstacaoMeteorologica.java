/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.observeralertatempo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafaelamoreira
 */
public class EstacaoMeteorologica implements SistemaAlertaClima{

    private List<Observer> observadores = new ArrayList<>();
    private String condicaoClimatica;

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String alertaTempo) {
        for (Observer observador : observadores) {
            observador.update(alertaTempo);
        }
    }

    public void setCondicaoClimatica(String novaCondicao) {
        this.condicaoClimatica = novaCondicao;
        System.out.println("Clima mudou para: " + novaCondicao);
        notificarObservadores(novaCondicao);
    }
}
