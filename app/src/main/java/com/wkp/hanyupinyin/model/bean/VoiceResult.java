package com.wkp.hanyupinyin.model.bean;

import java.util.List;

/**
 * Created by user on 2018/3/14.
 * 语音听写结果
 */

public class VoiceResult {

    /**
     * sn : 1
     * ls : false
     * bg : 0
     * ed : 0
     * ws : [{"bg":0,"cw":[{"sc":0,"w":"We"}]},{"bg":0,"cw":[{"sc":0,"w":" we"}]},{"bg":0,"cw":[{"sc":0,"w":" we"}]},{"bg":0,"cw":[{"sc":0,"w":" in"}]},{"bg":0,"cw":[{"sc":0,
     * "w":" now"}]}]
     */

    private int sn;
    private boolean ls;
    private int bg;
    private int ed;
    private List<WsBean> ws;

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public boolean isLs() {
        return ls;
    }

    public void setLs(boolean ls) {
        this.ls = ls;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public List<WsBean> getWs() {
        return ws;
    }

    public void setWs(List<WsBean> ws) {
        this.ws = ws;
    }

}
