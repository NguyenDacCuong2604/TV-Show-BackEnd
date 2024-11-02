package com.rse.tvshow.controller;

import com.rse.tvshow.dto.PageResponse;
import com.rse.tvshow.model.TvShow;
import com.rse.tvshow.service.TvShowService;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Validated
@ResponseStatus
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/tv-shows")
public class TvShowController {
    private final TvShowService tvShowService;

    @GetMapping
    public ResponseEntity<PageResponse<?>> getAllTvShows(@Min(1) int pageNumber, @Min(5) int pageSize) {
        return null;
    }

    @GetMapping(path = "/{tv_show_id}")
    public ResponseEntity<TvShow> getTvShowById(@PathVariable(name = "tv_show_id") Long tvShowId) {
        return null;
    }
}
