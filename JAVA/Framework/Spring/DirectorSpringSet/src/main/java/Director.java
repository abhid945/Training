import javax.annotation.Resource;
import java.util.Set;

public class Director<T> {

    private String directorName;
    private int experience;
    private Set<Movie> movieName;

    public Director() {
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Director(int experience, Set<Movie> movieName) {
        this.experience = experience;
        this.movieName = movieName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Resource
    public Set<Movie> getMovieName() {
        return movieName;
    }

    public void setMovieName(Set<Movie> movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Director----->" + directorName + '\'' +
                " experience=" + experience +
                ", movie " + movieName ;
    }


    void display(){
        System.out.println("****************Director*************");
        System.out.println(getDirectorName());
        System.out.println("Experience :- " + getExperience());
        System.out.println("************************Movies of " + getDirectorName()+"************" );
        for(Movie o :movieName){

            System.out.println("Movie Name :-"+o.getMovieName());
            System.out.println("Cast :-"+o.getCast().toString().replaceAll("\\]","").replaceAll("\\[",""));
            System.out.println("Release year :-"+o.getYear());
        }
    }
}


