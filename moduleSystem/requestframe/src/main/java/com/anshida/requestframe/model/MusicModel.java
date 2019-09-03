package com.anshida.requestframe.model;

import java.io.Serializable;
import java.util.List;

public class MusicModel implements Serializable{

    /**
     * song_list : [{"artist_id":"610199199","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-29","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/1b0a1bf4156e87089c0127964341cdeb/662414982/662414982.lrc","copy_type":"1","hot":"75027","all_artist_ting_uid":"340497722","resource_type":"0","is_new":"1","rank_change":"0","rank":"1","all_artist_id":"610199199","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,224,128,320,flac","file_duration":262,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"lossless,vip,perm-1","info":"","has_filmtv":"0","si_proxycompany":"杭州回声文化艺术策划有限公司","res_encryption_flag":"0","song_id":"614044521","title":"心如止水（正式版）","ting_uid":"340497722","author":"潘悦晨","album_id":"614044518","album_title":"心如止水（正式版）","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"2","mv_provider":"0000000000","artist_name":"潘悦晨","pic_radio":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg"},{"artist_id":"762","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-05-06","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/91273f9747f2cc51b3578bc3d1da4298/614133876/614133876.lrc","copy_type":"1","hot":"38973","all_artist_ting_uid":"1376,92457272","resource_type":"0","is_new":"1","rank_change":"0","rank":"2","all_artist_id":"762,65659668","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,224,128,320,flac","file_duration":261,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-3","info":"","has_filmtv":"0","si_proxycompany":"北京普天同乐文化传媒有限公司","res_encryption_flag":"0","song_id":"614133806","title":"勇士的荣耀","ting_uid":"1376","author":"龙梅子,郭晨冬","album_id":"614133803","album_title":"勇士的荣耀","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"龙梅子,郭晨冬","pic_radio":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/e3b6310ecbe403eec3e25a497af16d3d/614133837/614133837.jpg"},{"artist_id":"540890021","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-05-27","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/c2600f05a1abd15a45174683e18e991c/622226821/622226821.lrc","copy_type":"1","hot":"23068","all_artist_ting_uid":"340190802,232702439","resource_type":"0","is_new":"1","rank_change":"0","rank":"3","all_artist_id":"540890021,23557256","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":167,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-1","info":"","has_filmtv":"0","si_proxycompany":"北京市百艺星图文化传播有限公司","res_encryption_flag":"0","song_id":"622196102","title":"你笑起来真好看 合唱版","ting_uid":"340190802","author":"李昕融,中央少年广播合唱团","album_id":"622196095","album_title":"你笑起来真好看 合唱版","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"李昕融,中央少年广播合唱团","pic_radio":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/a980bba76a4548fe658be5921ee15e47/624275663/624275663.jpg@s_2,w_1000,h_1000"},{"artist_id":"614497804","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-05-20","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/9572788eaf2633ef6c114411c615d66d/614499542/614499542.lrc","copy_type":"1","hot":"18484","all_artist_ting_uid":"340508951","resource_type":"0","is_new":"1","rank_change":"0","rank":"4","all_artist_id":"614497804","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":207,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"first,lossless,vip,perm-1","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-海蝶音乐","res_encryption_flag":"0","song_id":"614497807","title":"战场","ting_uid":"340508951","author":"沙漠五子D5","album_id":"614497805","album_title":"战场","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"2","mv_provider":"0000000000","artist_name":"沙漠五子D5","pic_radio":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/46fc0a5ddd9758b1a620ab8b4363c18d/614499546/614499546.jpg@s_2,w_1000,h_1000"},{"artist_id":"1666","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-23","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/35937af448b88f97a583d4376839a75a/613912180/613912180.lrc","copy_type":"1","hot":"22862","all_artist_ting_uid":"1585","resource_type":"0","is_new":"1","rank_change":"0","rank":"5","all_artist_id":"1666","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":249,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-1","info":"","has_filmtv":"0","si_proxycompany":"独立音乐人","res_encryption_flag":"0","song_id":"613911776","title":"漂流瓶","ting_uid":"1585","author":"黄英","album_id":"613911772","album_title":"漂流瓶","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"黄英","pic_radio":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/3dc7ee67dded87f28c911f91efc2d01d/614204455/614204455.jpg"},{"artist_id":"12381018","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-04","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/262174e801a3fb7a16a578ae4ba73abe/613451049/613451049.lrc","copy_type":"1","hot":"40718","all_artist_ting_uid":"1224778","resource_type":"0","is_new":"1","rank_change":"0","rank":"6","all_artist_id":"12381018","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":184,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"first,lossless,vip,perm-1","info":"","has_filmtv":"0","si_proxycompany":"北京大格娱乐文化有限公司","res_encryption_flag":"0","song_id":"613440970","title":"为悦己者容（弦乐版）（电视剧《面具背后》片尾曲）","ting_uid":"1224778","author":"崔子格","album_id":"613440967","album_title":"为悦己者容（弦乐版）（电视剧《面具背后》片尾曲）","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"2","mv_provider":"0000000000","artist_name":"崔子格","pic_radio":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/fe8308782dbb1c4daadd3e5716763ecf/613451063/613451063.jpg@s_2,w_1000,h_1000"},{"artist_id":"762","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-12","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/59cc9cba2bc5429410feaf81d12d02dd/613668342/613668342.lrc","copy_type":"1","hot":"29565","all_artist_ting_uid":"1376","resource_type":"0","is_new":"1","rank_change":"-4","rank":"7","all_artist_id":"762","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":274,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-1","info":"","has_filmtv":"0","si_proxycompany":"北京普天同乐文化传媒有限公司","res_encryption_flag":"0","song_id":"613648854","title":"蝶恋花·愿为花更美（电影《月亮河之恋》片尾曲）","ting_uid":"1376","author":"龙梅子","album_id":"613648851","album_title":"蝶恋花·愿为花更美（电影《月亮河之恋》片尾曲）","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"龙梅子","pic_radio":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg","album_500_500":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/50d95588aa0ecf5e9c0b944148ef6727/613668338/613668338.jpg"},{"artist_id":"1665","language":"yue","pic_big":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-30","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/253ef94f27a8a5d8b856cbd4348a94dc/614045514/614045514.lrc","copy_type":"1","hot":"15564","all_artist_ting_uid":"2611","resource_type":"0","is_new":"1","rank_change":"-1","rank":"8","all_artist_id":"1665","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,224,128,320,flac","file_duration":280,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"first,lossless,vip,perm-1","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-海蝶音乐","res_encryption_flag":"0","song_id":"614045208","title":"不了了知","ting_uid":"2611","author":"刘惜君","album_id":"614045206","album_title":"不了了知","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"2","mv_provider":"0000000000","artist_name":"刘惜君","pic_radio":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/3047da9499ee8efbc6ad9812e53e0bff/614046069/614046069.jpg@s_2,w_1000,h_1000"},{"artist_id":"23364747","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-19","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/30395be3370e24cc6556a7671d6fbd7f/613876390/613876390.lrc","copy_type":"1","hot":"16892","all_artist_ting_uid":"140416568,340447933","resource_type":"0","is_new":"1","rank_change":"-1","rank":"9","all_artist_id":"23364747,603520274","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,128,224,320,flac","file_duration":261,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-1","info":"","has_filmtv":"0","si_proxycompany":"奔跑怪物（北京）文化娱乐有限公司","res_encryption_flag":"0","song_id":"613870976","title":"友情岁月（兄弟版）（电影《转型团伙》宣传推广曲）","ting_uid":"140416568","author":"吴镇宇,摩登兄弟刘宇宁","album_id":"613870973","album_title":"友情岁月（兄弟版）","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"吴镇宇,摩登兄弟刘宇宁","pic_radio":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/2991dabbde313172ba69f296abd1b6f0/613872506/613872506.jpg@s_2,w_1000,h_1000"},{"artist_id":"613961417","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_90,h_90","country":"内地","area":"0","publishtime":"2019-04-25","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/709e4be30410db4d80c3aba7531b6e0a/613961459/613961459.lrc","copy_type":"1","hot":"11164","all_artist_ting_uid":"340507999","resource_type":"0","is_new":"1","rank_change":"0","rank":"10","all_artist_id":"613961417","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"96,224,128,320,flac","file_duration":338,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless,perm-1","info":"","has_filmtv":"0","si_proxycompany":"独立音乐人","res_encryption_flag":"0","song_id":"613961421","title":"别来无恙","ting_uid":"340507999","author":"温妮","album_id":"613961418","album_title":"别来无恙","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"温妮","pic_radio":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/fa2cfdd5abd591e569db8fa03e2e9c8b/613961440/613961440.jpg@s_2,w_1000,h_1000"}]
     * billboard : {"billboard_type":"1","billboard_no":"2962","update_date":"2019-06-21","billboard_songnum":"14","havemore":1,"name":"新歌榜","comment":"该榜单是根据千千音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次","pic_s192":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_9a4fbbbfa50203aaa9e69bf189c6a45b.jpg","pic_s640":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_a4aa99cf8bf218304de9786b6ba38982.jpg","pic_s444":"http://hiphotos.qianqian.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg","pic_s260":"http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg","pic_s210":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_dea655f4be544132fb0b5899f063d82e.jpg","web_url":"http://music.baidu.com/top/new","color":"0x5B9400","bg_color":"0xEFF5E6","bg_pic":"http://business0.qianqian.com/qianqian/file/5bfe504b1c299_491.png"}
     * error_code : 22000
     */

