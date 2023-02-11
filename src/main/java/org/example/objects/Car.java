package org.example.objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Comparable<Car> {

    private String model;
    private int speed;

    private Long lastTime;

    @Override
    public int compareTo(Car o) {

        if (this.lastTime.equals(o.lastTime)) {
            return 0;
        } else if (this.lastTime < o.lastTime) {
            return -1;
        } else {
            return 1;
        }
    }

/*    @Override
    public int compareTo(Car o) {

           if (this.speed == o.speed) {
                return 0;
            } else if (this.speed < o.speed) {
                return -1;
            } else {
                return 1;
            }
       }
*/
}
