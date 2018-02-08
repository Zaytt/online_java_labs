package objects_classes_methods.labs;

import java.awt.*;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Overload{

   public void makePost(String text){
       //Makes a post containing only text.
   }

   public void makePost(Image image){
       //Makes a post containing only an image.
   }

   public void makePost(String text, Image image){
       //Makes a post containing both text and an image.
   }


}
