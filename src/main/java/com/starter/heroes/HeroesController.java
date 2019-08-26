package com.starter.heroes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HeroesController {
	
	@Autowired
	private HeroesService heroesService;
	
	@RequestMapping("/heroes")
	public List<Hero> getAllHeroes() {
		return heroesService.getAllHeroes(); 
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/heroes")
	public void addHero(@RequestBody Hero hero) {
		heroesService.addHero(hero);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/heroes/{id}")
	public void deleteHero(@PathVariable String id) {
		
		heroesService.deleteHero(id.replace("%20", " "));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/heroes")
	public void updateHero(@RequestBody Hero hero) {
		heroesService.updateHero(hero);
	}

}
