public class Movie
{
    private String title;
    private int id;
    private String posterPath;
    private String language;
    private double voteAverage;
    private String releaseDate;

    public Movie(String title, int id, String posterPath, String language, double voteAverage, String releaseDate)
    {
        this.title = title;
        this.id = id;
        this.posterPath = posterPath;
        this.language = language;
        this.voteAverage = voteAverage;
        this.releaseDate = releaseDate;
    }

    public String getTitle()
    {
        return title;
    }

    public int getID()
    {
        return id;
    }

    public String getPosterPath()
    {
        return posterPath;
    }

    public String getLanguage()
    {
        return language;
    }

    public double getVoteAverage()
    {
        return voteAverage;
    }

    public String getReleaseDate()
    {
        return releaseDate;
    }
}
