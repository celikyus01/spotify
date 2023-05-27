package com.cydeo.g20.models;

import lombok.Data;
import java.util.List;

@Data
public class Tracks {
    private String href;
    private List<Item> items;
    private int limit;
    private int next;
    private int offset;
    private int previous;
    private int total;
}
