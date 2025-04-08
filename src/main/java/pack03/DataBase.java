
package pack03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author smart10
 */
public class DataBase {
    public static List<VideoJuego> videogames;

    static {
        videogames = Collections.unmodifiableList(Arrays.asList(
                VideoJuego.builder()
                        .nombre("Forza horizon 5")
                        .precio(50.06)
                        .consola(Consola.XBOX)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best", 5),
                                new Review("Is the best but expensive", 4),
                                new Review("Is the best x2", 5)
                        )))
                        .sitioWebOficial("www.forza.com")
                        .tieneDescuento(false)
                        .totalVendido(74)
                        .build(),
                VideoJuego.builder()
                        .nombre("Residen evil 4")
                        .precio(55.20)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best", 5),
                                new Review("Is the best x2", 4),
                                new Review("Is the best x3", 5),
                                new Review("Is the best x4", 5)
                        )))
                        .sitioWebOficial("www.rs4.com")
                        .tieneDescuento(true)
                        .totalVendido(96)
                        .build(),
                VideoJuego.builder()
                        .nombre("Assassins creed origins")
                        .precio(15.55)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best Assassins ", 5)
                        )))
                        .sitioWebOficial("www.origins.com")
                        .tieneDescuento(false)
                        .totalVendido(65)
                        .build(),
                VideoJuego.builder()
                        .nombre("Assassins creed odisey")
                        .precio(15.55)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best Assassins ", 5),
                                new Review("Is the best Assassins x2 ", 5),
                                new Review("Is the best Assassins  x3", 5)
                        )))
                        .sitioWebOficial("www.odisey.com")
                        .tieneDescuento(false)
                        .totalVendido(33)
                        .build(),
                VideoJuego.builder()
                        .nombre("Assassins creed valhalla")
                        .precio(30.33)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is great Assassins ", 4),
                                new Review("Is great Assassins x2 ", 3),
                                new Review("Is great Assassins  x3", 4),
                                new Review("Is great Assassins  x4", 5)
                        )))
                        .sitioWebOficial("www.valhalla.com")
                        .tieneDescuento(false)
                        .totalVendido(78)
                        .build(),
                VideoJuego.builder()
                        .nombre("GTA 5")
                        .precio(25.5)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best", 4)
                        )))
                        .sitioWebOficial("www.gta.com")
                        .tieneDescuento(true)
                        .totalVendido(140)
                        .build(),
                VideoJuego.builder()
                        .nombre("Crash 4")
                        .precio(50.06)
                        .consola(Consola.ALL)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is too short", 2),
                                new Review("Is too short x2", 1)
                        )))
                        .sitioWebOficial("www.crash.com")
                        .tieneDescuento(false)
                        .totalVendido(188)
                        .build(),
                VideoJuego.builder()
                        .nombre("Forza horizon 4")
                        .precio(10.06)
                        .consola(Consola.XBOX)
                        .reviews(Collections. emptyList())
                        .sitioWebOficial("www.forza.com")
                        .tieneDescuento(false)
                        .totalVendido(52)
                        .build(),
                VideoJuego.builder()
                        .nombre("The last of us")
                        .precio(40.06)
                        .consola(Consola.PLAYSTATION)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best", 5),
                                new Review("When launch the part 3???", 5)
                        )))
                        .sitioWebOficial("www.last-of-us.com")
                        .tieneDescuento(false)
                        .totalVendido(41)
                        .build(),
                VideoJuego.builder()
                        .nombre("Good of war")
                        .precio(28.00)
                        .consola(Consola.PLAYSTATION)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("not very good", 3),
                                new Review("not like me", 2),
                                new Review("not very good x2", 2)
                        )))
                        .sitioWebOficial("www.forza.com")
                        .tieneDescuento(false)
                        .totalVendido(79)
                        .build(),
                VideoJuego.builder()
                        .nombre("Halo")
                        .precio(50.06)
                        .consola(Consola.XBOX)
                        .reviews(Collections.unmodifiableList(Arrays.asList(new Review("Is the best", 4))))
                        .sitioWebOficial("www.halo.com")
                        .tieneDescuento(false)
                        .totalVendido(14)
                        .build(),
                VideoJuego.builder()
                        .nombre("Mario bros")
                        .precio(55.99)
                        .consola(Consola.NINTENDO)
                        .reviews(Collections.unmodifiableList(Arrays.asList(new Review("nintendo is the best", 5))))
                        .sitioWebOficial("www.mario.com")
                        .tieneDescuento(false)
                        .totalVendido(64)
                        .build(),
                VideoJuego.builder()
                        .nombre("Geometry dash pc")
                        .precio(0.99)
                        .consola(Consola.PC)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("some comment", 5),
                                new Review("some comment", 2),
                                new Review("some comment", 4),
                                new Review("some comment", 4)))
                        )
                        .sitioWebOficial("www.g.com")
                        .tieneDescuento(false)
                        .totalVendido(236)
                        .build(),
                VideoJuego.builder()
                        .nombre("Luigi mansion")
                        .precio(50.06)
                        .consola(Consola.NINTENDO)
                        .reviews(Collections. emptyList())
                        .sitioWebOficial("www.mario.com")
                        .tieneDescuento(false)
                        .totalVendido(49)
                        .build(),
                VideoJuego.builder()
                        .nombre("Mario party")
                        .precio(22.00)
                        .consola(Consola.NINTENDO)
                        .reviews(Collections.unmodifiableList(Arrays.asList(new Review("Too boring", 1))))
                        .sitioWebOficial("www.mario.com")
                        .tieneDescuento(false)
                        .totalVendido(4)
                        .build(),
                VideoJuego.builder()
                        .nombre("COD black ops")
                        .precio(18.60)
                        .consola(Consola.PLAYSTATION)
                        .reviews(Collections.unmodifiableList(Arrays.asList(new Review("5 Stars", 5), new Review("5 Stars", 5))))
                        .sitioWebOficial("www.cod.com")
                        .tieneDescuento(false)
                        .totalVendido(900)
                        .build(),
                VideoJuego.builder()
                        .nombre("COD black mobile")
                        .precio(0.0)
                        .consola(Consola.MOBILE)
                        .reviews(Collections.unmodifiableList(Arrays.asList(new Review("4 Stars", 4))))
                        .sitioWebOficial("www.cod.com")
                        .tieneDescuento(false)
                        .totalVendido(1200)
                        .build(),
                VideoJuego.builder()
                        .nombre("Geometry dash")
                        .precio(1.0)
                        .consola(Consola.MOBILE)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("amazing", 5),
                                new Review("funny", 4),
                                new Review("ok", 5),
                                new Review("amazing2", 5),
                                new Review("funny2", 4),
                                new Review("ok2", 5))))
                        .sitioWebOficial("www.geometry.com")
                        .tieneDescuento(true)
                        .totalVendido(2000)
                        .build(),
                VideoJuego.builder()
                        .nombre("Candy crush")
                        .precio(0.0)
                        .consola(Consola.MOBILE)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("", 5),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 2))))
                        .sitioWebOficial("www.candy-crush.com")
                        .tieneDescuento(false)
                        .totalVendido(2200)
                        .build(),
                VideoJuego.builder()
                        .nombre("Forza horizon 5")
                        .precio(50.06)
                        .consola(Consola.XBOX)
                        .reviews(Collections.unmodifiableList(Arrays.asList(
                                new Review("Is the best", 5),
                                new Review("Is the best but expensive", 4),
                                new Review("Is the best x2", 5)
                        )))
                        .sitioWebOficial("www.forza.com")
                        .tieneDescuento(false)
                        .totalVendido(74)
                        .build()
        ));
    }
}
