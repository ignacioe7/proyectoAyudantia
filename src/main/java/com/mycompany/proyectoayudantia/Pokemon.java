/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoayudantia;

/**
 *
 * @author Sala-2-11-PC26
 */



public class Pokemon {
    private TipoPokemon tipoPokemon;
    private TipoHabilidad tipoHabilidad;
    private int id;
    private String nombre;
    private float vida;
    
    public enum TipoHabilidad{
        
    }
    
    public enum TipoPokemon{
        fuego, agua, electrico, planta, tierra;
    }

    public Pokemon(TipoPokemon tipoPokemon, TipoHabilidad tipoHabilidad, int id, String nombre, float vida) {
        this.tipoPokemon = tipoPokemon;
        this.tipoHabilidad = tipoHabilidad;
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }
    
    public  TipoPokemon getTipoPokemon() {
        return tipoPokemon;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getVida() {
        return vida;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }
    
    public void setTipoPokemon(TipoPokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
    
    
    
    
}
