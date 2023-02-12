package org.example.objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class House implements Comparable<House> {

   private final Integer area;
   private final int price;
   private final String city;
   private final boolean hasFurniture;

    public int compareTo(House anotherHouse)
    {
           System.out.println( "Hello Yura" );
          
       
        if (this.price == anotherHouse.price) {
            return 0;
        } else if (this.price < anotherHouse.price) {
            return -1;
        } else {
            return 1;
        }
    }
}
