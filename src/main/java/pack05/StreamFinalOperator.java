/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack05;

import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class StreamFinalOperator {
    
    public static void main(String[] args) {
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        
        contarOperator(videoJuego);
        forEachOperator(videoJuego2);
    }
    
    static void contarOperator(Stream<VideoJuego> stream){
        System.out.println(stream.count());
    }
    
    static void forEachOperator(Stream<VideoJuego> stream){
        stream.forEach(System.out::println);
    }
    
}
