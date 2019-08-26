package com.starter.heroes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroesService {
	
	@Autowired
	private HeroesRepository heroRepository;
	
	public List<Hero> getAllHeroes(){
		List<Hero> heroes = new ArrayList<>();
		heroRepository.findAll()
		.forEach(heroes::add);
		return heroes;
	}
	
	
	public void addHero(Hero hero) {
		heroRepository.save(hero);
	}
	
	public void updateHero(Hero hero) {
		heroRepository.save(hero);
	}
	
	public void deleteHero(String id) {
		heroRepository.delete(id);
	}
}
