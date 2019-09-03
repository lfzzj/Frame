# 音乐接口
    1.百度music web版全接口
        http://tingapi.ting.baidu.com/v1/restserver/ting
        参数：
            format:  json|xml
            method:
                1) 获取列表：
                    baidu.ting.billboard.billList  {type:1,size:10, offset:0}
                     type:
                        1、新歌榜、11、摇滚榜，12、爵士，16、流行
                        2、热歌榜、21、欧美金曲榜，22、经典老歌榜，23、情歌对唱榜，24、影视金曲榜，25、网络歌曲榜
                     size: 10 //返回条目数量
                     offset: 0 //获取偏移

                2) 搜索:
                    baidu.ting.search.catalogSug  { query: keyword }
                        query: '' //搜索关键字

                3)播放:
                     baidu.ting.song.play  {songid: id}
                     baidu.ting.song.playAAC  {songid: id}
                4)LRC歌词:
                     baidu.ting.song.lry  {songid: id}
                5)推荐列表:
                     baidu.ting.song.getRecommandSongList  {song_id: id, num: 5 }
                         num: //返回条目数量
                6)下载:
                    baidu.ting.song.downWeb  {songid: id, bit:"24, 64, 128, 192, 256, 320, flac", _t: (new Date())}
                         songid: //歌曲id
                         bit: //码率
                         _t: //时间戳
                7)获取歌手信息
                    baidu.ting.artist.getInfo  { tinguid: id }
                        tinguid: //歌手ting id
                8)获取歌手歌曲列表
                    baidu.ting.artist.getSongList  { tinguid: id, limits:6, use_cluster:1, order:2}
                        tinguid: //歌手ting id
                        limits: //返回条目数量



