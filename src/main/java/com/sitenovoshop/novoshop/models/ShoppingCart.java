package com.sitenovoshop.novoshop.models;


import com.sitenovoshop.novoshop.interfaces.AddShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart implements AddShoppingCart {

        @Override
        public void addShoppingCart() {
                List<Integer> getlist = new ArrayList<>();
                Scanner input = new Scanner(System.in);

                int dados = input.nextInt();
                getlist.add(dados);
                getlist.add(dados);
                getlist.add(dados);
                getlist.add(dados);
                getlist.add(dados);
                getlist.add(dados);
        }

}

