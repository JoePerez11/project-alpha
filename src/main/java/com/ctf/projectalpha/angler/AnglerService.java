/*This is the service layer of the app. */
package com.ctf.projectalpha.angler;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class AnglerService {
    public List<Angler> getAnglers() {
        return List.of(
                new Angler( 1L,
                        "Joseph Perez",
                        "perez.joseph.k@gmail.com",
                        LocalDate.of(1986, Month.FEBRUARY, 11),
                        36
                )
        );

    }
}
