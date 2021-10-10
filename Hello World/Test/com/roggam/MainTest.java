package com.roggam;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void main() {
    Main main = new Main();


    Assert.assertEquals("$472.81", main.mortgage());
    }
}