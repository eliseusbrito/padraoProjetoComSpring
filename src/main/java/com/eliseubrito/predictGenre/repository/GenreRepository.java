package com.eliseubrito.predictGenre.repository;

import com.eliseubrito.predictGenre.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, String> {

    Integer countByName(String name);

}