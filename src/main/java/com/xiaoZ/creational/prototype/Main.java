package com.xiaoZ.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始文件内容");

        for (int i = 0; i < 10; i++) {
            Mail tmpMail = (Mail) mail.clone();
            tmpMail.setName("姓名"+i);
            tmpMail.setEmailAddress("姓名"+i+"@xiaoZ.com");
            tmpMail.setContent("内容"+i);
            MailUtil.sendMail(tmpMail);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
