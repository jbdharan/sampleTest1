package Multifunctions;

import Operators.add;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class addition {
    add test = new add();

    @Test
    public void addition(){
        int a; short b;
        a=5; b=4;
        int c = test.addtwonums(a,b);
        assertEquals(9,c);
    }

}
