package com.lushihao.qrcodebusiness.service.video.impl;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.video.VideoCut;
import com.lushihao.qrcodebusiness.entity.video.VideoInfo;
import com.lushihao.qrcodebusiness.service.video.VideoCutService;
import com.lushihao.qrcodebusiness.util.LSHFfmpegUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VideoCutServiceImpl implements VideoCutService {

    @Resource
    private LSHFfmpegUtil lshFfmpegUtil;

    @Override
    public Result addCut(VideoCut videoCut) {
        if (lshFfmpegUtil.checkFileType(videoCut.getPath()) != lshFfmpegUtil.VIDEO) {
            return new Result(false, null, null, "不支持此文件格式");
        }
        VideoInfo videoInfo = lshFfmpegUtil.getVideoInfo(videoCut.getPath());
        if (videoInfo == null) {
            return new Result(false, null, null, "读取文件信息失败");
        }
        videoCut.setNewPath(videoCut.getPath().substring(0, videoCut.getPath().lastIndexOf(".")) + "_cut.mp4");
        if (!lshFfmpegUtil.videoCut(videoCut)) {
            return new Result(false, null, null, "添加失败，请重启软件后再试");
        } else {
            return new Result(true, videoCut.getNewPath(), "截取成功", null);
        }
    }

}
