/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpe321_project;

/**
 *
 * @author Stephen
 */
public class Room_Store extends Room{
    public Room_Store(){
        setRoomDescription("This is the store\n");
        setRoomLeft(this);
        setRoomRight(this);
        setRoomPictureURL("/cpe321_project/Room_store.jpg");   
    }
}
