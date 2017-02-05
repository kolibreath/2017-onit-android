package com.example.kolibreath.onit;

/**
 * Created by kolibreath on 2017/2/4.
 */

public class Userinfo {
    public String username;
    public int userAvatar;
    public String dongtaitime;
    public String content;
    public int favorNumber;
    public int commentsNumber;
    public String dongtaiDeadline;
    public int userOnitStatus;

    public Userinfo(String username,int userAvatar,String dongtaitime,String content,int commentsNumber,int favorNumber,String dongtaiDeadline,
                    int userOnitStatus){
        this.username = username;
        this.userAvatar = userAvatar;
        this.dongtaitime = dongtaitime;
        this.content = content;
        this.commentsNumber = commentsNumber;
        this.favorNumber = favorNumber;
        this.dongtaiDeadline = dongtaiDeadline;
        this.userOnitStatus = userOnitStatus;
    }
    public String getUsername(){
        return  username;
    }
    public int getUserAvatar(){
        return userAvatar;
    }
    public String getDongtaitime(){
        return dongtaitime;
    }
    public String getContent(){
        return content;
    }
    public int getCommentsNumber(){
        return commentsNumber;
    }
    public String getDongtaiDeadline(){
        return dongtaiDeadline;
    }
    public int getFavorNumber(){
        return favorNumber;
    }
    public int getUserOnitStatus(){return  userOnitStatus;}

}
