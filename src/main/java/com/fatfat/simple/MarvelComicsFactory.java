package com.fatfat.simple;

import com.fatfat.ISuperhero;

/**
 * @ClassName MarvelComicsFactory
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 8:38
 * @Description: TODO
 */
public class MarvelComicsFactory {

    public ISuperhero createHero(Class clazz){
        ISuperhero superhero = null;

        if(clazz != null){
            try {
                superhero = (ISuperhero) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return superhero;
    }

}
