package entities;

import entities.Idol;
import entities.Song;

import java.util.ArrayList;
import java.util.List;

public class TikTok {
    private List<Idol> idols;
    private List<Song> songs;

    public TikTok(List<Idol> idols, List<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public List<Idol> getIdols() {
        return idols;
    }

    public void setIdols(List<Idol> idols) {
        this.idols = idols;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
