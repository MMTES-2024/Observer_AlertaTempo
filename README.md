
# Sistema de Alerta de Eventos Meteorológicos

Uma prefeitura deseja implementar um sistema de alerta para eventos meteorológicos severos (como chuvas intensas, tempestades e furacões) em tempo real. Esse sistema permitirá que diferentes tipos de "observadores" sejam notificados automaticamente quando o estado do clima mudar, de forma a tomar as ações necessárias rapidamente.

Na cidade, há vários tipos de entidades que precisam receber alertas de clima:

- **Estação de Rádio**: A estação de rádio precisa receber alertas para transmitir a informação em tempo real para os moradores.
- **Serviço de SMS**: O serviço de SMS envia mensagens diretamente para o celular dos moradores cadastrados para alertá-los sobre mudanças de tempo severas.
- **Aplicativo de Notificação**: Um aplicativo de celular que exibe notificações de alerta aos usuários.

## Requisitos

1. Crie uma interface `Observer` com o método `atualizar(String mensagem)`, que recebe uma mensagem de alerta meteorológico.
2. Crie uma interface `AlertaClima` com métodos para:
   - Registrar observadores.
   - Remover observadores.
   - Notificar observadores.

3. Implemente a classe concreta `EstacaoMeteorologica`, que representa o sistema de monitoramento do clima e notifica todos os observadores quando há uma mudança no estado do clima.
4. Implemente classes concretas para cada tipo de observador:
   - `EstacaoRadio`
   - `ServicoSMS`
   - `AppNotificacao`

   Cada um desses observadores recebe as atualizações de alerta e realiza a ação necessária.

5. Na classe `Principal`, simule uma mudança de clima severa (como uma tempestade ou furacão) e verifique se todos os observadores são notificados corretamente.

