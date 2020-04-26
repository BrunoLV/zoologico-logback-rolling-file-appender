package br.com.valhala.logback.zoologico;

import br.com.valhala.logback.zoologico.animais.Animal;
import br.com.valhala.logback.zoologico.animais.Leao;
import br.com.valhala.logback.zoologico.animais.Lobo;
import br.com.valhala.logback.zoologico.animais.Papagaio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Zoologico {

    static final Logger logger = LoggerFactory.getLogger(Zoologico.class);

    public static void main(String[] args) {

        logger.info("O Zoológico esta aberto.");

        logger.warn("Cuidado com os animais...");

        Animal[] animais = {new Leao(), new Lobo(), new Papagaio()};

        for(long i = 0; i < 1_000_000; i++) {
            Arrays.stream(animais).forEach(a -> a.emiteSom());
        }

        logger.error("Uma jaula esta aberta.");

        logger.debug("Verificando se algum animal fugiu...");
        logger.debug("Nenhum animal fugiu.");

        logger.info("O Zoológico esta fechado.");

    }

}
