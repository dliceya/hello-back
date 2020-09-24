//package com.dlice.hello.utils;
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//import java.util.Date;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//
///**
// * @Date: 2020/9/3 22:38
// * @Author: dlice
// */
//@Converter(autoApply = true)
//public class ConvertJoda implements AttributeConverter<LocalDateTime, Date> {
//
//    @Override
//    public Date convertToDatabaseColumn(LocalDateTime localDateTime) {
//        return (localDateTime == null ? null : Date.from( localDateTime.atZone( ZoneId.systemDefault()).toInstant()));
//    }
//
//    @Override
//    public LocalDateTime convertToEntityAttribute(Date date) {
//        return (date == null ? null : LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
//    }
//}
