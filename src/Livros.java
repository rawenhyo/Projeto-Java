public class Livros {
    private String nomeLivro;
    private String genero;


    public Livros(String nomeLivro, String genero) {
        this.setNomeLivro(nomeLivro);
        this.setGenero(genero);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Livros: {" +
                "Livro='" + nomeLivro + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }


    }
