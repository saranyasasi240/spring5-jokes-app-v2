package com.logicaswiss.spring5_jokes_app_v2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
