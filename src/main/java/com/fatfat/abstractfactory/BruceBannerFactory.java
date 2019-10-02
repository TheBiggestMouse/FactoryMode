package com.fatfat.abstractfactory;

import com.fatfat.*;

/**
 * @ClassName BruceBannerFactory
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 11:12
 * @Description: TODO
 */
public class BruceBannerFactory implements IMarvelComicsFactory {
    @Override
    public ISuperhero createHero() {
        return new BruceBanner();
    }

    @Override
    public IMovie createMovie() {
        return new BruceBannerMovie();
    }

    @Override
    public ICaricature createCaricature() {
        return new BruceBannerCaricature();
    }
}
