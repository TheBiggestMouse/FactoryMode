package com.fatfat.method;

import com.fatfat.BruceBanner;
import com.fatfat.ISuperhero;

/**
 * @ClassName BruceBannerFactory
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 10:05
 * @Description: TODO
 */
public class BruceBannerFactory implements IMarvelComicsFactory{
    @Override
    public ISuperhero createHero() {
        return new BruceBanner();
    }
}
