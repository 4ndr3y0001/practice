package Practice2;

public class VideoGame implements Comparable<VideoGame>{
    private String name;
    private double score;

    public VideoGame(){
        this("unnamed",0);
    }
    public VideoGame(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(VideoGame o) {
        if(this.score>o.score){
            return -1;
        }else if (this.score<o.score){
            return 1;
        }else {
            return 0;
        }
    }
}
