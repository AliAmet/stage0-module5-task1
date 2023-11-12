package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    Fridge fridge = new Fridge() {
        @Override
        public void close() {
            System.out.println("Close th fridge");
        }

        @Override
        public void open() {

        }

        @Override
        public void getMilk() {
            System.out.println("Get the milk");
        }
    };



    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {

    }
}
