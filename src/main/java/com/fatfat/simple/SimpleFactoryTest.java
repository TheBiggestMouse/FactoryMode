package com.fatfat.simple;

import com.fatfat.ISuperhero;
import com.fatfat.PeterParker;

/**
 * @ClassName SimpleFactoryTest
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 8:55
 * @Description: TODO
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        MarvelComicsFactory marvelComicsFactory = new MarvelComicsFactory();
        ISuperhero superhero = marvelComicsFactory.createHero(PeterParker.class);
        superhero.introduce();
    }

}
