package com.vinurl.exe;

import org.apache.commons.lang3.SystemUtils;
import static com.vinurl.util.Constants.*;

public class FFmpeg extends Executable {
	private FFmpeg() {
		super("ffmpeg" + (SystemUtils.IS_OS_WINDOWS ? ".exe" : ""),
				VINURLPATH.resolve("ffmpeg").toFile(),
				String.format("ffmpeg-%s-x64.zip", (SystemUtils.IS_OS_LINUX ? "linux" : SystemUtils.IS_OS_MAC ? "osx" : "windows")),
				"Tyrrrz/FFmpegBin");
	}

	public static FFmpeg getInstance() {
		return FFmpegHolder.instance;
	}

	private static final class FFmpegHolder {
		private static final FFmpeg instance = new FFmpeg();
	}
}