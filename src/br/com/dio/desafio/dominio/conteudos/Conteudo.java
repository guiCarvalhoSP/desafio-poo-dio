package br.com.dio.desafio.dominio.conteudos;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private final String titulo;
    private final String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }


    public String getDescricao() {
        return descricao;
    }

}
