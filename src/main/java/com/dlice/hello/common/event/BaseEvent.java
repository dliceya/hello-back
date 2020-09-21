package com.dlice.hello.common.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Date: 2020/9/2 23:46
 * @Author: dlice
 */
public class BaseEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public BaseEvent(Object source) {
        super(source);
    }
}
