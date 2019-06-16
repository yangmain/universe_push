package com.comsince.github.model;

import java.io.Serializable;
import java.util.Arrays;

public class MessageConentResponse implements Serializable {
    private int type;
    private String searchableContent;
    private String pushContent;
    private String content;
    private byte[] binaryContent;
    private String localContent;
    private int mediaType;
    private String remoteMediaUrl;
    private String localMediaPath;
    private int mentionedType;
    private String[] mentionedTargets;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSearchableContent() {
        return searchableContent;
    }

    public void setSearchableContent(String searchableContent) {
        this.searchableContent = searchableContent;
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getBinaryContent() {
        return binaryContent;
    }

    public void setBinaryContent(byte[] binaryContent) {
        this.binaryContent = binaryContent;
    }

    public String getLocalContent() {
        return localContent;
    }

    public void setLocalContent(String localContent) {
        this.localContent = localContent;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public String getRemoteMediaUrl() {
        return remoteMediaUrl;
    }

    public void setRemoteMediaUrl(String remoteMediaUrl) {
        this.remoteMediaUrl = remoteMediaUrl;
    }

    public String getLocalMediaPath() {
        return localMediaPath;
    }

    public void setLocalMediaPath(String localMediaPath) {
        this.localMediaPath = localMediaPath;
    }

    public int getMentionedType() {
        return mentionedType;
    }

    public void setMentionedType(int mentionedType) {
        this.mentionedType = mentionedType;
    }

    public String[] getMentionedTargets() {
        return mentionedTargets;
    }

    public void setMentionedTargets(String[] mentionedTargets) {
        this.mentionedTargets = mentionedTargets;
    }

    @Override
    public String toString() {
        return "MessageConentResponse{" +
                "type=" + type +
                ", searchableContent='" + searchableContent + '\'' +
                ", pushContent='" + pushContent + '\'' +
                ", content='" + content + '\'' +
                ", binaryContent=" + Arrays.toString(binaryContent) +
                ", localContent='" + localContent + '\'' +
                ", mediaType=" + mediaType +
                ", remoteMediaUrl='" + remoteMediaUrl + '\'' +
                ", localMediaPath='" + localMediaPath + '\'' +
                ", mentionedType=" + mentionedType +
                ", mentionedTargets=" + Arrays.toString(mentionedTargets) +
                '}';
    }
}
