package com.fatfat.method;

import com.fatfat.ISuperhero;

/**
 * @ClassName FactoryMethodTest
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 10:14
 * @Description: TODO
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IMarvelComicsFactory bruceBannerFactory = new BruceBannerFactory();
        ISuperhero bruceBanner = bruceBannerFactory.createHero();
        bruceBanner.introduce();

        IMarvelComicsFactory peterParkerFactory = new PeterParkerFactory();
        ISuperhero peterParker =peterParkerFactory.createHero();
        peterParker.introduce();

    }



}
