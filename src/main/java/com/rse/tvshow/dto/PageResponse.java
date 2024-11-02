package com.rse.tvshow.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Collection;

@Getter
@Builder
public class PageResponse<T> {

    private Collection<T> content;

    private int pageNumber;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean isLast;

}
