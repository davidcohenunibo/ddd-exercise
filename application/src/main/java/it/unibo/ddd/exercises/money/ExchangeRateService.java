package it.unibo.ddd.exercises.money;

import java.util.Date;

public interface ExchangeRateService {

ExchangeRate getExchangeRateNow(Currency source, Currency destination);

ExchangeRate getExchangeRateNow(Currency source, Currency destination, Date when);


}
