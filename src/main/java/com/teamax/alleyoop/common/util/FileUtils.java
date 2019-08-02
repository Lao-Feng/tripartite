package com.teamax.alleyoop.common.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class FileUtils {
    /***
     * 保存文件
     * @param file
     * @return
     */
    public static File saveFile(MultipartFile file, String path) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                File filepath = new File(path);
                if (!filepath.exists())
                    filepath.mkdirs();
                // 文件保存路径
                String savePath = path + System.currentTimeMillis() + file.getOriginalFilename();//加上当前时间戳
                // 转存文件
                file.transferTo(new File(savePath));
                return new File(savePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
