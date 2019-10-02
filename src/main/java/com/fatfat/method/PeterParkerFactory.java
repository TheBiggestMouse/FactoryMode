package com.fatfat.method;

import com.fatfat.ISuperhero;
import com.fatfat.PeterParker;

/**
 * @ClassName PeterParkerFactory
 * @Auther LangGuofeng
 * @Date: 2019/10/2/002 10:13
 * @Description: TODO
 */
public class PeterParkerFactory implements IMarvelComicsFactory {
    @Override
    public ISuperhero createHero() {
        return new PeterParker();
    }
}
