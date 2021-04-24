package com.lingodan.work.channel.mapper;


import com.lingodan.work.channel.model.ChannelInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ChannelInfoMapper {

    @Select("Select * FROM channel_info WHERE id = #{id}")
    @Results({
            @Result(property = "merchantCode", column = "merchant_code")
    })
    ChannelInfo getChannelInfo(@Param("id") Integer id);

}
