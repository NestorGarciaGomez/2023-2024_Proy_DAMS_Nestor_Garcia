/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionariongg.Conexion;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author nesto
 */
public class Conexion {

    //Establecemos el cliente de mongo al que conectarnos
    public MongoClient cliente = new MongoClient("localhost", 27017);
    //Establecemos la base de datos a la que conectarnos
    public MongoDatabase db = cliente.getDatabase("ConcesionarioNGG");
    //Establecemos las colecciones de la base de datos
    public MongoCollection<Document> col_Modelos = db.getCollection("Modelos");
    public MongoCollection<Document> col_Piezas = db.getCollection("Piezas");
    public MongoCollection<Document> col_Disenyo = db.getCollection("Disenyo");
    public MongoCollection<Document> col_Trabajadores = db.getCollection("Trabajadores");
    public MongoCollection<Document> col_Ventas = db.getCollection("Ventas");
}
