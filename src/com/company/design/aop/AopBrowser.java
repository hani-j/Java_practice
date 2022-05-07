package com.company.design.aop;

import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;

public class AopBrowser implements IBrowser {
// aop : 전후가 있음, 관점지향
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;
    // ctrl + 클릭

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {

        before.run();
        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser htlm loading from : " +url);

            try {
                Thread.sleep(1500); // 1.5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        after.run();
        System.out.println("AopBrowser html cache : " + url);
        return html;
    }
}
