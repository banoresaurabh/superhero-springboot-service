package com.starter.heroes;

import org.springframework.data.repository.CrudRepository;

public interface HeroesRepository extends CrudRepository<Hero, String> {

}
