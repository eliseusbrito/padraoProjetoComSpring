package com.eliseubrito.predictGenre.service;

import com.eliseubrito.predictGenre.model.Genre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "predict", url = "https://api.genderize.io")
public interface PredictGenreService {

	@RequestMapping("/")
	Genre consultarGenre(@RequestParam("name") String name);
}
