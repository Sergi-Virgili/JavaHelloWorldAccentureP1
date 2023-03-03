package com.coders.services;

import com.coders.models.Coder;

import java.util.ArrayList;
import java.util.List;

public class CoderServiceImpl implements CoderService {

    private List<Coder> coderList = new ArrayList<>();

    @Override
    public List<Coder> getAll() {
        return this.coderList;
    }
}
