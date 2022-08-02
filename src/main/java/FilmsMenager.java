public class FilmsMenager {
    private String[] films = new  String[0];
    private int limit;

    public  FilmsMenager(){
        this.limit = 10;
    }
    public FilmsMenager(int limit){
        this.limit = limit;
    }

    public  void addFilm(String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++){
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String[] findAll(){
        String[] tmp = new String[films.length];
        for (int i =0; i < tmp.length; i++){
            tmp[i] = films[films.length - 1 -i];
        }
        return tmp;
    }
    public String[] findLast(int limit){
        int resultLength ;
        if(limit < films.length){
            resultLength = limit;
        }else {
            resultLength = films.length;
        }
        String[] tmp = new String[limit];
        for (int i =0; i < tmp.length; i++){
            tmp[i] = films[films.length -1 -i];
        }
        return  tmp;
    }
}

