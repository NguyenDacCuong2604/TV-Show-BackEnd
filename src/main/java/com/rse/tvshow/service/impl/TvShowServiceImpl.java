package com.rse.tvshow.service.impl;

import com.rse.tvshow.repository.TvShowRepository;
import com.rse.tvshow.service.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl implements TvShowService {
    private final TvShowRepository tvShowRepository;
}
