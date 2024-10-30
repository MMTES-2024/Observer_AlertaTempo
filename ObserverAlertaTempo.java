/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.observeralertatempo;

/**
 *
 * @author rafaelamoreira
 */
public class ObserverAlertaTempo {

    public static void main(String[] args) {
        
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        // Criando observadores
        Observer radio = new EstacaoRadio();
        Observer sms = new ServicoAlertaSMS();
        Observer app = new NotificacaoApp();

        // Registrando os observadores
        estacao.adicionarObservador(radio);
        estacao.adicionarObservador(sms);
        estacao.adicionarObservador(app);

        // Simulando mudanças de clima
        estacao.setCondicaoClimatica("Tempestade forte");
        System.out.println("-----");

        // Removendo um observador e notificando novamente
        estacao.removerObservador(sms);
        estacao.setCondicaoClimatica("Chuva leve");

    }
}
