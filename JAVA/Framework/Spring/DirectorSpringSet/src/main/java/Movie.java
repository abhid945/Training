import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class Movie {
    private  String movieName;
    private List<String> cast;
    private int year;

    public Movie() {
    }

    public Movie(String movieName, List<String> cast, int year) {
        this.movieName = movieName;
        this.cast = cast;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public List<String> getCast() {
        return cast;
    }
    @Resource
    @Autowired
    public void setCast(List<String> cast) {
        this.cast = cast;
    }


    public Movie(List<String> cast) {
        this.cast = cast;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  movieName + '\'' +
                ", cast=" + cast +
                ", year=" + year;
    }
}

