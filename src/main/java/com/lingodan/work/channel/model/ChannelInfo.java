package com.lingodan.work.channel.model;

import lombok.Data;

@Data
public class ChannelInfo {

    // 主键ID
    private Integer id;

    // 渠道名称
    private String name;

    // 渠道编码
    private String merchantCode;
}
