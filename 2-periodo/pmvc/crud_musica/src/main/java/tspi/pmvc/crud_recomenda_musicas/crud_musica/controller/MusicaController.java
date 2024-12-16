package tspi.pmvc.crud_recomenda_musicas.crud_musica.controller;

public class MusicaController {
    
    private final MusicaController repository;

    public static final String ATRIBUTO_OBJETO = "musica";

    public MusicaController(MusicaController repository) {
        this.repository = repository;
    }

    

}
