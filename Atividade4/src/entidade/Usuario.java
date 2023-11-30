package entidade;

import java.util.Date;

import util.RedeSocial;

public class Usuario {
    protected String nome;
    protected String id;
    protected Date data;
    private Usuario[] amigos;
    private Publicacao[] publicacaos;
    public static int qtdUsuarios;
}
