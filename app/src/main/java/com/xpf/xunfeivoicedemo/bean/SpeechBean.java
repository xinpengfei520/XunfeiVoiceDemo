package com.xpf.xunfeivoicedemo.bean;

import java.util.List;

/**
 * Created by x-sir on 2019.01.12 :)
 * Function:SpeechBean
 */
public class SpeechBean {

    public String bg;
    public String ed;
    public String ls;
    public String sn;
    public List<WS> ws;

    public class WS {
        public String bg;
        public List<CW> cw;
    }

    public class CW {
        public String sc;
        public String w;
    }
}
