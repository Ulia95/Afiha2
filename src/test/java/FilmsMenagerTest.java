import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsMenagerTest {

    @Test
    public void testFindAll() {
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

        String[] actual = menager.findLast(10);
        String[] expected = {"film10", "film9", "film8", "film7", "film6","film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
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

        String[] actual = menager.findLast(6);
        String[] expected = {"film10", "film9", "film8", "film7", "film6","film5"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        FilmsMenager menager = new FilmsMenager(12);
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
        menager.addFilm("film11");
        menager.addFilm("film12");


        String[] actual = menager.findLast(10);
        String[] expected = {"film12", "film11", "film10", "film9", "film8","film7", "film6", "film5","film4", "film3"};
        Assertions.assertArrayEquals(expected, actual);
    }




    }



