package singleotn;

public class ConfiguracaoSistema {

    private ConfiguracaoSistema() {}

    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();

    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    private String nomeAplicacao;
    private String versaoSistema;

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public void setVersaoSistema(String versaoSistema) {
        this.versaoSistema = versaoSistema;
    }
}
