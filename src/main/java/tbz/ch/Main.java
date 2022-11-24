package tbz.ch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(new Book("BookName", "2022", 19.99, 1345));
        mediaList.add(new CD("SongName", "2022", 19.99, "The Band"));
        mediaList.add(new DVD("FilmName", "2022", 19.99, 60));
        System.out.println(mediaList.get(0).Title);
        System.out.println(mediaList.get(1).Title);
        System.out.println(mediaList.get(2).Title);


    }


}