    private BillboardBean billboard;
    private int error_code;
    private List<SongListBean> song_list;

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<SongListBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongListBean> song_list) {
        this.song_list = song_list;
    }

    public static class BillboardBean implements Serializable{
        /**
         * billboard_type : 1
         * billboard_no : 2962
         * update_date : 2019-06-21
         * billboard_songnum : 14
         * havemore : 1
         * name : 新歌榜
         * comment : 该榜单是根据千千音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次
         * pic_s192 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_9a4fbbbfa50203aaa9e69bf189c6a45b.jpg
         * pic_s640 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_a4aa99cf8bf218304de9786b6ba38982.jpg
         * pic_s444 : http://hiphotos.qianqian.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg
         * pic_s260 : http://hiphotos.qianqian.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg
         * pic_s210 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_dea655f4be544132fb0b5899f063d82e.jpg
         * web_url : http://music.baidu.com/top/new
         * color : 0x5B9400
         * bg_color : 0xEFF5E6
         * bg_pic : http://business0.qianqian.com/qianqian/file/5bfe504b1c299_491.png
         */

        private String billboard_type;
        private String billboard_no;
        private String update_date;
        private String billboard_songnum;
        private int havemore;
        private String name;
        private String comment;
        private String pic_s192;
        private String pic_s640;
        private String pic_s444;
        private String pic_s260;
        private String pic_s210;
        private String web_url;
        private String color;
        private String bg_color;
        private String bg_pic;

        public String getBillboard_type() {
            return billboard_type;
        }

        public void setBillboard_type(String billboard_type) {
            this.billboard_type = billboard_type;
        }

        public String getBillboard_no() {
            return billboard_no;
        }

        public void setBillboard_no(String billboard_no) {
            this.billboard_no = billboard_no;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        public String getBillboard_songnum() {
            return billboard_songnum;
        }

        public void setBillboard_songnum(String billboard_songnum) {
            this.billboard_songnum = billboard_songnum;
        }

        public int getHavemore() {
            return havemore;
        }

        public void setHavemore(int havemore) {
            this.havemore = havemore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public void setPic_s192(String pic_s192) {
            this.pic_s192 = pic_s192;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public void setPic_s640(String pic_s640) {
            this.pic_s640 = pic_s640;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public void setPic_s444(String pic_s444) {
            this.pic_s444 = pic_s444;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public void setPic_s260(String pic_s260) {
            this.pic_s260 = pic_s260;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public void setPic_s210(String pic_s210) {
            this.pic_s210 = pic_s210;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBg_color() {
            return bg_color;
        }

        public void setBg_color(String bg_color) {
            this.bg_color = bg_color;
        }

        public String getBg_pic() {
            return bg_pic;
        }

        public void setBg_pic(String bg_pic) {
            this.bg_pic = bg_pic;
        }
    }

    public static class SongListBean implements Serializable {
        /**
         * artist_id : 610199199
         * language : 国语
         * pic_big : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_150,h_150
         * pic_small : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_90,h_90
         * country : 内地
         * area : 0
         * publishtime : 2019-04-29
         * album_no : 1
         * lrclink : http://qukufile2.qianqian.com/data2/lrc/1b0a1bf4156e87089c0127964341cdeb/662414982/662414982.lrc
         * copy_type : 1
         * hot : 75027
         * all_artist_ting_uid : 340497722
         * resource_type : 0
         * is_new : 1
         * rank_change : 0
         * rank : 1
         * all_artist_id : 610199199
         * style :
         * del_status : 0
         * relate_status : 0
         * toneid : 0
         * all_rate : 96,224,128,320,flac
         * file_duration : 262
         * has_mv_mobile : 0
         * versions :
         * bitrate_fee : {"0":"129|-1","1":"-1|-1"}
         * biaoshi : lossless,vip,perm-1
         * info :
         * has_filmtv : 0
         * si_proxycompany : 杭州回声文化艺术策划有限公司
         * res_encryption_flag : 0
         * song_id : 614044521
         * title : 心如止水（正式版）
         * ting_uid : 340497722
         * author : 潘悦晨
         * album_id : 614044518
         * album_title : 心如止水（正式版）
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * has_mv : 0
         * learn : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 2
         * mv_provider : 0000000000
         * artist_name : 潘悦晨
         * pic_radio : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_300,h_300
         * pic_s500 : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500
         * pic_premium : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500
         * pic_huge : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg
         * album_500_500 : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg@s_2,w_500,h_500
         * album_800_800 :
         * album_1000_1000 : http://qukufile2.qianqian.com/data2/pic/ae20ccd3d476cd478811f46c3aa462b1/614044535/614044535.jpg
         */

        private String artist_id;
        private String language;
        private String pic_big;
        private String pic_small;
        private String country;
        private String area;
        private String publishtime;
        private String album_no;
        private String lrclink;
        private String copy_type;
        private String hot;
        private String all_artist_ting_uid;
        private String resource_type;
        private String is_new;
        private String rank_change;
        private String rank;
        private String all_artist_id;
        private String style;
        private String del_status;
        private String relate_status;
        private String toneid;
        private String all_rate;
        private int file_duration;
        private int has_mv_mobile;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String info;
        private String has_filmtv;
        private String si_proxycompany;
        private String res_encryption_flag;
        private String song_id;
        private String title;
        private String ting_uid;
        private String author;
        private String album_id;
        private String album_title;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int has_mv;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String pic_radio;
        private String pic_s500;
        private String pic_premium;
        private String pic_huge;
        private String album_500_500;
        private String album_800_800;
        private String album_1000_1000;

        public String getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(String artist_id) {
            this.artist_id = artist_id;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getAlbum_no() {
            return album_no;
        }

        public void setAlbum_no(String album_no) {
            this.album_no = album_no;
        }

        public String getLrclink() {
            return lrclink;
        }

        public void setLrclink(String lrclink) {
            this.lrclink = lrclink;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }

        public void setAll_artist_ting_uid(String all_artist_ting_uid) {
            this.all_artist_ting_uid = all_artist_ting_uid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getRank_change() {
            return rank_change;
        }

        public void setRank_change(String rank_change) {
            this.rank_change = rank_change;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getHas_filmtv() {
            return has_filmtv;
        }

        public void setHas_filmtv(String has_filmtv) {
            this.has_filmtv = has_filmtv;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getRes_encryption_flag() {
            return res_encryption_flag;
        }

        public void setRes_encryption_flag(String res_encryption_flag) {
            this.res_encryption_flag = res_encryption_flag;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s500() {
            return pic_s500;
        }

        public void setPic_s500(String pic_s500) {
            this.pic_s500 = pic_s500;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getAlbum_500_500() {
            return album_500_500;
        }

        public void setAlbum_500_500(String album_500_500) {
            this.album_500_500 = album_500_500;
        }

        public String getAlbum_800_800() {
            return album_800_800;
        }

        public void setAlbum_800_800(String album_800_800) {
            this.album_800_800 = album_800_800;
        }

        public String getAlbum_1000_1000() {
            return album_1000_1000;
        }

        public void setAlbum_1000_1000(String album_1000_1000) {
            this.album_1000_1000 = album_1000_1000;
        }
    }
}
