package com.hello.app.utils;

import org.joda.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;

/**
 * @Date: 2020/9/3 22:38
 * @Author: dlice
 */
@Converter(autoApply = true)
public class ConvertJoda implements AttributeConverter<LocalDateTime, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDateTime localDateTime) {
        return (localDateTime == null ? null : Date.valueOf(localDateTime.toString()));
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date date) {
        return (date == null ? null : new LocalDateTime(date));
    }
}
