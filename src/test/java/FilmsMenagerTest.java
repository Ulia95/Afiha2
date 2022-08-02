import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsMenagerTest {

    @Test
    public void test() {
        FilmsMenager menager = new FilmsMenager(10);
        menager.addFilm("film1");
        menager.addFilm("film2");
        menager.addFilm("film3");
        menager.addFilm("film4");
        menager.addFilm("film5");
        menager.addFilm("film6");
        menager.addFilm("film7");
        menager.addFilm("film8");
        menager.addFilm("film9");
        menager.addFilm("film10");

        String[] actual = menager.findLast(5);
        String[] expected = {"film10", "film9", "film8", "film7", "film6" };

        Assertions.assertEquals(expected, actual);


    }

}

