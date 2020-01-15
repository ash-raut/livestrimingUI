package com.example.livestrimingui;

public class livestreamListData {
    private int imgId;
    private String ArtistName;
    private String Artistaddress;
    private String ArtistDatetime;



    public livestreamListData(String ArtistName, String Artistaddress, String ArtistDatetime,int imgId) {
        this.ArtistName = ArtistName;
        this.Artistaddress = Artistaddress;
        this.ArtistDatetime = ArtistDatetime;
        this.imgId = imgId;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public String getArtistaddress() {
        return Artistaddress;
    }

    public void setArtistaddress(String artistaddress) {
        Artistaddress = artistaddress;
    }

    public String getArtistDatetime() {
        return ArtistDatetime;
    }

    public void setArtistDatetime(String artistDatetime) {
        ArtistDatetime = artistDatetime;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
