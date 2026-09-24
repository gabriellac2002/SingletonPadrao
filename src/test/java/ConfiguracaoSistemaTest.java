import org.junit.jupiter.api.Test;
import singleotn.ConfiguracaoSistema;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracaoSistemaTest {
    @Test
    void deveRetornarNomeAplicacao() {
        ConfiguracaoSistema.getInstance().setNomeAplicacao("Sistema Financeiro");
        assertEquals("Sistema Financeiro", ConfiguracaoSistema.getInstance().getNomeAplicacao());
    }

    @Test
    void deveRetornarVersaoSistema() {
        ConfiguracaoSistema.getInstance().setVersaoSistema("1.0.0");
        assertEquals("1.0.0", ConfiguracaoSistema.getInstance().getVersaoSistema());
    }
}
