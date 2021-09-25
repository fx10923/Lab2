package vn.edu.proxy_pattern.youtube_services;

import java.util.HashMap;

import com.sun.media.jfxmedia.control.VideoDataBuffer;

public interface ThirdPartyYoutubeLib {
	HashMap<String, Video> popularVideos();
	
	Video getVideo(String videoId);
}
