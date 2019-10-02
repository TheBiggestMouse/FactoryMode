package com.fatfat.abstractfactory;

import com.fatfat.ICaricature;
import com.fatfat.IMovie;
import com.fatfat.ISuperhero;

public interface IMarvelComicsFactory {

    ISuperhero createHero();

    IMovie createMovie();

    ICaricature createCaricature();

}
