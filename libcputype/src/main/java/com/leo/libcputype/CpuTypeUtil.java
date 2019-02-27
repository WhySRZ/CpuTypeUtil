package com.leo.libcputype;

import android.text.TextUtils;
import java.io.File;

public final class CpuTypeUtil {
    private CpuTypeUtil() {
    }

    /**
     * 获取 cpu 指令集
     * 根据最新 ndk 编译生成的全平台 so 文件有四种
     * armeabi_v7a、arm64_v8a、x86、x86_64
     *
     * @return cpu 指令集类型
     */
    @CpuType
    public static String getCpuType() {
        String cpuAbi = android.os.Build.CPU_ABI;
        if (TextUtils.equals(cpuAbi, "armeabi-v7a")
                || TextUtils.equals(cpuAbi, "armeabi")) {
            return CpuType.ARMEABI_V7A;
        }
        if (TextUtils.equals(cpuAbi, "x86")) {
            return CpuType.X86;
        }
        if (TextUtils.equals(cpuAbi, "x86-64")) {
            return CpuType.X86_64;
        }
        if (TextUtils.equals(cpuAbi, "arm64-v8a")) {
            return CpuType.ARM64_V8A;
        }
        return CpuType.ARMEABI_V7A;
    }
    
     /**
     * 判断 so 文件是否存在
     *
     * @return fileName so 文件名（包括.so 扩展名）
     */
    public stastic boolean isSoFileExists(@NonNull String fileName){
        File dir = context.getDir("libs", Context.MODE_PRIVATE);
        File soFile = new File(dir, fileName);
        return soFile.exists() && soFile.isFile() && soFile.length() > 0;
    }
}
