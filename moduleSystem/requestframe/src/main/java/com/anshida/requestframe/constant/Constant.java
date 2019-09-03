package com.anshida.requestframe.constant;

/**
 * @data on 2018/3/21 10:08
 * @describe:
 */

public class Constant {
    //根地址
    public static final String BASE_URL = "http://gank.io/";

    //获取干货
    public static final String GET_GANHUO = "api/data/{type}/{count}/{page}";


    /*------------------音乐接口-------------------*/
    public static final String BASE_MUSIC_URL = "http://tingapi.ting.baidu.com/";

    //歌曲列表
    public static final String METHOD_LIST = "baidu.ting.billboard.billList";
    //推荐列表
    public static final String RECOMMAND_LIST = "baidu.ting.song.getRecommandSongList";
    //搜索
    public static final String SEARCH_LIST = "baidu.ting.search.catalogSug";
    //获取歌手信息
    public static final String GET_ART_lIST = "baidu.ting.artist.getInfo";
    //获取歌手歌曲列表
    public static final String GET_SONG_LIST = "baidu.ting.artist.getSongList";
    //获取歌曲信息
    public static final String GET_SONG_INFO = "baidu.ting.song.play";




}
