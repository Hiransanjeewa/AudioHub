package com.AudioHub.Play_List_Service;


public class PlaylistDto  {

    public int playlist_no;
    public String username;
    public String playlist_name;
    public int[] songslist;

    public PlaylistDto() {
    }


    public int getPlaylist_no() {
        return playlist_no;
    }

    public String getUsername() {
        return username;
    }

    public String getPlaylist_name() {
        return playlist_name;
    }

    public int[] getSongslist() {
        return songslist;
    }

    public void setPlaylist_no(int playlist_no) {
        this.playlist_no = playlist_no;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPlaylist_name(String playlist_name) {
        this.playlist_name = playlist_name;
    }

    public void setSongslist(int[] songslist) {
        this.songslist = songslist;
    }
}
