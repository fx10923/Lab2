package vn.edu.proxy_pattern.proxy;

import java.util.HashMap;

import vn.edu.proxy_pattern.youtube_services.ThirdPartyYoutubeClass;
import vn.edu.proxy_pattern.youtube_services.ThirdPartyYoutubeLib;
import vn.edu.proxy_pattern.youtube_services.Video;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
	
	private ThirdPartyYoutubeLib youtubeService;
	private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
	private HashMap<String, Video> cacheAll = new HashMap<String, Video>();
	
	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYoutubeClass();
	}
	
	@Override
	public HashMap<String, Video> popularVideos() {
		if (cachePopular.isEmpty()) {
			cachePopular = youtubeService.popularVideos();
		} else {
			System.out.println("Retrived list from cache.");
		}
		return cachePopular;
	}

	@Override
	public Video getVideo(String videoId) {
		Video video = cacheAll.get(videoId);
		if (video == null) {
			video = youtubeService.getVideo(videoId);
			cacheAll.put(videoId, video);
		} else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
		return video;
	}
	
	public void reset() {
		cacheAll.clear();
		cachePopular.clear();
	}
}
