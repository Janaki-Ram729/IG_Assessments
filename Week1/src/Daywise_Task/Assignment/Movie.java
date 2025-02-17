package Assignment;

class Movie implements Comparable<Movie> {
    private String name;
    private String language;
    private String releaseDate;
    private String director;
    private String producer;
    private double duration;

    public Movie(String name, String language, String releaseDate, String director, String producer, double duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    // Getters
    public String getName() { return name; }
    public String getLanguage() { return language; }
    public String getReleaseDate() { return releaseDate; }
    public String getDirector() { return director; }
    public String getProducer() { return producer; }
    public double getDuration() { return duration; }
    
    @Override
    public int compareTo(Movie other) {
        return this.language.compareToIgnoreCase(other.language);
    }


    @Override
    public String toString() {
        return String.format("Movie{name='%s', language='%s', releaseDate='%s', director='%s', producer='%s', duration=%.2f hrs}", 
                name, language, releaseDate, director, producer, duration);
    }
}
