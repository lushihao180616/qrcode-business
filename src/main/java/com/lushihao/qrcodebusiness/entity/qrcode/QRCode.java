package com.lushihao.qrcodebusiness.entity.qrcode;

import com.lushihao.qrcodebusiness.entity.temple.QRCodeTemple;

/**
 * 二维码的使用类
 */
public class QRCode {

    /**
     * 二维码信息
     */
    private String message;
    /**
     * 二维码类型
     */
    private String type;
    /**
     * 二维码所属编号
     */
    private QRCodeTemple qrCodeTemple;
    /**
     * 商家
     */
    private String businessCode;
    /**
     * 管理员
     */
    private String managerCode;
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 背景图片
     */
    private String backGround;
    /**
     * 较短边长
     */
    private int shortLength;
    /**
     * x偏移量
     */
    private int x;
    /**
     * y偏移量
     */
    private int y;
    /**
     * 码透明度
     */
    private int alpha;
    /**
     * 旋转角度
     */
    private int angle;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QRCodeTemple getQrCodeTemple() {
        return qrCodeTemple;
    }

    public void setQrCodeTemple(QRCodeTemple qrCodeTemple) {
        this.qrCodeTemple = qrCodeTemple;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBackGround() {
        return backGround;
    }

    public void setBackGround(String backGround) {
        this.backGround = backGround;
    }

    public int getShortLength() {
        return shortLength;
    }

    public void setShortLength(int shortLength) {
        this.shortLength = shortLength;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public QRCode() {
    }

    public QRCode(String message, String type, QRCodeTemple qrCodeTemple, String businessCode, String managerCode, String fileName, String backGround, int shortLength, int x, int y, int alpha, int angle) {
        this.message = message;
        this.type = type;
        this.qrCodeTemple = qrCodeTemple;
        this.businessCode = businessCode;
        this.managerCode = managerCode;
        this.fileName = fileName;
        this.backGround = backGround;
        this.shortLength = shortLength;
        this.x = x;
        this.y = y;
        this.alpha = alpha;
        this.angle = angle;
    }

}
