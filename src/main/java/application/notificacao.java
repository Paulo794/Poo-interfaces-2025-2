package application;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public  abstract class notificacao {

    private LocalDateTime dataEnvio;
    private String remetente;

    public notificacao(String remetente) {
        this.remetente = remetente;
        this.dataEnvio = LocalDateTime.now();
    }

    public void exibirInformacoesRemetente() {
        System.out.println(
            "--notificacao de " + this.remetente + "em" + this.dataEnvio);
    }

    public abstract void enviar();
    public abstract void registrarLog();

    
}
