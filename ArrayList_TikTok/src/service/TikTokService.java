package service;

import com.sun.tools.javac.Main;
import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.TikTok;

import java.util.List;

public class TikTokService {
    public void showTiktok() {
        Main main = new Main();
        List<Idol> idols =
        // Hiển thị thông tin TikTok
        TikTok tikTok = new TikTok(idols, songs);
        System.out.println("Thông tin:");
        System.out.println("-------- Idols --------");
        for (Idol i : tikTok.getIdols()) {
            System.out.println(i);
        }

        System.out.println("-------- Songs --------");
        for (Song s : tikTok.getSongs()) {
            System.out.println(s);
        }
    }
}
