import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.TikTok;
import service.SongService;
import service.TikTokService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Idol> idols = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Follower> followers = new ArrayList<>();
    public static void main(String[] args) {
        addIdol();
        addSong();
        showTiktok();

        SongService songService = new SongService();

    }

    public static void showTiktok() {
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

    public static void addIdol() {

        System.out.print("Số lượng idol: ");
        int n = new Scanner(System.in).nextInt();
        for(int i =0;i< n ;i++) {
            // Nhập thông tin Idol
            System.out.println("Nhập thông tin idol thứ " + (i+1) + " :" );
            System.out.println("Nhập id idol: ");
            int id = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("Nhập tên idol: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Nhập email idol: ");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Nhập tên group của idol: ");
            String group = new Scanner(System.in).nextLine();

            System.out.println("Idol có bao nhiêu follower: ");
            int m= new Scanner(System.in).nextInt();
            for(int j =0;j<m;j++) {
                addFollower();
            }

            Idol idol = new Idol(name, id, email, followers , group);
            idols.add(idol);
        }
    }

    public static void addFollower() {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin Follower
        System.out.println("Nhập thông tin follower: ");
        System.out.print("Id follower: ");
        int followerId = Integer.parseInt(sc.nextLine());
        System.out.print("NHập tên follower: ");
        String followerName = sc.nextLine();
        System.out.print("Email follower: ");
        String followerEmail = sc.nextLine();
        System.out.print("số lượng thích: ");
        int numberOfLikes = Integer.parseInt(sc.nextLine());

        Follower follower = new Follower(followerName, followerId, followerEmail, numberOfLikes);
        followers.add(follower);
    }

    public static void addSong() {
        System.out.print("Số bài hát: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++) {
            // Nhập thông tin Song
            System.out.println("Nhập thông tin bài hát số " + (i+1) + " :");
            System.out.println("NHập id bài hát:");
            System.out.print("Id: ");
            int songId = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Name: ");
            String songName = new Scanner(System.in).nextLine();
            System.out.print("Singer: ");
            String singer = new Scanner(System.in).nextLine();

            Song song = new Song(songId, songName, singer);
            songs.add(song);
        }
    }
}