package model;

public class Exercise {

    private int image;
    private String name;
    private String Type;
    private int seconds;

    public Exercise(int image, String name, String type, int seconds) {
        this.image = image;
        this.name = name;
        Type = type;
        this.seconds = seconds;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
