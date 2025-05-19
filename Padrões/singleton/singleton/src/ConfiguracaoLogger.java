public class ConfiguracaoLogger {
    private static ConfiguracaoLogger instancia = null;
    private String caminhoArquivoLog;
    private boolean estaAtivado;

    private ConfiguracaoLogger() {
        caminhoArquivoLog = "logs/log.txt";
        estaAtivado = true;
    }

    public static ConfiguracaoLogger getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoLogger();
        }
        return instancia;
    }

    public String getCaminhoArquivoLog() {
        return caminhoArquivoLog;
    }

    public void setCaminhoArquivoLog(String caminhoArquivoLog) {
        this.caminhoArquivoLog = caminhoArquivoLog;
    }

    public boolean estaAtivado() {
        return estaAtivado;
    }

    public void setEstaAtivado(boolean estaAtivado) {
        this.estaAtivado = estaAtivado;
    }
}