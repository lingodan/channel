package com.lingodan.work.channel.mapper;

import com.lingodan.work.channel.model.ChannelInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ChannelInfoMapperTest {

    @Autowired
    private ChannelInfoMapper channelInfoMapper;

    @Test
    void getChannelInfoById() {
        ChannelInfo channelInfo = channelInfoMapper.getChannelInfo(1);
        System.out.println(channelInfo);
    }

}