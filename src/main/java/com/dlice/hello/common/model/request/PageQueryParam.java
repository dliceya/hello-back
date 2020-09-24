package com.dlice.hello.common.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PageQueryParam extends Request{

    private Integer pageSize;

    private Integer pageNum;
}
